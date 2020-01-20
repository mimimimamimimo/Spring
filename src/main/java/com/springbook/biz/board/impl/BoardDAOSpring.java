package com.springbook.biz.board.impl;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.common.JDBCUtil;

@Repository
class BoardDAOSpring {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private final String BOARD_INSERT="insert into board(seq,title,writer,content) values((select nvl(max(seq),0)+1 from board),?,?,?)";
	private final String BOARD_UPDATE="update board set title=?,content=? where seq=?";
	private final String BOARD_DELETE="delete board where seq=?";
	private final String BOARD_GET="select * from board where seq=?";
	private final String BOARD_LIST="select * from board order by seq desc";
	
	public void insertBoard(BoardVO vo) {
		System.out.println("jdbc�� insert���ó��");
		
		jdbcTemplate.update(BOARD_INSERT,vo.getTitle(),vo.getWriter(),vo.getContent());
	}


	public void updatetBoard(BoardVO vo) {
		System.out.println("jdbc�� update���ó��");
		jdbcTemplate.update(BOARD_UPDATE,vo.getSeq());

	}
	
	public void deleteBoard(BoardVO vo) {
		
		System.out.println("jdbc�� delete���ó��");
		jdbcTemplate.update(BOARD_DELETE,vo.getSeq());
		
	}
	
	
	public BoardVO getBoard(BoardVO vo) {
		System.out.println("jdbc�� getBoard���ó��");
		Object[] args= {vo.getSeq()};
		return jdbcTemplate.queryForObject(BOARD_GET,args,new BoardRowMapper());
		
	}
	
	public List<BoardVO> getBoardList(BoardVO vo) {
		System.out.println("jdbc�� getBoardList���ó��");
		return (List<BoardVO>) jdbcTemplate.query(BOARD_LIST,new BoardRowMapper());
		
	}
	
	 class BoardRowMapper implements RowMapper<BoardVO> {
		public BoardVO mapRow(ResultSet rs,int rowNum) throws SQLException{
			BoardVO board=new BoardVO();
			board.setSeq(rs.getInt("SEQ"));
			board.setTitle(rs.getString("TITLE"));
			board.setWriter(rs.getString("WRITER"));
			board.setContent(rs.getString("CONTENT"));
			board.setRegDate(rs.getDate("REGDATE"));
			board.setCnt(rs.getInt("CNT"));
			return board;
			
		}
	}

	
	
	
}
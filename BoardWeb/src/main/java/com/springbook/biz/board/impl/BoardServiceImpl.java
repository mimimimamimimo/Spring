package com.springbook.biz.board.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbook.biz.board.BoardService;
import com.springbook.biz.board.BoardVO;
import com.springbook.biz.common.Log4Advice;
import com.springbook.biz.common.LogAdvice;

@Service("boardService")  //id�� ��κ� Ŭ�����ձ��� �ҹ��ڷ� �ؼ� ����
public class BoardServiceImpl implements BoardService {

	@Autowired   //�� �� ��ϵ������� ���� new �� �ʿ䰡 ���� �ڵ�����! �ڵ����������� �ڵ尣�Ἲ�Ӹ� �ƴ϶� xml�δ㰨�ҵ� �ִٱ׷���!
	private BoardDAO boardDAO;
	//private Log4Advice log;
	
	BoardServiceImpl(){
		//log=new Log4Advice();
	}
	@Override
	public void insertBoard(BoardVO vo) {
		
		//log.printLogging();
		boardDAO.insertBoard(vo);
	}

	@Override
	public void updatetBoard(BoardVO vo) {
		
		//log.printLogging();
		boardDAO.updatetBoard(vo);
	}

	@Override
	public void deleteBoard(BoardVO vo) {
		
		//log.printLogging();
		boardDAO.deleteBoard(vo);
	}

	@Override
	public BoardVO getBoard(BoardVO vo) {
		
		//log.printLogging();
		return boardDAO.getBoard(vo);
	}

	@Override
	public List<BoardVO> getBoardList(BoardVO vo) {
		
		//log.printLogging();
		return boardDAO.getBoardList(vo);
		
	}

}

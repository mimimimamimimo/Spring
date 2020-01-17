package com.springbook.biz.user.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.stereotype.Repository;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.common.JDBCUtil;
import com.springbook.biz.user.UserVO;

@Repository("userDAO")
public class UserDAO{  //��� �� static�ƴұ�, ���� ���񽺿��� ���پ��µ� �� Ŀ�ؼ����� �ȵǼ�?
	private Connection conn=null;
	private PreparedStatement stmt=null;  //?
	private ResultSet rs=null; 
	
	private final String USER_GET="select * from users where id=? and password=?";
	//���� ??�κ��� �ڿ��� �����ϴ°� �¾Ҵ�
	/* (non-Javadoc)
	 * @see com.springbook.biz.user.impl.UserService#getUser(com.springbook.biz.user.UserVO)
	 */
	
	public UserVO getUser(UserVO vo) {  //�� ���ڿ� �ƴ� � �ʱⰪ�� ��ü�� �޴°� �ߴ���
		System.out.println("jdbc�� getUser���ó��");  //�ش� ��ü�� �Ϻ�Į������ �˻��� �Ұű⶧��
		UserVO user=null;
		try {
			conn=JDBCUtil.getConnection();
			stmt=conn.prepareStatement(USER_GET);
			stmt.setString(1, vo.getId());   //sql�� ??�κ� �ϼ��ϰ�
			stmt.setString(2, vo.getPassword());  //����
			rs=stmt.executeQuery();
			if(rs.next()) {
				user=new UserVO();  //�� ��ü�� ��ȯ�ؼ� ������� ��
				user.setId(rs.getString("ID"));
				user.setRole(rs.getString("ROLE"));
				user.setName(rs.getString("NAME"));
				user.setPassword(rs.getString("PASSWORD"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(rs,stmt, conn);
		}
		return user;
	}
}

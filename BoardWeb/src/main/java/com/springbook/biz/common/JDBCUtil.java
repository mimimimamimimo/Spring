package com.springbook.biz.common;

import java.sql.Connection;
import java.sql.DriverManager;  //sql���� ���Ŷ� ��������
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCUtil {  //��а� db�� jdbc�� �ҰŶ�, ��� dao���� ����� db����ó���� �� Ŭ������ �ۼ�
	public static Connection getConnection() {  //���� ...static�� ������ �ϳ��� ������ �Ǽ��ΰ�
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe","chaeeun","6657");  //���� �����ؾ�
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void close(PreparedStatement stmt,Connection conn) {  //���� 
		try {
			if(!stmt.isClosed()) stmt.close();
			
		} catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
		}finally {
			stmt=null;
		}
		
		if(conn!=null) {
			try {
				if(!conn.isClosed()) conn.close();
			} catch (Exception e) {   //�׻� ����ó���� finall �������� �ϴ±���
				e.printStackTrace();
				// TODO: handle exception
			}finally {
				conn=null;
			}
		}
	}
	
	public static void close(ResultSet rs,PreparedStatement stmt,Connection conn) {  //close�� �����ε��Ǽ� �پ��ϰ� ����������
		if(rs!=null) {
			try {
				if(!rs.isClosed()) rs.close();
			} catch (Exception e) {
				e.printStackTrace();
				// TODO: handle exception
			}finally {
				rs=null;
			}
		}
		
		if(stmt!=null) {
			try {
				if(!stmt.isClosed()) stmt.close();
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				stmt=null;
			}
			
			if(conn!=null) {
				try {
					if(!conn.isClosed()) conn.close();
				} catch (Exception e) {
					e.printStackTrace();
					// TODO: handle exception
				}finally {
					conn=null;
				}
			}
		}
	}
}

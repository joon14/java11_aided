package org.kh.database2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.kh.database.Student;

public class MariaDBExam2 {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		String driver = "org.mariadb.jdbc.Driver";
		String url = "jdbc:mariadb://localhost:3308/temp";
		String userid = "root";
		String userpw = "1234";
		
		Student newSt = new Student(3, "김응원", 100);
		String sql = "insert into student values (?,?,?)";
		
		//MariaDB 의 temp 데이터베이스의 student 테이블의 newSt의 내용을 레코드로 추가되도록 자바 프로그래밍을 완성하시오.
		
		int i = 0;
		
		try {
			Class.forName(driver);
			try {
				con = DriverManager.getConnection(url, userid, userpw);
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, newSt.getNo());
				pstmt.setString(2, newSt.getName());
				pstmt.setInt(3, newSt.getPoint());
				
				i = pstmt.executeUpdate();
				if(i > 0) {
					System.out.println(i+"건이 성공적으로 추가되었습니다.");
				}
				else {
					System.out.println("처리가 실패되었습니다.");
				}	
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

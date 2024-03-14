package org.kh.database2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.kh.database.Student;

public class MariaDBExam3 {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		String driver = "org.mariadb.jdbc.Driver";
		String url = "jdbc:mariadb://localhost:3308/temp";
		String userid = "root";
		String userpw = "1234";
		
		Student updSt = new Student(7, "정도준", 50);
		String sql = "update student set name=?, point=? where no=?";
		
		//MariaDB 의 temp 데이터베이스의 student 테이블 3번 학생의 데이터를 updSt의 내용으로 레코드로 변경될 수 있도록 자바 프로그래밍을 완성하시오.
		
		int i = 0;
		
		try {
			Class.forName(driver);
			try {
				con = DriverManager.getConnection(url, userid, userpw);
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, updSt.getName());
				pstmt.setInt(2, updSt.getPoint());
				pstmt.setInt(3, updSt.getNo());
			
				i = pstmt.executeUpdate();
				if(i > 0) {
					System.out.println(i+"건이 성공적으로 변경되었습니다.");
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

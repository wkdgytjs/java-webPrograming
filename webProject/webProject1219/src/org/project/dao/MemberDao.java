package org.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.project.dbconnect.DBConnect;
import org.project.dto.MemberDto;

public class MemberDao {

	// 싱글톤 -> 객체를 한번만 생성
	// 1. 방법1
//	private static final MemberDao INSTANCE=new MemberDao();

//	private MemberDao() {
//		System.out.println("MemberDao");
//	}
//	public static MemberDao getInstance() {
//		return INSTANCE;
//	}
	// 2. 방법2
	private static class SingleTon {
		private static final MemberDao INSTANCE = new MemberDao();

	}

	private MemberDao() {
		System.out.println("MemberDao");
	}

	public static MemberDao getInstance() {
		return SingleTon.INSTANCE;
	}

	public int inserDo(String userId, String userPw, String email) {
		int result = 0;

		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "insert into member1219 values(?,?,?)";
			pstm = conn.prepareStatement(query);
			pstm.setString(1, userId);
			pstm.setString(2, userPw);
			pstm.setString(3, email);

			result = pstm.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (pstm != null)
					pstm.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return result;
	}

	public int joinOkDo(String userId, String userPw, String userName, String gender, String hobbysArr, String phoneArr,
			String memo) {
		int result = 0;

		Connection conn = null;
		PreparedStatement pstm = null;
//		String query = "";

		try {
			conn = DBConnect.getConnection();
			String query = "insert into test_tb_1219 values(?,?,?,?,?,?,?)";
			pstm = conn.prepareStatement(query);

		
			
			pstm.setString(1, userId);
			pstm.setString(2, userPw);
			pstm.setString(3, userName);
			pstm.setString(4, gender);
			pstm.setString(5, hobbysArr);
			pstm.setString(6, phoneArr);
			pstm.setString(7, memo);
			
			
			result=pstm.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("입력실패");
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (pstm != null)
					pstm.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return result;
	}
}

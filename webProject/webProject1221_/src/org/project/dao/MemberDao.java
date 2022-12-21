package org.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.project.dbconnect.DBConnect;
import org.project.dto.MemberDto;

public class MemberDao {
	// 싱글톤 -> 객체를 한번만 생성
	private static class SingleTon {

		private static final MemberDao INSTANCE = new MemberDao();

	}

	private MemberDao() {
		System.out.println("MemberDao");
	}

	public static MemberDao getInstance() {
		return SingleTon.INSTANCE;
	}

	public int insertDo(String userId, String userPw, String email) {
		int result = 0;

		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "insert into member1219(userId,userPw,email) values(?,?,?)";
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

	public ArrayList<MemberDto> selectDo() {
		ArrayList<MemberDto> lists = new ArrayList<MemberDto>();

		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";
		ResultSet rs = null;

		try {
			conn = DBConnect.getConnection();
			query = "select * from member1219";
			pstm = conn.prepareStatement(query);

			rs = pstm.executeQuery();

			if (rs != null) {
				while (rs.next()) {
					lists.add(new MemberDto(rs.getString(1), rs.getString(2), rs.getString(3)));
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (pstm != null)
					pstm.close();
				if (rs != null)
					rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return lists;
	}

	public int updateDo(String userId, String userPw, String email) {
		int result = 0;

		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "update member1219 set userPw=?,email=? where userId=?";
			pstm = conn.prepareStatement(query);
			pstm.setString(1, userPw);
			pstm.setString(2, email);
			pstm.setString(3, userId);

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

	public int deleteDo(String userId, String userPw, String email) {
		int result = 0;

		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "delete from member1219 where userId=?";
			pstm = conn.prepareStatement(query);
			pstm.setString(1, userId);

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

	public int join1221InsertDo(String userId, String userPw, String gender, String hobbysArr, String hometown,
			String memo) {
		int result = 0;

		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "insert into login1221(userId,userPw,gender,hobbys,hometown,memo) values(?,?,?,?,?,?)";
			pstm = conn.prepareStatement(query);
			pstm.setString(1, userId);
			pstm.setString(2, userPw);
			pstm.setString(3, gender);
			pstm.setString(4, hobbysArr);
			pstm.setString(5, hometown);
			pstm.setString(6, memo);

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

	public int loginOk1221Do(String userId, String userPw) {
		int result = 0;

		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";
		ResultSet rs = null;

		try {
			conn = DBConnect.getConnection();
			query = "select count(*) from login1221 where userId=? and userPw=?";
			pstm = conn.prepareStatement(query);
			pstm.setString(1, userId);
			pstm.setString(2, userPw);

			rs = pstm.executeQuery();

			if (rs != null) {
				while (rs.next()) {
					result = rs.getInt(1);//회원이면1
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (pstm != null)
					pstm.close();
				if (rs != null)
					rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return result;
	}
}

package ztb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DBUtil {
	/*
	 * ��ȡ���ݿ����ӡ�
	 */
	public static Connection getConnection() throws SQLException {
		try {
			// ָ����������
			Class.forName(Constants.DRIVER);
			// �������ݿ�����
			Connection conn = DriverManager.getConnection(Constants.URL,
					Constants.USERNAME, Constants.PASSWORD);
			return conn;
		} catch (Exception e) {
			// ������ӹ��̳����쳣���׳��쳣��Ϣ
			e.printStackTrace();
			throw new SQLException("�������������ʧ�ܣ�");
		}
	}

	/*
	 * �ر� Statement ����
	 */
	public static void closeStatement(Statement stmt) throws SQLException {
		try {
			// �ر�stmt
			if (stmt != null)
				stmt.close();
		} catch (SQLException e) {
			throw new SQLException("�ر�Statementʧ�ܣ�");
		}
	}

	/*
	 * �ر� ResultSet ����
	 */
	public static void closeResultSet(ResultSet rs) throws SQLException {
		try {
			// �ر� rs
			if (rs != null)
				rs.close();
		} catch (SQLException e) {
			throw new SQLException("�ر�ResultSetʧ�ܣ�");
		}
	}

	/*
	 * �ر�Connection ����
	 */
	public static void closeConnection(Connection conn) throws SQLException {
		try {
			// �ر� rs
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			throw new SQLException("�ر�Connectionʧ�ܣ�");
		}
	}
}

package lti.quiz.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import lti.quiz.bean.ForgetBean;
import lti.quiz.bean.LoginBean;
import lti.quiz.bean.RegisterBean;
import oracle.jdbc.OracleDriver;

public class UserDaoImpl implements UserDao {

	private Connection getConnection() throws SQLException {
		DriverManager.registerDriver(new OracleDriver());
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = DriverManager.getConnection(url, "sarvesh", "sarvesh");
		return conn;
	}

	@Override
	public RegisterBean authenticate(LoginBean login) {
		String sql = "select * from users where email=? and password=?";
		Connection conn = null;

		try {
			conn = getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, login.getEmail());
			stmt.setString(2, login.getPassword());
			ResultSet rs= stmt.executeQuery();
			RegisterBean rb = null;
			if(rs.next()) {//checking if it is returning result set
				rb=new RegisterBean();
				rb.setEmail(rs.getString(1));
				rb.setProfile(rs.getString(4));
			}
			
			return rb;
			
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} finally {
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		
	}

	@Override
	public boolean register(RegisterBean register) {
		String sql = "insert into users values(?,?,?,?)";
		Connection conn = null;
		try {
			conn = getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, register.getEmail());//getting email from user 
			stmt.setString(2, register.getPassword());//getting password from user
			stmt.setString(3, register.getAnswer());//getting answer from user
			stmt.setString(4, register.getProfile());//getting profile picture
			stmt.executeUpdate();//executing insert query
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		} finally {
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	@Override
	public boolean validate(ForgetBean forget) {
		String sql = "select * from users where email=? and answer=?";
		Connection conn = null;
		try {
			conn = getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, forget.getEmail());
			stmt.setString(2, forget.getAnswer());
			ResultSet rs= stmt.executeQuery();
			return rs.next();//checking if resultset has returned any rows.
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		} finally {
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	@Override
	public boolean update(LoginBean change) {
		String sql = "update users set password=? where email=?";
		Connection conn = null;
		try {
			conn = getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, change.getPassword());
			stmt.setString(2, change.getEmail());
			stmt.executeUpdate();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		} finally {
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}

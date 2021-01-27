// JDBCRowSet
// CachedRowSet, WebRowSet, JoinRowSet, FilteredRowSet

package jdbc_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class JDBC_1 {
	public static void ConnectToDataBase() {
		try {
			String url = ConnectionString.DB_URL;
			String user = ConnectionString.USERNAME;
			String password = ConnectionString.PASSWORD;

			Connection connection = DriverManager.getConnection(url, user, password);

			Statement statement = connection.createStatement();

			ResultSet resultSet = statement.executeQuery("select * from nhanvien");
			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1) + resultSet.getString(2) + resultSet.getBoolean(3));
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		ConnectToDataBase();
	}

}

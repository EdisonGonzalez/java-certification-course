package database;

import java.sql.*;
import java.util.*;

public class JavaSQLGetData {
    /**
     * Tree SQLException
     *
     * -- java.lang.Object
     *    |-- java.lang.Throwable
     *       |-- java.lang.Exception
     *           |-- java.sql.SQLException
     *
     * Methods who thrown SQLException:
     *
     * 1. public static java.sql.Connection java.sql.DriverManager.getConnection(@NotNull String url, @Nullable String user, @Nullable String password) throws java.sql.SQLException
     * 2. public abstract java.sql.Statement java.sql.Connection(con).createStatement() throws java.sql.SQLException
     * 3. public abstract java.sql.ResultSet java.sql.Statement(stmt).executeQuery(String sql) throws java.sql.SQLException
     * 4. public abstract int java.sql.ResultSet(rs).getInt(String columnLabel) throws java.sql.SQLException
     *
     */
    public static void main(String[] args) throws SQLException {
        var url = "jdbc:mysql://localhost:3306/ocp";
        var user = "root";
        var password = "password";
        var list = new ArrayList<Integer>();

        try (var con = DriverManager.getConnection(url, user, password);
             var stmt = con.createStatement()) {
            ResultSet rs = stmt.executeQuery("Select ID from LOG");
            list.add(rs.getInt("ID"));
            list.forEach(System.out::println);
        }
    }
}
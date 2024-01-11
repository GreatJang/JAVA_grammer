package Spring;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnect {
    public static void main(String[] args) {
//        db의 url : localhost:3306
        String url = "jdbc:mysql://localhost:3306/board1";
        String userName = "root";
        String pw = "1234";

        try {
            Connection conn = DriverManager.getConnection(url, userName, pw);
            System.out.println("DB 커넥션 성공");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

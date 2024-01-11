package Spring;

import java.sql.*;

public class DatabaseConnect {
    public static void main(String[] args) {
//        db의 url : localhost:3306
        String url = "jdbc:mysql://localhost:3306/board1?useSSL=false"; // 기본 SSL처리가 되기때문에 SSL을 무력화 하는 ?useSSL=false 붙히기
        String userName = "root";
        String pw = "1234";

        try {
            Connection conn = DriverManager.getConnection(url, userName, pw);
            System.out.println("DB 커넥션 성공");
//            statement : 쿼리를 담아 db로 보낼수 있는 객체
            Statement st = conn.createStatement();
            String myQuery = "SELECT * FROM author";
            ResultSet rs = st.executeQuery(myQuery);
            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                System.out.println("id : " + id + " name : " + name);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

package connectionSQL;

import java.sql.Connection;
import java.sql.DriverManager;

public class connectionSQL {

    public static Connection ketnoi(String hoaDon) {
        try {
            String user = "sa", password = "123", databaseName = "QLIPHONE";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://DESKTOP-BFNI15L\\SQLEXPRESS:1433;databaseName=" + databaseName;

            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Kết nối thành công");
            return con;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}

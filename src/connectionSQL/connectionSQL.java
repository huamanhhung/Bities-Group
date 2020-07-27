package connectionSQL;

import java.sql.Connection;
import java.sql.DriverManager;

public class connectionSQL {

    public static Connection ketnoi(String hoaDon) {
        try {
            String user = "sa", password = "1", databaseName = "QLIPHONE";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://DESKTOP-TJJ188P\\SQLEXPRESS:1433;databaseName=" + databaseName;

            Connection con = DriverManager.getConnection(url, user, password);
            return con;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}

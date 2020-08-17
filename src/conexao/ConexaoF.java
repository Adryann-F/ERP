package conexao;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConexaoF {
    private static final String DRIVER = "com.mysql.jdbc.Driver";     
    private static final String URL = "jdbc:mysql://localhost:3306/dberp";
    private static final String USER = "root";
    private static final String PASS = "";
    
    public static Connection getConection(){
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro na conexão", ex);
        }
    }
    public static void closeConnection(Connection con){
        try {
    if(con!=null){
            con.close();
        }} catch (SQLException ex) {
            throw new RuntimeException("Erro no close", ex);
        }
    };
    public static void closeConnection(Connection con, PreparedStatement stmt){
        closeConnection(con);
    try {
        if (stmt != null){
        stmt.close();
        }    
                   
    } catch (SQLException ex) {
            throw new RuntimeException("Erro no close", ex);
        }
    };
    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs){
        closeConnection(con,stmt);
    try {
        if (rs != null){
        rs.close();
        }    
            
    } catch (SQLException ex) {
            throw new RuntimeException("Erro no close", ex);
        }
    };
}

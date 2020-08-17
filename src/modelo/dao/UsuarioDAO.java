package modelo.dao;

import com.mysql.jdbc.PreparedStatement;
import conexao.ConexaoF;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author adrya
 */
public class UsuarioDAO {
  public boolean checklogin(String login, String senha){
  Connection con = ConexaoF.getConection();
   PreparedStatement stmt = null;
    ResultSet rs = null;
    boolean check = false;
    try {
        stmt = (PreparedStatement) con.prepareStatement("SELECT * FROM usuarios WHERE nome = ? and senha = ?");
        stmt.setString(1, login);
        stmt.setString(2, senha);
        rs = stmt.executeQuery();
        if (rs.next()) { 
            //
          check = true; 
            
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Erro ao entrar");
    }finally{
    ConexaoF.closeConnection(con, stmt, rs);
    }
    return check;   
}




    
}

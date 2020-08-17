package modelo.dao;

import com.mysql.jdbc.ConnectionFeatureNotAvailableException;
import com.mysql.jdbc.PreparedStatement;
import conexao.ConexaoF;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.bean.Fornecedor;

/**
 *
 * @author adrya
 */
public class FornecedorDAO {
    public void creat(Fornecedor f){
        Connection con = ConexaoF.getConection();
        PreparedStatement stmt = null;
        
        try {
            stmt = (PreparedStatement) con.prepareStatement("INSERT INTO fornecedor (nome, cpf, cnpj, rgIr, obs)"
                    + "VALUES(?,?,?,?,?)");
         stmt.setString(1, f.getNome());
         stmt.setString(2, f.getCpf());
         stmt.setString(3, f.getCnpj());
         stmt.setString(4, f.getRgIr());
         stmt.setString(5, f.getObs());
         
         stmt.executeUpdate();
         JOptionPane.showMessageDialog(null, "Fornecedor Salvo");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar"+ex);
        }finally{
        ConexaoF.closeConnection(con, stmt);
        }
    }
    
    public List<Fornecedor> lista(){
    Connection con = ConexaoF.getConection();
    PreparedStatement stmt = null;
    ResultSet rs = null; 
        
        List<Fornecedor> fornecedor = new ArrayList<>();
        try {
            stmt = (PreparedStatement) con.prepareStatement("SELECT * FROM fornecedor");
            rs = stmt.executeQuery();
            while(rs.next()){
            Fornecedor f = new Fornecedor();
            f.setId(rs.getInt("id"));
            f.setNome(rs.getString("nome"));
            f.setCnpj(rs.getString("cnpj"));
            f.setCpf(rs.getString("cpf"));
            f.setRgIr(rs.getString("rgIr"));
            f.setObs(rs.getString("obs"));   
            fornecedor.add(f);
            }
    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao gerar lista ");
        }finally{
            ConexaoF.closeConnection(con, stmt, rs);
        }
    return fornecedor;
    }
     public void atualizar(Fornecedor f){
        Connection con = ConexaoF.getConection();
        PreparedStatement stmt = null;
        
        try {
            stmt = (PreparedStatement) con.prepareStatement("UPDATE fornecedor SET nome = ?, cpf = ?, cnpj = ?, rgIr = ?,"
                    + " obs = ? WHERE id  = ? ");
         stmt.setString(1, f.getNome());
         stmt.setString(2, f.getCpf());
         stmt.setString(3, f.getCnpj());
         stmt.setString(4, f.getRgIr());
         stmt.setString(5, f.getObs());
         stmt.setInt(6, f.getId());
         
         stmt.executeUpdate();
         JOptionPane.showMessageDialog(null, "Fornecedor Atualizado");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir");
        }finally{
        ConexaoF.closeConnection(con, stmt);
        }
    }
    
    
    
     public void deletar(Fornecedor f){
        Connection con = ConexaoF.getConection();
        PreparedStatement stmt = null;
        
        try {
            stmt = (PreparedStatement) con.prepareStatement("DELETE FROM  fornecedor WHERE id = ?");
         stmt.setInt( 1, f.getId());
         
         stmt.executeUpdate();
         JOptionPane.showMessageDialog(null, "Fornecedor Excluido");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir");
        }finally{
        ConexaoF.closeConnection(con, stmt);
        }
    }
    
    public List<Fornecedor> busca(String nome){
    Connection con = ConexaoF.getConection();
    PreparedStatement stmt = null;
    ResultSet rs = null; 
        
        List<Fornecedor> fornecedor = new ArrayList<>();
        try {
            stmt = (PreparedStatement) con.prepareStatement("SELECT * FROM fornecedor WHERE nome LIKE ?");
            stmt.setString(1, "%"+nome+ "%");
            rs = stmt.executeQuery();
            while(rs.next()){
            Fornecedor f = new Fornecedor();
            f.setId(rs.getInt("id"));
            f.setNome(rs.getString("nome"));
            f.setCnpj(rs.getString("cnpj"));
            f.setCpf(rs.getString("cpf"));
            f.setRgIr(rs.getString("rgIr"));
            f.setObs(rs.getString("obs"));   
            fornecedor.add(f);
            }
    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao gerar buscar ");
        }finally{
            ConexaoF.closeConnection(con, stmt, rs);
        }
    return fornecedor;
    }
    
}

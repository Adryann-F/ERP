package modelo.dao;

import com.mysql.jdbc.PreparedStatement;
import conexao.ConexaoF;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.bean.Produto;

public class ProdutoDAO {
    //Criar
public void crud(Produto p){
    Connection con = ConexaoF.getConection();
    PreparedStatement stmt = null;
    
    try {
        stmt = (PreparedStatement) con.prepareStatement("INSERT INTO produtos (descricao, qtdE, valorC, valorV, codB, id) "
                + "VALUES(?,?,?,?,?,?)");
        stmt.setString(1, p.getDescricao());
        stmt.setInt(2, p.getQtd());
        stmt.setDouble(3, p.getValorC());
        stmt.setDouble(4, p.getValorV());
        stmt.setInt(5, p.getCdb());
        stmt.setInt(6, p.getId());
        
        stmt.executeUpdate();
        
        JOptionPane.showMessageDialog(null, "Salvo");
    } 
    catch (SQLException ex) {
       JOptionPane.showMessageDialog(null, "Erro ao salvar");
    }finally{
    ConexaoF.closeConnection(con, stmt);
    }
}  
//listar os produtos salvos no banco de dados
public List<Produto> listar(){
  Connection con = ConexaoF.getConection();
   PreparedStatement stmt = null;
    ResultSet rs = null;
     
    List<Produto> produtos = new ArrayList();
    try {
        stmt = (PreparedStatement) con.prepareStatement("SELECT * FROM produtos");
        rs = stmt.executeQuery();
        while (rs.next()) { 
            //nome das variaveis de acordo com os nomes no banco de dados
            Produto produto = new Produto();
            produto.setId(rs.getInt("id"));
            produto.setCdb(rs.getInt("codB"));
            produto.setDescricao(rs.getString("descricao"));
            produto.setQtd(rs.getInt("qtdE"));
            produto.setValorC(rs.getDouble("valorC"));
            produto.setValorV(rs.getDouble("valorV"));
            
            produtos.add(produto);
            
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Erro ao listar");
    }finally{
    ConexaoF.closeConnection(con, stmt, rs);
    }
    return produtos;   
}

public void atualizar(Produto p){
    Connection con = ConexaoF.getConection();
    PreparedStatement stmt = null;
    
    try {
        stmt = (PreparedStatement) con.prepareStatement("UPDATE produtos SET descricao = ? ,qtdE = ? ,valorC = ? "
                + ",valorV = ? , codB = ? WHERE id = ?");
        stmt.setString(1, p.getDescricao());
        stmt.setInt(2, p.getQtd());
        stmt.setDouble(3, p.getValorC());
        stmt.setDouble(4, p.getValorV());
        stmt.setInt(5, p.getCdb());
        stmt.setInt(6, p.getId());
        
        stmt.executeUpdate();
        
        JOptionPane.showMessageDialog(null, "Atualizado");
    } 
    catch (SQLException ex) {
       JOptionPane.showMessageDialog(null, "Erro ao atualizar");
    }finally{
    ConexaoF.closeConnection(con, stmt);
    }
}  
public void deletar(Produto p){
    Connection con = ConexaoF.getConection();
    PreparedStatement stmt = null;
    
    try {
        stmt = (PreparedStatement) con.prepareStatement("DELETE FROM produtos WHERE id = ?");
        stmt.setInt(1, p.getId());
        
        stmt.executeUpdate();
        
        JOptionPane.showMessageDialog(null, "Excluido");
    } 
    catch (SQLException ex) {
       JOptionPane.showMessageDialog(null, "Erro ao excluir");
    }finally{
    ConexaoF.closeConnection(con, stmt);
    }
} 
public List<Produto> buscar(String desc){
  Connection con = ConexaoF.getConection();
   PreparedStatement stmt = null;
    ResultSet rs = null;
     
    List<Produto> produtos = new ArrayList();
    try {
        stmt = (PreparedStatement) con.prepareStatement("SELECT * FROM produtos WHERE descricao LIKE ?");
        stmt.setString(1, "%"+desc+"%");
        rs = stmt.executeQuery();
        while (rs.next()) { 
            //nome das variaveis de acordo com os nomes no banco de dados
            Produto produto = new Produto();
            produto.setId(rs.getInt("id"));
            produto.setCdb(rs.getInt("codB"));
            produto.setDescricao(rs.getString("descricao"));
            produto.setQtd(rs.getInt("qtdE"));
            produto.setValorC(rs.getDouble("valorC"));
            produto.setValorV(rs.getDouble("valorV"));
            
            produtos.add(produto);
            
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Erro ao listar");
    }finally{
    ConexaoF.closeConnection(con, stmt, rs);
    }
    return produtos;   
}

}

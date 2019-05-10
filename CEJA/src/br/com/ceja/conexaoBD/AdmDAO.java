package br.com.ceja.conexaoBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdmDAO {

	private Connection connection;
	String sql;
	PreparedStatement ps;
	ResultSet rs;
	
	@SuppressWarnings("static-access")
	public AdmDAO() {
		connection = new ConexaoMySQL().getConexaoMySQL();
	}

	public boolean verificaAdm(String login, String senha) {
		
		sql = "SELECT * FROM administrador WHERE login='"+login+"'";
		
		try {
			ps = connection.prepareStatement(sql);
			rs = ps.executeQuery();

			while (rs.next()) {
				if(senha.equals(rs.getString("senha")))
					return true;
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return false;
	}
	
	public static void main(String[] args) {
		AdmDAO adm = new AdmDAO();
		System.out.println(adm.verificaAdm("joao", "12345678"));

	}
}

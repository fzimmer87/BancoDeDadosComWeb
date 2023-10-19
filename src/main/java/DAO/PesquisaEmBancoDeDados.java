package DAO;

import ConexaoSQL.ConexaoForwardMySQL;
import ConexaoSQL.ConexaoPostgres;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Cadastrar {

    public void clicoNoBotaoRegisterNaPáginaDeRegistro() throws InterruptedException {
        ConexaoForwardMySQL conexao = new ConexaoForwardMySQL();
        Connection conn = conexao.getConexao();
        try {
            String sql = "SELECT * FROM registro";

            Statement stm = conn.createStatement();
            ResultSet resultado = stm.executeQuery(sql);

            while (resultado.next()) {

            }
        } catch (SQLException ex) {
        }
}
}

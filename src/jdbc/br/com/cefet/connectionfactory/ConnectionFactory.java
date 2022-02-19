package br.com.cefet.connectionfactory;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    private static ConnectionFactory instancia;
    private Connection conexao = null;

    private ConnectionFactory() {
        final String DB_URL = "jdbc:[sgbd]://[ip]/nome_do_banco";
        final String USERNAME = "";
        final String PASSWORD = "";
    
        try {
            System.out.println("Conectando com o banco...");
            this.conexao = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
        } catch( SQLException e ) {
            throw new RuntimeException(e);
        }
    }

    public Connection getConexao() {
        return this.conexao;
    }

    public static synchronized ConnectionFactory getInstancia() {
        if (instancia == null)
            instancia = new ConnectionFactory();
        return instancia;
    }
}

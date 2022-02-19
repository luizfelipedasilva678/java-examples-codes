import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;

import br.com.cefet.connectionfactory.ConnectionFactory;
import br.com.cefet.contato.Contato;

import java.sql.Date;

public class App {
    public static void main(String[] args) throws SQLException {
        Connection conn = null;

        Contato contato = new Contato();
        contato.setNome("Teste");
        contato.setEmail("teste@email.com");
        contato.setEndereco("Rua A");
        contato.setDataNascimento(Calendar.getInstance());

        Connection connectionFactory = ConnectionFactory.getInstancia().getConexao();
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = connectionFactory;

            conn.setAutoCommit(false);
            System.out.println("Conectado com sucesso");
            String sql = "insert into contatos(nome,email,endereço,dataNascimento) values(?,?,?,?)";
            
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, contato.getNome());
            stmt.setString(2, contato.getEmail());
            stmt.setString(3, contato.getEndereco());
            stmt.setDate(4, new Date(contato.getDataNascimento().getTimeInMillis()));
            stmt.execute();
            conn.commit();

        } catch(SQLException e) {
            conn.rollback();
            e.printStackTrace();
        } catch(ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
           conn.setAutoCommit(true);
           conn.close();
        }

    }
}
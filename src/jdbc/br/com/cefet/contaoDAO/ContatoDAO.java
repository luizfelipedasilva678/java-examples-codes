package br.com.cefet.contaoDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import br.com.cefet.connectionfactory.ConnectionFactory;
import br.com.cefet.contato.Contato;
import java.sql.Date;
import java.sql.ResultSet;

public class ContatoDAO {
    private Connection conexao;
    private String comandoSQL;
    private PreparedStatement stmt;

    public ContatoDAO() {
        this.conexao = ConnectionFactory.getInstancia().getConexao();
    }

    public void adiciona(Contato c) {
        this.comandoSQL = "insert into contatos(nome,email,endereço,dataNascimento) values(?,?,?,?)";

        try {
            this.stmt = this.conexao.prepareStatement(this.comandoSQL);

            this.stmt.setString(1, c.getNome());
            this.stmt.setString(2, c.getEmail());
            this.stmt.setString(3, c.getEndereco());
            this.stmt.setDate(4, new Date(c.getDataNascimento().getTimeInMillis()));
            this.stmt.execute();
            System.out.println("Contato" + c.getNome() + " adicionado com sucesso");

        } catch(SQLException e) {   
            System.out.println("Erro ao adicionar" + e.getMessage());
        } finally {
            try {
                this.stmt.close();
                System.out.println(this.conexao);
            } catch(SQLException e) {
                System.out.println("Não foi possível liberar recursos" + e.getMessage());
            }
        }
    }

    public List<Contato> carregaTodosOsContatos() {
        List<Contato> contatos = new ArrayList<Contato>();
        try {
            this.stmt = this.conexao.prepareStatement("select * from contatos");
            ResultSet rs = this.stmt.executeQuery();
            
            while(rs.next()) {
                Contato c = new Contato();
                c.setNome(rs.getString("nome"));
                c.setEmail(rs.getString("email"));
                c.setEndereco(rs.getString("endereço"));
                Calendar data = Calendar.getInstance();
                data.setTime(rs.getDate("dataNascimento"));
                c.setDataNascimento(data);
                c.setId(rs.getInt("id"));
                contatos.add(c);
            }

            return contatos;
            
        } catch (SQLException e) {
            System.out.println("Erro ao listar contatos" + e.getMessage());
            return null;
        } finally {
            try {
                stmt.close();
            } catch (SQLException e) {
                System.out.println("Erro ao listar contatos" + e.getMessage());
            }
        }
    }

    public void altera(Contato c) {
        try {
            this.comandoSQL = "Update contatos SET nome=?, email=?, endereço=?, dataNascimento=? WHERE id = ?";
            this.stmt = this.conexao.prepareStatement(this.comandoSQL);
            
            this.stmt.setString(1, c.getNome());
            this.stmt.setString(2, c.getEmail());
            this.stmt.setString(3, c.getEndereco());
            this.stmt.setDate(4, new Date(c.getDataNascimento().getTimeInMillis()));
            this.stmt.setInt(5, (int) c.getId());
            this.stmt.execute();
        } catch (SQLException e) {
            System.out.println("Erro ao alterar" + e.getMessage());
        } finally {
            try {
                this.stmt.close();
                System.out.println(this.conexao);
            } catch (SQLException e) {
                System.out.println("Erro ao alterar" + e.getMessage());
            }
        }
    }

    public void remove(Contato c) {
        try {
            this.comandoSQL = "DELETE FROM contatos WHERE id = ?";
            this.stmt = this.conexao.prepareStatement(this.comandoSQL);
            this.stmt.setInt(1, (int) c.getId());
            this.stmt.execute();
        } catch(SQLException e) {
            System.out.println("Erro ao remover" + e.getMessage());
        } finally {
            try {
                this.stmt.close();
                System.out.println(this.conexao);
            } catch (SQLException e) {
                System.out.println("Erro ao alterar" + e.getMessage());
            }
        }
    }
}

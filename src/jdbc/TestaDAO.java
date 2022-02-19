import br.com.cefet.contato.Contato;
import br.com.cefet.contaoDAO.ContatoDAO;
import java.util.Calendar;
import java.util.List;

public class TestaDAO {
    public static void main(String[] args) {
        Contato contato = new Contato();
        contato.setNome("Teste1000");
        contato.setEmail("teste@email.com");
        contato.setEndereco("Rua A");
        contato.setDataNascimento(Calendar.getInstance());

        ContatoDAO dao = new ContatoDAO();
        dao.adiciona(contato);
        System.out.println("Contato Gravado");
        List<Contato> contatos = dao.carregaTodosOsContatos();

        for(Contato contato2 : contatos) {
            System.out.println("Nome: " + contato2.getNome());
        }

        dao.altera(contatos.get(0));
        dao.remove(contatos.get(0));
    }
}

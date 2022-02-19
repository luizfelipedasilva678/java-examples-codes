package br.com.cefet.contato;
import java.util.Calendar;

public class Contato {
    private long id;
    private String nome, email, endereco;
    private Calendar dataNascimento;
    
    // Getters
    public long getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public String getEmail() {
        return this.email;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public Calendar getDataNascimento() {
        return this.dataNascimento;
    }

    //Setters
    public void setId(long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setDataNascimento(Calendar dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}

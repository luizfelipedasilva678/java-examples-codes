public class Cliente {
    private String nome = "Cliente sem nome"; 
    private String cpf = "999.999.999-99";
    private String dataNascimento = "10/10/2010";

    public Cliente() {}

    public Cliente(String nomeTitular) {
        this.nome = nomeTitular;
    }

    //getters
    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getDataNascimento() {
        return this.dataNascimento;
    }

    //setters
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        if(this.validaCpf(cpf))
            this.cpf = cpf;
    }

    private boolean validaCpf(String cpf) {
        if(cpf.length() != 11) 
            return false;
        return true;
    }
}

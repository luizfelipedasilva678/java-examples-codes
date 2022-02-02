public class Caneta {
    private String cor;
    private boolean tampa;
    private String marca;
    private double tamanho;
    private String formato;

    public Caneta(String cor, String marca) {
        this.cor = cor;
        this.marca = marca;
    }
    
    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public String getCor() {
        return this.cor;
    }

    public String getMarca() {
        return this.marca;
    }
}
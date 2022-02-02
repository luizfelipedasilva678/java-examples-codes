public class AutenticadorUtil {
    private int senha;
    
    public boolean autentica(int senha) {
        if(senha == this.senha) return true;

        return false;
    }
}
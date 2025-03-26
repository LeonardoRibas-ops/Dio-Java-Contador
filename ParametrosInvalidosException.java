// ParametrosInvalidosException.java
public class ParametrosInvalidosException extends Exception {
    
    // Construtor que recebe uma mensagem
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);  // Passa a mensagem para a classe pai (Exception)
    }
}
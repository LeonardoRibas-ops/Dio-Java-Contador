import java.util.Scanner;  // Para usar a classe Scanner

public class Contador {
    public static void main(String[] args) {
        // Criar o Scanner para ler os parâmetros do usuário
        Scanner terminal = new Scanner(System.in);
        
        try {
            // Leitura dos parâmetros
            System.out.println("Digite o primeiro parâmetro:");
            int parametroUm = terminal.nextInt();  // Lê o primeiro parâmetro

            System.out.println("Digite o segundo parâmetro:");
            int parametroDois = terminal.nextInt();  // Lê o segundo parâmetro

            // Chama o método que contém a lógica de contagem
            contar(parametroUm, parametroDois);
        
        } catch (ParametrosInvalidosException exception) {
            // Captura a exceção e imprime a mensagem de erro
            System.out.println(exception.getMessage());
        
        } finally {
            // Garante que o Scanner seja fechado, mesmo se ocorrer uma exceção
            terminal.close();
        }
    }
    
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Verifica se o primeiro parâmetro é maior que o segundo
        if (parametroUm > parametroDois) {
            // Lança a exceção se o primeiro parâmetro for maior
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
        
        // Calcula a quantidade de iterações (intervalo entre os dois parâmetros)
        int contagem = parametroDois - parametroUm;
        
        // Realiza a contagem e imprime os números
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}

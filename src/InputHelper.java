import java.util.Locale;
import java.util.Scanner;

public class InputHelper {
    private Scanner scanner;

    public InputHelper() {
        // Scanner configurado para o Locale brasileiro
        this.scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);
    }

    // Método para ler uma String
    public String getString(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextLine();
    }

    // Método para ler um int com validação
    public int getByte(String mensagem) {
        int valor;
        while (true) {
            try {
                System.out.print(mensagem);
                valor = Integer.parseInt(scanner.nextLine());
                if (valor <= 0) {
                    System.out.println("Valor deve ser maior que zero.");
                } else {
                    return valor;
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida! Por favor, insira um número inteiro válido.");
            }
        }
    }
    
    // Método para ler um double com validação
    public double getDouble(String mensagem) {
        double valor;
        while (true) {
            try {
                System.out.print(mensagem);
                valor = Double.parseDouble(scanner.nextLine().replace(",", "."));
                if (valor <= 0) {
                    System.out.println("Valor deve ser maior que zero.");
                } else {
                    return valor;
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida! Por favor, insira um número decimal válido (ex.: 1,75).");
            }
        }
    }

    // Fechar o Scanner
    public void close() {
        scanner.close();
    }
}

package metodo;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String primeiroNome, segundoNome;

        // Solicita e captura o primeiro nome
        System.out.println("Digite seu primeiro nome:");
        primeiroNome = sc.nextLine(); // Usa nextLine() para capturar a linha inteira

        // Solicita e captura o segundo nome
        System.out.println("Digite seu segundo nome:");
        segundoNome = sc.nextLine(); // Usa nextLine() para capturar a linha inteira

        // Chama método imprimindo resultado dentro do print
        System.out.println(nomeCompleto(primeiroNome, segundoNome));

        sc.close(); // Fecha o Scanner
    }

    // Método para retornar o nome completo
    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Seu nome completo é: ".concat(primeiroNome.concat(" ").concat(segundoNome));
    }
}
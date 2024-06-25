package edu.geraldo.tema.anatomiadasclasses;
import java.util.Scanner;

public class MinhaClasse3 {
    
    public static void main(String[] args) {
        // Criando um objeto Scanner com 'try-with-resources' que finaliza o scanner ao imprimir o 'nomeCompleto' 
        try (Scanner lerNome = new Scanner(System.in)){ 
            
        String primeiroNome, segundoNome;

        System.out.printf("Informe o primeiro nome: \n"); // Recebe o primeiro nome do usuário
        primeiroNome = lerNome.next(); // Salva o primeiro nome informado pelo usuário
        System.out.printf("Informe o segundo nome: \n"); // Recebe o sgundo nome do usuário
        segundoNome = lerNome.next(); // Salva o primeiro nome informado pelo usuário

        String nomeCompleto = criarNomeCompleto(primeiroNome, segundoNome); // Adiciona as variáveis como atributos do método 'criarNomeCompleto' salvando-os em outra variável

        System.out.printf(nomeCompleto); // Imprime o nome completo
        }
    }
    // Método 'criarNomeCompleto' irá juntar o primeiro nome com o segundo nome 
    public static String criarNomeCompleto(String primeiroNome, String segundoNome) {
        return "Nome completo: " + primeiroNome.concat(" ").concat(segundoNome);  // 'concat()' vai permitir juntar os nome e deixar um espaço entre eles
    }
}

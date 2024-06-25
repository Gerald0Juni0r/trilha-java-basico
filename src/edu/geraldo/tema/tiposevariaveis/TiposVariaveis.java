package edu.geraldo.tema.tiposevariaveis;
public class TiposVariaveis {
    
    public static void main(String[] args) {

        String nome = "Geraldo Júnior";
        System.out.println(nome);

        double salarioMinimo = 2500;
        System.out.println(salarioMinimo);

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        // short numeroCurto2 = numeroNormal // Não é permitido porque o tipo short tem uma limitação de bytes
        System.out.println(numeroNormal);

        int numero = 5;
        numero = 50;
        System.out.println(numero);

        // Váriavel declarada como uma constante(esta definida como 'final' e esta em maiúsculo)
        final long CPF = 12345678955L; // Cria uma variável do tipo long(deve ter um L após os números)
        // CPF = 98765432188L; // Não será permitido alterar, porque 'CPF' está definido como constante
        System.out.println(CPF);
    }
}

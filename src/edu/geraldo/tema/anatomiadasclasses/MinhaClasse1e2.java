package edu.geraldo.tema.anatomiadasclasses;
// Toda classe deve ter o mesmo nome do arquivo '.java' o qual deve iniciar com letra maiúscula
public class MinhaClasse1e2 {
    // 'void' = não irá retornar nada, apenas executar
    public static void main(String[] args) {
        System.out.println("Olá mundo");
        // Toda variável deve ser escrita com letra minuscula (camelCase)
        // Ex.: ano ou anoFabricacao        

        // -----------------------------------------------------------------------------------------
        
        // variável toda maiúscula significa que ela é 'final' e que NÃO pode mais sofrer alterações
        final String BR = "Brasil";
        // BR = "Brazil"; // Aparece um erro porque NÃO pode ser alterada

        // -----------------------------------------------------------------------------------------

        // Quando a variável é do tipo 'final' utiliza-se o '_', se necessário, para separar o nome da variável
        int ANO_2000 = 2000; // NÃO pode ser alterada
        int ESTADOS_BRASILEIROS = 27; // NÃO pode ser alterada

        System.out.println(ANO_2000 + " " + ESTADOS_BRASILEIROS );

        // -----------------------------------------------------------------------------------------
                
        int ano = 2021;
        ano = 2024; // Não da erro porque pode ser alterada

        System.out.println(ano + " " + BR );

        /* 
        Declaração inválida de variáveis:
        int numero&um = 1; // Únicos simbolos permitidos são '_' e '$'
        int 1numero = 1; // Não pode começar com númerico
        int long = 1; // 'long' faz parte das palavras reservadas na linguagem (Java)

        Declaração válida de variáveis:
        int numero$um = 1;
        int numero_um = 1;
        int numero1 = 1;
        int longo = 1;
        */

    }

}
import java.util.Scanner;

class LP_Atividade_N1_1_05_2040482612017 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        //Entrada de dados
        System.out.print("Estoque inicial: ");
        int estoque = input.nextInt();
        System.out.print("Quantidade de entrada: ");
        int qtdEntrada = input.nextInt();
        System.out.print("Quantidade de saída 1: ");
        int qtd1Saida1 = input.nextInt();
        System.out.print("Quantidade de saída 2: ");
        int qtd1Saida2 = input.nextInt();
        System.out.print("Estoque mínimo: ");
        int estoqueMinimo = input.nextInt();
        System.out.print("Tamanho do lote (caixa): ");
        int tamanhoLote = input.nextInt();
        
        //Saída
        System.out.println("Estoque inicial: " + estoque + " unidades.");
        estoque += qtdEntrada;
        System.out.println("Após entrada (+" + qtdEntrada + "): " + estoque + " unidades.");
        estoque -= qtd1Saida1;
        System.out.println("Após saída (-" + qtd1Saida1 + "): " + estoque + " unidades.");
        estoque -= qtd1Saida2;
        System.out.println("Após saída (-" + qtd1Saida2 + "): " + estoque + " unidades.");
        boolean necessidadeDeCompra = estoque < estoqueMinimo;
        System.out.println("O nível de estoque atual (" + estoque + ") está abaixo do mínimo (" + estoqueMinimo + ")? " + necessidadeDeCompra);
        int resto = estoque % tamanhoLote;
        System.out.println("Unidades fora de caixas fechadas de " + tamanhoLote + ": " + resto);
        boolean estoquePerfeito = estoque % tamanhoLote == 0;
        System.out.println("O estoque está perfeitamente fracionado em caixas completas? " + estoquePerfeito);

        input.close();
    }
}

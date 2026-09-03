import java.util.Scanner;
import java.util.Locale;

class LP_Atividade_N1_1_10_2040482612017 
{
    public static void main(String[] args) 
    {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        //Entrada de dados
        System.out.print("Informe a valor A: ");
        double a = input.nextDouble();
        System.out.print("Informe a valor B: ");
        double b = input.nextDouble();
        System.out.print("Informe a valor C: ");
        double c = input.nextDouble();
        System.out.print("Informe a valor D: ");
        double d = input.nextDouble();
        System.out.print("Informe a média do aluno: ");
        double media = input.nextDouble();
        System.out.print("Informe o percentual de presença: ");
        double presenca = input.nextDouble();
        
        //Saída de dados
        System.out.println("--- Demonstração de Precedência Aritmética ---");
        double result1 = a * b / c + d - 10.0 - 5.0;
        double result2 = ((a * b) / c) + d - 10.0 - 5.0;
        System.out.println("Resultado Sem parênteses: " + result1);
        System.out.println("Resultado Com parênteses explícitos: " + result2);
        System.out.println("Nota: Ambos dão o mesmo resultado pela precedência natural (*, /");
        System.out.println("depois +), mas a segunda forma é mais legível.");
        System.out.println();
        System.out.println("--- Validação do Critério de Aprovação ---");
        boolean aprovadoDireto = (media >= 6 && presenca >= 75) ? true : false;
        System.out.println("Entrada -> Média: " + media + " | Presença: " + presenca + "%");
        System.out.println("Resultado da avaliação (aprovadoDireto): " + aprovadoDireto);

        input.close();
    }
}
import java.util.Scanner;
import java.util.Locale;

class LP_Atividade_N1_1_09_2040482612017 
{
    public static void main(String[] args) 
    {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Informe a nota final do aluno: ");
        double notaFinal = input.nextDouble();
        System.out.println("--- Abordagem 1: Estrutura Condicional Tradicional (if-else) ---");

        //Condição tradicional
        if(notaFinal >= 6.0) {
            System.out.println("Situação (if-else): Aprovado");
        }else{
            System.out.println("Situação (if-else): Reprovado");
        }
        System.out.println();
        System.out.println("--- Abordagem 2: Operador Ternário Simples ---");

        //Operador ternário
        String resultado = (notaFinal >= 6.0) ? "Aprovado" : "Reprovado";
        System.out.println("Situação (Ternário): " + resultado);

        input.close();
    }
}
/*String resultado = (notaFinal >= 6.0) ? "Aprovado" : (notaFinal >= 4.0) ? "Exame" : "Reprovado";
 *Os motivos de evitar este tipo de encadeamento:
 *1. Manutenção complexa por conta das mudanças das regras de negócio no futuro e
 *aumentaria a chance de introduzir um erro de lógica (bug)
 *2. dificuldade de depuração (Debug) por motivo de colocar um ponto de parada (breakpoint) para
 *analisar o valor de cada condição passo a passo se torna mais complicado. 
 */
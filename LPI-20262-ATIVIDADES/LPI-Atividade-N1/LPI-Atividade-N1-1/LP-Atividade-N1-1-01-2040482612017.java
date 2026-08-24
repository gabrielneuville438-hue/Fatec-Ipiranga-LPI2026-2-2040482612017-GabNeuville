import java.util.Scanner;
import java.util.Locale;
/*
 *Uso de underline e sem uso da 'public' na class para evitar erro de compilação com hífens
 *Uso do import Locale para aceitar ponto decimal (.) sem conflito com a configuração regional
 */
class LP_Atividade_N1_1_01_2040482612017 
{
    public static void main(String[] args) 
    {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        
        //Entrada de dados
        System.out.print("Idade do Aluno: ");
        //byte: 8 bits, intervalo de -128 a 127
        byte idade = input.nextByte();
        System.out.print("Número de Faltas: ");
        //short: 16 bits, intervalo de -32.768 a 32.767
        short faltas = input.nextShort();
        System.out.print("Matrícula ID: ");
        //int: 32 bits, intervalo de -2.147.483.648 a 2.147.483.647
        int matriculaId = input.nextInt();
        System.out.print("Código Nacional do Estudante: ");
        //long: 64 bits, intervalo de -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807
        long codigoNacional = input.nextLong();
        System.out.print("Nota do Trabalho: ");
        //float: 32 bits, aproximadamente de -3,4028235E38 a 3,4028235E38
        float notaTrabalho = input.nextFloat();
        System.out.print("Nota da Prova Final: ");
        //double: 64 bits, aproximadamente de -1,7976931348623157E308 a 1,7976931348623157E308
        double notaProvaFinal = input.nextDouble();
        System.out.print("Conceito Final do Aluno: ");
        //char: 16 bits, intervalo de 0 a 65.535 (valores Unicode)
        char conceitoFinal = input.next().charAt(0);
        System.out.print("Aluno está Aprovado (true/false): ");
        //boolean: tamanho em bits não especificado pela linguagem Java, valores true ou false
        boolean aprovado = input.nextBoolean();

        //Saída
        System.out.print("--- Dados do Aluno Fictício ---");
        System.out.print("Idade do Aluno: " + idade + " anos");
        System.out.print("Números de Faltas: " + faltas);
        System.out.print("Matrícula ID: " + matriculaId);
        System.out.print("Código Nacional do Estudante: " + codigoNacional);
        System.out.print("Nota do Trabalho: " + notaTrabalho);
        System.out.print("Nota da Prova Final: " + notaProvaFinal);
        System.out.print("Conceito Final do Aluno: " + conceitoFinal);
        System.out.print("Aluno está Aprovado? " + aprovado);

        input.close(); //fim da variável Scanner
    }
}

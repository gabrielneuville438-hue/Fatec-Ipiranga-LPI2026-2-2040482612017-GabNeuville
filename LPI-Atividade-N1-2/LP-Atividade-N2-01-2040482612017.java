import java.util.Scanner;
import java.util.Locale;

/*O motivo de ter usado o for é obrigar o programa rodar exatamente a quantidade de alunos
 *para que todos tenham a nota e que os calculos sejam bem definidos
 */
class LP_Atividade_N2_01_2040482612017 
{
    public static void main(String[] args) 
    {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        double soma = 0.0;
        double maiorNota = 0.0;
        
        System.out.print("Quantidade de alunos na turma: ");
        int quantidadeAlunos = input.nextInt();

        for(int i = 0; i < quantidadeAlunos; i++)
        {
            System.out.print("Nota do aluno: ");
            double nota = input.nextDouble();
            //Cálculo
            soma += nota;
            //Comparação de maior nota
            maiorNota = Math.max(maiorNota, nota);
        }
        System.out.println("Soma total das notas: " + soma);

        if(quantidadeAlunos > 0) 
        {
            double media = soma / quantidadeAlunos;
            System.out.println("Média da turma: " + media);
            System.out.println("Maior nota da turma: " + maiorNota);
        }

        input.close();
    }
}
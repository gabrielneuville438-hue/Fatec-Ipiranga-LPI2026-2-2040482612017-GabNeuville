import java.util.Scanner;
import java.util.Locale;

/*O motivo de ter usado o do-while é por ser um loop sentinela e
 * o teste é antes da execução obrigatoria do bloco da uma vez
 */

class LP_Atividade_N2_02_2040482612017 
{
    public static void main(String[] args) 
    {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        double soma = 0.0;
        int count = 0;
        double valorVenda;

        do
        {
            System.out.print("Valor da venda (ou 0 para encerrar): ");
            valorVenda = input.nextDouble();

            if(valorVenda > 0){
                //Calculo
                soma += valorVenda;
                count++;
            }

        } while(valorVenda != 0);

        if(count > 0) {
            double media = soma / count;
            System.out.println("Total vendido no turno: R$ " + soma);
            System.out.println("Quantidade de vendas: " + count);
            System.out.printf("Valor médio por venda: R$%.2f%n", media);
        }else{
            System.out.println("Nenhuma venda registrada nesta sessão de caixa.");
        }

        input.close();
    }
}
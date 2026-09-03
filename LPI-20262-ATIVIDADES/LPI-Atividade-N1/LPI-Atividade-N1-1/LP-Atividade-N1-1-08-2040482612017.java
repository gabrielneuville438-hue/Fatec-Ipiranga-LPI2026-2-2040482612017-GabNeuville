import java.util.Scanner;
import java.util.Locale;

class LP_Atividade_N1_1_08_2040482612017 
{
    public static void main(String[] args) 
    {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        
        //Entrada de dados
        System.out.print("Informe o valor total da compra em reais: ");
        double valorTotalReais = input.nextDouble();
        System.out.print("Informe o número de parcelas: ");
        int numeroParcelas = input.nextInt();

        //Saída
        System.out.println("--- Calculadora Financeira Escalar (Mapeamento em Centavos) ---");
        //Conversão de double para long
        long centavos = Math.round(valorTotalReais * 100);
        System.out.println("Valor total convertido: " + centavos + " centavos.");
        long parcelaBaseCentavos = centavos / numeroParcelas;
        System.out.println("Divisão de R$" + valorTotalReais + " por " + numeroParcelas + " em centavos: " + parcelaBaseCentavos + " centavos por parcela.");
        double centDouble = parcelaBaseCentavos / 100.0;
        System.out.println("Valor convertido para exibição: R$ " + centDouble);
  
        input.close();
    }
}
/*Vantagens da abordagem Escalar com inteiros em comparação ao BigDecimal
 *1. Os tipos primitivos (long/int) processam diretamente no hardware da CPU e 
 *consumem menos memória do que objetos complexos como o BigDecimal.
 *2. É muito mais simples e seguro armazenar valores monetários como inteiros brutos
 *em bancos de dados
 *3. Não há risco de alocação excessiva de memória no Garbage Collector, pois não criamos
 *novas instâncias a cada conta matemática.
 *
 * Desvantagens da abordagem Escalar com inteiros em comparação ao BigDecimal
 * 1. A divisão de valores que não da a conta exata e precisa obrigatoriamente de %
 * para não ter confusão.
 * 2. O ipo long possui limite máximo de bits que pode estourara a capacidade em sistemas mais
 * complexos como criptomoedas
 * 3. O BigDecimal possui regras de arredondamento nativas sofisticadas como RoundingMode.HALF_UP
 * e a escala inteira não tem estas regras.
 */

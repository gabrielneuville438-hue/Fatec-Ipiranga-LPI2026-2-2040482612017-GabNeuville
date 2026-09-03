import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

class LP_Atividade_N1_1_07_2040482612017 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        //Entrada de dados
        System.out.print("Informe o valor A (ex.: 1.00): ");
        String valorA = input.nextLine();
        System.out.print("Informe o valor B (ex.: 0.90): ");
        String valorB = input.nextLine();
        System.out.print("Informe o valor total da compra: ");
        String valorCompra = input.nextLine();
        System.out.print("Informe o número de parcelas: ");
        int numeroParcelas = input.nextInt();

        //Saída
        System.out.println("--- Demonstração da Imprecisão do padrão IEEE 754 (double) ---");
        
        //Conversão de String para double
        double aDouble = Double.parseDouble(valorA);
        double bDouble = Double.parseDouble(valorB);
        double sub = aDouble - bDouble;

        //Usando BigDecimal
        BigDecimal aBig = new BigDecimal(valorA);
        BigDecimal bBig = new BigDecimal(valorB);
        BigDecimal subBig = aBig.subtract(bBig);
        BigDecimal compraTotal = new BigDecimal(valorCompra);
        BigDecimal parcela = new BigDecimal(numeroParcelas);

        //Cálculo da parcela
        BigDecimal valorParcela = compraTotal.divide(parcela, 2, RoundingMode.HALF_UP);
        
        System.out.println("Resultado esperado de " + valorA + " - " + valorB + " seria " + subBig);
        System.out.println("Resultado real obtido com double: " + sub);
        System.out.println();
        System.out.println("--- Correção exata utilizando java.math.BigDecimal ---");
        System.out.println("Resultado com BigDecimal (String Constructor): " + subBig);
        System.out.println();
        System.out.println("--- Divisão de parcelas com Escala e RoundingMode.HALF_UP ---");
        System.out.println("Compra de R$ " + valorCompra + " dividida em " + numeroParcelas + "x: R$" + valorParcela + " por parcela.");

        input.close();
    }
}
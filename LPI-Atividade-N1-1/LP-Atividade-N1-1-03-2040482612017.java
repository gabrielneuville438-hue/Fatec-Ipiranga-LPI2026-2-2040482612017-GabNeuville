import java.util.Scanner;

class LP_Atividade_N1_1_03_2040482612017 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        Integer idade = null;
        
        System.out.println("Tentando realizar operação aritmética com Integer nulo...");
        //Uso do Tratamento
        try {
            int novaIdade = idade + 1;
        } catch(NullPointerException e) {
            System.out.println("Erro Capturado com sucesso: Não foi possível calcular porque a idade");
            System.out.println("não foi informada (null).");
            System.out.println("Detalhe da exceção: java.lang.NullPointerException");
        }
        System.out.println();
        //Uso de tratamento
        try {
            System.out.print("Informe uma idade válida: ");
            int novaIdade = input.nextInt();
            System.out.println("Reatribuindo valor válido para a variável...");
            int idadeMais = novaIdade + 1;
            System.out.println("Operação bem-sucedida! Idade atual: " + novaIdade + " | Idade no próximo ano: " + idadeMais);
        } catch(NullPointerException e) {
            System.out.println("Erro Capturado com sucesso: Não foi possível calcular porque a idade");
            System.out.println("não foi informada (null).");
            System.out.println("Detalhe da exceção: java.lang.NullPointerException");
        }

        input.close();
    }
}
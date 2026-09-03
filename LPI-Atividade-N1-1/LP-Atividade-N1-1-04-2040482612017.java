import java.util.Scanner;

class LP_Atividade_N1_1_04_2040482612017 
{
    //Constantes de classe
    public static final String INISTITUICAO = "FATEC Ipiranga";
    public static final int PRAZO_MAXIMO_PADRAO = 14;
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o número de dias do empréstimo: ");
        final int diasEmprestimo = input.nextInt();
        
        /*Tentativa de reatribuição comentada na demonstração do erro da compilação:
         *Ex: diasEmprestimo = 15; //Erro: cannot assign a value to final variable diasEmprestimo
         */

        //Criação do objeto da classe para acessar o método não estático
        LP_Atividade_N1_1_04_2040482612017 programa = new LP_Atividade_N1_1_04_2040482612017();
        int prazoFinal = programa.calcularPrazo(diasEmprestimo);

        if(prazoFinal != -1) 
        {
            System.out.println("Instituição: " + INISTITUICAO);
            System.out.println("Prazo Máximo Padrão: " + PRAZO_MAXIMO_PADRAO + " dias.");
            System.out.println("Dias calculados para devolução: " + prazoFinal);
        }

        input.close();
    }
    //Método
    public int calcularPrazo(int diasEmprestimo) 
    {
        if(diasEmprestimo <= PRAZO_MAXIMO_PADRAO) {
            return diasEmprestimo;
        }else{
            System.out.println("Não foi aceito o prazo.");
            return -1; //Retorna um valor que indica erro
        }
    }
}
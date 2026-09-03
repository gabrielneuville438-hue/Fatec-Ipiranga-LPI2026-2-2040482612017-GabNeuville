import java.util.Scanner;
/*O operador '&' simples pode forçar o java a avaliar ambas condições,
 *sendo na primeira (texto != null) e coloca a variável como null vai dar false;
 *indo para a segunda, tentaria executar o método .length() e iria gerar NullPointerException.
 */
class LP_Atividade_N1_1_06_2040482612017 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        for(int i = 0; i < 3; i++) 
        {
            System.out.println("--- Execução " + (i + 1) + " ---");
            System.out.print("Informe o nome de usuário: ");
            String texto = input.nextLine();
            
            if(texto != null && texto.length() > 0 && !texto.equalsIgnoreCase("null")) {
                System.out.println("Usuário válido fornecido: " + texto);
            }else {
                System.out.println("Entrada rejeitada: O texto está nulo ou vazio.");
            }
            System.out.println(); //pula linha
        }

        input.close();
    }
}
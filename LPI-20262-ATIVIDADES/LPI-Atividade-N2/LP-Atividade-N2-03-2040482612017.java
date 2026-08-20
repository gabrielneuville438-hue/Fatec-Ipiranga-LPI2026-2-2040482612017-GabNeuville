import java.util.Scanner;

/*O motivo de ter usado while é definir o true e false, sendo true para a senha errada
 *e false para senha certa. Vai ocorrer várias tentativas (true) até acertar (false) 
 */

class LP_Atividade_N2_03_2040482612017 
{
    public static final int PIN = 1234;
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int pinDigitado = 0;
        int count = 0;

        while(pinDigitado != PIN) {
            System.out.print("Informe o PIN de acesso: ");
            pinDigitado = input.nextInt();
            count++;

            if(pinDigitado == PIN) {
                System.out.println("Acesso concedido! Você utilizou " + count + " tentativa(s).");
            }else {
                System.out.println("PIN incorreto. Tente novamente.");
            }
        }

        input.close();
    }
}
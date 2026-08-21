import java.util.Scanner;
//Usei underline por motivo de erro de compilação com hiffens e sem uso de public
class LP_Atividade_N1_1_02_2040482612017 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        //Entrada de dados
        System.out.print("Valor para comparação de primitivos: ");
        int valorPrimitivo = input.nextInt();
        System.out.print("Valor para comparação de objetos (new Integer): ");
        int valorObjeto = input.nextInt();
        System.out.print("Valor dentro do Integer Cache (-128 a 127): ");
        int valorCache = input.nextInt();
        System.out.print("Valor fora do Integer Cache: ");
        int valorForaCache = input.nextInt();

        //Resultados
        System.out.println("--- Comparação de Primitivos (int) ---");
        int primitivo1 = valorPrimitivo;
        int primitivo2 = valorPrimitivo;
        System.out.println("aPrimitivo == bPrimitivo: " + (primitivo1 == primitivo2));
        System.out.println(); //Pula linha
        System.out.println("--- Comparação de Objetos via 'new Integer()' ---");
        Integer objeto1 = new Integer(valorObjeto);
        Integer objeto2 = new Integer(valorObjeto);
        System.out.println("aObjeto == bObjeto (Identidade): " + (objeto1 == objeto2));
        System.out.println("aObjeto.equals(bObjeto) (Valor): " + (objeto1.equals(objeto2)));
        System.out.println();
        System.out.println("--- Comparação com Autoboxing e Integer Cache ---");
        Integer cache1 = valorCache; //Autoboxing
        Integer cache2 = valorCache;
        System.out.println("Dentro do Cache " + "(" + valorCache + ") -> xCache == yCache: " + (cache1 == cache2));
        Integer foraCache1 = valorForaCache;
        Integer foraCache2 = valorForaCache;
        System.out.println("Fora do Cache " + "(" + valorForaCache + ") -> xForaCache == yForaCache: " + (foraCache1 == foraCache2));
        System.out.println("Fora do Cache " + "(" + valorForaCache + ") -> xForaCache.equals(yForaCache): " + (foraCache1.equals(foraCache2)));
        
        input.close();
    }
}
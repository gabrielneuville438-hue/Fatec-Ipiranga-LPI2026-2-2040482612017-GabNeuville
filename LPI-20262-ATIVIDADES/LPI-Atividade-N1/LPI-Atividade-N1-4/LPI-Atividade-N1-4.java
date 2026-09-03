/*--------------------------------------------------*
* Disciplina: Linguagem de Programacao I            *
*          Prof. Verissimo                          *
*---------------------------------------------------*
* Objetivo do Programa: desenvolver uma matriz para *
*                       simular o xeque pastor      *
* Data - 29/08/2026                                 *
* Autor: Gabriel C. S. Neuville                     *
*---------------------------------------------------*/

class LPI_Atividade_N1_4 
{
    //Constante da quantidade de linhas no tabuleiro
    private static final int TAMANHO_TABULEIRO = 8;
    
    //Converter a letra do xadrex para o índice da coluna da matriz
    private static int converterColunaParaIndice(char letra) 
    {
        //Converter tudo para minúsculo
        letra = Character.toLowerCase(letra);
        //No ASCI, 97 é a. Ex: 97 - 97 + 1 = 1; b = 2
        if(letra >= 'a' && letra <= 'h') {
            return letra - 'a' + 1;
        }
        return -1;
    }
    
    private static void moverPecaPorSigla(String[][] tabuleiro, String nomePeca, String posicao) 
    {
        char letraColuna = posicao.charAt(0);
        String posicaoLinhaXadrez = String.valueOf(posicao.charAt(1));
        
        int linhaOrigem = -1;
        int colunaOrigem = -1;
        int posicaoLinhaMatriz = -1;
       
        //Converter a letra da coluna para índice da matriz
        int posicaoColunaMatriz = converterColunaParaIndice(letraColuna);

        //Encontrar os índices atuais da peça
        for(int i = 0; i < TAMANHO_TABULEIRO; i++) 
        {
            for(int j = 1; j < tabuleiro[i].length; j++) 
            {
                if(tabuleiro[i][j].trim().equals(nomePeca.trim())) 
                {
                    linhaOrigem = i;
                    colunaOrigem = j;
                    break;
                }
            }
        }

        //Encontrar o índice da linha baseado na linha da coluna 0 do tabuleiro
        for(int i = 0; i <TAMANHO_TABULEIRO; i++) 
        {
            if(tabuleiro[i][0].equals(posicaoLinhaXadrez)) 
            {
                posicaoLinhaMatriz = i;
                break;
            }
        }

        //Pega o texto exato da peça(ex: BB3)
        String pecaTextoOriginal = tabuleiro[linhaOrigem][colunaOrigem];

        //Execução do movimento para nova linha e nova coluna
        tabuleiro[posicaoLinhaMatriz][posicaoColunaMatriz] = pecaTextoOriginal;
        
        //Limpa o lugar antigo onde a peça estava
        tabuleiro[linhaOrigem][colunaOrigem] = " ...";
    }

    private static void imprimirTabuleiro(String[][] tabuleiro) 
    {
        for(int linha = 0; linha < tabuleiro.length; linha++) 
        {
            for(int coluna = 0; coluna < tabuleiro[linha].length; coluna++) 
            {
                System.out.print(tabuleiro[linha][coluna]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) 
    {
        //Declarar uma matriz
        String[][] tabuleiroInicial = {
            {"8", " TP1", " CP2"," BP3", " DP4", " RP5", " BP6", " CP7", " TP8"},
            {"7", " PP1", " PP2", " PP3", " PP4", " PP5", " PP6", " PP7", " PP8"},
            {"6", "    ", "    ", "    ", "    ", "    ", "    ", "    ", "    "},
            {"5", "    ", "    ", "    ", "    ", "    ", "    ", "    ", "    "},
            {"4", "    ", "    ", "    ", "    ", "    ", "    ", "    ", "    "},
            {"3", "    ", "    ", "    ", "    ", "    ", "    ", "    ", "    "},
            {"2", " PB1", " PB2", " PB3", " PB4", " PB5", " PB6", " PB7", " PB8"},
            {"1"," TB1", " CB2", " BB3", " DB4", " RB5", " BB6", " CB7", " TB8"}
        };

        System.out.println("======================================");
        System.out.println();
        System.out.println("     Posicao Inicial do tabuleiro     ");
        System.out.println();
        System.out.println("======================================");
        System.out.println("  -a- -b- -c- -d- -e- -f- -g- -h-");
        imprimirTabuleiro(tabuleiroInicial);
        System.out.println();
        System.out.println("======================================");
        System.out.println();
        System.out.println("             Jogada #1                ");
        System.out.println();
        System.out.println("======================================");
        System.out.println();
        System.out.println("----------Brancas jogam e4------------");
        moverPecaPorSigla(tabuleiroInicial, "PB5", "e4");
        imprimirTabuleiro(tabuleiroInicial);
        System.out.println();
        System.out.println("-----------Pretas jogam e5------------");
        moverPecaPorSigla(tabuleiroInicial, "PP5", "e5");
        imprimirTabuleiro(tabuleiroInicial);
        System.out.println();
        System.out.println("======================================");
        System.out.println();
        System.out.println("             Jogada #2                ");
        System.out.println();
        System.out.println("======================================");
        System.out.println();
        System.out.println("----------Brancas jogam Bc4------------");
        moverPecaPorSigla(tabuleiroInicial, "BB6", "c4");
        imprimirTabuleiro(tabuleiroInicial);
        System.out.println();
        System.out.println("-----------Pretas jogam Cc6------------");
        moverPecaPorSigla(tabuleiroInicial, "CP2", "c6");
        imprimirTabuleiro(tabuleiroInicial);
        System.out.println();
        System.out.println("======================================");
        System.out.println();
        System.out.println("             Jogada #3                ");
        System.out.println();
        System.out.println("======================================");
        System.out.println();
        System.out.println("----------Brancas jogam Dh5------------");
        moverPecaPorSigla(tabuleiroInicial, "DB4", "h5");
        imprimirTabuleiro(tabuleiroInicial);
        System.out.println();
        System.out.println("-----------Pretas jogam Cf6------------");
        moverPecaPorSigla(tabuleiroInicial, "CP7", "f6");
        imprimirTabuleiro(tabuleiroInicial);
        System.out.println();
        System.out.println("======================================");
        System.out.println();
        System.out.println("         Jogada #4 (Xeque Mate)       ");
        System.out.println();
        System.out.println("======================================");
        System.out.println();
        System.out.println("----------Brancas capturam Peao PP6 em f7 e Xeque MATE (Dxf7#)------------");
        moverPecaPorSigla(tabuleiroInicial, "DB4", "f7");
        imprimirTabuleiro(tabuleiroInicial);
    }
}
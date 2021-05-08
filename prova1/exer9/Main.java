public class Main
{
    public int pesquisa_linear(int[] vetor, int tamanho, int chave) {
        int index = -1;

        for(int i = 0; i < tamanho; i++) {
            if(vetor[i] == chave)
                return i;
        }

        return index;
    }

    public static void main(String[] args) {
        Main main = new Main();

        int[] vetor1 = {6, 27, 34, 51, 93};
        int chave1 = 51;
        int res1 = main.pesquisa_linear(vetor1, vetor1.length, chave1);

        int chave2 = 82;
        int[] vetor2 = {22, 54, 81, 83, 124, 222, 869};
        int res2 = main.pesquisa_linear(vetor2, vetor2.length, chave2);

        System.out.println("Pesquisa linear vetor1 (chave1 = "+chave1+"): " + res1);
        System.out.println("Pesquisa linear vetor2 (chave1 = "+chave2+"): " + res2);


    }
}

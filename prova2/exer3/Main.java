import java.util.Scanner;

public class Main {

    public String ConcatERemove(String s, String t, int k) {

        String maior, menor;

        // Se o número de mudancas permitidas (k), for maior ou igual a qtd de char's em ambas as strings,
        // sempre e possivel realizar a modificação
        if(k >= s.length() + t.length())
            return "sim";

        if(s.length() >= t.length()) {  // Verifica qual é a String maior e menor para evitar indexOutOfBoundsException
            maior = s;
            menor = t;
        } else {
            maior = t;
            menor = s;
        }

        int minNecesChanges;
        int countAfterFirstDiffer = 0;
        int numDifferAfter = 0;
        boolean isDiffer = false;

        // Percorre as duas String's, e compara seus char's;
        // Conta o número de subistituições necessárias;
        // Conta o número de char's a serem add no final.
        for(int i = 0; i < maior.length(); i++) {
            if(i < menor.length()) {
                if(maior.charAt(i) != menor.charAt(i)) {
                    isDiffer = true;
                }
                if(isDiffer)
                    countAfterFirstDiffer++;
            } else {
                numDifferAfter++;
            }

        }

        // Calcula número de mudanças: Subistituição de char = duas mudanças; add no final = uma mudança
        minNecesChanges = (countAfterFirstDiffer * 2) + numDifferAfter;

        if(k < minNecesChanges) // Número de mudancas insuficiente
            return "não";
        else {
            if(k == minNecesChanges) // Número de mudancas exato
                return "sim";
            else if((k - minNecesChanges) % 2 == 0) // k's extras podem ser add/removidos dois por dois
                return "sim";
            else                    // Sobra um k
                return "não";
        }

    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner in = new Scanner(System.in);

        System.out.print("s: ");
        String s = in.nextLine();
        System.out.print("t: ");
        String t = in.nextLine();
        System.out.print("k: ");
        int k = in.nextInt();
        System.out.print("");

        String res = main.ConcatERemove(s, t, k);
        System.out.println(res);
    }
}

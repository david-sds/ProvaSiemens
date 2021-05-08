public class Main {

    public String ConcatERemove(String s, String t, int k) {

        String maior, menor;

        // Se o numero de mudancas permitidas (k), for maior que a quantidade de caracteres em ambas as strings,
        // sempre e possivel realizar a transicao
        if(k >= s.length() + t.length())
            return "sim";

        if(s.length() >= t.length()) {
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

        // percorre as duas strings, e compara seus caracteres
        // conta numero de subistituicoes de caracteres (duas mudancas),
        // conta o numero de caracteres a serem add no final (uma mudanca)
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

        minNecesChanges = (countAfterFirstDiffer * 2) + numDifferAfter;

        if(k < minNecesChanges) // # de mudancas insuficiente
            return "não";
        else {
            if(k == minNecesChanges) // # de mudancas exato
                return "sim";
            else if((k - minNecesChanges) % 2 == 0) // possivel corrigir mudancas extras (add e remove o mesmo char)
                return "sim";
            else                    // impossivel corrigir mudancas extras (so consegue remover ou add)
                return "não";
        }

    }

    public static void main(String[] args) {
        Main main = new Main();
        String res = main.ConcatERemove("abcdefg", "abddefgabc", 5);
        System.out.println(res);
    }
}

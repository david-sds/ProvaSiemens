public class Main
{
    public StringBuilder inverterString(StringBuilder str) {

        int tamanho = str.length() - 1;
        int metade;

        if(tamanho % 2 == 0)
            metade = tamanho/2 + 1;
        else
            metade = tamanho/2;

        for(int i = tamanho; i >= metade + 1; i--) {
            char charFim = str.charAt(i);
            char charInicio = str.charAt(tamanho-i);

            str.setCharAt(tamanho - i, charFim);
            str.setCharAt(i, charInicio);
        }
        return str;
    }

    public static void main(String[] args) {
        Main main = new Main();
        StringBuilder str = new StringBuilder("1 2 3 4 5 6 7 8 9 10");
        System.out.println("String original: " + str);

        main.inverterString(str);

        System.out.println("String invertida: " + str);

    }
}

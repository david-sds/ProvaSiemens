import java.util.Scanner;

public class Main
{
    public int tamanhoString(String str) {
        char cont = 0;

        try {

            while(true) {
                str.charAt(cont);
                cont++;
            }

        } catch (StringIndexOutOfBoundsException ex) {}

        return cont;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Main main = new Main();

        System.out.print("Insira uma String para ser 'medida': ");
        String str = in.nextLine();
        System.out.print("Tamanho da String fornecida: " + main.tamanhoString(str));
    }
}

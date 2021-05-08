import java.util.Scanner;

public class Main
{
    public long calcFibonacci(int limite) {
        long x1 = 0;
        long x2 = 1;
        long soma = 0;
        
        if(limite < 0 || limite > 92)
            return -1;
        
        int cont = 1;
        while(cont <= limite) {
            soma = x1 + x2;
            x1 = x2;
            x2 = soma;
            cont++;
        }

        return x1;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Main main = new Main();

        System.out.print("Insira o numero da sequencia Fibonacci que deseja (0 -> 92): ");
        int limite = in.nextInt();
        long resposta = main.calcFibonacci(limite);
        System.out.print("Fibonacci " + limite + ": " + resposta);

    }
}

public class Main {

    public void fooBaa() {
        for(int i = 1; i <= 100; i++) {
            System.out.println();
            if(i % 3 == 0)
                System.out.print("Foo");
            if(i % 5 == 0)
                System.out.print("Baa");
            if(i % 3 != 0 && i % 5 != 0)
                System.out.print(i);
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.fooBaa();
    }
}

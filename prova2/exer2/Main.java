public class Main {

    public void fooBaa() {
        for(int i = 1; i <= 100; i++) {
            if(i % 3 == 0 && i % 5 == 0)
                System.out.println("FooBaa");
            else if(i % 3 == 0)
                System.out.println("Foo");
            else if(i % 5 == 0)
                System.out.println("Baa");
            else
                System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.fooBaa();
    }
}

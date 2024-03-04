import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int qtd = sc.nextInt();

        int total = 0;
        for (int i = 0; i < qtd; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            total += a * b;
        }

        System.out.println(total);
        sc.close();

    }

}

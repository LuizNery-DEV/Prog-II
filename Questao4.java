import java.util.Scanner;

public class Questao4 {

    // Esse método verifica se o número é par
    public static boolean isEven(int numero) {
        return numero % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;

        System.out.println("Digite vários números inteiros:");

        do {
            System.out.print("Número: ");
            numero = input.nextInt();

            if (numero != 0) {
                if (isEven(numero)) {
                    System.out.println(numero + " é par.");
                } else {
                    System.out.println(numero + " é impar");
                }
            }

        } while (numero != 0);

        System.out.println("Fim do programa!");
        input.close();
    }
}

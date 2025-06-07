import java.util.Scanner;

public class Questao1 {

    // a) Calcula a hipotenusa
    public static double hypotenuse(double side1, double side2) {
        return Math.sqrt(side1 * side1 + side2 * side2);
    }

    // b) Retorna o menor entre três inteiros
    public static int smallest(int x, int y, int z) {
        int menor = x;

        if (y < menor) {
            menor = y;
        }

        if (z < menor) {
            menor = z;
        }

        return menor;
    }

    // c) Exibe instruções
    public static void instructions() {
        System.out.println("\n--- Instruções ---");
        System.out.println("Este programa demonstra o uso de métodos.");
        System.out.println("Você irá informar valores para testes.");
    }

    // d) Converte inteiro para float
    public static float intToFloat(int number) {
        return (float) number;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        instructions();

        // Hipotenusa
        System.out.println("\n--- Cálculo da Hipotenusa ---");
        System.out.print("Informe o lado 1: ");
        double lado1 = entrada.nextDouble();

        System.out.print("Informe o lado 2: ");
        double lado2 = entrada.nextDouble();

        double h = hypotenuse(lado1, lado2);
        System.out.println("Hipotenusa: " + h);

        // Menor entre três inteiros
        System.out.println("\n--- Encontrar o Menor Número ---");
        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = entrada.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = entrada.nextInt();

        System.out.print("Digite o terceiro número inteiro: ");
        int num3 = entrada.nextInt();

        int menor = smallest(num1, num2, num3);
        System.out.println("Menor número: " + menor);

        // Conversão int para float
        System.out.println("\n--- Conversão de Inteiro para Float ---");
        System.out.print("Digite um número inteiro para converter: ");
        int numeroInt = entrada.nextInt();

        float convertido = intToFloat(numeroInt);
        System.out.println("Número convertido para float: " + convertido);

        entrada.close();
    }
}

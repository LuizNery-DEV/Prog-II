import java.util.Scanner;

public class Questao5 {


    public static int celsius(int fahrenheit) {
        return (int)(5.0 / 9.0 * (fahrenheit - 32));
    }

   
    public static int fahrenheit(int celsius) {
        return (int)(9.0 / 5.0 * celsius + 32);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Menu de Conversão de Temperatura");
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Converter Fahrenheit para Celsius");
        System.out.println("2 - Converter Celsius para Fahrenheit");
        System.out.print("Opção: ");
        int opcao = input.nextInt();

        if (opcao == 1) {
            System.out.print("Digite a temperatura em Fahrenheit: ");
            int tempF = input.nextInt();
            int resultadoC = celsius(tempF);
            System.out.println("Temperatura em Celsius: " + resultadoC + "°C");

        } else if (opcao == 2) {
            System.out.print("Digite a temperatura em Celsius: ");
            int tempC = input.nextInt();
            int resultadoF = fahrenheit(tempC);
            System.out.println("Temperatura em Fahrenheit: " + resultadoF + "°F");

        } else {
            System.out.println("Opção inválida!");
        }

        input.close();
    }
}


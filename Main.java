import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        int num1 = 0;
        int num2 = 0;
        int operacao = 0;
      
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        System.out.println("Digite o primeiro numero:");
        num1 = scanner.nextInt();

        System.out.println("Digite o segundo numero:");
        num2 = scanner.nextInt();

        System.out.println("Digite a operação:");
        operacao = scanner.nextInt();
      
        calculadora.Calcular(num1, num2, operacao);
    }
}

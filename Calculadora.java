public class Calculadora {
    public int num1;
    public int num2;
    public int resultado;

    public Calculadora(int num1, int num2, int operacao){
        switch(operacao){
            case 1:
                resultado = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + resultado);
                break;
            
            case 2:
                resultado = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + resultado);
                break;
            
            case 3:
                resultado = num1 * num2;
                System.out.println(num1 + " x " + num2 + " = " + resultado);
                break;
            
            case 4:
                resultado = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + resultado);
                break;
        }
    }
}

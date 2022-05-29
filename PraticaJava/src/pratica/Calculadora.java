package pratica;
/*Calculadora simples utilizando métodos
* */
public class Calculadora {
    public static void adicao(double numero1,double numero2){
        double resultado = numero1+numero2;
        System.out.println("O resultado da adição é: "+resultado);
    }
    public static void subitracao(double numero1,double numero2){
        double resultado = numero1-numero2;
        System.out.println("O resultado da subtração é: "+resultado);
    }
    public static void multiplicacao(double numero1,double numero2){
        double resultado = numero1*numero2;
        System.out.println("O resultado da multiplicação é: "+resultado);
    }
    public static void divisao(double numero1,double numero2){
        double resultado = numero1/numero2;
        System.out.println("O resultado da divisão é: "+resultado);
    }
}

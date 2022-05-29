package Dio;

public class Calculadora {
    public static void adicao(int numero1,int numero2){
        int total=numero1+numero2;
        System.out.println("O resultado da adição de "+numero1+" e "+numero2+" é "+total);
    }
    public static void sibtracao(int numero1,int numero2){
        int total=numero1-numero2;
        System.out.println("O resultado da subtração de "+numero1+" e "+numero2+" é "+total);
    }
    public static void multiplicacao(int numero1,int numero2){
        int total=numero1*numero2;
        System.out.println("O resultado da multiplicação de "+numero1+" e "+numero2+" é "+total);
    }
    public static void divisao(int numero1,int numero2){
        int total=numero1/numero2;
        System.out.println("O resultado da divisão de "+numero1+" e "+numero2+" é "+total);
    }
}

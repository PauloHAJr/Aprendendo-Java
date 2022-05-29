package Dio;

public class Fatorial {
    public static void soma(int a){
        int soma=1;
        for (int i=a;i>=1;i--){
            soma*=i;
        }
        System.out.println("O fatorial de "+a+" é: "+soma);
    }
}

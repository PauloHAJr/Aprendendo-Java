package Dio;

public class Mensagem {
    public static void mensagem(int h){
        if(h<12){
            System.out.println("Bom dia S2");
        }else if(h>12 && h<18){
            System.out.println("Boa tarde S2");
        }else{
            System.out.println("Boa noite S2");
        }
    }
}

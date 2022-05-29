package pratica;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int a,b;
        //String h;
        int j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Exercício Calculadora");
        /*Calculadora.adicao(3,6);
        Calculadora.subitracao(10,5);
        Calculadora.subitracao(5,3);
        Calculadora.divisao(20,4);*/

        /*System.out.println("Mensagem:");
        Mensagem.mensagem(8);
        Mensagem.mensagem(5);
        Mensagem.mensagem(22);*/

        System.out.println("Digite os números a serem calculados");
        a = sc.nextInt();
        b = sc.nextInt();

        Calculadora.adicao(a,b);
        Calculadora.subitracao(a,b);
        Calculadora.multiplicacao(a,b);
        Calculadora.divisao(a,b);

        /*System.out.println("Que horas são aí? ");
        h = sc.nextLine();
        System.out.println(h);*/

       // j= Integer.parseInt(h);

       // Mensagem.mensagem(j);

        System.out.println("\nDigite o valor do empréstimo");
        j = sc.nextInt();

        Financas.calculo(j);



    }
}

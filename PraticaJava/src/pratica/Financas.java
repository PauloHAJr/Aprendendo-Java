package pratica;

public class Financas {

    public static void calculo(int a){
        double juros[]=new double[6];
        double soma=0;
        double total;
        double parcela;
        for(int i=0;i < 6;i++){
            juros[i] = (a*5)/100;
            soma+=juros[i];
        }
        total=a+soma;
        parcela=total/6;

        System.out.printf("O valor do emprestimo R$%d,00 gerou R$%.2f de juros",a,soma);
        System.out.println();
        System.out.printf("O valor total séra R$%.2f e o valor de cada parcela será R$%.2f",total,parcela);
    }
}

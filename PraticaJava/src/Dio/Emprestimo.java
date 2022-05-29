package Dio;

public class Emprestimo {
    public static void calculo(double valor,int parcelas){
        double juros[]=new double[parcelas];
        double taxa =5;//5% de taxas de juros
        double soma=0;
        double total;
        double parcela;
        for(int i=0;i < juros.length;i++){
            juros[i] = (valor*taxa)/100;
            soma+=juros[i];
        }
        total=valor+soma;
        parcela=total/parcelas;

        System.out.printf("O valor do emprestimo R$%.2f,00 em %d parcelas gerou R$%.2f de juros",valor,parcelas,soma);
        System.out.println();
        System.out.printf("O valor total séra R$%.2f e o valor de cada parcela será R$%.2f",total,parcela);
        System.out.println();

    }
}

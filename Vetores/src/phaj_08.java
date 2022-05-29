import java.util.Scanner;
public class phaj_08 {//Nao
    /*Faça um programa em Java que receba a temperatura média de cada mês do ano,
      armazenando-as em um vetor. Calcule e mostre a maior e a menor temperatura do ano e em
      que mês ocorreram.*/
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        float[] tempM=new float[12];
        float maior=0;
        int indiceMaior=0;
        float menor=tempM[0];
        int indiceMenor=0;

        for (int i=0;i<12;i++){
            System.out.print("Qual foi a temperatura média do mês "+(i+1)+" : ");
            tempM[i]= scan.nextFloat();
        }
        for (int i=0;i< tempM.length;i++){
            if(maior<tempM[i]){
                maior=tempM[i];
                indiceMaior=i;
            }
        }
        for (int i=1;i< tempM.length;i++){
            if(tempM[i]<menor){
                menor=tempM[i];
                indiceMenor=i;
            }
        }
        switch (indiceMaior){
            case 0:
                System.out.printf("\nA maior temperatura do ano: %.1f foi no mês de Janeiro",maior);
                break;
            case 1:
                System.out.printf("\nA maior temperatura do ano: %.1f foi no mês de Fevereiro",maior);
                break;
            case 2:
                System.out.printf("\nA maior temperatura do ano: %.1f foi no mês de Março",maior);
                break;
            case 3:
                System.out.printf("\nA maior temperatura do ano: %.1f foi no mês de Abril",maior);
                break;
            case 4:
                System.out.printf("\nA maior temperatura do ano: %.1f foi no mês de Maio",maior);
                break;
            case 5:
                System.out.printf("\nA maior temperatura do ano: %.1f foi no mês de Junho",maior);
                break;
            case 6:
                System.out.printf("\nA maior temperatura do ano: %.1f foi no mês de Julho",maior);
                break;
            case 7:
                System.out.printf("\nA maior temperatura do ano: %.1f foi no mês de Agosto",maior);
                break;
            case 8:
                System.out.printf("\nA maior temperatura do ano: %.1f foi no mês de Setembro",maior);
                break;
            case 9:
                System.out.printf("\nA maior temperatura do ano: %.1f foi no mês de Outubro",maior);
                break;
            case 10:
                System.out.printf("\nA maior temperatura do ano: %.1f foi no mês de Novembro",maior);
                break;
            case 11:
                System.out.printf("\nA maior temperatura do ano: %.1f foi no mês de Dezembro",maior);
                break;
        }
        switch (indiceMenor){
            case 0:
                System.out.printf("\nA menor temperatura do ano: %.1f foi no mês de Janeiro",menor);
                break;
            case 1:
                System.out.printf("\nA menor temperatura do ano: %.1f foi no mês de Fevereiro",menor);
                break;
            case 2:
                System.out.printf("\nA menor temperatura do ano: %.1f foi no mês de Março",menor);
                break;
            case 3:
                System.out.printf("\nA menor temperatura do ano: %.1f foi no mês de Abril",menor);
                break;
            case 4:
                System.out.printf("\nA menor temperatura do ano: %.1f foi no mês de Maio",menor);
                break;
            case 5:
                System.out.printf("\nA menor temperatura do ano: %.1f foi no mês de Junho",menor);
                break;
            case 6:
                System.out.printf("\nA menor temperatura do ano: %.1f foi no mês de Julho",menor);
                break;
            case 7:
                System.out.printf("\nA menor temperatura do ano: %.1f foi no mês de Agosto",menor);
                break;
            case 8:
                System.out.printf("\nA menor temperatura do ano: %.1f foi no mês de Setembro",menor);
                break;
            case 9:
                System.out.printf("\nA menor temperatura do ano: %.1f foi no mês de Outubro",menor);
                break;
            case 10:
                System.out.printf("\nA menor temperatura do ano: %.1f foi no mês de Novembro",menor);
                break;
            case 11:
                System.out.printf("\nA menor temperatura do ano: %.1f foi no mês de Dezembro",menor);
                break;
        }

    }
}

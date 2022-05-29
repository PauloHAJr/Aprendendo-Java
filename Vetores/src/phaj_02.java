import java.util.Scanner;
public class phaj_02 {
    /*Faça um algoritmo em portugol e um programa em Java que preencha dois vetores de dez
      elementos numéricos cada um e mostre o vetor resultante com a intercalação deles.*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numA = new int[10];
        int[] numB= new int[10];
        int[] numT = new int[20];
        int j=0;

        for(int i=0;i<10;i++){
            System.out.print("Digite um número para ser adicionado no vetor A: ");
            numA[i] = sc.nextInt();
        }
        for(int i=0;i<10;i++){
            System.out.print("Digite um número para ser adicionado no vetor B: ");
            numB[i] = sc.nextInt();
        }
        for(int i=0;i<10;i++){
            numT[j]=numA[i];
            j++;
            numT[j]=numB[i];
            j++;
        }
        for(int i=0;i<20;i++){
            System.out.print(numT[i]+" ");
        }

    }
}



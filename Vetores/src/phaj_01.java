import java.util.Scanner;

public class phaj_01 {//Nao
    /*Faça um algoritmo em portugol e um programa em Java que preencha um vetor com nove
      números inteiros, calcule e mostre os números primos e suas respectivas posições.*/

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetor=new int[9];
        int[] primos=new int[9];
        int n=0;
        int contPrimo=0;

        for (int i=0;i<9;i++) {
            System.out.println("Vetor[" + i + "]: ");
            vetor[i] = scan.nextInt();
        }
        for (int i=0;i<9;i++) {
            n=vetor[i];
            for (int j = 1; j < n; j++) {
                if (n % j == 0) {
                    contPrimo++;
                    if (contPrimo == 2) {
                        primos[i] =n;
                    }
                }
            }
        }

        System.out.print("\nNúmeros primos: ");
        for (int k=0;k<9;k++) {
            if(primos[k]!=0)
                System.out.print(primos[k]+" ");
        }



    }
}
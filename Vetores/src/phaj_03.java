import java.util.Scanner;

public class phaj_03 {
    /*Faça um algoritmo em portugol e um programa em Java que preencha um vetor com oito
      números inteiros, calcule e mostre dois vetores resultantes. O primeiro vetor resultante deve
      conter os números positivos e o segundo, os números negativos. Cada vetor resultante vai ter,
      no máximo, oito posições, que poderão ser completamente utilizadas.*/

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] vetorI= new int[8];
        int[] vetorA= new int[8];
        int[] vetorB= new int[8];
        int n=0;

        for (int i=0;i<8;i++){
            System.out.print("Digite um número: ");
            vetorI[i] = scan.nextInt();
        }
        for (int j=0;j<8;j++){
            n=vetorI[j];
            if(n>0){
                vetorA[j]=n;
            }else{
                vetorB[j]=n;
            }
        }
        System.out.println("\nNúmeros positivos");
        for(int vetorP:vetorA){
            if(vetorP!=0)
                System.out.print(vetorP+" ");
        }System.out.println("\nNúmeros negativos");
        for(int vetorN:vetorB){
            if(vetorN!=0)
                System.out.print(vetorN+" ");
        }


    }
}

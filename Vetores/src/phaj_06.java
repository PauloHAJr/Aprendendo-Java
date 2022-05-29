import java.util.Scanner;

public class phaj_06 {
    /*Faça um programa em Java que, no momento de preencher um vetor com oito números
      inteiros, já os armazene de forma crescente.*/
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] vetor=new int[8];
        int aux;

        for (int i = 0; i < 8; i++) {
            System.out.print("Digite um número para ser adicionado no vetor: ");
            vetor[i] = scan.nextInt();
            for(int k=0;k < 8;k++){
                if(vetor[i] < vetor[k]){
                        aux=vetor[i];
                        vetor[i]=vetor[k];
                        vetor[k]=aux;
                }
            }
        }
        System.out.print("\nVetor crescente: ");
        for (int i=0;i<8;i++){
            System.out.print(vetor[i]+" ");
        }
    }
}

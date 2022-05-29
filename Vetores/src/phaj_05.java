import java.util.Scanner;
public class phaj_05 {
    /*Faça um programa em Java que preencha um vetor com dez números inteiros, calcule e mostre
      vetor resultante de uma ordenação decrescente.*/
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] vetor=new int[10];
        int aux;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número para ser adicionado no vetor: ");
            vetor[i] = scan.nextInt();
        }
        for (int i=0;i < 10;i++){
            for(int j=0;j < 10;j++){
                if(vetor[i] > vetor[j]){
                    aux=vetor[i];
                    vetor[i]=vetor[j];
                    vetor[j]=aux;
                }
            }
        }
        System.out.println("\nVetor na ordem decrescente: ");
        for (int i=0;i<10;i++){
            System.out.print(vetor[i]+" ");
        }

    }
}

import java.util.Scanner;
public class phaj_04 {//Nao
    /*) Faça um programa em Java que preencha dois vetores, X e Y, com dez números inteiros cada.
        Calcule e mostre os seguintes vetores resultantes:
         A união de X com Y (todos os elementos de X e de Y sem repetições).
         A diferença entre X e Y (todos os elementos de X que existam em Y, sem repetições).
         A soma entre X e Y (soma de cada elemento de X com o elemento da mesma posição em Y).
         O produto entre X e Y (multiplicação de cada elemento de X com o elemento de mesma posição em Y).
         A intersecção entre X e Y (apenas os elementos que aparecem nos dois vetores, sem repetições).*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] vetorX = new int[10];
        int[] vetorY = new int[10];
        int[] vetorR = new int[20];
        int[] vetorD = new int[10];
        int[] vetorS = new int[10];
        int[] vetorP = new int[10];
        int[] vetorI = Interseccao(vetorX, vetorY);
        int j = 10;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número para ser adicionado no vetor X: ");
            vetorX[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número para ser adicionado no vetor Y: ");
            vetorY[i] = sc.nextInt();
        }
        System.out.print("\nVetorX: ");
        for (int i=0;i<10;i++) {
            System.out.print(vetorX[i] + " ");
        }
        System.out.print("\nVetorY: ");
        for (int i=0;i<10;i++) {
            System.out.print(vetorY[i] + " ");
        }
        for (int i = 0; i < 10; i++) {
            vetorR[i] = vetorX[i];
            vetorR[j] = vetorY[i];
            j++;
        }
        System.out.print("\nUnião dos vetores: ");
        for (int uniao : vetorR) {
            System.out.print(uniao + " ");
        }
        //////
        for (int i = 0; i < 10; i++) {
            vetorD[i] = vetorX[i] - vetorY[i];
        }
        System.out.print("\nDiferença dos vetores: ");
        for (int diferenca : vetorD) {
            System.out.print(diferenca + " ");
        }
        ////
        for (int i = 0; i < 10; i++) {
            vetorS[i] = vetorX[i] + vetorY[i];
        }
        System.out.print("\nSoma dos vetores: ");
        for (int soma : vetorS) {
            System.out.print(soma + " ");
        }
        ////////
        for (int i = 0; i < 10; i++) {
            vetorP[i] = vetorX[i] * vetorY[i];
        }
        System.out.print("\nProduto dos vetores: ");
        for (int produto : vetorP) {
            System.out.print(produto + " ");
        }
        ////////////////
        System.out.print("\nInterseção dos vetores: ");
        for (int intersecao: vetorI){
            if(intersecao!=0)
             System.out.print(intersecao+" ");
        }



    }

    public static int[] Interseccao(int[] vetorX, int[] vetorY) {
        int[] aux = new int[20];

        for(int i=0;i< 10;i++){
            for(int j=0;j< 10;j++){
                if(vetorX[i]==vetorY[j]){
                    aux[i]=vetorX[i];
                }
            }
        }
        int[] vetorI=new int[20];
        for(int i=0;i<20;i++){
            vetorI[i]=aux[i];
        }
        return vetorI;

    }
}

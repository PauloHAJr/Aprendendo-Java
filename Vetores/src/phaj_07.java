import java.util.Scanner;
public class phaj_07 {
    /*Faça um programa em Java que preencha dois vetores com cinco elementos numéricos cada e,
      depois, ordene-os de forma crescente. Deverá ser gerado um terceiro vetor com dez posições,
      composto pela junção dos elementos dos vetores anteriores, também ordenado de maneira
      crescente.*/
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int[] vetorA=new int[5];
        int[] vetorB=new int[5];
        int[] vetorC=new int[10];
        int aux1;
        int aux2;
        int aux3;
        int k=5;

        for (int i=0;i<5;i++){
            System.out.print("Digite um número para ser adicionado  no vetor A: ");
            vetorA[i] = scan.nextInt();

        }
        for (int i=0;i < 5;i++){
            for(int j=0;j < 5;j++){
                if(vetorA[i] < vetorA[j]){
                    aux1=vetorA[i];
                    vetorA[i]=vetorA[j];
                    vetorA[j]=aux1;
                }
            }
        }
        for (int i=0;i<5;i++){
            System.out.print("Digite um número para ser adicionado  no vetor B: ");
            vetorB[i] = scan.nextInt();
        }
        for (int i=0;i < 5;i++){
            for(int j=0;j < 5;j++){
                if(vetorB[i] < vetorB[j]){
                    aux2=vetorB[i];
                    vetorB[i]=vetorB[j];
                    vetorB[j]=aux2;
                }
            }
        }
        for (int i=0;i < 5;i++){
            vetorC[i]=vetorA[i];
            vetorC[k]=vetorB[i];
            k++;
        }
        for (int i=0;i < 10;i++){
            for(int j=0;j < 10;j++){
                if(vetorC[i] < vetorC[j]){
                    aux3=vetorC[i];
                    vetorC[i]=vetorC[j];
                    vetorC[j]=aux3;
                }
            }
        }
        System.out.print("\nVetor A: ");
        for (int i=0;i < 5;i++){
            System.out.print(vetorA[i]+" ");
        }System.out.print("\nVetor B: ");
        for (int i=0;i < 5;i++){
            System.out.print(vetorB[i]+" ");
        }System.out.print("\nVetor C: ");
        for (int i=0;i < 10;i++){
            System.out.print(vetorC[i]+" ");
        }
    }
}

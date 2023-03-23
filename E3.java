import java.util.*;
public class E3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Digite o número de linhas da matriz: ");
        int n = leitor.nextInt();

        System.out.print("Digite o número de colunas da matriz: ");
        int m = leitor.nextInt();

        int[][] matriz = new int[n][m];
        int[] b = new int[n];

        for (int i = 0; i<n; i++){
            for (int j = 0; j<m; j++){
                matriz[i][j] = random.nextInt();
            }
        }

        //inicia a soma com zero
        for (int i = 0; i < n; i++) {
            b[i] = 0;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = random.nextInt(10) + 1;
            }
        }


        //Calcula a soma de cada linha e armazena no vetor
        for (int i = 0; i<n; i++){
            for (int j = 0; j<m; j++){
                b[i] += matriz[i][j];
            }
        }

        //imprime a matriz
        System.out.println("\nMatriz gerada:");
        for (int i = 0; i<n; i++){
            for (int j = 0; j<m; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        //imprime o vetor
        for (int i = 0; i<n; i++){
            System.out.print(" \nSoma da linha " + (i + 1) + ": " + b[i]);
        }
        System.out.println();

        int somaTotal = 0;
        for (int i = 0; i < n; i++) {
            somaTotal += b[i];
        }
        System.out.println("Soma total: " + somaTotal);
    }
}

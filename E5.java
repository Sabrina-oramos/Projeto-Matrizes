import java.util.*;
public class E5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Random random = new Random();

        //Dimenções das matrizes
        System.out.print("Digite o número de linhas: ");
        int n = leitor.nextInt();

        System.out.print("Digite o número de colunas: ");
        int m = leitor.nextInt();

        int[][] matrizA = new int[n][m];
        int[][] matrizB = new int[n][m];
        int[][] matrizC = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrizA[i][j] = random.nextInt(10);
                matrizB[i][j] = random.nextInt(10);
            }
        }

        //calcula a matriz C
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int soma = 0;
                for (int k = 0; k < m; k++) {
                    soma += matrizA[i][k] * matrizB[k][j];
                }
                matrizC[i][j] = soma;
            }
        }

        System.out.println("Matriz A");
        imprimeMatriz(matrizA);

        System.out.println("Matriz B");
        imprimeMatriz(matrizB);

        System.out.println("Matriz C (A * B)");
        imprimeMatriz(matrizC);

    }
        public static void imprimeMatriz(int[][] matriz) {
            int N = matriz.length;

            for (int i = 0; i<N; i++){
                for (int j = 0; j< matriz.length; j++){
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
    }
}
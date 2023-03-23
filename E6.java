import java.util.*;
public class E6 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Digite o número de linhas: ");
        int n = leitor.nextInt();
        System.out.print("Digite o número de colunas: ");
        int m = leitor.nextInt();

        int[][] matrizA = new int[n][m];

        for (int i = 0; i<n; i++){
            for (int j = 0; j<m; j++){
                matrizA[i][j] = random.nextInt(10);
            }
        }

        //Encontrar o menor valor
        int menorValor = matrizA[0][0];
        for (int i = 0; i<n; i++){
            for (int j = 0; j<m; j++){
                if (matrizA[i][j] < menorValor){ //se o número de linhas e colunas for menor que menorValor
                    menorValor = matrizA[i][j];
                }
            }
        }

        //Imprime matriz
        System.out.println("\nMatriz A");
        for (int i = 0; i<n; i++){
            for (int j = 0; j<m; j++){
                System.out.print(matrizA[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nO menor valor encontrado na matriz é: " + menorValor);

    }
}

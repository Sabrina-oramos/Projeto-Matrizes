import java.util.*;
public class E7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Digite o número de linhas: ");
        int n = leitor.nextInt();
        System.out.print("Digite o número de colunas: ");
        int m = leitor.nextInt();

        int[][] matrizA = new int[n][m];

        System.out.println();
        for (int i = 0; i<n; i++){
            for (int j = 0; j<m; j++){
                matrizA[i][j] = random.nextInt(10);//preenche a matriz com números aleatórios de 0 à 9
            }
        }

        //Encontra o maior valor
        int maiorValor = matrizA[0][0];
        for (int i = 0; i<n; i++){
            for (int j = 0; j<m; j++){
                if (matrizA[i][j] > maiorValor){
                    maiorValor = matrizA[i][j];
                }
            }
        }

        //imprime a matriz
        for (int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                System.out.print(matrizA[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nMaior valor encontrado na matriz: " + maiorValor);
    }
}

import java.util.Scanner;
public class E8 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a dimenção da matriz: ");
        int n = leitor.nextInt();

        int[][] matriz = new int[n][n];

        System.out.println("Digite os valores da matriz: ");
        for (int i = 0; i<n; i++){
            for (int j = 0; j<n; j++){
                System.out.printf("matriz[%d][%d]: ", i, j);
                matriz[i][j] = leitor.nextInt();
            }
        }

        //calcula a soma das linhas, colunas e diagonais
        int somaDiagonal = 0;
        int somaDiagonalSecundaria = 0;
        for (int i = 0; i<n; i++){
            int somaLinha = 0;
            int somaColuna = 0;
            for (int j = 0; j<n; j++){
                somaLinha += matriz[i][j];
                somaColuna += matriz[j][i];
                if (i == j){
                    somaDiagonal += matriz[i][j];
                }
                if (i + j == n - 1){
                    somaDiagonalSecundaria += matriz[i][j];
                }
            }
            if (somaLinha != somaColuna || somaLinha != somaDiagonal
                    || somaLinha != somaDiagonalSecundaria){
                System.out.println("\nA matriz não é um quadro mágico.");
                return;
            }
        }
        //Se chegou até aqui a matriz é um quadro mágico
        System.out.println("A matriz é um quadro mágico!");
    }
}
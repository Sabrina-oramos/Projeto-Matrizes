import java.util.*;
public class E9 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o número de linhas: ");
        int m = leitor.nextInt();
        System.out.print("Digite o número de colunas: ");
        int n = leitor.nextInt();

        int[][] matriz = new int[m][n];
        for (int i = 0; i<m; i++){
            for (int j = 0; j<n; j++){
                System.out.printf("matriz[%d][%d]: ", i,j);
                matriz[i][j] = leitor.nextInt();
            }
        }

        for (int i = 0; i<m; i++){
            for (int j = 0; j<n; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        //Soma todos os valores pares
        int somaPares = 0;
        for (int i = 0; i<m; i++){
            for (int j = 0; j<n; j++){
                if (matriz[i][j] % 2 == 0){
                    somaPares += matriz[i][j];
                }
            }
        }

        System.out.println("\nA soma dos números pares é: " + somaPares);

        leitor.close();

        //Soma os elementos dos índices ímpares
        int somaImpares = 0;
        for (int i = 1; i < m; i += 2) {
            for (int j = 1; j < n; j += 2) {
                somaImpares += matriz[i][j];
            }
        }

        System.out.println("A soma dos elementos dos índices ímpares é: " + somaImpares);

        //Valor do produto dos índices ímpares
        int produtoImpares = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] % 2 != 0) {
                    produtoImpares *= matriz[i][j];
                }
            }
        }
        System.out.println("Produto dos elementos ímpares da matriz: " + produtoImpares);

        //Busca um determinado número na matriz e retorna sua posição
        System.out.println("Digite um número para ser encontrado na matriz: ");
        int numero = leitor.nextInt();
        boolean encontrado = false;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] == numero) {
                    System.out.println("\nO número " + numero + " foi encontrado na posição [" + i + "][" + j + "]");
                    encontrado = true;
                    break;
                }
            }
            if (encontrado) {
                break;
            }
            encontrado = false; // redefine encontrado como falso para a próxima linha
        }

        if (!encontrado) {
            System.out.println("\nO número " + numero + " não foi encontrado!");
        }

        //Caso a matriz seja quadrada, soma da diagonal pricipal e secundária

        if (m == n){ //caso a linha for igual a coluna
            int DiagonalPricipal = 0;
            int DiagonalSecudaria = 0;
            for(int i = 0; i<m; i++){
                DiagonalPricipal += matriz[i][i];
                DiagonalSecudaria += matriz[i][n - 1 - i];
            }
            System.out.println("\nA soma da diagonal principal é: " + DiagonalPricipal);
            System.out.println("A soma da da=iagonal secundária é: " + DiagonalSecudaria);
        }else {
            System.out.println("\nA matriz não é quadrada!");
        }

        //Soma das linhas
        int[] somaLinha = new int[m];

        for (int i = 0; i<m; i++){
            for (int j = 0; j<n; j++){
                somaLinha[i] += matriz[i][j];
            }
        }
        //Soma das colunas
        int[] somaColuna = new int[n];

        for (int j = 0; j<n; j++){
            for (int i = 0; i<m; i++){
                somaColuna[j] += matriz[i][j];
            }
        }

        //imprime os resultados
        for (int i = 0; i<m; i++){
            System.out.print("\nA soma da linha " + (i + 1) + ": " + somaLinha[i]);
            }
        for (int j = 0; j<n; j++){
            System.out.print("Soma da linha " + (j + 1) + ": " + somaColuna);
        }
        System.out.println();
    }
}


import java.util.*;
public class E2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o tamanho da matriz: ");
        int n = leitor.nextInt();

        int[][] A = new int[n][n];
        Random random = new Random();

        for (int i = 0; i<n; i++){
            for (int j = 0; j<n; j++){
                A[i][j] = random.nextInt(10) + 1;
            }
        }

        System.out.println("\nMatriz gerada");
        for (int  i = 0; i < n; i++){
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }

        boolean repetidos = false;
        for (int i = 0; i<n; i++){
            for (int j = 0; j<n; j++){
                for (int k = i+1; k<n; k++){
                    for (int l = j+1; l<n; l++){
                        if (A[i][j] == A[k][l]){
                            repetidos = true;
                            break;
                        }
                    }
                    if (repetidos){
                        break;
                    }
                }
                if (repetidos){
                    break;
                }
            }
            if (repetidos){
                break;
            }
        }

        if (repetidos){
            System.out.println("\nA matriz possui elementos repetidos!");
        }else {
            System.out.println("\nA matriz não possui elementos repetidos!");
        }
    }
}
import java.util.*;
public class E10A {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Digite o tamanhos da matriz(MxM): ");
        int m = leitor.nextInt();
        
        int[][] matriz = new int[m][m];
        
        for (int i = 0; i<m; i++){
            for (int j = 0; j<m; j++){
                matriz[i][j] = random.nextInt(10);
            }
        }

        System.out.println("Diagonal principal da matriz: ");
        for (int i = 0; i<m; i++){
            for (int j = 0; j<m; j++){
                if (i == j){
                    System.out.print(matriz[i][j] + " ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

import java.util.*;
public class E10E {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a dimenção da matriz(MxM): ");
        int m = leitor.nextInt();

        int[][] matriz = new int[m][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if (i <= j) {
                    matriz[i][j] = 0;
                } else {
                    matriz[i][j] = (int) (Math.random() * 10);
                }
            }
        }

        System.out.println("Matriz: ");
        for (int i = 0; i<m; i++){
            for (int j = 0; j<m; j++){
                    System.out.print(matriz[i][j] + " ");
                }
            System.out.println();
            }
        }
    }


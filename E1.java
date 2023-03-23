public class E1 {
    public static void main(String[] args) {

        int[][] matriz = new int[2][5];

        int contador = 1;

        //for aninhado - um for dentro de outro
        for (int i = 0; i< matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = contador;
                contador++;
            }
        }

        System.out.println("Matriz(2x5)");

        for (int  i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j]);
                if (j < matriz[i].length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}






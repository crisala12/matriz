package newpackage;

public class NewClass {

    int[][] enteros;
    int[][] matrizdos;
    int[][] suma;

    public NewClass(int i, int j) {
        enteros = new int[i][j];

    }

    public void llenamatriz() {
       
        for (int i = 0; i < enteros.length; i++) {
            for (int j = 0; j < enteros[i].length; j++) {

                enteros[i][j] = (int) (Math.random() * 10);
                

            }

        }

    }

    public void imprimirMatriz() {
 System.out.println("LA MATRIZ NUMERO UNO ES: ");
        for (int i = 0; i < enteros.length; i++) {

            for (int j = 0; j < enteros[i].length; j++) {
                System.out.print(enteros[i][j] + "");

            }
            System.out.println(" ");
        }
    }

    public void llenarmatrizdos(int x, int y) {
        matrizdos = new int[x][y];
        for (int i = 0; i < matrizdos.length; i++) {
            for (int j = 0; j < matrizdos[i].length; j++) {
                matrizdos[i][j] = (int) (Math.random() * 10);

            }

        }

    }

    public void mostrarmatrizdos() {
        System.out.println("\nLA SEGUNDA MATRIZ ES: ");
        for (int i = 0; i < matrizdos.length; i++) {
            for (int j = 0; j < matrizdos[i].length; j++) {
                System.out.print(matrizdos[i][j]+" ");

            }
            System.out.println("");

        }
    }

    public void sumatotal(int x, int y) {
        suma = new int[x][y];
        for (int i = 0; i < suma.length; i++) {
            for (int j = 0; j < suma[i].length; j++) {
                suma[i][j] = enteros[i][j] + matrizdos[i][j];

            }

        }

    }

    public void mostrarsumatotal() {
        System.out.println("\nla suma de la mtrices es: ");
        for (int i = 0; i < suma.length; i++) {
            for (int j = 0; j < suma[i].length; j++) {
                System.out.print(suma[i][j] + " ");

            }
            System.out.println("");

        }

    }
}

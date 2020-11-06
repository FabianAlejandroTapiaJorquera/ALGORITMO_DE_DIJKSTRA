//FABIAN ALEJANDRO TAPIA JORQUERA
//RUT:19.230.622-1
package DIJKSTRA;

import java.util.Scanner;


public class MAIN {
        
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int[][] matrizCostos={{9999,14,9999,9999,9999,9999},{9999,9999,9,6,9999,9999},{9999,9999,9999,9999,9999,12},{16,9999,9999,9999,8,9999},{9999,13,4,9999,9999,9999},{9999,25,9999,9999,11,9999}};
        /*for(int i=0; i<6; i++){
            for(int j=0; j<6; j++){
                System.out.print("Ingrese el valor de la matriz posicion["+(i+1)+"]["+(j+1)+"]: ");
                matrizCostos[i][j]=entrada.nextInt();
            }
        }*/
        
        /*for(int k=0; k<6; k++){
            for(int l=0; l<6; l++){
                System.out.print(matrizCostos[k][l]+" ");
            }
            System.out.println("");
        }*/ 
        
        int[] verticeInicial={9999, 14 ,9999, 9999, 9999, 9999};
        //int[] verticeInicial={9999, 9999 , 9, 6, 9999, 9999};
        //int[] verticeInicial={9999, 9999 ,9999, 9999, 9999, 12};
        //int[] verticeInicial={16, 9999 ,9999, 9999, 8, 9999};
        //int[] verticeInicial={9999, 13 ,4, 9999, 9999, 9999
        //int[] verticeInicial={9999, 25 ,9999, 9999, 11, 9999};
        verticeInicial=Función_Dijkstra.algoDijkstra(verticeInicial, 6, matrizCostos, 0);
        System.out.println("Vector de costos: ");
        for(int z=0; z<6; z++){
            System.out.print(verticeInicial[z]+" ");
        }
    }
}

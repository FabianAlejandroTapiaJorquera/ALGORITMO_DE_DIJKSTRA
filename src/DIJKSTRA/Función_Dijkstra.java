package DIJKSTRA;

public class Función_Dijkstra {
  
    public static int buscadorMinimos(int a, int b){
        if(a < b)
            return a;
        else
            return b;
    }
    
    public static int[] algoDijkstra(int[] vertIni, int n, int[][] costos, int vertice){//vertice a=0 , b=1 , c=2;.....
        boolean[] ocupados=new boolean[n];
        for(int b=0; b<n; b++)
            ocupados[b]=false;
        
        
        int comparador=vertIni[0], w=0;
        for(int i=0; i<n; i++){
            //BUSCANDO EL VERTICE MÍNIMO
            for(int a=0; a<n; a++){
                if(vertIni[a] < comparador){
                    if(ocupados[a] == false){
                        comparador=vertIni[a];
                        w=a;
                    }
                }
            }
            ocupados[w]=true;
            for(int c=0; c<n; c++){
                if(ocupados[c] == false){
                    vertIni[c] = buscadorMinimos(vertIni[c], vertIni[w]+ costos[w][c]);
                }
            }
            comparador=vertIni[0];
        }
        vertIni[vertice]=9999;
        return vertIni;
    }
    
}
import java.util.Scanner;



public class EliminacionGauss {
    private static final Scanner teclado = new Scanner(System.in);
     

   
    public static double[][] creamatriz() {
        int x=0;
        System.out.println("Ingresa el tamaño de la matriz");
        x=teclado.nextInt();
        double matriz[][] = new double[x][x];
        return matriz;
       }

       public static double[][] rellenamatriz(double[][]matriz){
           int x=0;
           double f=0;
           do{
               for(int i=0; i<matriz.length;i++){
                System.out.println("Ingresa el valor de X"+(i+1)+" en R"+(x+1));
                f=teclado.nextDouble();
                matriz[x][i]=f;
                }
                x=x+1;
    }while(x<matriz[0].length);
     
          return matriz;
       }

       public static void imprimematriz (double[][]matriz){
        for (int a=0; a < matriz.length; a++) 
        {
           for (int y=0; y < matriz[a].length; y++) 
           {
       
            System.out.print(" | ");System.out.print (matriz[a][y]); System.out.print(" | ");
       
           }
         System.out.println();
       
           } 
       }
       
       public static void operacion (double[][]matriz){  
        double primera[][] = new double[matriz[0].length][matriz.length];
        for(int i=0; i<matriz.length;i++){
            primera[0][i]=matriz[0][i];
        }
        double matrizc[] = new double[matriz.length];
        matrizc=matrizc(matriz);
         primera[1][0]=0;
         
       }

       public static double[] matrizc (double[][]matriz){
           double matrizc[] = new double[matriz.length];
           double aux=0;
           for(int i=0;i<matrizc.length; i++){
               System.out.println("Ingresa el valor de C"+(i+1));
                aux=teclado.nextDouble();
               matrizc[i]=aux;
           }
           return matrizc;

       }

       public static void main(String[] args) {
        
    }
}

import java.util.Scanner;
public class Uri1060{
    public static void main(String arg[]){
        Scanner teclado = new Scanner(System.in);
        float numero;
        int qtdePositivos=0;

        // como eu conto ate 6?
        for (int cont=1; cont <=6; cont++){
            numero = teclado.nextFloat();
            if (numero > 0){
                //System.out.println("Voce digitou");
                qtdePositivos++;
            }
        }
        System.out.println(qtdePositivos+"valores positivos");
    }
}
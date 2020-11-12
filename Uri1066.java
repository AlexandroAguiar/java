import java.util.Scanner;
public class Uri1066{
    public static void main(String arg[]){
        Scanner teclado = new Scanner(System.in);
        int numero;
        int qtdePositivos=0; 
        int qtdeNegaivos=0;
        int Valpares=0; 
        int Valimpares=0;

        for (int cont=1; cont<=5; cont++){
            numero = teclado.nextInt();
            if (numero %2 == 0){
                Valpares++;
            }
            else {
                Valimpares++;
            }
            if ( numero > 0 ){
                qtdePositivos++;
            }
            else if (numero < 0) {
                qtdeNegaivos++;
            }
       }
       System.out.println(Valpares+ " valor(es) par(es)");
       System.out.println(Valimpares+ " valor(es) impar(es)");
       System.out.println(qtdePositivos+ " valor(es) positivo(s)");
       System.out.println(qtdeNegaivos+ " valor(es) negativo(s)");
    }
}

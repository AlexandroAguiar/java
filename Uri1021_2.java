import java.util.Scanner;
public class Uri1021_2{
 public static void main(String args[]){
 Scanner teclado = new Scanner(System.in);
 
 float valorOriginal;
 int valorInteiro;
 float centavos;
 int valorCentavos;
 
 valorOriginal = teclado.nextFloat();
 valorInteiro = (int)valorOriginal;
 centavos = valorOriginal - valorInteiro;
 valorCentavos = Math.round(centavos*100);
 
 System.out.println("Valor original = "+valorOriginal);
 System.out.println("Valor inteiro = "+valorInteiro);
 System.out.println("Centavos = "+centavos);
 System.out.println("Valor Centavos = "+valorCentavos);
 
 }
}
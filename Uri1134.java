import java.util.Scanner;
public class Uri1134{
public static void main(String args[]){
    Scanner teclado= new Scanner(System.in);
    int cod;
    int alc, gas, dis;
    alc=0;
    gas=0;
    dis=0;
    do{
        cod = teclado.nextInt();
        if (cod == 1){
            alc++;
        }
        else if (cod == 2){
            gas++;
        }
        else if (cod == 3){
            dis++;
        }
    }
    while (cod != 4);
    System.out.println("MUITO OBRIGADO");
    System.out.println("Alcool: "+alc);
    System.out.println("Gasolina: "+gas);
    System.out.println("Diesel: "+dis);
 }
}

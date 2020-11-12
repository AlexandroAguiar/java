import java.util.Scanner;
public class Uri1037{
public static void main(String args[]){
    Scanner teclado= new Scanner(System.in);
    float num;

    num = teclado.nextFloat();
    

    if (num >= 0f && num <= 25.0f){
        System.out.println("Intervalo [0,25]");
    }
    else if (num > 25.0f && num <= 50.0f){
        System.out.println("Intervalo (25,50]");
    }
    else if (num > 50.0f && num <= 75.0f){
        System.out.println("Intervalo (50,75]");
    }
    else if (num > 75.0f && num <= 100.0f){
        System.out.println("Intervalo (75,100]");
    }
    else{
        System.out.println("Fora de intervalo");
    }    
  }
 }
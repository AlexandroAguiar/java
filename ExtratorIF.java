import java.util.Scanner;
public class ExtratorIF{
public static void main(String args[]){
    float n1, p, media;

    System.out.println("Digite a nota da prova");
    n1 = teclado.nextFloat();
    System.out.println("Digite a nota do projeto");
    p = teclado.nextFloat();

    media = (n1 + p)/2;

    System.out.println("Sua media =" +media);

    if ( media >= 6 ){
        System.out.println("Parabens voce passou!");
    }
    else {
        System.out.println("Dessa voce não passou!");
    }
    System.out.println("FIM");
    }
}
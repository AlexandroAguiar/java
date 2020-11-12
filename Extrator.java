import java.util.Scanner;
public class Extrator{
public static void main(String args[]){
    Scanner teclado = new Scanner(System.in);
        int numero;
        int un, de, ce;
        int resto; // para armazenar o resto da divisão

        //entrada
        numero = teclado.nextInt();
        
        //processamento
        ce = numero / 100; // se eu pegar esse numero e dividir por 100, obtenho as centenas.
        resto = numero % 100;
        
        
        de = resto / 10; // se eu pegar esse numero e dividir por 10, obtenho as dezenas.
        un = resto % 10;
        
        //saida
        
        System.out.println("Centena: "+ce);
        System.out.println("Sobrou:  "+resto);
        System.out.println("Dezena:  "+de);
        System.out.println("Unidade: "+un);

    }
}
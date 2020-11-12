import java.util.Scanner; // declaro a importancia  da biblioteca
/*
    exemplo de Leitura de dados via teclado
    DETALHE: O Scanner utiliza como idioma padrão, o idioma da máquina. Isso sgnifica que por exemplo, ao usuario digitar um numero real (double ou float),
    o separador de casas decimais é o  do idioma padrão (no nosso caso, português do Brasil, é a virgula - ,).

*/

public class Leituras{
    public static void main(String args[]){ 
        
        // preciso criar o componente
        Scanner teclado;
        teclado = new Scanner(System.in); // crio o componente apontando-o para o dispositivo de entrada padrão (teclado)
    int valorInteiro;
    float valorReal;
    System.out.println("Por favor, digite o numero inteiro:");
    valorInteiro = teclado.nextInt();
    System.out.println("O valor inteiro " + valorInteiro + " foi digitado por você");

    System.out.println("Agora digite o valor real:");
    valorReal = teclado.nextFloat();
    System.out.println("O valor real " + valorReal + " foi digitado por você");
    System.out.printf("O valor com 2 casas decimais: %.2f que vc digitou\n" ,valorReal);

}

}
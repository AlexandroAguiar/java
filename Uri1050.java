import java.util.Scanner;
public class Uri1050{
public static void main(String args[]){
    Scanner teclado= new Scanner(System.in);
    int cod;
    String cidade;

    cod = teclado.nextInt();
    

    if (cod == 61){
        cidade = "Brasilia";
    }
    else if (cod == 71){
        cidade = "Salvador";
    }
    else if (cod == 11){
        cidade = "Sao Paulo";
    }
    else if (cod == 21){
        cidade = "Rio de Janeiro";
    }
    else if (cod == 32){
        cidade = "Juiz de Fora";
    }
    else if (cod == 19){
        cidade = "Campinas";
    }
    else if (cod == 27){
        cidade = "Vitoria";
    }
    else if (cod == 31){
        cidade = "Belo Horizonte";
    }
    else{
        cidade = "DDD nao cadastrado";
    }
    System.out.println(cidade);
 }
}
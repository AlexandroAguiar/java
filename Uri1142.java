import java.util.Scanner;
public class Uri1142{
public static void main(String args[]){
    Scanner teclado= new Scanner(System.in);
    int N, Res, Res2, Res3;
    N = 0;
    Res = 1;
    Res2 = 2;
    Res3 = 3;
    
    N = teclado.nextInt();
    for (int cont=1 ; cont <=N ; cont++){
        System.out.println(+Res + " " + Res2 + " " + Res3 + " PUM");
        Res+=4;
        Res2+=4;
        Res3+=4;
    }
 }
}
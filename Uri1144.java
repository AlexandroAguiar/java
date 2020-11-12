import java.util.Scanner;
public class Uri1144{
public static void main(String args[]){
    Scanner teclado= new Scanner(System.in);
    int N, Res, Res2, Res3;
    N = 0;
    Res = 1;
    
    N = teclado.nextInt();
    for (int cont=1 ; cont <=N ; cont++){
        System.out.println(Res + " " +(Res*Res)  + " " +(Res*Res*Res));
        System.out.println(Res + " " +(Res*Res+1)  + " " +(Res*Res*Res+1));
        Res+=1;
    }
 }
}
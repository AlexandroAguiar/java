import java.util.Scanner;
public class Uri1051{
public static void main(String args[]){
    Scanner teclado= new Scanner(System.in);
    double VE,IMP1,RES;

    VE = teclado.nextDouble();
    
    if (VE <= 2000){
        System.out.println("Isento");
    }
    else if (VE > 2000 && VE <= 3000){
        IMP1 = (VE - 2000);
        RES = ( IMP1 * 0.08);
        System.out.printf("R$ %.2f\n",RES);
    }
    else if (VE > 3000 && VE <= 4500){
        IMP1 = (VE - 3000)*0.18 + (3000-2000)*0.08;   
        System.out.printf("R$ %.2f\n",IMP1);
    }
    else {
        IMP1 = (VE - 4500.0) * 0.28 + (4500 - 3000)*0.18 +(3000.0 - 2000.0)*0.08;
        System.out.printf("R$ %.2f\n",IMP1);
    }
  }
 }
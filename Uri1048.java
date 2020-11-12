import java.util.Scanner;
public class Uri1048{
public static void main(String args[]){
    Scanner teclado= new Scanner(System.in);
    int perc;
    float sal, reaj, novsal;

    sal = teclado.nextFloat();
    

    if (sal >= 0 && sal <= 400.00){
        novsal = sal + sal * 0.15f;
        reaj = novsal - sal;
        System.out.printf("Novo salario: %.2f\n",novsal);
        System.out.printf("Reajuste ganho: %.2f\n",reaj); 
        System.out.printf("Em percentual: 15 %%\n");
    }
    else if (sal > 400.00 && sal <= 800.00){
        novsal = sal + sal * 0.12f;
        reaj = novsal - sal;
        System.out.printf("Novo salario: %.2f\n",novsal);
        System.out.printf("Reajuste ganho: %.2f\n",reaj); 
        System.out.printf("Em percentual: 12 %%\n");
    }
    else if(sal > 800.00 && sal <= 1200.00){
        novsal = sal + sal * 0.10f;
        reaj = novsal - sal;
        System.out.printf("Novo salario: %.2f\n",novsal);
        System.out.printf("Reajuste ganho: %.2f\n",reaj); 
        System.out.printf("Em percentual: 10 %%\n");
    }
    else if(sal > 1200.00 && sal <= 2000.00){
        novsal = sal + sal * 0.07f;
        reaj = novsal - sal;
        System.out.printf("Novo salario: %.2f\n",novsal);
        System.out.printf("Reajuste ganho: %.2f\n",reaj); 
        System.out.printf("Em percentual: 7 %%\n");
    }
    else{
        novsal = sal + sal * 0.04f;
        reaj = novsal - sal;
        System.out.printf("Novo salario: %.2f\n",novsal);
        System.out.printf("Reajuste ganho: %.2f\n",reaj); 
        System.out.printf("Em percentual: 4 %%\n");
    }    
 }
}
import java.util.Scanner;
public class Uri1052{
public static void main(String args[]){
    Scanner teclado= new Scanner(System.in);
    int cod;
    String month;

    cod = teclado.nextInt();
    

    if (cod == 1){
        month = "January";
    }
    else if (cod == 2){
        month = "February";
    }
    else if (cod == 3){
        month = "March";
    }
    else if (cod == 4){
        month = "April";
    }
    else if (cod == 5){
        month = "May";
    }
    else if (cod == 6){
        month = "June";
    }
    else if (cod == 7){
        month = "July";
    }
    else if (cod == 8){
        month = "August";
    }
    else if (cod == 9){
        month = "September";
    }
    else if (cod == 10){
        month = "October";
    }
    else if (cod == 11){
        month = "November";
    }
    else{
        month = "December";
    }
    System.out.println(month);
 }
}
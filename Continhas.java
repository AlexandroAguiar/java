public class Continhas { 
    public static void main(String args[]){
        // poderia tambem fazer int a,b,c;
        int a; 
        int b;
        int c;

        a = 19;
        b = 3;
        c = a +b;
        System.out.println("Valor da soma = " + c);

        c = a - b;
        System.out.println("Valor da subtração = " + c);

        c = a * b;
        System.out.println("Valor da multiplicação = " + c);

        c= a / b;
        System.out.println("Valor da divisão = " + c);

        c = a % b;
        System.out.println("Valor da diferença = " + c);

        double d;

        d = 1 / 2;
        System.out.println("Valor do d resultado inteiro = " + d);

        d = 1.0 / 2;
        System.out.println("Valor do d resultado doble = " + d);

        float e;

        e = 1f / 2;
        System.out.println("Valor do d resultado float com f = " + e);

        e =(float)1.0 / 2;
        System.out.println("Valor do d resultado float antes= " + e);


    }
}
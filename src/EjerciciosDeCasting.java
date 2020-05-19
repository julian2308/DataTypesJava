public class EjerciciosDeCasting {
    public static void main(String[] args) {

        char c = 'Z';
        int intC = (int) c;
        System.out.println("Valor inicial de c: " + c);
        System.out.println("c convertido a int " + intC);

        //int i = 250; conviertelo a long y luego de long a short
        int i = 250;
        long iL = i;
        short iS = (short) iL;
        System.out.println("El valor inicial de i es: " + i);
        System.out.println("i convertido a long: " + iL);
        System.out.println("i convertido a short: " + iS);

        //dobule d = 301.607 conviertelo a long
        double d = (long)301.067;
        System.out.println(d);

        //int a = 100; súmale 5000.66 y conviertelo a float
        int a = (int) (100+5000.66);
        float aF = a;
        System.out.println(aF);

        //int i = 737; multiplícalo por 100 y conviertelo a byte
        int b = (byte)(737*100);
        System.out.println(b);

        //double d = 298.638; divídelo entre 25 y conviertelo a long
        double e = (long)(298.638/25);











    }
}

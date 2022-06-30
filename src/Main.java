public class Main {
    
    public static void main(String[] args)
    {
        suma( 10,20,30);


    }

    public static void suma(int num1, int num2, int num3)
    {
        int resultado = num1+num2+num3;

        System.out.println("la suma es: " + resultado);

        Coche MiCarro = new Coche();

        MiCarro.AgregarNumPuertas(3);
        MiCarro.Imprimir();

    }
}
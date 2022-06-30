public class Coche {
    private int NumPuertas;

    public void setNumPuertas(int numPuertas) {
        this.NumPuertas = numPuertas;
    }

    public void AgregarNumPuertas(int numPuertas) {
        this.NumPuertas += numPuertas;
    }

    public void Imprimir() {
        System.out.println("Numero de Puertas: " + NumPuertas);
    }

}

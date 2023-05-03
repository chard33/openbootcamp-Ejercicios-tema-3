public class Main {
    public static void main(String[] args) {

        int resultado = suma(1, 2, 3);
        coche coche1 = new coche();

        System.out.println("El resultado de la suma es: " + resultado);

        coche1.agregarPuertas();
        coche1.agregarPuertas();
        coche1.agregarPuertas();

        System.out.println("Numero de puertas del coche: " + coche1.puertas);
    }
    public static int suma(int a, int b, int c){
        return a + b + c;
    }
}

class coche{

    int puertas;

    public void agregarPuertas(){

        this.puertas++;
    }
}
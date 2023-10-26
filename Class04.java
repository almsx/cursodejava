public class Class04 {
    public static void main(String[] args) {
        // Operadores Lógicos

        // And
        boolean esMayorDeEdad = false;
        boolean documentoIdentificacion = true;

        if (esMayorDeEdad && documentoIdentificacion) {
            System.out.println("And - Puede entrar al bar");
        } else {
            System.out.println("And - No puede entrar al bar");
        }

        // or
        if (esMayorDeEdad || documentoIdentificacion) {
            System.out.println("OR - Puede entrar al bar");
        } else {
            System.out.println("OR - No puede entrar al bar");
        }

        // Not
        if (!esMayorDeEdad){
            System.out.println("Not - Puede entrar al bar");
        } else {
            System.out.println("Not - No Puede entrar al bar");
        }

        // Como representar una operación de tipo exponencial
        double numero2ala3 = Math.pow(2,3);
        System.out.println("2 a la tercera potencia vale "+numero2ala3);

        // Raiz cuadrada
        double raizCuadrada = Math.sqrt(81);
        System.out.println("La raiz cuadrada de 25 es "+raizCuadrada);
        int entero = (int) Math.sqrt(25);
        System.out.println("La raiz cuadrada de 25 en entero es "+entero);
        double raizCuadrada666 = Math.sqrt(666);
        System.out.println("La raiz cuadrada de 666 es "+raizCuadrada666);
        int entero666 = (int) Math.sqrt(666);
        System.out.println("La raiz cuadrada de 666 en entero es "+entero666);


    }
}

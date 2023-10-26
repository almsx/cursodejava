public class Class02 {
    public static void main(String[] args) {
        // Crearemos un arreglo de enteros con un valor inicial de 5.
        int numeros[] = new int[5];

        // inicializar arreglo numeros
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;
        //numeros[5] = 6;

        // Acceder al arreglo
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Valor de arreglo en la posición " + i + " es: " + numeros[i]);
        }

        // Arreglo de Strings
        String[] alumnasMC  = {"Tania", "Quetzali", "Hanna", "Daniela", "Lizbeth", "Andrea", "Brenda", "Dalila"};
        for (String nombre: alumnasMC){
            System.out.println("Nombre de alumna: " + nombre);
        }

        // Arreglo de Ventas con tipo Double
        double[] ventas = {1200.50, 740.00, 310.49, 100.00};
        for (int i = 0; i < ventas.length; i++) {
            System.out.println("Ventas " + i + " es: " + ventas[i]);
        }

        // Arreglo de chars
        char[] respuestas = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        for (int i = 0; i < respuestas.length; i++) {
            System.out.println("RESPUESTAS " + i + " es: " + respuestas[i]);
        }

        // Arreglo de booleans
        boolean[] asientosDisponibles = {true, true, true, false, false};
        for (int i = 0; i < asientosDisponibles.length; i++) {
            
            if (asientosDisponibles[i]){
                System.out.println("Asiento " + i + " disponible");
            } else {
                System.out.println("Asiento " + i + " no disponible");
            }
        }
   }
}

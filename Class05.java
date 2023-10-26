import java.util.Scanner;
public class Class05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            
            int edad = ingresoDatos(scanner);
            
            if (edad >= 18) {
                System.out.println("Puede entrar al bar");
            } else {
                System.out.println("No puede entrar al bar");
            }

        } catch(Exception e){
            System.out.println("Error: " + e);
        } finally {
            scanner.close();
        }
    }

    public static int ingresoDatos(Scanner scanner){
        int edad = 0;
        boolean validacion = false;

        while (!validacion){
            try{

                System.out.println("Ingresa la edad para saber si puedes entrar");
                edad = Integer.parseInt(scanner.nextLine());

                if (edad >= 0 && edad <= 99){
                    validacion = true;
                } else {
                    System.out.println("La edad no puede ser negativa.");
                }

            } catch(NumberFormatException e){
                System.out.println("Error: Debes ingresar un número entre 0 y 99");
            }
        }
        return edad;
    }
}

public class Class01{
    public static void main(String[] args){
        System.out.println("Hola Mundo");

        // Variables
        
        // Enteros
        int entero1 = 5;
        int entero2= -5;
        long enteroLong = 5;
        byte enteroByte = 5;
        short enteroShort = 5;
        // -128 a 127
        byte ariday1 = -128; 
        int ariday2 = 300;

        System.out.println("Entero 1 " + entero1);
        System.out.println("Entero 2 " + entero2);
        System.out.println("Entero Long " + enteroLong);
        System.out.println("Entero Byte " + enteroByte);
        System.out.println("Entero Short " + enteroShort);
        System.out.println("Byte ari 1 " + ariday1);
        System.out.println("Byte ari 2 " + ariday2);

        // enteros
        // -2,147,483,648 a 2,147,483,647
        int masGrande1= 2147483647;
        int masGrande2= 2147483647;

        // double
        // 64 bits u 8 bytes de espacio.
        

        //Reales

        float valor1 = 3.1416f;
        double valor2 = 4;
        System.out.println("Valor 1 flotante " + valor1);
        System.out.println("Valor 2 double " + valor2);


        // Booleanos

        boolean hayMasterClass = false;
        boolean irAlCine = true;

        if (hayMasterClass == true){
            System.out.println("Hoy aprenderé Java!!!");
        } else {
            System.out.println("Sigo estudiando en IBM Skills");
        }

        if (irAlCine == true){
            System.out.println("Veremos El Exorcista");
        } else {
            System.out.println("Seguir estudiando en IBM Skills");
        }

        // Cadenas
        String cadenaHolaMundo = "Hola mundo!";
        String cadenaMC = "Bienvenidas a la Master class de Java";

        int longitud1 = cadenaHolaMundo.length();
        int longitud2 = cadenaMC.length();

        System.out.println("Longitud de cadena 1 " + longitud1);
        System.out.println("Longitud de cadena 2 " + longitud2);

        // Chars
        char inicial = 'A';
        System.out.println("Valor de inicial "+inicial);

        // Manipular caracteres inidividuales en cadenas
        String nombre = "alberto";
        char primerCaracter = nombre.charAt(0);

        // Obtener RFC de Alberto
        // 2 letras del apellido paterno
        // 1 letra del apellido materno
        // 1 letra del nombre
        // 6 digitos - 2 año - 2 mes - 2 día
        String name = "Alberto";
        String apaterno = "Luebbert";
        String amaterno = "Mendoza";
        String mes = "05";
        String dia = "13";
        String anio = "87";

        char rfcPaterno1 = apaterno.charAt(0);
        char rfcPaterno2 = apaterno.charAt(1);
        char rfcMaterno1 = amaterno.charAt(0);
        char rfcNombre = name.charAt(0);

        String rfc = "" + rfcPaterno1 + rfcPaterno2 + rfcMaterno1 + rfcNombre + anio + mes + dia;
        System.out.println("El RFC mayusculas es: "+rfc.toUpperCase());
        System.out.println("El RFC mayusculas es: "+rfc.toLowerCase());

        // Calcular la HomoClave
        // Todo - Generar las letras aleatorias
        String homo = "JIA";
        String rfcFinal = rfc + homo;
        System.out.println("RFC con homoclave  "+rfcFinal.toUpperCase());
        


    }
}
public class Class03 {
    public static void main(String[] args) {
        // mayor que
        // menor que
        // Mayor o igual que
        // menor o igual que 
        // igual

        int valor1 = 10;
        int valor2 = 20;

        boolean mayorQue = valor1 > valor2;
        boolean menorQue = valor1 < valor2;
        boolean mayorIgualQue = valor1 >= valor2;
        boolean menorIgualQue = valor1 <= valor2;
        boolean igualQue = valor1 == valor2;

        System.out.println("Mayor que: " + mayorQue);
        System.out.println("Menor que: " + menorQue);
        System.out.println("Mayor o igual que: " + mayorIgualQue);
        System.out.println("Menor o igual que: " + menorIgualQue);
        System.out.println("Igual que: " + igualQue);

    }
}

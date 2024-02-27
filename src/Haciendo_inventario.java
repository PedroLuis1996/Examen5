import java.util.HashSet;
import java.util.Scanner;

public class Haciendo_inventario {
    public static void main(String[] args) {
        int numero;
        String palabra;
        boolean bucle = false;
        Scanner scanner = new Scanner(System.in);
        numero = scanner.nextInt();
        do {
            if (numero > 150000){
                System.out.println("no puede ser mayor de 150.000");
                numero = scanner.nextInt();
            } else {
                bucle = true;
            }
        }while(!bucle);
        HashSet<String> lista = new HashSet<>();
        scanner.nextLine();
        for (int i = 0; i != numero; i++){
            bucle = false;

            palabra = scanner.nextLine();
            do {
                if(palabra.length()> 20){
                    System.out.println("no puede tener mas de 20 letras");
                    palabra = scanner.nextLine();
                } else if (palabra.equals("0")) {
                    break;

                } else {
                    bucle = true;
                }
            }while(!bucle);

            palabra.toLowerCase();
            lista.add(palabra);




        }
        System.out.println(lista.size());






    }
}

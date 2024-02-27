import java.sql.Array;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Ut5_1 {
    public static void main(String[] args) {
        TreeSet<Integer> primitiva = new TreeSet<>();







        for (int i = 0; i < 7; i++){
            boolean bucle = false;
            int numero;
            do {
                numero = generarApuesta();
                if(!primitiva.contains(numero) || primitiva.size() == 0) {
                    bucle = true;
                    primitiva.add(numero);
                }



            }while(!bucle);



        }

        System.out.println("Apuesta: " + primitiva);

        for (int i = 0; i < 50; i++){
            if (primitiva.contains(i)){
                if (i == 9 ||i == 19 ||i == 29 ||i == 39 ||i == 49){
                    if (i == 9){
                        System.out.println("X");
                    } else {
                        System.out.println("XX");
                    }
                } else if (i >= 1 && i<=8) {
                    System.out.print("X  ");
                } else {
                    System.out.print("XX ");
                }

            } else if (i == 0){
                System.out.print("    ");
            } else if (i == 9 ||i == 19 ||i == 29 ||i == 39 ||i == 49){
                System.out.println(i);
            } else if (i >= 1 && i<=9) {
                System.out.print(i + "  ");
            } else {
                System.out.print(i + " ");
            }
        }






    }
    private static int generarApuesta(){
        Random random = new Random();
        int numero = random.nextInt(1, 50);
        return numero;

    }
}
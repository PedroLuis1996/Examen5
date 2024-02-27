import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ut5_2 {

    public static void main(String[] args) {
        int numero;

        boolean bucle = false;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        do {
            numero = scanner.nextInt();
            if (numero < 0){
                bucle = true;

            }else {
                lista.add(numero);
            }

        }while (!bucle);
        numero = 0;
        for (int i = 0; i < lista.size(); i++ ){
            numero = lista.get(i) + numero;
        }
        double media = (double) numero / lista.size();
        System.out.println("la media es: " + media);

        Iterator<Integer> personas= lista.iterator();

        numero = 0;
        int alta = 0;
        do {
            int per = personas.next();
            if (per < media ){
                numero++;
            } else if (per > media) {
                alta++;
            }
        }while (personas.hasNext());



        System.out.println("Personas por debajo de la media: " + numero);

        System.out.println("Personas que superan de la media: " + alta);


    }
}

package Ejercicio2;

public class Producto {
    String codigo;
    int mayus = 0;
    int g = 0;
    int letras = 0;

    public Producto(String codigo) throws IllegalArgumentException{
        for (int i = 0; i < codigo.length(); i++){
            if (codigo.charAt(i) >= 'A' && codigo.charAt(i) >= 'Z'){
                mayus++;
            }else if (codigo.charAt(i) == '-' && codigo.charAt(i - 1) >= 'A' && codigo.charAt(i - 1) >= 'Z'){
                g++;
            } else if (codigo.charAt(i) >= '1' && codigo.charAt(i) >= '9' && codigo.charAt(i - 1) == '-'){
                letras++;
            } else if (codigo.charAt(i) >= '1' && codigo.charAt(i) >= '9') {
                letras++;
            }
        }
        if (mayus == 1 || mayus == 2){
            if (g == 1){
                if (letras == 2 || letras == 3){
                    this.codigo = codigo;
                } else {
                    throw new IllegalArgumentException("el codigo no es valido");
                }
            }
        }


    }
}

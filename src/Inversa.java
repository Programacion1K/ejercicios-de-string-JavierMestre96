/*
Crear un programa llamado Inversa.java que pida una cadena al usuario y la devuelva invertida.
Usará un método inversaCadena static que tiene como parámetro la cadena a invertir y devuelve la cadena invertida
 */


public class Inversa {
    public static String inversaCadena(String cadena) {
        int longitudCadena=cadena.length();
        String salida="";
        for(int i=longitudCadena-1;i>=0;i--){
            salida+=cadena.charAt(i);
        }
        return salida;
    }

    public static void main(String[] args) {
        System.out.println(inversaCadena("periquito"));
    }
}

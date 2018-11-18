/*
Cadena espejo. Crea un programa Espejo.java que reciba una cadena de caracteres y la devuelva invertida con efecto espejo,
esto es, se concatena a la palabra original su inversa, compartiendo la última letra, que hará de espejo, por lo que
la palabra obtenida se lee igual hacia adelante que hacia atrás.
Por ejemplo, al introducir “teclado” devolverá “tecladodalcet” y al introducir “goma” devolverá “gomamog”
Usará un método espejoCadena
 */


public class Espejo {
    public static String espejoCadena(String cadena) {
        int longitudCadena=cadena.length();
        String salida=cadena;
        for(int i=longitudCadena-2;i>=0;i--) {
            salida += cadena.charAt(i);
        }
        return salida;
    }

    public static void main(String[] args){

        System.out.println(espejoCadena("teclado"));

    }
}

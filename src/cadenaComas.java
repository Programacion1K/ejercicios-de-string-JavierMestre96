/*
Programa que lee una cadena y la muestra con cada carácter separado por comas.
Si ya hubiera una coma, no la sustituye
Ejemplo: Cadena de ejemplo, con coma C,a,d,e,n,a, ,d,e, ,e,j,e,m,p,l,o, c,o,n, c,o,m,a
 */

public class cadenaComas {
    public static String cadenaConComas(String cadena){
        String salida="";
        int longitudCadena=cadena.length();

        for(int i=0;i<longitudCadena;i++){

            if(i<longitudCadena-1){
                if(cadena.charAt(i)!=','){
                    salida+=cadena.charAt(i)+",";
                }
            }else{
                salida+=cadena.charAt(i);
            }
        }

        return salida;
    }
    public static void main(String[] args){
        System.out.println(cadenaConComas("cadena de ejemplo, con comas"));
    }
}

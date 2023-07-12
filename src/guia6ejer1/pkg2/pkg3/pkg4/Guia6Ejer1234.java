/*
 1-Demuestre como provocar intencionalmente una excepción del tipo
NullPointerException, luego agregue las sentencias try/catch para mostrar el mensaje de
error.
 */
package guia6ejer1.pkg2.pkg3.pkg4;


public class Guia6Ejer1234 {

  /* public static void main(String[] args) {
        try {
            String str = null; // Referencia nula
            int length = str.length(); // Provocar NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Se produjo una excepción NullPointerException: " + e.getMessage());
        }
    }
*/

    
    /*
    2-Demuestre como provocar intencionalmente una excepción del tipo
ArrayIndexOutOfBoundsException (índice de arreglo fuera de rango); luego agregue las
sentencias try/catch para mostrar lo que devuelve el método fillInStackTrace.
    */
/* public static void main(String[] args) {
        try {
            int[] array = new int[5];
            int element = array[10]; // Provoca la excepción
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("\nResultado de fillInStackTrace():");
            e.fillInStackTrace().printStackTrace();
        }
    }
*/


/*
    4-Demuestre como provocar intencionalmente una excepción del tipo
NumberFormatException, luego agregue las sentencias try/catch para mostrar los
mensajes de error.
    */
    public static void main(String[] args) {
        try {
            String number = "abc"; // Valor no numérico
            int parsedNumber = Integer.parseInt(number); // Provoca la excepción
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}




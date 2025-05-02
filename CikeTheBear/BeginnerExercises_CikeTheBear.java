package CikeTheBear;

/*
Clase 2 - Comentarios, Variables, Constantes, Tipos de datos y Operadores (09/04/2025)
Vídeo: https://www.twitch.tv/videos/2428998601
*/

public class BeginnerExercises_CikeTheBear {

    public static void main(String[] args) {

        // 1. Declara una variable de tipo String y asígnale tu nombre.
        String name = "Carlos";

        // 2. Crea una variable de tipo int y asígnale tu edad.
        int age = 33;

        // 3. Crea una variable double con tu altura en metros.
        double height = 1.79;

        // 4. Declara una variable de tipo boolean que indique si te gusta programar.
        boolean iLikeProgramming = true;

        // 5. Declara una constante con tu email.
        final String email = "myemailgoeshere@cikethebear.com";

        // 6. Crea una variable de tipo char y guárdale tu inicial.
        char initial = 'C';

        // 7. Declara una variable de tipo String con tu localidad, y a continuación cambia su valor y vuelve a imprimirla.
        String myLocation = "Caracas";
        System.out.println(myLocation);
        myLocation = "Spain";
        System.out.println(myLocation);


        // 8. Crea una variable int llamada a, otra b, e imprime la suma de ambas.
        int a = 10;
        int b = 8;
        System.out.println(a + b);

        // 9. Imprime el tipo de dos variables creadas anteriormente.
        System.out.println(myLocation.getClass());

        System.out.println(name.getClass());


        // 10. Intenta declarar una variable sin inicializarla y luego asígnale un valor antes de imprimirla.
        double amount;
        amount = 1000;
        System.out.println(amount);
    }
}

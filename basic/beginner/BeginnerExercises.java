package basic.beginner;

/*
Clase 2 - Comentarios, Variables, Constantes, Tipos de datos y Operadores (09/04/2025)
Vídeo: https://www.twitch.tv/videos/2428998601
*/

public class BeginnerExercises {

    public static void main(String[] args) {

        // 1. Declara una variable de tipo String y asígnale tu nombre.

        String myName = "Carlos";

        // 2. Crea una variable de tipo int y asígnale tu edad.

        int myAge = 33;

        // 3. Crea una variable double con tu altura en metros.

        double myHeight = 1.79;

        // 4. Declara una variable de tipo boolean que indique si te gusta programar.

        boolean iLikeProgramming = true;

        // 5. Declara una constante con tu email.

        final String MY_EMAIL = "dealmeidaromanelli@gmail.com";

        // 6. Crea una variable de tipo char y guárdale tu inicial.

        char myInitial = 'C';

        // 7. Declara una variable de tipo String con tu localidad, y a continuación cambia su valor y vuelve a imprimirla.

        String myCity = "Caracas";
        System.out.println("I'm currently living in " + myCity);
        myCity = "Alicante";
        System.out.println("But, I will be moving to " + myCity + " this year.");

        // 8. Crea una variable int llamada a, otra b, e imprime la suma de ambas.

        int a = 18;
        int b = 33;
        System.out.println( "The sum of A and B is: " + (a + b));

        // 9. Imprime el tipo de dos variables creadas anteriormente.

        System.out.println(myCity.getClass().getSimpleName());
        System.out.println(MY_EMAIL.getClass().getSimpleName());

        // 10. Intenta declarar una variable sin inicializarla y luego asígnale un valor antes de imprimirla.

        boolean iLoveArt;

        iLoveArt = true;

        System.out.println("Do I love art? " + iLoveArt);
    }
}

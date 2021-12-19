public class Main {

    public static void main(String[] args) {


        /* zad.2
        a) stworzyć klasę kwadrat i prostokat które będą dziedziczyć po klasie Figura
        b) zaimplementować metody abstrakcyjne odpowiednimi wzorami,
        c) stworzyć objekty tych klas i wyświetlić przykładowe wyliczenia
        */

        Prostokat prostakat1 = new Prostokat(4,3);
        Kwadrat kwadrat1 = new Kwadrat(5);


        System.out.println(prostakat1.obwod());
        System.out.println(prostakat1.pole());
        System.out.println(kwadrat1.obwod());
        System.out.println(kwadrat1.pole());


    }
}

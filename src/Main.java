
public class Main {
    public static void main(String[] args) {

         /* zad.3
        a) stworzyć 2 objekty typu Student i uzupełnić wszystkie pola
        b) stworzyć 2 objekty typu Pracownik i uzupełnić wszystkie pola
        c) wypisać metody toString() wszystkich objektów*/

        Student student1 = new Student();
        student1.setIndeks("368421");

        Student student2 = new Student();
        student2.setIndeks("368422");

        Pracownik pracownik1 = new Pracownik();
        pracownik1.setFirma("Hochland");

        Pracownik pracownik2 = new Pracownik();
        pracownik2.setFirma("Nivea");

        System.out.println( pracownik1.toString());
        System.out.println( pracownik2.toString());
        System.out.println( student1.toString());
        System.out.println( student2.toString());

    }
}

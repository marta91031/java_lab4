public class Main {
    public static void main(String[] args) {
        /* zad.3
        a) w klasie Main stworzyć 2 objekty typu Dom deklarując pierwszy objekt Typem Dom,
        drugi objekt typem Budynek,
        b) wykorzystać wszystkie metody do implementacji pól
        c) wyświetlić w konsoli metodę toString (na obu obiektach) opisującą zachowanie klasy Dom
        */

        Dom dom1 = new Dom();
        Budynek dom2 = new Dom();

        dom1.powierzchnia(67.33);
        dom1.adresBudynku("Wielkopolska w Warszawie");
        dom1.kolorDomu(KolorEnum.BIALY);
        dom1.liczbaMieszkancow(2);
        dom1.sredniaWielkoscNaMieszkanca(62.44,2);
        System.out.println(dom1.toString());

        dom2.powierzchnia(77.33);
        dom2.adresBudynku("Mazowiecka w Poznaniu");
        dom2.kolorDomu(KolorEnum.CZERWONY);
        dom2.liczbaMieszkancow(3);
        dom2.sredniaWielkoscNaMieszkanca(78.24,6);
        System.out.println(dom2.toString());
    }
}

public class Student implements StudentI {

    private String indeks;

    @Override
    public void setIndeks(String value) {
        this.indeks = value;
    }

    @Override
    public String przywitajSie() {
        return "Hej! Jestem " + indeks;
    }

    @Override
    public String pozegnajSie() {
        return "Do widzenia";
    }

    @Override
    public String napiszKolokwium() {
        return "Piszę kolokwium";
    }

    @Override
    public String idzNaWagary() {
        return "Ide na wagary";
    }

    @Override
    public String idzNaWyklad() {
        return "Ide na wyklad";
    }
}

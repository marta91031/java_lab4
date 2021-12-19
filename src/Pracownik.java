public class Pracownik implements  PracownikI{

    private String firma;

    public void setFirma (String value) {
        this.firma = value;
    }

    @Override
    public String przywitajSie() {
        return "Witamy w firmie " + firma;
    }

    @Override
    public String pozegnajSie() {
        return "Mam nadzieje zobaczyc cie ponownie";
    }

    @Override
    public String idzDoPracy() {
        return "Ide do pracy";
    }

    @Override
    public String zrobKawe() {
        return "Robie kawe";
    }

    @Override
    public String zjedzLunch() {
        return "jem lunch";
    }
}

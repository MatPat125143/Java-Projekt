public class Produkt {
    private int id;
    private String nazwa;
    private int pojemnosc;
    private double cena;

    public Produkt(int id, String nazwa, int pojemnosc, double cena) {
        this.id = id;
        this.nazwa = nazwa;
        this.pojemnosc = pojemnosc;
        this.cena = cena;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getPojemnosc() {
        return pojemnosc;
    }

    public void setPojemnosc(int pojemnosc) {
        this.pojemnosc = pojemnosc;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

}

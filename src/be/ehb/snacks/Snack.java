package be.ehb.snacks;

import java.io.Serializable;

public class Snack implements Comparable<Snack>, Serializable {//marker interface
    private int artikelCode;
    private String naam;
    private float prijs;

    public Snack() {
    }

    public Snack(int artikelCode, String naam, float prijs) {
        this.artikelCode = artikelCode;
        this.naam = naam;
        this.prijs = prijs;
    }

    public int getArtikelCode() {
        return artikelCode;
    }

    public void setArtikelCode(int artikelCode) {
        this.artikelCode = artikelCode;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public float getPrijs() {
        return prijs;
    }

    public void setPrijs(float prijs) {
        this.prijs = prijs;
    }

    @Override
    public int compareTo(Snack o) {
        return this.naam.compareTo(o.naam);
    }

    @Override
    public String toString() {
        return "Snack{" +
                "naam='" + naam + '\'' +
                ", prijs=" + prijs +
                '}';
    }
}

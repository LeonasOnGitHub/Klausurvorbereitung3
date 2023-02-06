package grundlagen;

import java.math.BigInteger;

public class Bruch implements Comparable<Bruch> {
    private int nenner;
    private int zaehler;
    private int ganzzahl;

    public Bruch(int nenner, int zaehler) {
        if (nenner != 0) {
            this.nenner = nenner;
            this.zaehler = zaehler;
        }
    }

    public Bruch(int ganzzahl) {
        this.ganzzahl = ganzzahl;
    }

    public int getGanzzahl() {
        return ganzzahl;
    }

    public int getNenner() {
        return nenner;
    }

    public int getZaehler() {
        return zaehler;
    }

    @Override
    public int compareTo(Bruch o) {
        return 0;
    }

    public String toString() {
        return zaehler + "/" + nenner;
    }

    public Bruch multiplizieren(Bruch b) {
        return new Bruch(this.nenner * b.nenner, this.zaehler * b.zaehler);
    }

    public double aussrechnen() {
        if (nenner != 0) {
            return zaehler / nenner;
        } else return 0;
    }

    public void kuerzen() {
        BigInteger bigInteger = new BigInteger(String.valueOf(nenner));
        int gcd = bigInteger.gcd(new BigInteger(String.valueOf(zaehler))).intValue();
        this.nenner = nenner / gcd;
        this.zaehler = zaehler / gcd;
    }

}

public class BankAccount {
    private final long kontoNummer;
    private double kontoStand;

    public long getKontoNummer() {
        return kontoNummer;
    }

    public double getKontoStand() {
        return kontoStand;
    }

    public boolean deposit(double betrag) {
        if (betrag < 0) {
            return false;
        }
        this.kontoStand += betrag;
        return true;
    }

    public boolean withdraw(double betrag) {
        if (this.kontoStand - betrag < 0) {
            return false;
        }
        this.kontoStand -= betrag;
        return true;
    }

    public BankAccount(long kontoNummer) {
        this.kontoNummer = kontoNummer;
        this.kontoStand = 0;
    }
}

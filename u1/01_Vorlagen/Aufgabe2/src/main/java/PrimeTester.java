import util.SimpleIO;

public class PrimeTester {
    void main() {
        int number = SimpleIO.readInt("Ist es eine Primzahl? 'n': ");

        IO.println(isPrime(number) ? "Ja" : "Nein");
    }

    boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}

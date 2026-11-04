public class PricingUtil {
    public static String getFormattedPrice(int priceInCents) {
        int euros = priceInCents / 100;
        int cents = priceInCents % 100;

        return euros + "," + String.format("%02d", cents) + " €";
    }
}

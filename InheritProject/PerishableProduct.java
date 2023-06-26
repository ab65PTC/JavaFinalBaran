import java.time.LocalDate;

public class PerishableProduct extends Product {
    private LocalDate dateAcquired;
    private int daysUntilBad;

    public PerishableProduct(String productName, int quantity, float cost, LocalDate dateAcquired, int daysUntilBad) {
        super(productName, quantity, cost);
        this.dateAcquired = dateAcquired;
        this.daysUntilBad = daysUntilBad;
    }

    public PerishableProduct() {
    }

    public LocalDate getDateAcquired() {
        return dateAcquired;
    }

    public void setDateAcquired(LocalDate dateAcquired) {
        this.dateAcquired = dateAcquired;
    }

    public int getDaysUntilBad() {
        return daysUntilBad;
    }

    public void setDaysUntilBad(int daysUntilBad) {
        this.daysUntilBad = daysUntilBad;
    }

    @Override
    public String toString() {
        return super.toString() + ", Date Acquired: " + dateAcquired + ", Days Until Bad: " + daysUntilBad;
    }

    public LocalDate getExpirationDate() {
        return dateAcquired.plusDays(daysUntilBad);
    }

    public static void main(String[] args) {
        PerishableProduct perishableProduct = new PerishableProduct("Milk", 10, 2.99f, LocalDate.now(), 7);
        System.out.println(perishableProduct);
        System.out.println("Expiration Date: " + perishableProduct.getExpirationDate());
    }
}

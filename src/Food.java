public class Food extends Article{

    private String minimumDurabilityDate;

    public Food(int id, String label, double price, String minimumDurabilityDate) {
        super(id, label, price);
        this.minimumDurabilityDate = minimumDurabilityDate;
    }


    public int getTax() {
        return 7;
    }

    @Override
    public String toString() {
        return "Food{" +
                "id=" + id +
                ", label='" + label + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                ", minimumDurabilityDate='" + minimumDurabilityDate + '\'' +
                '}';
    }
}

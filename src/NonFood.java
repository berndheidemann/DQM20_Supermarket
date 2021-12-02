public class NonFood extends Article{



    public NonFood(int id, String label, double price) {
        super(id, label, price);
    }

    @Override
    public int getTax() {
        return 19;
    }

    @Override
    public String toString() {
        return "NonFood{" +
                "id=" + id +
                ", label='" + label + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                '}';
    }

}

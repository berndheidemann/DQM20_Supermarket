public abstract class Article {

    protected int id;
    protected String label;
    protected double price;
    protected int stock;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Article(int id, String label, double price) {
        this.id = id;
        this.label = label;
        this.price = price;
        this.stock = 0;
    }

    public abstract int getTax();
}

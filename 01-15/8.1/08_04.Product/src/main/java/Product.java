public class Product {
    private double p;
    private int q;
    private String n;

    public Product(String name, double price, int initialQuantity) {
        this.n = name;
        this.p = price;
        this.q = initialQuantity;
    }

    public void printProduct() {
        System.out.println(this.n + ", price " + this.p + ", " + this.q + " pcs");
    }
}

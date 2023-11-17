package pl.gornik.model;

public class Product {
    private String title;
    private int numberOfItems;
    private double price;

    public double countPrice() {
        return (int)(numberOfItems*price);
    }

    public Product(String title, int numberOfItems, double price) {
        this.title = title;
        this.numberOfItems = numberOfItems;
        this.price = price;
    }

    public String displayProduct() {
        return "Product " +
                "title='" + title + '\'' +
                ", numberOfItems=" + numberOfItems +
                ", price=" + price +
                ' ';
    }

    public double getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }

    public void setNumberOfItems(int numberOfItems) {
        this.numberOfItems = numberOfItems;
    }
}

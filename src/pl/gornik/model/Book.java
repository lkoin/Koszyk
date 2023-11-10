package pl.gornik.model;

public class Book extends Product{
    private String author;


    public Book(String title, int numberOfItems, double price,String author) {
        super(title, numberOfItems, price);
        this.author = author;
    }

    @Override
    public String displayProduct() {
        return super.displayProduct();
    }

    @Override
    public String getTitle() {
        return super.getTitle();
    }

    @Override
    public int getNumberOfItems() {
        return super.getNumberOfItems();
    }

    @Override
    public void setNumberOfItems(int numberOfItems) {
        super.setNumberOfItems(numberOfItems);
    }
}

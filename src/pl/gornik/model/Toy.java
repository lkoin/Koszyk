package pl.gornik.model;

public class Toy extends Product{
    private int minimalAge;

    public Toy(String title, int numberOfItems, double price,int minimalAge) {
        super(title, numberOfItems, price);
        this.minimalAge = minimalAge;
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
    public void setNumberOfItems(int numberOfItems) {
        super.setNumberOfItems(numberOfItems);
    }

    @Override
    public int getNumberOfItems() {
        return super.getNumberOfItems();
    }
}

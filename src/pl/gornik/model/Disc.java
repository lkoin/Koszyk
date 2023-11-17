package pl.gornik.model;

public class Disc extends Product{
    private String performer;


    public Disc(String title, int numberOfItems, double price,String performer) {
        super(title, numberOfItems, price);
        this.performer = performer;
    }

    @Override
    public String displayProduct() {
        return super.displayProduct()+"Performer: "+performer;
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

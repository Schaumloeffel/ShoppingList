package de.bib.dozvjg.probeklausur;

public class ShoppingMemo {
    private String product;
    private int quantity;
    private double price;
    private long id;


    public ShoppingMemo(String product, int quantity, double price, long id) {
        this.product = product;
        this.quantity = quantity;
        this.price = price;
        this.id = id;
    }


    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }


    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    @Override
    public String toString() {
        String output = String.format("%d x %s [%.2f€]", quantity, product, quantity*price);

        return output;
    }
}


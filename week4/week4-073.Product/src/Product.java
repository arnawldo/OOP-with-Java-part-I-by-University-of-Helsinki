/**
 * Created by arnoldo on 07/04/17.
 */
public class Product {
    private String nameAtStart;
    private double priceAtStart;
    private int amountAtStart;

    public Product(String name, double price, int amount){
        this.nameAtStart = name;
        this.priceAtStart = price;
        this.amountAtStart = amount;
    }

    public void printProduct(){
        System.out.println(this.nameAtStart + ", price " + this.priceAtStart + ", amount " + this.amountAtStart);
    }
}

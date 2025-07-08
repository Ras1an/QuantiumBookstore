public class PaperBook extends Book {
    protected int stock;
    public PaperBook(String ISBN, String title, int publishYear, double price, int stock) {
        super(ISBN,title,publishYear,price);
        this.stock = stock;
    }
    
    @Override
    public void printBook(){
        System.out.println("Book Name: " +title + " Available quantity: " + stock);
    }

    @Override
    public boolean BuyBook(int quantity, String email,String address) {
        if (stock < quantity) {
            System.out.println("We do not have enough stock of " + title);
            return false;
        }
        this.stock -= quantity;

        ShippingService shippingService = new ShippingService();
        shippingService.shipping(title, address);

        System.out.println("Total cost of " + quantity + " items of " + title + "book = "+ quantity * price);
        return true;
    }
    // shipped




}

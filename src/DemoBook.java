public class DemoBook extends Book {
    public DemoBook(String ISBN, String title, int publishYear, double price) {
        super(ISBN, title, publishYear, price);
    }

    public void printBook(){
        System.out.println("Book Name: " +title + " Price: " + price + " Type: Demo Book");
    }

    @Override
    public boolean BuyBook(int quantity, String email,String address) {
        System.out.println("You can not buy a demo book :)");

        return false;
    }
    // not for sale
}

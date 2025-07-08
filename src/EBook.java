public class EBook extends Book {
    private String fileType;
    public EBook(String ISBN, String title, int publishYear, double price, String fileType) {
        super(ISBN, title, publishYear, price);
        this.fileType = fileType;
    }

    @Override
    public void printBook(){
        System.out.println("Book Name: " +title + " File type: " + fileType);
    }
    @Override
    public boolean BuyBook(int quantity, String email,String address) {

        // call the shipping service
        // ShappingService(book,quantity,address)
        MailService mailService = new MailService();
        mailService.Send(title, email);

        System.out.println("Total cost of "+ title + " book = " +  price);
        return true;
    }
    // sent via email
}

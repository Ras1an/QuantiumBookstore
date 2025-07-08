public class QuantumBookstoreFullTest {


    public void TestAllSystem(){
        System.out.println("Welcome at Quantum Bookstore");
        Book book1 = new PaperBook("B1","C++ How To Program",2020,50, 2);
        Book book2 = new PaperBook("B2","OOP",2002, 35, 25);
        Book book3 = new EBook("B3","The Prisoner Of Zenda",2000,40, "PDF");
        Book book4 = new EBook("B4","Clean Code",2010,75, "PDF");
        Book book5 = new DemoBook("B5","Clean Architecture",2009,75);

        Inventory inventory = new Inventory();
        inventory.AddBook(book1);
        inventory.AddBook(book2);
        inventory.AddBook(book3);
        inventory.AddBook(book4);
        inventory.AddBook(book5);
        System.out.println();
        inventory.PrintBooks();



        System.out.println();
        //   public void BuyBook(String ISBN, int quantity, String email, String address){
        inventory.BuyBook("B2", 5, "mostafa@gmail.com", "Giza"); System.out.println();
        inventory.BuyBook("B3", 2, "omar@gmail.com", "Cairo"); System.out.println();
        inventory.BuyBook("B1", 3, "mostafa@gmail.com", "Giza"); System.out.println();
        inventory.BuyBook("B5", 3, "mostafa@gmail.com", "Giza");
        System.out.println();
        inventory.PrintBooks();



        System.out.println();
        inventory.RemoveOutDatedBooks(20);
        System.out.println();
        inventory.PrintBooks();
    }
}

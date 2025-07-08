import java.util.ArrayList;

public class Inventory {
    private ArrayList<Book>  books;

    public Inventory() {
        this.books = new ArrayList<>();
    }

    public void AddBook(Book book){
        books.add(book);
        System.out.println(book.title + " added successfully");
    }

    public void RemoveOutDatedBooks(int passedYears){

        int outdatedBookCount = 0;
        for (int i = books.size() - 1; i > 0; i--) {

            if(2025 - books.get(i).publishYear >= passedYears) {
                books.remove(i);
                outdatedBookCount++;
            }
        }

        System.out.println(outdatedBookCount + " outdated books that passed " + passedYears  +" years removed successfully");

    }

    public void BuyBook(String ISBN, int quantity, String email, String address){
        Book book = null;
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).ISBN.equals(ISBN)) {
                book = books.get(i);
            }
        }

        if (book == null) {
            System.out.println("Book with ISBN: " + ISBN + " not found");
        }

        boolean isBought = book.BuyBook(quantity, email, address);
        if(isBought == true)
            System.out.println("Congratulations "+ book.title + " book was bought successfully");
        else
            System.out.println("Sorry, " + book.title + " could not be bought");

    }

    public void PrintBooks(){
        System.out.println("Available books:");
        for (Book book : books) {
            book.printBook();
        }
    }
}

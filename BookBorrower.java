public class BookBorrower implements Library {
    @Override
    public void borrow(String title) {
        System.out.println("Borrowed  Book: " + title);
    }
}
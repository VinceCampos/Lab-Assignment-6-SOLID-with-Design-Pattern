public class JournalBorrower implements Library {
    @Override
    public void borrow(String title) {
        System.out.println("Borrowed  Journal: " + title);
      
    }
}
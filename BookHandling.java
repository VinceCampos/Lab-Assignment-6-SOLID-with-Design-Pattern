public class BookHandling {
    private Student student;
    private BookBorrower book;

    public BookHandling(Student student, BookBorrower book) {
        this.student = student;
        this.book = book;
    }

    public void processBook() {
        book.borrow(student.getTitle());
    }
}
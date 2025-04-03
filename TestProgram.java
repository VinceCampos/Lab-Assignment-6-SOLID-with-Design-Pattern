public class TestProgram {
    public static void main(String[] args) {
        
        Student student1 = new Student("1234", "Orton", "Randy", "A Game Of Thrones");
        BookHandling process1 = new BookHandling(student1, new BookBorrower());
        process1.processBook();

        Student student2 = new Student("2258", "Austin", "Steve", "Soul Therapy");
        JournalHandling process2 = new JournalHandling(student2, new JournalBorrower());
        process2.processJournal();

        Student student3 = new Student("0071", "Barnes", "Scottie", "The Hobbit");
        BookHandling process3 = new BookHandling(student3, new BookBorrower());
        process3.processBook();
    }
}
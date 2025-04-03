public class TestProgram {
    public static void main(String[] args) {
        
        Student student1 = new Student("43216", "Cena", "John", "The Time is Now");
        BookHandling process1 = new BookHandling(student1, new BookBorrower());
        process1.processBook();

        Student student2 = new Student("20195", "Rhodes", "Cody", "The Sport Journal");
        JournalHandling process2 = new JournalHandling(student2, new JournalBorrower());
        process2.processJournal();

        Student student3 = new Student("55678", "Doncic", "Austin", "Harry Potter and the Chamber of Secrets");
        BookHandling process3 = new BookHandling(student3, new BookBorrower());
        process3.processBook();

        Student student4 = new Student("94567", "Kent", "Clark", "Abiotic Stress and Legumes");
        JournalHandling process4 = new JournalHandling(student4, new JournalBorrower());
        process4.processJournal();
    }
}
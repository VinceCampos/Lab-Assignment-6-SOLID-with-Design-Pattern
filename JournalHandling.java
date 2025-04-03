public class JournalHandling {
    private Student student;
    private JournalBorrower journal;

    public JournalHandling(Student student, JournalBorrower journal) {
        this.student = student;
        this.journal = journal;
    }

    public void processJournal() {
        journal.borrow(student.getTitle());
    }
}
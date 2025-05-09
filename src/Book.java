public class Book {
    private String NameBook;
    private Author Author;
    private int YearPub;

    public Book(String NameBook, Author Author, int YearPub) {
        this.NameBook = NameBook;
        this.Author = Author;
        this.YearPub = YearPub;
    }

    public String getNameBook() {
        return NameBook;
    }

    public Author getAuthor() {
        return Author;
    }

    public int getYearPub() {
        return YearPub;
    }

    public void setYearPub(int yearPub) {
        YearPub = yearPub;
    }

    public String toString() {
        return "Название книги: " + NameBook + "\n" + "Автор: " + Author + "\n" + "Год публикации: " + YearPub;
    }
}

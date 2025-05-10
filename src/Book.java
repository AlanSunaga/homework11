public class Book {
    private String nameBook;
    private Author author;
    private int yearPub;

    public Book(String nameBook, Author author, int yearPub) {
        this.nameBook = nameBook;
        this.author = author;
        this.yearPub = yearPub;
    }

    public String getNameBook() {
        return nameBook;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearPub() {
        return yearPub;
    }

    public void setYearPub(int yearPub) {
        this.yearPub = yearPub;
    }

    @Override
    public String toString() {
        return "Название книги: " + nameBook + "\n" + "Автор: " + author + "\n" + "Год публикации: " + yearPub;
    }
}

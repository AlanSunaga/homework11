public class Author {
    private String Name;
    private String Surname;

    public Author(String Name, String Surname) {
        this.Name = Name;
        this.Surname = Surname;
    }

    public String getName() {
        return Name;
    }

    public String getSurname() {
        return Surname;
    }

    public String toString() {
        return Name + " "+ Surname;
    }
}

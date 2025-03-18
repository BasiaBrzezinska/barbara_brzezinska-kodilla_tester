
public class Book {
    private String author;
    private String title;
git
    public Book (String title, String author){
        this.author = author;
        this.title = title;
    }

    public static Book of (String title, String author){
        return new Book (title, author);
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                '}';
    }

    public static void main (String[] args){
        Book book = new Book ("1984", " George Orwell");
        System.out.println("My favorite book is: " + book);
    }
}

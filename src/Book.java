import java.util.Objects;

public class Book {
    private String title;
    private Author author;
    private int publicationYear;

    public Book(String title, Author author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return "книга: \"" + title + "\" автор: " + author.toString() + " (" + publicationYear + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Проверка на ссылочную равенство
        if (obj == null || getClass() != obj.getClass()) return false; // Проверка на null и класс
        Book book = (Book) obj; // Приведение типа
        return publicationYear == book.publicationYear &&
                Objects.equals(title, book.title) &&
                Objects.equals(author, book.author); // Сравнение полей
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, publicationYear);
    }
}
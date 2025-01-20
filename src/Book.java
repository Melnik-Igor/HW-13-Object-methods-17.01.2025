import java.util.Objects;
// Класс, представляющий книгу
public class Book {
    private String title;
    private Author author;
    private int publicationYear;
    // Конструктор для инициализации книги с обязательными полями
    public Book(String title, Author author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }
    // Геттер для получения названия книги
    public String getTitle() {
        return title;
    }
    // Геттер для получения автора книги
    public Author getAuthor() {
        return author;
    }
    // Геттер для получения года публикации книги
    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
    // Метод toString вызывает toString у автора, избегая дублирования кода
    @Override
    public String toString() {
        return "книга: \"" + title + "\" автор: " + author.toString() + " (" + publicationYear + ")";
    }
    // Переопределение метода equals для сравнения объектов Book по значению всех полей
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Проверка на ссылочную равенство
        if (obj == null || getClass() != obj.getClass()) return false; // Проверка на null и класс
        Book book = (Book) obj; // Приведение типа
        return publicationYear == book.publicationYear &&
                Objects.equals(title, book.title) &&
                Objects.equals(author, book.author); // Сравнение полей
    }
    // Переопределение метода hashCode для корректного использования объектов Book в коллекциях
    @Override
    public int hashCode() {
        return Objects.hash(title, author, publicationYear);
    }
}
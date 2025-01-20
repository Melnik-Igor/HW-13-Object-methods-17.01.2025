import java.util.Objects;
// Класс, представляющий автора книги
public class Author {
    private String firstName;
    private String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    // Переопределение метода toString для удобного вывода информации об авторе
    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
    // Переопределение метода equals для сравнения объектов Author по полям firstName и lastName
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Проверка на ссылочную равенство
        if (obj == null || getClass() != obj.getClass()) return false; // Проверка на null и класс
        Author author = (Author) obj; // Приведение типа
        return Objects.equals(firstName, author.firstName) &&
                Objects.equals(lastName, author.lastName); // Сравнение полей
    }
    // Переопределение метода hashCode для корректного использования объектов Author в коллекциях
    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}
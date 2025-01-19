import java.util.Objects;

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

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Проверка на ссылочную равенство
        if (obj == null || getClass() != obj.getClass()) return false; // Проверка на null и класс
        Author author = (Author) obj; // Приведение типа
        return Objects.equals(firstName, author.firstName) &&
                Objects.equals(lastName, author.lastName); // Сравнение полей
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}
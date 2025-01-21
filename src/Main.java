public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Joshua", "Foer");
        Author author2 = new Author("Ray", "Bradbury");


        Book book1 = new Book("Atlas Obscura", author1, 2019);
        Book book2 = new Book("451 градус по Фаренгейту", author2, 1953);


        System.out.println(book1);
        System.out.println(book2);


        book1.setPublicationYear(2022);
        System.out.println("\nПосле изменения года публикации:");
        System.out.println(book1);


        Book anotherBook1 = new Book("Atlas Obscura", author1, 2022);
        System.out.println("\nbook1 равна anotherBook1: " + book1.equals(anotherBook1));


        System.out.println("Хеш-код book1: " + book1.hashCode());
        System.out.println("Хеш-код anotherBook1: " + anotherBook1.hashCode());
    }
}
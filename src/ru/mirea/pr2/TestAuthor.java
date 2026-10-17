package ru.mirea.pr2;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Максим Зарубин", "max@example.com", 'M');
        System.out.println(author);
        author.setEmail("maksim@example.com");
        System.out.println(author.getName());
        System.out.println(author.getEmail());
        System.out.println(author.getGender());
    }
}

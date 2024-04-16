public class Main {
    public static void main(String[] args) {
        Author tolstoy = new Author("Лев", "Толстой");

        Book childhood = new Book("Детство", tolstoy, 1852);
        System.out.println(childhood);

        childhood.setPublicationYear(1851);
        System.out.println(childhood.getPublicationYear());

        Author pushkin = new Author("Александр", "Пушкин");
        Book onegin = new Book("Детство", pushkin, 1833);
        System.out.println(onegin);

        System.out.println(childhood.equals((onegin)));
    }
}

public class Main {
    public static void main(String[] args) {
        Author tolstoy = new Author("Лев", "Толстой");

        Book childhood = new Book("Детство ", tolstoy, 1852);
        System.out.println(childhood.getNameOfAuthor().getFirstName() + " " + childhood.getNameOfAuthor().getSecondName());
        System.out.println(childhood.getBookTitle() +" " + childhood.getPublicationYear());
        childhood.setPublicationYear(1851);
        System.out.println(childhood.getPublicationYear());

        Author pushkin = new Author("Александр", "Пушкин");
        Book onegin = new Book("Евгений Онегин", pushkin, 1833);
        System.out.println(onegin.getNameOfAuthor().getFirstName() + " " + onegin.getNameOfAuthor().getSecondName());
        System.out.println(onegin.getBookTitle() + " " + onegin.getPublicationYear());
    }
}
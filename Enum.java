import java.lang.ProcessBuilder.Redirect.Type;

public class Enum {
    public static void main(String[] args) {
        book b1 = new Book("wear and place", Type.BELLETER);
        System.out.println(b1.name, b1.bookType);

        switch (b1.bookType) {
            case BELLETRE:
                System.out.println("Belletre");
                break;
            case SCIENCE:
                System.out.println("Science");
                break;
            case SCIENCE_FICTION:
                System.out.println("Science fiction");
                break;
            case PHANTASY:
                System.out.println("Phantasy");
                break;
        }
    }
}

/**
 * Book
 */
public class Book {
    String name;
    Type bookType;
    String author;

    Book(String name, String author, Type type) {
        bookType = type;
        this.name = name;
        this.author = author;
    }
}

enum Type {
    SCIENCE, BELLETRE, PHANTASY, SCIENCE_FICTION
}

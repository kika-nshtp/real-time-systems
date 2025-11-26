package lab02.Author;
import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args) {
        Author author1 = new Author("Alexander Pushkin", "pushkin1799@gmail.com", 'm');
        System.out.println("Информация об авторе: "+author1.toString());
        System.out.println("\nИмя автора: " + author1.getName());
        System.out.println("\nПол автора: " + author1.getGender());
        System.out.println("\nУ А.С. Пушкина могла бы быть такая почта: "+author1.getEmail());
        System.out.println("\nНапишите альтернативную");
        Scanner scan = new Scanner(System.in);
        String email = scan.nextLine();
        author1.setEmail(email);
        System.out.println("\nПочта могла бы быть такая: "+author1.getEmail());

    }
}

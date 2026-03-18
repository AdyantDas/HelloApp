import java.util.Scanner;
public class HelloApp {
    public static void main(String[] args) {
<<<<<<< HEAD
        System.out.println("Hello World");
=======
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello," + name + "!");
        sc.close();
>>>>>>> feature/UC2-display-name
    }
}
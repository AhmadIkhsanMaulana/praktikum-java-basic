import java.util.Scanner;

public class UbahCamelCase {
    public static void  main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Masukkan Kata: ");
        String kata = userInput.nextLine();

        String camelCase = ubahKeCamelCase(kata);

        System.out.println(camelCase);

        userInput.close();
    }

    private static String ubahKeCamelCase(String kata) {
        StringBuilder camelCase = new StringBuilder();

        String[] words = kata.split(" ");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (i == 0) {
                camelCase.append(word.toLowerCase());
            } else {
                camelCase.append(word.substring(0, 1).toUpperCase());
                camelCase.append(word.substring(1).toLowerCase());
            }
        }

        return camelCase.toString();
    }
}

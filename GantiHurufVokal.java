import java.util.Scanner;

public class GantiHurufVokal {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Masukkan Kata: ");
        String kata = userInput.nextLine();

        String kataBaru = gantiHurufVokal(kata);

        System.out.println(kataBaru);

        userInput.close();
    }

    private static String gantiHurufVokal(String kata) {
        StringBuilder kataBaru = new StringBuilder();

        for (int i = 0; i < kata.length(); i++) {
            char huruf = kata.charAt(i);
            switch (Character.toUpperCase(huruf)) {
                case 'A':
                    kataBaru.append('4');
                    break;
                case 'E':
                    kataBaru.append('3');
                    break;
                case 'I':
                    kataBaru.append('1');
                    break;
                case 'O':
                    kataBaru.append('0');
                    break;
                default:
                    kataBaru.append(huruf);
                    break;
            }
        }

        return kataBaru.toString();
    }
}

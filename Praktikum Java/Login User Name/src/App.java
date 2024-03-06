import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean validUsername = false;
        boolean validPassword = false;

        while (!validUsername || !validPassword) {

            System.out.println("Username harus memiliki panjang minimal 5 karakter.");
            System.out.println("Password harus memiliki panjang minimal 8 karakter.");
            System.out.println("Password harus mengandung setidaknya satu karakter huruf besar,");
            System.out.println("satu karakter huruf kecil, dan satu karakter khusus (!@#$%^&*)");
            System.out.println("");

            System.out.println("+--------------------------------------+");

            System.out.print("| Masukkan username : ");
            String username = scanner.nextLine();

            validUsername = username.length() >= 5;

            if (!validUsername) {
                System.out.println("Error: Panjang username harus minimal 5 karakter.");
                continue;
            }

            System.out.print("| Masukkan password : ");
            String password = scanner.nextLine();

            boolean validLength = password.length() >= 8;

            System.out.println("+--------------------------------------+");
            
            boolean hasUpperCase = false;
            boolean hasLowerCase = false;
            boolean hasSpecialChar = false;

            for (char ch : password.toCharArray()) {
                if (Character.isUpperCase(ch)) {
                    hasUpperCase = true;
                } else if (Character.isLowerCase(ch)) {
                    hasLowerCase = true;
                } else if ("!@#$%^&*".indexOf(ch) != -1) {
                    hasSpecialChar = true;
                }
            }

            validPassword = validLength && hasUpperCase && hasLowerCase && hasSpecialChar;

            if (!validPassword) {
                System.out.println("Error: Password tidak memenuhi kriteria.");
                if (!validLength) {
                    System.out.println("   - Panjang password harus minimal 8 karakter.");
                }
                if (!hasUpperCase) {
                    System.out.println("   - Password harus mengandung setidaknya satu karakter huruf besar.");
                }
                if (!hasLowerCase) {
                    System.out.println("   - Password harus mengandung setidaknya satu karakter huruf kecil.");
                }
                if (!hasSpecialChar) {
                    System.out.println("   - Password harus mengandung setidaknya satu karakter khusus (!@#$%^&*).");
                }
            }
        }

        System.out.println("Registrasi berhasil!");
    }
}

import java.util.Random;

public class PasswordRandomizer {
    private String characters = "abcdefghijklmnopqrstuvwxyz";
    private int passwordLength;
    private String password;
    private Random random = new Random();

    public PasswordRandomizer(int length) {
        this.passwordLength = length;
    }

    public String createPassword() {
        password = "";
        int count = 0;
        while (count < passwordLength) {
            password += characters.charAt(random.nextInt(26));
            count++;
        }
        return password;
    }
}

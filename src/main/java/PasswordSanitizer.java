import java.util.List;
import java.util.stream.Collectors;

public class PasswordSanitizer {


    public static void main(String[] args) {
        //au lungimea mai mica decat 5 sau au numai numere sau au numai litere
    }

    public String sanitize(List<String> passwords){
        return passwords.stream()
                .filter(p ->isValid(p))
                .collect(Collectors.joining(" "));

    }

    public boolean isValid (String password){
        if (password.length()<5){
            return false;
        }
        boolean hasDigit = false;
        boolean hasLetter = false;
        for (Character c : password.toCharArray()){
            if (Character.isDigit(c)){
                hasDigit = true;
            }
            if (Character.isLetter(c)){
                hasLetter=true;
            }
        }

        return hasDigit && hasLetter;

    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CodeValidation {
    public static void main(String[] args) {
        String code = "Aa1203 ds";
        System.out.println(isCodeValid(code));
        String code2 = "sdfsdfs";
        List<String> codes = Arrays.asList(code,code2);


    }

    public List<String> getValidCodes(List<String> codes){
        List<String> validCodes = new ArrayList<>();
        for (String code: codes){
            if (isCodeValid(code)){
                validCodes.add(code);
            }
        }
        return validCodes;
    }

    public static boolean isCodeValid(String code) {
        //parcurg stringul de caractere si impart verificarea in bucati
        //pentru primele doua caractere verific daca sunt diferite de litere (le pot transforma in litere mari )
        //daca da, returnez false
        //pentru urmatoarele 3 caractere, verific daca sunt diferite de cifre (isDigit) si daca da, returnez false
        // pentru urmatorul caracter verific sa nu fie diferit de  spatiu , daca da, returnez false ;
        //pentru urmatoarele caractere, repet pasul 2
        String codeToUpper = code.toUpperCase();
        if (code.length() != 7) {
            return false;
        }
        for (int i = 0; i < 2; i++) {
            if (!Character.isLetter(code.charAt(i))) {
                return false;
            }
        }

        for (int i = 2; i < 5; i++) {
            if (!Character.isDigit(codeToUpper.charAt(i))) {
                return false;
            }
        }
        return true;
    }

}




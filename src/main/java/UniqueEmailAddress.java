import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class UniqueEmailAddress {
    public static void main(String[] args) {
        //andrei@gmail.com este andrei@gmail.com
        //andrei.z@gmail.com  este andreiz@gmail.com
        //andrei+trlalala@gmail.com este andrei@gmail.com
        //andrei.z+tralala@gmail.com este andreiz@gmail.com

        System.out.println(reduce("andrei.z+tralala@gmail.com"));




    }

    public static Integer getNumberOfUniqueEmails(List<String> emails){

        return emails.stream()
                .map(email -> reduce(email))
                .collect(Collectors.toSet()).size();

    }

    public static String reduce (String email){
        String reducedEmail = "";

        for (Character c : email.toCharArray()){
            if (c=='+' || c == '@'){
                break;
            }
            else if (c != '.'){
                reducedEmail+=c;
            }
        }

        boolean foundArond = false;
        for (Character c: email.toCharArray()){
            if (c=='@'){
                foundArond = true;
            }
            if (foundArond){
                reducedEmail+=c;
            }
        }

        return reducedEmail;
    }

}

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// public class Ex3_9 {
//     public static void main(String[] args) {
//         String inputText = "Please read this application and give me gratuity";
//         String pattern = "([aeiouAEIOU]{2})";

//         Pattern r = Pattern.compile(pattern);
//         Matcher matcher = r.matcher(inputText);

//         System.out.print("Sample Output: ");
//         while (matcher.find()) {
//             System.out.print(matcher.group(0) + ", ");
//         }
//     }
// }
public class Ex3_9{
    public static void main(String args[]){
        String input="Please read this application and give me gratuity";
        String pattern="([aeiouAEIOU]{2})";
        Pattern r=Pattern.compile(pattern);
        Matcher matcher=r.matcher(input);
        while(matcher.find()){
            System.out.print(matcher.group(0) +", ");
        }

    }
}

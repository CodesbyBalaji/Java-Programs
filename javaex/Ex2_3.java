// import java.util.HashSet;
// public class Ex2_3  {
//     public static void main(String[] args) {
//         char[] charArray = {'a', 'b', 'c', 'a', 'd', 'b', 'e', 'f'};

//         System.out.println("Duplicate characters in the array:");
//         printDuplicateCharacters(charArray);
//     }

//     public static void printDuplicateCharacters(char[] charArray) {
//         HashSet<Character> set = new HashSet<>();
//         HashSet<Character> duplicateSet = new HashSet<>();

//         for (char ch : charArray) {
//             if (!set.add(ch)) {
//                 duplicateSet.add(ch);
//             }
//         }

//         for (char ch : duplicateSet) {
//             System.out.print(ch + " ");
//         }
//     }
// }
public class Ex2_3 {
    public static void main(String[] args) {
        String input = "a b c a b d";
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (input.indexOf(currentChar, i + 1) != -1) {
                System.out.print(currentChar + " ");
            }
        }
    }
}

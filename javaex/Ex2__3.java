// public class Ex2__3{
//     public static void main(String[] args) {
//         char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f'};

//         int vowelsCount = countVowels(charArray);
//         int consonantsCount = charArray.length - vowelsCount;

//         System.out.println("Number of vowels: " + vowelsCount);
//         System.out.println("Number of consonants: " + consonantsCount);
//     }
//     public static int countVowels(char[] charArray) {
//         int count = 0;
//         for (char ch : charArray) {
//             char lowercaseCh = Character.toLowerCase(ch);
//             if (lowercaseCh == 'a' || lowercaseCh == 'e' || lowercaseCh == 'i' || lowercaseCh == 'o' || lowercaseCh == 'u') {
//                 count++;
//             }
//         }
//         return count;
//     }
// }
public class Ex2__3 {
    public static void main(String[] args) {
        char[] charArray = {'a', 'e', 'i', 'o', 'u','b' ,'s','r'};
        int vowelCount = 0;
        int consonantCount = 0;

        for (char c : charArray) {
            if ("aeiouAEIOU".contains(String.valueOf(c))) {
                vowelCount++;
            } else if (Character.isLetter(c)) {
                consonantCount++;
            }
        }

        System.out.println("Vowels: " + vowelCount);
        System.out.println("Consonants: " + consonantCount);
    }
}
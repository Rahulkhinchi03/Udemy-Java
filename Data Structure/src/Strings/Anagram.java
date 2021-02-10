package Strings;

public class Anagram {
    public static void main(String[] args) {
        String a = " aab";
        String b = "aab";
        boolean isAnagram = true;
      boolean[] Visited = new boolean[b.length()];


   if (a.length() == b.length()) {
       for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            isAnagram = false;
           for (int j = 0; j < b.length(); j++) {
               if (b.charAt(j) == c && !Visited[j]) {
                   Visited[j] = true;
                   isAnagram = true;
                   break;
               }
           }
                    if(!isAnagram) {
                     break;
                   }
      }
  }

        if(isAnagram) {
            System.out.println("Is an Anagram");
        }
        else{
            System.out.println("Not an Anagram");
        }
    }
}

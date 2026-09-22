package org.strings;

public class ReverseAlternateWordInSentence {

    public static void main(String args[]){

        String input = "Hello good morning india";

        StringBuilder result = new StringBuilder();

        String words[] = input.split(" ");
        result.append(words[0]);
       for(int i=1; i < words.length; i++){
           if(i%2 == 0){
               result.append(" "+words[i]);
           } else{

               result.append(" "+reverseWords(words[i]));
           }

       }

        System.out.println("Given String   -> " + input);
        System.out.println("Reverse String -> " + result.toString());
    }

    public static String reverseWords(String word){
        if(word.isEmpty() || word == null){
            return word;
        }
        String result = "";
        for(int i=word.length()-1; i >=0; i--){
            result = result + word.charAt(i);
        }
        System.out.println(result);
        return result;
    }
}

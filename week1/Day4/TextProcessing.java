package Day4;

import java.util.Scanner;

public class TextProcessing {

    static void count_no_of_word(String str){

        String[] arr = str.split(" ");
        System.out.println("No of word : "+arr.length);

    }

    static void uppercase_conversion(String str){
        StringBuilder res = new StringBuilder();

        String[] arr = str.split(" ");

        for(String a : arr){
            for(char ch : a.toCharArray()){
                res.append(Character.toUpperCase(ch));
            }
            res.append(" ");
        }

        System.out.println("Upper case sentence : "+res);

    }

    static void reverse(String str){
        StringBuilder res = new StringBuilder(str);

        System.out.println("Reversed sentence : "+res.reverse());
    }

    static void wordToReplace(String str , String replaceWord , String newWord){

        StringBuffer ans = new StringBuffer();

        String[] arr = str.split(" ");
        for(String a : arr){
            if(a.equals(replaceWord)){
                ans.append(newWord);
            }else{
                ans.append(a);
            }

            ans.append(" ");
        }

        System.out.println("Updated Sentence : "+ans);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Sentence : ");
        String str = sc.nextLine().trim();

        System.out.print("Word to replace : ");
        String replaceWord = sc.next();

        System.out.print("New word :");
        String newWord = sc.next();


        count_no_of_word(str);

        uppercase_conversion(str);

        reverse(str);

        wordToReplace(str,replaceWord,newWord);



    }
}

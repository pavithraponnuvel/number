import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class vowels {
    public static void main(String[] args) throws IOException {
        char ch;
        System.out.println("enter the character\n");
         BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
          ch = (char) bf.read();
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        {
            System.out.println(ch+":is vowel");
        }
        else
            System.out.println(ch+":is consonant");
    }
    
}

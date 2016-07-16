package guvi;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class alphabet {
    public static void main(String[] args) throws IOException {
        char ch;
        System.out.println("enter the character\n");
         BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
          ch = (char) bf.read();

        if( (ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
            System.out.println(ch+":is an alphabet");
    else
            System.out.println(ch+":is not an alphabet.");

    }
}

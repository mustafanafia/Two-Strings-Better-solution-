import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'twoStrings' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s1
     *  2. STRING s2
     */





    public static String twoStrings(String s1, String s2) {

        HashSet<Character> a = new HashSet<>();
        HashSet<Character> b = new HashSet<>();

        String result;

        for(int i =0; i<s1.length(); i++){
            a.add(s1.charAt(i));
        }
        for(int i =0; i<s2.length(); i++){
            b.add(s2.charAt(i));
        }
        a.retainAll(b);

        if(!a.isEmpty()){
            result = "YES";
        }
        else{
            result = "NO";
        }

        return result;

    }
}





public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        for (int qItr = 0; qItr < q; qItr++) {
            String s1 = bufferedReader.readLine();

            String s2 = bufferedReader.readLine();


            String result = Result.twoStrings(s1, s2);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}



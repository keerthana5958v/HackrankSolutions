import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
        double totalValues = arr.size();
        int numberOfPositiveValues = 0;
        int numberOfNegativeValues = 0;
        int numberOfZeros = 0;
        for(int i = 0 ; i < totalValues ; i++){
            if(arr.get(i)>0)numberOfPositiveValues++;
            else if(arr.get(i)<0)numberOfNegativeValues++;
            else numberOfZeros++; 
        }
        double v1 = numberOfPositiveValues / totalValues;
        double v2 = numberOfNegativeValues / totalValues;
        double v3 = numberOfZeros / totalValues;
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}


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
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
        int minNum = 0;
        if(arr.size()>0) minNum = arr.get(0) ;
        int maxNum = 0;
        long sum = 0;
        for(int i = 0 ; i < arr.size() ; i++){
            if(maxNum<=arr.get(i))maxNum=arr.get(i);
            if(minNum>=arr.get(i))minNum = arr.get(i);
            sum += arr.get(i);
        }
        long minSum = sum - maxNum;
        long maxSum = sum - minNum;
        System.out.println(minSum+" "+maxSum);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}


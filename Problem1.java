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

public class Problem1 {
    public static int[] getLastRow(int n, List<List<Integer>> butterfly){

        ArrayList<Integer>[] LastRow = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            LastRow[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < n; i++) {
            LastRow[i].add(i+1);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                List <Integer> tmpList = butterfly.get(i);
                int tmpNum = tmpList.get(j);
                LastRow[i].remove(tmpNum);
            }
        }

        int [] LastRowOutput = new int[n];

        for (int i = 0; i < n; i++) {
            LastRowOutput[i] = LastRow[i].get(0);
        }

        return LastRowOutput;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer> > butterfly = new ArrayList<List<Integer>>(n);
        for (int i = 0; i < n - 1; i++) {
            List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());
            butterfly.add(arr); }

        int[] result = getLastRow(n, butterfly);

        for (int i = 0; i < n; i++) {
            if (i < n - 1) {
                bufferedWriter.write(String.valueOf(result[i]) + " ");
            } else {
                bufferedWriter.write(String.valueOf(result[i]));
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
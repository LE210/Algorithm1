import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(extracted(arr));

    }

    private static String extracted(int[] arr) {
        if (arr[0] == 1) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != i + 1) {
                    return "mixed";
                }
            }
            return "ascending";
        } else if (arr[0] == 8) {
            int cnt = 8;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != cnt) {
                    return "mixed";
                }
                cnt--;
            }
            return "descending";
        }
        return "mixed";
    }
}
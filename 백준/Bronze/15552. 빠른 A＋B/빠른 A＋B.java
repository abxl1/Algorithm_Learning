import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num1 = Integer.parseInt(br.readLine());

        for (int i = 0; i < num1; i++) {
            String[] arr = br.readLine().split(" ");

            int num2 = Integer.parseInt(arr[0]);
            int num3 = Integer.parseInt(arr[1]);
            bw.write(num2 + num3 + "\n");
        }
        bw.flush();
        bw.close();
    }
}
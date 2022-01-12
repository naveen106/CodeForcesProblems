package BLevelProblem;
import CLevelProbsDiv2_3.FastScanner;
//https://codeforces.com/problemset/problem/266/B
import java.io.PrintWriter;

public class QueueAtSchool {
    public static void main(String[] args) {
        FastScanner input = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        byte n = input.nextByte();
        byte t = input.nextByte();

        StringBuilder str = new StringBuilder(input.next());

        while(t-- > 0){
            for(int i = 0; i<n; i++){
                if(i+1<n && str.substring(i,i+2).equals("BG")) {
                    str.replace(i, i + 2, "GB");
                    i++;
                }
            }
        }
        out.println(str);
        out.close();
    }
}

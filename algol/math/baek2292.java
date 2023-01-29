package algol.math;

import java.util.Scanner;

public class baek2292 {
    public static int solution(int room){
        int cnt = 1;
        int prefix = 6;
        int val = 1;
        while(room > val){
            val = val+(prefix * cnt);
            cnt ++;
        }
        return cnt;
    }
    public static void main(String[] args){
        System.out.println(solution(new Scanner(System.in).nextInt()));
    }
}

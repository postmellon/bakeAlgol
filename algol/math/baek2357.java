package algol.math;

import java.util.Scanner;

public class baek2357 {
    public static int solution(int year){
        return year%4 == 0 && (!(year%100 == 0) || year%400 == 0) ? 1 : 0;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(solution(sc.nextInt()));
    }
}

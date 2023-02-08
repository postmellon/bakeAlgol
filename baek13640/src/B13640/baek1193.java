package B13640;

import java.util.Scanner;

public class baek1193 {
    public static String solution(int param){
        if(param == 1){
            return "1/1";
        }
        int yIndex = 1;
        int lastIndexValue = 1;
        while(param > lastIndexValue){
            lastIndexValue += (++yIndex);
        }

        return yIndex%2==0 ?
                ""+(param - lastIndexValue + yIndex)+"/"+(lastIndexValue - param + 1)  :
                ""+(lastIndexValue - param + 1)+"/"+(param - lastIndexValue + yIndex);
    }
    public static void main(String[] args) {
        System.out.println(baek1193.solution(new Scanner(System.in).nextInt()));
    }
}

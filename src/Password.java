import java.util.Scanner;

public class Password {
    // 암호
    // 알파벳 대문자
    // # 또는 * 일곱개 구성 , 7자리수
    // #는 이진수 1 *은 이진수 0으로 변환
    // ex) #*****# 은 1000001 2진수
    // 바뀐 2진수 1000001을 10진수로 변경하면 65
    // 65를 아스키번호로 변경하면 A
    // A : 65 ~ Z : 90
    // #****###**#####**#####**##**
    public static String solution(int n , String s){
        String answer = "" ;

        for(int i =0; i < n; i++){
            String tmp = s.substring(0 , 7).replace('#' , '1').replace('*' ,'0');
            int num = Integer.parseInt(tmp ,2);
            answer += (char)num;
            s= s.substring(7);

        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        int n = kb.nextInt();


        System.out.println(solution(n , str));

    }
}

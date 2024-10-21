import java.util.Scanner;

public class OnlyNumber {
    // 숫자만 추출
    // 문자와 숫자가 섞여있는 문자열이 주어지면 그중 숫자만 추출 순서대로 자연수 만들기
    // ex) tge0a1h205er 이 주어지면 이것을 자연수로 만들면 1205
    public static int solution(String s){
        // 1번
        // int answer=0;

        // 2번
        String answer= "";

        for (char x : s.toCharArray()){
            // 1번방법
            /*
            if(x>=48 && x<=57){ // 48~57은 문자 0~9의 값을 나타냄 즉 문자형 숫자를 뜻함
                answer = answer *10 + (x-48); // x를 그냥 더하면 아스킨넘버로 인식해서 48이 찍힘 결국 -48해야 0이 찍힘
            }
            */

            // 2번방법
            if(Character.isDigit(x)){ // Character.isDigit(x) 문자가 숫자인지 판별하는 메서드
                answer +=x;
            }
        }

        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(solution(str));
    }
}

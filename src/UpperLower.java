import java.util.Scanner;

public class UpperLower {
    // 대소문자 변환
    // 예를 들어 StUDy 라는 문자열이 주어지면 소문자는 대문자로 대문자는 소문자로 리턴하는 문제

    public static String solution(String str){
        String answer ="";

        // 1번방법
        for(char x: str.toCharArray()){
            if(Character.isLowerCase(x)){// 소문자면 Character.isLowerCase(x)
                 answer += Character.toUpperCase(x); // 대문자로 변환
            }else{
                answer += Character.toLowerCase(x); // 소문자로 변환
            }
        }

        // 2번방법
        // 대문자 아스키 코드는 45~90
        // 소문자 아스키 코드는 97~122
        // if(x >=97 && x<=122) .... 이런식으로 소문자를 찾아서 하면 됨

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(solution(str));

    }
}

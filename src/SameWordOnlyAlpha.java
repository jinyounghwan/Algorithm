import java.util.Scanner;

public class SameWordOnlyAlpha {
    public static String solution(String s){
        //회문 문자열
        // 회문 문자열인데 특수문자 , 숫자 제외하고 알파벳일경우만
        String answer="No";
        s= s.toUpperCase().replaceAll("[^A-Z]" , ""); // 대문자 치환 , 알파벳만 거르는 정규식

        String test = new StringBuilder(s).reverse().toString();

        if(s.equals(test)){
            return "YES";
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(solution(str));
    }
}

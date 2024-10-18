import java.util.Scanner;

public class SameWord {
    // 회문 문자열
    // 앞에서 읽을때나 뒤에서 읽을때나 같은 문자열을 회문 문자열이라 칭함 예시 GOOG
    // 문자열이 입력되면 해당 문자열이 회문이면 YES 아니면 NO 출력

    public static String solution(String str){
        String answer="YES";
        str = str.toUpperCase();
        int len = str.length();
        // 1번 방법
        // 앞문자와 뒷문자 비교해서 리턴
        for(int i=0; i < len/2; i++){
            if(str.charAt(i) != str.charAt(len-i-1)){ // 앞에 비교 != 뒤에서부터 비교
                return "NO"; // 같지 않으면 바로 리턴
            }
        }

        // 2번방법
        // String tmp = new Stringbuilder(str).reverse().toString();
        // tmp와 str 비교해서 return하면 1번방법과 동일

        return  answer;
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(solution(str));
    }

}

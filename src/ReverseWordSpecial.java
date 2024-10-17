import java.util.ArrayList;
import java.util.Scanner;

public class ReverseWordSpecial {
    // 특정문자뒤집기
    // 특수문자 포함한 문자열을 뒤집으면되는데 특수문자는 빼고 뒤집기

    public static String solution(String str){
        String answer;
        char[] s = str.toCharArray(); // 문자배열

        int lt = 0;
        int rt = str.length()-1;

        while (lt < rt){
            if(!Character.isAlphabetic(s[lt])){ // 알바벳이 아닌지
                lt++;                           // 알파벳이 아니면 그냥 증감 아무것도 안하면
            }else if(!Character.isAlphabetic(s[rt])){
                rt--;
            }else {
                // lt-앞에서부터 체크 , rt- 뒤에서부터 체크 둘다 알파벳이면 정상로직
                char tmp = s[lt];
                s[lt]=s[rt];
                s[rt]= tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(s); // 문자를 스트링형으로 바꿔줌 다른 타입도 마찬가지로 쓸 수 있음
        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(solution(str));
    }
}

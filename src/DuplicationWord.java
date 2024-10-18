import java.util.Scanner;

public class DuplicationWord {
    // 중복문자 제거
    // 예시 ksekksek > ksek
    public static String solution(String str){
        String answer="";

        for (int i =0; i < str.length(); i++){ // indexOf(문자) 는 찾고자하는 문자나
            //System.out.println(str.charAt(i) + " " + i + " " + str.indexOf(str.charAt(i)));
            System.out.println("str.charAt(i) >" + str.charAt(i));
            System.out.println("str.indexOf(str.charAt(i)) >" + str.indexOf(str.charAt(i)));
            if(str.indexOf(str.charAt(i))==i){
                answer += str.charAt(i);
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(solution(str));
    }
}

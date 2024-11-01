import java.util.Scanner;

public class StringCompression {
    // 문자열 압축
    // 알파벳 대문자로 이루어진 문자를 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는 문자 오른쪽에 반복횟수를 표기
    // ex) KKHSSSSSSSE
    // =   K2HS7E
    public static String solution(String s){
        String answer ="";
        s=s+" ";
        int cnt = 1;

        for(int i=0; i< s.length()-1; i++){
            if(s.charAt(i) == s.charAt(i+1)){
                cnt++;
            }else{
                answer += s.charAt(i);
                if(cnt>1){
                    answer += String.valueOf(cnt);
                }
                cnt = 1;
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

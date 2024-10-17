import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class ReverseWord {
    // 단어 뒤집기
    // N개의 단어가 주어지면 각 단어를 뒤집어 출력
    // 영어로만 구성

    public static ArrayList<String> solution(int n , String[] str){
        ArrayList<String> answer = new ArrayList<>();

        // 1번방법
        for(String x : str){
            // 스트링은 값을 변경 할 수 없음 새로운 객체를 생성해서 대입하는 형식인데 빌더는 수정가능 메모리 관리면에서 좋음
            String tmp = new StringBuilder(x).reverse().toString(); // 스트링 빌더 객체를 리버스해서 문자열로 넣음
            answer.add(tmp);
        }

        // 2번방법
        // 일부 문자만 바꾸는 방법
        for(String x : str){
            char[] s = x.toCharArray();
            int lt=0;
            int rt = x.length()-1;

            while (lt < rt){
                char tmp = s[lt];
                s[lt]=s[rt];
                s[rt]= tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(s); // valueOf는 static메서드 배열을 스트링화 시켜서 smp
            answer.add(tmp);
        }



        return  answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        String[] str = new String[n];
        for (int i =0; i <n; i++){
            str[i] = kb.next();
        }

        for (String x : solution(n , str)){
            System.out.println(x);
        }
    }
}

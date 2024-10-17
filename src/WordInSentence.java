import java.util.Scanner;

public class WordInSentence {
    // 문장 속 단어
    // 한개 문장이 주어지면 그 문장 속에서 가장 긴단어를 출력하는 프로그램 ,
    // 각 단어는 공백으로 구분 제일 긴 단어가 2개면 앞쪽에 있는 단어가 답
    // 예시 : it is time to study면 제일 긴 단어는 study

    public static String Solution(String str){
        String answer="";

        int m = 0;  // 제일 작은 수
        String[] s = str.split(" ");


        for(String x : s){
            int len = x.length(); // 각각 단어의 길이
            System.out.println("x > "+ len);
            System.out.println("m > " + m);
            if(len > m){ // 최솟값을 비교해서
                m=len;
                answer=x;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in); // 입력 받기 위함

        String str = kb.nextLine();
        System.out.println(Solution(str));
    }
}

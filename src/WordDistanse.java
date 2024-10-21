import java.util.Scanner;

public class WordDistanse {
    // 가장 짧은 문자거리
    // 한개의 문자열 s와 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 순서대로 출력
    // ex) 문자열 s = teachermode  ,  문자열 t = e
    // 1 0 1 2 1 0 1 2 2 1 0
    // t e a c h e r m o d e

    public static int[] solution(String s , char t){
        int[] answer =new int[s.length()];
        int p = 1000;

        // 문자열 s를 charAt으로 t로 돌고
        for(int i =0; i < s.length(); i++){
            if(s.charAt(i) == t){
                // 주어진 문자를 돌면서 문자랑 같으면
                p = 0;
                answer[i] = p;
            }else{
                p++;
                answer[i] = p;
            }
        }
        p = 1000;
        for(int i =s.length()-1 ; i >=0; i-- ){
            if(s.charAt(i) == t){
                // 주어진 문자를 돌면서 문자랑 같으면
                p = 0;
            }else{
                p++;
                answer[i] = Math.min(answer[i] , p); // 기존 값과 비교해서 작은 숫자를 넣으면 된다 양쪽으로 반복문이 돌아야 하기 때문에
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char t = kb.next().charAt(0);
        for(int x : solution(str , t)){
            System.out.println(x + "");
        }

    }
}

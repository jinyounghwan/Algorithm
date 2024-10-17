import java.util.Scanner;

public class CharFind {
    // 문자찾기

    // 문자열이 Computercoller라는 단어가 주어지고
    // 입력된 문자가 몇개 있는지 갯수 찾는 문제
    // 대소문자 구분 안함

    public static int solution(String str , char t){
        int answer=0;

        str = str.toUpperCase(); // UpperCase 전부 대문자로 바꿈
        t = Character.toUpperCase(t);

        System.out.println("str > " + str);
        System.out.println("t > " + t);

        // 1번 방법
        // 인덱스로 돌아서 확인
       /* for(int i=0; i < str.length(); i++){
            if(str.charAt(i) == t){ // charAt 문자열을 인덱스별로 돌아서 확인함
                answer++;
            }
        }*/

        // 2번방법
        // 배열을 넣어야 하기 때문에 문자열을 배열로 만드는 toCharArray를 사용
        for(char x : str.toCharArray()){
            if(x == t){
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in); // 입력 받기 위함

        String str= kb.next();  // 콘솔 창에서 입력 받기 위함
        char c = kb.next().charAt(0);

        System.out.println(solution(str ,c ));

    }
}

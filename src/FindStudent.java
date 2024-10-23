import java.util.ArrayList;
import java.util.Scanner;

public class FindStudent {
    // 보이는 학생
    // 선생님이 n명의 학생을 일렬로 세웠습니다.
    // 일렬로 서있는 학생의 키가 앞에서부터 순서대로 주어질 때
    // 맨앞에 서있는 선생님이 볼 수 있는 학생의수를 구하는 프로그램

    // 8
    // 130 135 148 140 145 150 150 153
    public static int solution(int n , int[] arr){
        int answer = 1;
        int max = arr[0];

        for(int i =0; i < n; i++){
            if(arr[i] > max){
                answer++;
                max=arr[i];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[] arr  = new int[n];
        for(int i =0 ; i < n; i++){
            arr[i] = kb.nextInt();
        }

        System.out.println(solution(n ,arr));
    }
}

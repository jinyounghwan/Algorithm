import java.util.Scanner;

public class ScoreMath {
    // 점수 계산
    //10
    //1 0 1 1 1 0 0 1 1 0
    // 1이면 정답 0이면 오답
    // 연속되면 카운트 아니면 다시 1부터 카운트 총점을 구하는 프로그램
    // 1 0 1 1 1 0 0 1 1 0
    // 1 0 1 2 3 0 0 1 2 0 = 10점
    public static  int solution(int n, int[] arr){
        int answer=0, cnt=0;
        for(int i=0; i<n; i++){
            if(arr[i]==1){
                cnt++;
                answer+=cnt;
            }
            else cnt=0;
        }
        return answer;
    }


    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        System.out.print(solution(n, arr));
    }


}

import java.util.Scanner;

public class Decimal {
    // 소수 (에라토스테네스 체)
    // 자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램
    // 20이 입력되면 1~20의 소수는 2 , 3, 5 ,7 , 11, 13 ,17 , 19
    public static int solution(int n){
        int cnt=0;

        // 21 ?
        int[] ch = new int[n+1];

        for(int i=2; i<=n; i++){
            System.out.println(" ch[i] > " + ch[i]);
            if(ch[i]==0){ //
                cnt++;
                for(int j=i; j<=n; j=j+i) { // 아 2가 들어오면 계속 2+2 ~ 4+2 6+2 ~ 뭐 이런식으로 다 돌면서 20까지 찾은 후 모두 1로 바뀌니깐 cnt
                    ch[j] = 1;
                }

            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        System.out.println(solution(n));

    }

}

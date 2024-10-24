import java.util.Scanner;

public class FibonacciNum {
    // 피보나치 수열
    // 앞의 2개의 수를 합하여 다음 숫자가 되는 수열
    // 10을 입력하면
    //  1 1 2 3 5 8 13 21 34 55 이런식으로
    public static int[] solution(int n){
        int[] answer = new int[n];

        for(int i=2; i < n ; i++){
            answer[0] = 1;
            answer[1] = 1;

            answer[i] = answer[i-1] + answer[i-2];
            System.out.println("11 >" + answer);
        }

        // 배열 쓰지않고 출력


        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        for(int x : solution(n)){
            System.out.println(x + "");
        }


    }
}

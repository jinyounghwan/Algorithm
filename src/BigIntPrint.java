import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class BigIntPrint {
    //큰 수 출력
    // N개의 정수를 입력받아 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램 작성
    // ex) 6 / 7 3 9 5 6 12
    // = 7 9 6 112

    public static ArrayList<Integer> solution(int n , int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();

        for(int z = 0; z  < arr.length; z++){
            if(arr[z] >= n) {
               answer.add(arr[z]);
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

        for(int x : solution(n , arr)){
            System.out.println(x + "");
        }

    }
}

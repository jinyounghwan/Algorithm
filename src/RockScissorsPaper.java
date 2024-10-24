import java.util.Scanner;

public class RockScissorsPaper {
    // 가위바위보
    // A랑 B가 있는데
    // 둘이 가위바위보해서 이긴 사람을 출력하는 프로그램
    // ex) 1가위 / 2바위 / 3보
    /*
    5
    2 3 3 1 3
    1 1 2 2 3
    */

    // A B A B D

    // 1
    public static String solution(int n, int[] a, int[] b){
        String answer="";
        for(int i=0; i<n; i++){
            if(a[i]==b[i]) answer+="D";
            else if(a[i]==1 && b[i]==3) answer+="A";
            else if(a[i]==2 && b[i]==1) answer+="A";
            else if(a[i]==3 && b[i]==2) answer+="A";
            else answer+="B";
        }
        return answer;
    }

        public static void main(String[] args){
            Main T = new Main();
            Scanner kb = new Scanner(System.in);
            int n=kb.nextInt();
            int[] a=new int[n];
            int[] b=new int[n];
            for(int i=0; i<n; i++){
                a[i]=kb.nextInt();
            }
            for(int i=0; i<n; i++){
                b[i]=kb.nextInt();
            }
                System.out.println(solution(n , a ,b ));
        }


}

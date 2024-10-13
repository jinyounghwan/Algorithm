import java.util.Scanner;

public class Main {
    public String solution(String str){
        String answer = "";
      /*  for(char c : str.toCharArray()){
            if(Character.isLowerCase(c)) answer+= Character.toUpperCase(c);
            else answer += Character.toLowerCase(c);
        }*/

        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        String str = kb.next();

        System.out.println(T.solution(str));
    }
}
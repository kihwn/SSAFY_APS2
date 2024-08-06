package SWEA_1224_계산기3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class Solution {
    static Map<Character, Integer> map = new HashMap<>();

    static {
        map.put('+', 1);
        map.put('-', 1);
        map.put('*', 2);
        map.put('/', 2);
//		map.put('(', 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int round = 1; round <= 10; round++) {
            int n = sc.nextInt();
            String s = sc.next();
            int result = evaluate(s);
            System.out.println("#" + round + " " + result);
        }
    }

    static int evaluate(String expression) {
        String postfix = infixToPostfix(expression);
        return evalPostfix(postfix);

    }

    static String infixToPostfix(String infix) {
        String result = "";
        Stack<Character>stack = new Stack<>();

        int n = infix.length();
        for (int i=0; i<n; i++){
            char c = infix.charAt(i);
            if (c=='('){
                stack.push(c);
            }
            else if (c>='0' && c<='9'){
                result+=c;
            }

            else if (c==')'){
                char tmp = stack.pop();

                while(tmp!='('){
                    result+=stack.pop();
                    tmp = stack.pop();
                }
            }
            else{
                if (!stack.isEmpty()&& stack.peek()!='('&&map.get(stack.peek())>=map.get(c)){
                    char tmp = stack.pop();
                    result+=tmp;

                }
                stack.push(c);
            }
        }

        while(!stack.isEmpty()){
            result+=stack.pop();
        }
        return result;
    }


    static int evalPostfix(String result) {

        Stack<Integer> stack = new Stack<>();

        for (int i=0; i<result.length(); i++){
            char c = result.charAt(i);

            if (c>='0'&& c<='9'){
                stack.push(c-'0'); //c를 int형으로 바꿔주는 과정
            }
            else{
                int num1 = stack.pop();
                int num2 = stack.pop();
                int result2;

                if (c=='+'){
                    result2 = num2+num1;
                }
                else if (c=='-'){
                    result2 = num2-num1;
                }
                else if (c=='*'){
                    result2 = num2*num1;
                }
                else{
                    result2 = num2/num1;
                }
                stack.push(result2);
            }
        }
        return stack.pop();
    }

}
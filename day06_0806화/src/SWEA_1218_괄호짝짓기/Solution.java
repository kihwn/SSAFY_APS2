package SWEA_1218_괄호짝짓기;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    static ArrayList<String>arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int round=1; round<=10; round++){
            arr = new ArrayList<>();
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            String[]sarr = s.split("");
            boolean isCheck = true;

            for (int i=0; i<n; i++){
                if (sarr[i].equals("(")||sarr[i].equals("[")||sarr[i].equals("<")||sarr[i].equals("{")){
                    push(sarr[i]);
                }
                else if (sarr[i].equals("]")){
                    if (!isEmpty()){
                        String tmp = peek();
                        if (tmp.equals("[")){
                            pop();
                        }
                        else{
                            isCheck=false;
                            break;
                        }
                    }
                    else{
                        isCheck = false;
                        break;
                    }
                }
                else if (sarr[i].equals(")")){
                    if (!isEmpty()){
                        String tmp = peek();
                        if (tmp.equals("(")){
                            pop();
                        }
                        else{
                            isCheck=false;
                            break;
                        }
                    }
                    else{
                        isCheck = false;
                        break;
                    }
                }
                else if (sarr[i].equals("}")){
                    if (!isEmpty()){
                        String tmp = peek();
                        if (tmp.equals("{")){
                            pop();
                        }
                        else{
                            isCheck=false;
                            break;
                        }
                    }
                    else{
                        isCheck = false;
                        break;
                    }
                }
                else if (sarr[i].equals(">")){
                    if (!isEmpty()){
                        String tmp = peek();
                        if (tmp.equals("<")){
                            pop();
                        }
                        else{
                            isCheck=false;
                            break;
                        }
                    }
                    else{
                        isCheck = false;
                        break;
                    }
                }
            }
            if (!isEmpty()){
                isCheck = false;
            }

            if (!isCheck){
                System.out.println("#"+round+" 0");
            }
            else{
                System.out.println("#"+round+" 1");
            }


        }
    }

    public static void push(String x){
        arr.add(x);
    }

    public static String pop(){
        if (!arr.isEmpty()){
            String tmp = arr.get(arr.size()-1);
            arr.remove(arr.size()-1);
            return tmp;
        }
        return null;
    }

    public static boolean isEmpty(){
        if (arr.isEmpty()){
            return true;
        }
        return false;
    }

    public static String peek(){
        if (!isEmpty()){
            return arr.get(arr.size()-1);}
        else{
            return null;
        }
    }

}
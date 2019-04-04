package epam4;

import java.io.*;
import java.util.*;

public class QueueUsingStacks {

    Stack<Integer> shiftStk(Stack<Integer> stk1, Stack<Integer> stk2){
        while(!stk1.empty())
            stk2.push(stk1.pop());

        return stk2;
    }


    public static void main(String[] args) {
    	QueueUsingStacks s = new QueueUsingStacks();

        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        Scanner sc = new Scanner(System.in);

        int queries = sc.nextInt();
        int t, d;

        while(queries-- > 0){
            t = sc.nextInt();

            if(t == 1){
                d = sc.nextInt();
                stack1.push(d);
             
            }
            else if(t == 2){
                if(stack2.isEmpty()){
                	stack2 = s.shiftStk(stack1,stack2);
                }
                stack2.pop();
            }
            else{
                if(stack2.isEmpty()){
                	stack2 = s.shiftStk(stack1, stack2);
                }
                System.out.println(stack2.peek());
            }
        }
        sc.close();
    }
}

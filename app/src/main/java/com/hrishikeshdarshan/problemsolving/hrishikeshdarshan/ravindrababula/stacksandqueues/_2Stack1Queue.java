package com.hrishikeshdarshan.problemsolving.hrishikeshdarshan.ravindrababula.stacksandqueues;

//Implement 1 queue using 2 stacks
public class _2Stack1Queue {

    static int[] stack1 = new int[5];
    static int[] stack2 = new int[5];
    static int length = stack1.length;
    static int top1 = -1;
    static int top2 = -1;

    public static void main(String[] args) {

        push(1);
        push(2);
        push(3);
        push(4);
        push(5);
        push(6); //overflow
        pop(); //1
        pop(); //2
        pop(); //3
        pop(); //4
        pop(); //5
        pop();
//

    }

    private static void push(int i) {

        if(top1 == stack1.length - 1 ){
            System.out.println("Can't do it homie, it would be an overflow");
        }
        else{
            top1 = top1+1;
            stack1[top1] = i;
            System.out.println("Pushed " + stack1[top1]);
        }
    }

    private static void pop() {

        if(top2 == -1){
            if(top1 == -1){
                System.out.println("Can't do it homie, both top1 and top2 are empty. It will cause an underflow");
            }
            else{

                for (int i = top1; i != -1; i--){

                    top2 = top2+ 1;
                    stack2[top2] = stack1[top1];
                    top1--;

//                    pushto2AndPopIn1(stack2[i]);
//                    top2--;
                }
                System.out.println("Popped: " + stack2[top2]);
                top2--;
            }

        }
        else{
            System.out.println("Popped: " + stack2[top2]);
            top2--;
        }
    }
}

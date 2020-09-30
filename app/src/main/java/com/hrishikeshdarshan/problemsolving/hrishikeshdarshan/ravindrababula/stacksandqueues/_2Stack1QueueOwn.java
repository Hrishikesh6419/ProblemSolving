package com.hrishikeshdarshan.problemsolving.hrishikeshdarshan.ravindrababula.stacksandqueues;

//Implement 1 queue using 2 stacks
public class _2Stack1QueueOwn {

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
        printQueue();
        push(6); //overflow
        pop();
        printQueue();
        pop();
        printQueue();
        push(6);
        printQueue();
        pop();pop();pop();
        printQueue();
        pop();
        printQueue();


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

    private static void printQueue(){
        if (top2 != -1){

            for(int i = top2; i != -1; i--){
                System.out.print(stack2[i] +"->");
            }
        }
        if (top1 != -1){

            for(int i = 0; i <= top1; i++){
                System.out.print(stack1[i] +"->");
            }
        }
        System.out.println();

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

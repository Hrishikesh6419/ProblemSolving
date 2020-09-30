package com.hrishikeshdarshan.problemsolving.hrishikeshdarshan.ravindrababula.stacksandqueues;

import java.util.Stack;

public class _2Stack1QueueOnline {

    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();

    public static void main(String[] args) {


        insert(1);
        insert(2);
        insert(3);
        delete();
        delete();
        delete();
        delete();
        delete();
        insert(1);
        insert(2);
        insert(3);
        insert(4);
        insert(5);
        insert(6);

    }

    private static void insert(int i) {
        System.out.println("Pushed: " + s1.push(i));
    }
    private static void delete(){

        if (s2.isEmpty() && s1.isEmpty()){
            System.out.println("Can't do it homie");
            return;
        }
        else if(s2.isEmpty() && !s1.isEmpty()){
            while (!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }

        System.out.println("popped: " + s2.pop());

    }

}

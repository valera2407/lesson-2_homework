package com.alevel;

public class Main {

    public static void main(String[] args) {
        int numbers = 347693485;
        int num;
        int i = 0;
        while (numbers>0) {
            num = numbers % 10;
            i = i * 10 + num;
            numbers = numbers / 10;
        }
        while (i>0){
            num = i % 10;
            if (num % 2 == 0 && num % 3 == 0) {
                System.out.println("fizzbuzz");
            } else if (num % 2 == 0) {
                System.out.println("fizz");
            } else if (num % 3 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println("Number is " + num);
            }
            i = i / 10;
        }
    }
}
//слева направо

package com.alevel;

public class Main {

    public static void main(String[] args) {
        int numbers = 347693485;
        int times = 9;
        int num;
        int i = 0;
        while (true){
            num = numbers % 10;
            i = i * 10 + num;
            numbers = numbers / 10;
            if (i == 584396743) {
                for (int x=0;x <= 8; x++) {
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
            times--;
            if (times == 0)
                return;
        }
    }
}
//слева направо

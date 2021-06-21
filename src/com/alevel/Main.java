package com.alevel;

public class Main {

    public static void main(String[] args) {
        int numbers = 347693485;
        int num;
        while (numbers>0){
            num = numbers%10;
            if (num%2==0 && num%3==0) {
                System.out.println("fizzbuzz");
            }else if (num % 2 == 0) {
                System.out.println("fizz");
            }else if (num % 3 == 0) {
                System.out.println("buzz");
            }else {
                System.out.println("Number is " + num);
            }
            numbers = numbers/10;
        }
        System.out.println("Your task completed");
        //справо налево
        int beforeInvert = 347693485;
        int numIvert;
        int forIvert = 0;
        while (beforeInvert>0) {
            numIvert = beforeInvert % 10;
            forIvert = forIvert * 10 + numIvert;
            beforeInvert = beforeInvert / 10;
        }
        while (forIvert>0){
            numIvert = forIvert % 10;
            if (numIvert % 2 == 0 && numIvert % 3 == 0) {
                System.out.println("fizzbuzz");
            } else if (numIvert % 2 == 0) {
                System.out.println("fizz");
            } else if (numIvert % 3 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println("Number is " + numIvert);
            }
            forIvert = forIvert / 10;
        }
        System.out.println("Okay, we did it");
        //слева направо
        int quantity = 0;
        String Lnumber = Long.toBinaryString(361927548);
        int leught = Lnumber.length();
        for (int i = 0; i <= leught - 1; i++){
            char value = Lnumber.charAt(i);
            if (value == '1')
                quantity++;
        }
        System.out.println(quantity+ " - bits with a value of '1'");
    }
}

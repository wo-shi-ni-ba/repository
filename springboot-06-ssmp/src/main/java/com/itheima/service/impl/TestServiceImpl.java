package com.itheima.service.impl;

public class TestServiceImpl {
    public static void main(String[] args) {
        System.out.println(isHappyNum(19));
    }
    public static Boolean isHappyNum(int number){
        if (number % 2 ==0){
            return Boolean.FALSE;
        }
        if (number == 1){
            return Boolean.TRUE;
        }
        while(true){
            int sum = 0;
            while(number>=0){

                int count = number % 10;
                sum += count^2;
            }
            number = sum;
            if (sum == 0){
                return Boolean.TRUE;
            }
        }
    }
}

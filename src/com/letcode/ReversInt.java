package com.letcode;

/**
 * @author: fanbopeng
 * @Date: 2018/9/8 12:46
 * @Description:反转整数
 */
public class ReversInt {

    public static int reverse(int x) {
        /**
         *
         * 功能描述:
         *  O(log(x))
         * @param: [x]
         * @return: int
         * @auther: fanbopeng
         * @date: 2018/9/8 12:58
         */
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;

            rev = rev * 10 + pop;
        }
        return rev;
    }


    public static void main(String[] args) {


        System.out.println( ReversInt.reverse(256));

    }




}

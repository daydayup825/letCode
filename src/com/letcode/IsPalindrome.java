package com.letcode;

/**
 * @author: fanbopeng
 * @Date: 2018/9/8 13:04
 * @Description:  回文数
 */
public class IsPalindrome {

      public static  boolean isPalindrome(int x){
          /**
           *
           * 功能描述:
           *
           * @param: [x]
           * @return: boolean
           * @auther: fanbopeng
           * @date: 2018/9/8 13:05
           */

          if(x<0||(x%10==0&&x!=0)){

              return  false;
          }
        int revertedNumber=0;
          while (x>revertedNumber){
               revertedNumber=x%10+revertedNumber*10;
               x/=10;

          }

          return x==revertedNumber||x==revertedNumber/10;
      }


    public static void main(String[] args) {

            IsPalindrome.isPalindrome(1221);

    }



}

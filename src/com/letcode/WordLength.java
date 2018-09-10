package com.letcode;

/**
 * @author: fanbopeng
 * @Date: 2018/9/10 09:22
 * @Description:58. 最后一个单词的长度
 */
public class WordLength {

    public  static int lengthOfLastWord(String s) {

        int length=0;
        int i=s.length()-1;
        while(i>=0&&s.charAt(i)==' '){

            i--;
        }
        while (i>=0&&s.charAt(i)!=' '){
            length++;
            i--;
        }
        return  i;
    }

    public static void main(String[] args) {
        int i = WordLength.lengthOfLastWord("gei ni");
        System.out.println(i);
    }

}

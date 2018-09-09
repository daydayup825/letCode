package com.letcode;

/**
 * @author: fanbopeng
 * @Date: 2018/9/9 22:36
 * @Description:给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
 *
 */
public class StrStr {

    public int strStr(String haystack, String needle) {
    /**
     *
     * 功能描述:
     *
     * @param: [haystack, needle]
     * @return: int
     * @auther: fanbopeng
     * @date: 2018/9/9 22:37
     */

        char[] haystackArray = haystack.toCharArray();
        char[] needleArray = needle.toCharArray();
        if (needleArray.length==0){return 0;}



        for (int i=0;i<haystackArray.length;i++){
            for (int j=0;j<needleArray.length;j++){
               while (haystackArray[i]==needleArray[j]){
                   System.out.println(i);
                    return i;


                }



            }

        }

        return 0;
    }


    public static void main(String[] args) {
        StrStr strStr=new StrStr();
        strStr.strStr("hello", "needle");
    }

}

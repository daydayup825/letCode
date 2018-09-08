package com.letcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: fanbopeng
 * @Date: 2018/9/8 10:48
 * @Description:
 */
public class Solution {
    /**
     * @author: fanbopeng
     * @Date: 2018/9/8 10:43
     * @Description:
    给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。
    你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。

     */

        public static int[] twoSum(int[] nums, int target) {
            /**
             *
             * 功能描述:
             *  暴力法 O(n)=n^2
             * @param: [nums, target]
             * @return: int[]
             * @auther: fanbopeng
             * @date: 2018/9/8 11:14
             */

            for (int i = 0; i <= nums.length; i++) {
                for (int j = i + 1; j <= nums.length; j++) {

                    if (target == nums[i] + nums[j]) {

                        System.out.println(nums[i]);
                        System.out.println(nums[j]);
                        return new int[]{i, j};
                    }
                }
            }

            throw new IllegalAccessError("No two solution");
        }

    public static int[] twoSum2(int[] nums, int target){
            /**
             *
             * 功能描述:
             *      两遍哈希表  O(n)=O(n)
             * @param: [nums, target]
             * @return: int[]
             * @auther: fanbopeng
             * @date: 2018/9/8 11:31
             */
        Map<Integer,Integer> map = new HashMap<>();
         for (int i=0;i<nums.length;i++){

             map.put(nums[i],i );
         }

         for (int i=0;i<nums.length;i++){
             int value=target-nums[i];
             if (map.containsKey(value)&&map.get(value)!=i){

                 return  new int[]{i,map.get(value)};
             }


         }

        throw new IllegalAccessError("No two solution");
    }

    public static int[] twoSum3(int[] nums, int target){
            /**
             *
             * 功能描述:
             *          一遍哈希表 O(n)=O(n)
             * @param: [nums, target]
             * @return: int[]
             * @auther: fanbopeng
             * @date: 2018/9/8 11:36
             */
            Map<Integer,Integer> map = new HashMap<>();
            for (int i=0;i<nums.length;i++){

                map.put( nums[i],i );
                 int value=target-nums[i];
                 if(map.containsKey(value)&&map.get(value)!=i){

                     return new int[]{i,value};

                 }



            }


        throw new IllegalAccessError("No two solution");

    }






        public static void main(String[] args) {
            int[] ints={1,2,3,5,6};
            int target=8;


            Solution.twoSum3(ints, target);
        }
    }



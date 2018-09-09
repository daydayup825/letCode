package com.letcode;

/**
 * @author: fanbopeng
 * @Date: 2018/9/9 23:03
 * @Description:给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 */
public class SearchInsert {

    public int searchInsert(int[] nums, int target) {
        /**
         *
         * 功能描述:
         *  二分查
         * @param: [nums, target]
         * @return: int
         * @auther: fanbopeng
         * @date: 2018/9/9 23:15
         */
        int left=0;
        int right=nums.length-left;
        while (left<=right){
            int mid=(right-left)/2+left;

             if (nums[mid]<target){
                  left=mid+1;
             }else  if (nums[mid]>target){
                 right=mid-1;
             }else {
                 return  mid;
             }

        }
            return left;

    }
    public static void main(String[] args) {
        SearchInsert searchInsert = new SearchInsert();
        int array[]={1,1,2,3,4,5};
        searchInsert.searchInsert(array, 5);
    }
}


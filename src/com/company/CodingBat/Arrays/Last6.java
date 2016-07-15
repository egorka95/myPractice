package com.company.CodingBat.Arrays;

/**
 * Created by nikitarozhkov on 22.06.16.
 */
public class Last6 {

    public boolean firstLast6(int[] nums) {
        return (nums[0] == 6 || nums[nums.length - 1] == 6);
    }

        // Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.

    public boolean sameFirstLast(int[] nums) {
        return (nums[0] == nums[nums.length - 1]);
    }

    //Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.
    public int[] makePi() {
        int[] pi = {3, 1, 4};
        return pi;
    }

    //Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element. Both arrays will be length 1 or more.
    public boolean commonEnd(int[] a, int[] b) {
        return (a[0] == b[0] || a[a.length-1] == b[b.length-1]);
    }

    //вернуть сумму масива длиной в 3 элемента
    public int sum3(int[] nums) {
        return (nums[0] + nums [1] + nums[2]);
    }

    //Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.
    public int[] reverse3(int[] nums) {
        int[] reserve3 = {nums[2], nums[1] ,nums[0]};
        return reserve3;
    }

    //Given an array of ints length 3, figure out which is larger between the first and last elements in the array, and set all the other elements to be that value. Return the changed array.
    public int[] maxEnd3(int[] nums) {
        //
        //      ???
        //
        //
        return (nums);
    }

    //Given an array of ints, return the sum of the first 2 elements in the array. If the array length is less than 2, just sum up the elements that exist, returning 0 if the array is length 0.
    public int sum2(int[] nums) {

        if (nums.length <2){
            return nums[0] + nums[1];
        }if (nums.length == 0){
            return 0;
        }if (nums.length<2){
            return nums[0];
        }
        return (nums[0] + nums[nums.length - 1]);
    }

    //Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.
    public int[] middleWay(int[] a, int[] b) {
       int[] i = {a[1],b[1]};
        return i;
    }

    // Given an array of ints, return a new array length 2 containing the first and last
    // elements from the original array. The original array will be length 1 or more.
    public int[] makeEnds(int[] nums) {
        int[] end = {nums[0], nums[nums.length - 1]};
        return end;
    }


    /*public boolean has23(int[] nums) {
        if (nums[0] == 2 || nums[0] == 3){
            return true;
        }else (nums[1] == 2 || nums[1] == 3){
            return true;
        }
        return (nums[0] == 2 || nums[0] ==3);
        }*/

    //Given an int array length 2, return true if it does not contain a 2 or 3.
    public boolean no23(int[] nums) {
        if (nums[0] == 2 || nums[0] == 3 ){
            return false;
        }
        if (nums[1] == 2 || nums[1] == 3 ){
            return false;}
        return !(nums[1] == 2 || nums[1] == 3);

    }

    // Given an int array, return a new array with double the length where its last element is the same as
    // the original array, and all the other elements are 0. The original array will be length 1 or more.
    // Note: by default, a new int array contains all 0's.
    public int[] makeLast(int[] nums) {
        int[] last = {nums.length*2};
                /*
                ???
                ???
                ???
                 */
        return nums;
    }

    //Given an int array, return true if the array contains 2 twice, or 3 twice. The array will be length 0, 1, or 2.
    public boolean double23(int[] nums) {
        if (nums[0] == 2 || nums[1] == 2 || nums[2] == 2){
            return true;
        }if (nums[0] == 3 || nums[1] == 3 || nums[2] == 3){
            return true;
        }

        return (nums[0] == 2 || nums[0] ==2);
    }

    //Given an int array length 3, if there is a 2 in the array immediately followed by a 3, set the 3 element to 0. Return the changed array.
    public int[] fix23(int[] nums) {
        int[] fix = {nums[0], nums[1], nums[2]};
        if (nums[0] == 2 && nums[1] == 3)
            fix[1] = 0;
        if (nums[1] == 2 && nums[2] == 3)
            fix[2] = 0;
        return fix;
    }
/*
    //Start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1 as their first element.
    public int start1(int[] a, int[] b) {
        if (a[0] == 1){
            return a;
        }if (b[0] == 1){
            return b;}
        return start1();
*/



    public static void main(String[] args) {

        int[] nums = new int[]{1,5,3,7,6};

        System.out.println(nums.length);

        for (int n : nums){
            System.out.println(n);
        }




        }
    }


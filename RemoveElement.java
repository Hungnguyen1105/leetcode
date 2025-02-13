package Algorithm.leetcode;

public class RemoveElement {
    //ex 08: Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
    // The order of the elements may be changed.
    // Then return the number of elements in nums which are not equal to val.
    public int removeElement(int[] nums, int val){
        int k = 0;
        for(int i = 0; i < nums.length; i++){
            if (nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
    public static void main(String[]args){
        RemoveElement solution = new RemoveElement();
        int[] nums1 ={3,2,2,4};
        int k1 = solution.removeElement(nums1,3);
        System.out.println("remaining count: " + k1);

        int[] nums2 = {9,8,7,7,7};
        int k2 = solution.removeElement(nums2, 10);
        System.out.println("remaning count" + k2);
    }
}

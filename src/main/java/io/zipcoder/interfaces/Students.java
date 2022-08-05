package io.zipcoder.interfaces;


import java.util.Arrays;

public class Students extends People<Student> { //Singleton

    private static final Students instance = new Students();

    private Students(){ //must be private in order to not be accessible
    }

    public static Students getInstance() {
        return instance;
    }

    public static void main(String[] args) {
//        public int[] twoSum(int[] nums, int target) {

            int [] nums = new int[]{2,7,11,15};
            int target = 9;

            int temp1 = 0;
            int temp2 = 0;
            for (int i = 0; i < nums.length; i++) {

                for (int j = 0; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target)
                        temp1 = i;
                    temp2 = j;
                }

            }
            int[] indices = new int[2];
            indices[0] = temp1;
            indices[1] = temp2;

        System.out.println(Arrays.toString(indices));
    }
}

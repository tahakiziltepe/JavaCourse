


public class a010_Arrays {
    public static void main(String[] args) {
        
        // Define a variable that is an array.
            // You may create in this way if you want to give values.
        int nums[] = {3,7,2,4};
            // You may create in this way if you do not want to give values but size of array. 
        int nums1[] = new int[5]; // This array has 5 values and all of them is 0.

        // Read - Get a value based on its index.
        System.out.println(nums[0]);

        // Read - Get all values.
        for(int i = 0; i < nums.length; i++)
        {
            System.out.println(nums[i]);
        }

        // Update - Change value based on its index.
        nums1[0] = 5;
        System.out.println(nums1[0]);



    }
}

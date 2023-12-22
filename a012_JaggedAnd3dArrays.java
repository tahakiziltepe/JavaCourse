public class a012_JaggedAnd3dArrays {
    public static void main(String[] args) {
        
        // We may define how many arrays are involved but we do not have to define how many elements are involved in these arrays.
        int nums[][] = new int[3][];  // Jagged Array

        // We may manage it in this way:
        nums[0] = new int[3];
        nums[1] = new int[4];
        nums[2] = new int[2];

        for(int i = 0; i < nums.length; i++)
        {
            for(int j = 0; j < nums[i].length; j++)
            {
                nums[i][j] = (int)(Math.random() * 100);
            }
        }

        for(int n[] : nums)
        {
            for(int m : n)
            {   
                System.out.print(m + " ");
            }
            System.out.println();
        }

        System.out.println("-----");

        int nums1[][][] = new int[3][4][2]; // 3D Array

        for(int n[][] : nums1)
        {
            for(int m[]: n)
            {   
                for(int k : m)
                {
                    k = (int)(Math.random() * 100);
                    System.out.print(k + " ");
                }
                System.out.println();
            }
            System.out.println();
        }





    }
}

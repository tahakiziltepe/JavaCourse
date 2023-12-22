

public class a011_MultiDimensionalArrays {
    public static void main(String[] args) {
        
        // We may define arrays of array.
        int nums[][] = new int[3][4]; // It represents there will be 3 arrays and every single array will have 4 elements.

        // Read - Get 
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 4; j++)
            {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("-----");

        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 4; j++)
            {
                int random = (int)(Math.random() * 100); // Random method creates double values. Therefore we multiplied by 100 and converted it to int.
                nums[i][j] = random;                     // We could have written random formula here without defining a variable, also.
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("-----");

        // There is another way to print arrays. 
        for(int n[] : nums) // We define an array variable and it returns arrays respectively.
        {
            for(int m: n) // We define an primitive variable and it returns elements of array.
            {
                System.out.print(m + " ");
            }
            System.out.println();
        }

    }
}

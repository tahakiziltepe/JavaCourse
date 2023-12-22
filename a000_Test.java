public class a000_Test {
    public static void main(String[] args) {
        int[] A = {1,3,2,4};
        int[] B = {3,1,2,4};
        int l = A.length;
        int[] C = new int[l];
        C[0] = 0;
        int common = 0;
        for(int i = 1; i < l; i++)
        {
            for(int j = i; j >= 0; j--)
            {
                while(i >= 0)
                {
                    if(A[i] == B[j] && A[j] == B[i])
                    {
                        common++;
                        break;
                    }
                    else if(A[i] == B[j])
                    {
                        common++;
                    }
                    else if(A[j] == B[i])
                    {
                        common++;
                    }
                    i--;
                }
            }
            C[i] = common;
        } 

        for(int i : C) System.out.println(i);
    }
}

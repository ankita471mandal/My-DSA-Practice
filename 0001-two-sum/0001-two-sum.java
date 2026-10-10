import java.util.*;
public class Solution{
    public static int[] twoSum(int nums[],int target){
            int n=nums.length;
            int[][] arr = new int[n][2];
            for (int k = 0; k < n; k++) {
            arr[k][0] = nums[k];   
            arr[k][1] = k;      
        }

            Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

            int i=0;int j=nums.length-1;
            while(i<j){
            int sum = arr[i][0] + arr[j][0];    
            if(sum==target){
                return new int[]{arr[i][1], arr[j][1]};
            }
            if(sum<target){
                i++;
            }
            if(sum>target){
                j--;
            }
        }
        return new int []{-1,-1};
    }
}
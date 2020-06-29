import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] arr = new Solution().exchange(new int[]{1,3,2,4});
        System.out.println(Arrays.toString(arr));
    }
    public int[] exchange(int[] nums) {
        //point1指向偶数,2指向奇数
        int point1 = nums.length-1;
        int point2 = 0 ;
        while (point1 >= point2){
            while ((nums[point1]&1) != 1 ) {
                if (point1 == 0) break;
                point1--;
            }
            System.out.println(point1);
            while ((nums[point2]&1) != 0 ) {
                if (point2 == nums.length-1) break;;
                point2++;
            }
            if (point1 > point2)
            swap(nums,point1,point2);
        }
        return nums;
    }
    void swap (int[] arr ,int a,int b){
        int val = arr[a];
        arr[a] = arr[b];
        arr[b] = val;
    }
}
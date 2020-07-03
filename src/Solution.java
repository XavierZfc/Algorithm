import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] arr = new Solution().constructArr(new int[]{1,2,3,4,5,});
        System.out.println(Arrays.toString(arr));
    }
    public int[] constructArr(int[] a) {
        if (a==null || a.length==0) return null;
        int len = a.length;
        int[] forward = new int[len];
        int[] reverse = new int[len];

        forward[0] = a[0];
        reverse[len-1] = a[len-1];
        reverse[0] = a[len-1];

        for(int q=1;q<len;q++){
            forward[q] = forward[q-1] * a[q];
        }
        for(int q=len-2;q>=0;q--){
            reverse[q] = reverse[q+1] * a[q];
            System.out.println(reverse[q+1] +" aa " + a[q]);
        }

        int[] arr = new int[len];

        System.out.println("forward "+Arrays.toString(forward));
        System.out.println("reverse  "+Arrays.toString(reverse));
        arr[0] = reverse[1];
        arr[len-1] = forward[len-2];
        for(int q=1;q<len-1;q++ ){
            arr[q] = forward[q-1] * reverse[q+1];
        }

        return arr;
    }
}
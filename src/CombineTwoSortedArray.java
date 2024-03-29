import java.util.Arrays;

/**
 * 合并两个有序数组到一个新的数组
 */
public class CombineTwoSortedArray {
    public static void main(String[] args) {
        int[] a = { 1, 3, 25 };
        int[] b = { 2, 3, 4, 7,8,11,16 };
        merger(a, b);
    }

    public static void merger(int[] a, int[] b) {
        int l = a.length + b.length;
        int[] temp = new int[l];
        int i = 0, j = 0, h = 0;
// 这里必须用while，不能用if
        while (i < a.length || j < b.length) {
            if (i == a.length && j < b.length) {
                temp[h++] = b[j++];
            } else if (i < a.length && j == b.length) {
                temp[h++] = a[i++];
            } else if (a[i] <= b[j]) {
                temp[h++] = a[i++];
            } else if (a[i] > b[j]) {
                temp[h++] = b[j++];
            }
        }
        for (int m : temp) {
            System.out.print(m + " ");
        }
    }




    public static void merge1(int[] a,int[] b){
        int[] c = new int [a.length+b.length];
        int i = 0,j = 0, k = 0;
        while(i < a.length || j < b.length){
            if(i<a.length && j == b.length){
                c[k++] = a [i++];
            }else if(i == a.length && j < b.length){
                c [k++] = b [j++];
            }else if(a[i]<=b[j]){
            c[k++]=a[i++];
            }else {
            c[k++]=b[j++];
            }
        }
        Arrays.stream(c).forEach(System.out::println);
    }
}
//Arrays.sort(sortedArray);


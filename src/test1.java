
import com.sun.javafx.collections.MappingChange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.*;

public class test1 {
    CountDownLatch count =new CountDownLatch(4);

    public static void main(String[] args) {

//        Date d = new Date();
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        //Integer currentDate = Integer.valueOf(sdf.format(d));
//        System.out.print(sdf.format(d));

        Integer s1 =16,s2 = 2<<3, t1 = 1024 , t2 = Integer.parseInt("1024");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(t1 == t2);
        System.out.println(s1.equals(s2));
        System.out.println(t1.intValue() == t2.intValue());

//        String s = "qwerrewqqwerrewq";
//        char[] s2 = s.toCharArray();
//        Map<Character,Integer> map1 = sortArrayToMap(s2);
//        findMaxKey(map1);
//
//
// ThreadDemo demo = new ThreadDemo();
//        FutureTask<Integer> result = new FutureTask<Integer>(demo);
//        new Thread(result).start();
//
//        try{
//            Integer sum = result.get();
//            System.out.println(sum);
//            System.out.println("------------------------------------");
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }catch (ExecutionException e){
//            e.printStackTrace();
//        }
        int[] a={1,2,3,4,5,6,7,8,8,9};
        System.out.println(getNumberIndex(a,9));
    }

//字符数组去重
    public static Map<Character,Integer> sortArrayToMap(char[] charArray) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        if (charArray.length != 0) {
            for (int i = 0; i < charArray.length; i++) {
                if (map.get(charArray[i]) != null) {
                    map.put(charArray[i], map.get(charArray[i]) + 1);
                } else {
                    map.put(charArray[i], new Integer(1));
                }
            }
        }
        return map;
    }

//寻找最大值
    public static char findMaxKey(Map<Character,Integer> map){
        Iterator itera = map.entrySet().iterator();
        Map.Entry entry = (Map.Entry)itera.next();
        Character maxKey = (Character)entry.getKey();
        Integer maxValue = (Integer) entry.getValue();
        while(itera.hasNext()){
            Map.Entry entry1 = (Map.Entry)itera.next();
            Character c1 = (Character)entry1.getKey();
            Integer Value = (Integer)entry1.getValue();
            if(maxValue<Value){
                maxValue = Value;
                maxKey = c1;
            }
        }
        System.out.println("the word which is "+maxKey+",time is "+maxValue);
        return maxKey;
    }


    //错误的二分查找法
public static int getNumberIndex(int[] arrays,int num){
        int start = 0;
        int end = arrays.length-1;
        for(int i=0;i<arrays.length/2;i++){
            int div = (start+end)/2;
            if(num>arrays[div])
                start = div;
            else if(num<arrays[div])
                end = div;
            else
                return div;


        }
        return -1;
}


//递归求二叉树的深度
public int dfs(TreeNode root){
        if(root == null)
            return 0;
        int leftDepth = dfs(root.TREE_LEFT)+1;
        int rightDepth = dfs(root.TREE_RIGHT)+1;
        return leftDepth>rightDepth?leftDepth:rightDepth;
}

    //二分查找法
    private int getIndex(int[] a,int b){
        int start = 0;
        int end = a.length-1;
        while(start < end){
            int mid = (start+end)/2;
            if(a[mid] == b){
                return mid;
            }else if(a[mid]<b){
                start = mid+1;
            }else {
                end = mid -1;
            }
        }
        return -1;
    }

}
class ThreadDemo implements Callable<Integer>{
    public Integer call(){
        int sum =0;
        for(int i=0;i<1000;i++){
            sum+=i;
        }
        return sum;
    }


}



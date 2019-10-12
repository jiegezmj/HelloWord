import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) {
//        Integer a =new Integer(5);
//        Integer b =new Integer(6);
//        System.out.println(a>b);
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        //Integer currentDate = Integer.valueOf(sdf.format(d));
        System.out.print(sdf.format(d));
    }

//    private void caculateWords(String words){
//        Map<Character,Integer> caculateMap = new HashMap();
//        char[] wordsArray = words.toCharArray();
//
//        for(int i=0;i<wordsArray.length;i++){
//            if(caculateMap.containsKey(wordsArray[i])){
//                caculateMap.put(wordsArray[i],caculateMap.get(wordsArray[i])+1);
//            }else{
//             caculateMap.put(wordsArray[i],1);
//            }
//        }
//        List s= new ArrayList<Map.Entry<Character,Integer>>();
//        Set<Map.Entry<Character,Integer>> set = caculateMap.entrySet();
//        for(Map.Entry<Character,Integer> entry:set){
//            if(s!=null){
//                s.get(0);
//            }
//            int bigBrother = entry.getValue();
//            if(){
//                s.add(entry);
//            }
//        }
//
//    }
//}
//
}

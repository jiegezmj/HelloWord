import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import	java.util.stream.Collectors;
public class StreamOperator {
    public static void main(String[] args){
        List<Student> list = new ArrayList<Student>();
        list.add(new Student(12,"王十二","陕西"));
        list.add(new Student(6,"王6","成都"));
        list.add(new Student(18,"王十8","西安"));
        list.add(new Student(1,"王1","西安"));
        list.add(new Student(1,"王1","西安"));
        list.add(new Student(1,"王1","西安"));

        //默认的排序是倒序
        list.stream().sorted().forEach(System.out::println);
        //按照参数的顺序去比较是升序
        list.stream().sorted((stu1,stu2) -> Integer.compare(stu1.getAge(),stu2.getAge()))
              .forEach(System.out::println);
        list.stream().sorted( Comparator.comparingInt(Student::getAge)).forEach(System.out::println);

        //去重
        list.stream().distinct().forEach(System.out::println);

        //filter 过滤功能
        List<Student> listOne = filterByAdress(list);
        listOne.forEach(System.out::println);

        testMap(list);

        //限制返回的元素个数
        list.stream().limit(2).forEach(System.out:: println);

        //skip(2)删除元素
        list.stream().limit(3).skip(2).forEach(System.out:: println);

        //寻找最大元素，最小元素.
        Student min = list.stream().min( Comparator.comparingInt(Student::getAge)).get();
        System.out.println(min);
        Student max = list.stream().max( Comparator.comparingInt(Student::getAge)).get();
        System.out.println(max);

        //聚合
        testReduce();

        //匹配match()
        boolean anyMatch = list.stream().anyMatch(s -> "王6".equals(s.getName()));
        System.out.println(anyMatch);
        boolean allMatch = list.stream().allMatch(s -> "王6".equals(s.getName()));
        System.out.println(allMatch);
        boolean noneMatch = list.stream().noneMatch(s -> "王6".equals(s.getName()));
        System.out.println(noneMatch);
    }

    //filter 过滤功能
    public static List<Student> filterByAdress(List<Student> list){
        return list.stream().filter(s ->"西安".equals(s.getAddress())).collect(Collectors.toList());
    }

    //map将对应的元素按照给定的方法转换
    public static void testMap(List<Student> list){
        List<String> address = list.stream().map(s -> "住址"+s.getAddress()).collect(Collectors.toList());
        address.forEach(a -> System.out.println(a));
    }

    //distinct去重
    public static void testDistinct(){
        List<String> list = Arrays.asList("123","345","567","123");
        list.stream().distinct().forEach(System.out:: println);
    }

    //reduce()聚合集合中元素为一条数据
    public static void testReduce(){
        List<String> list = Arrays.asList(" welcome"," to"," bei"," jing");
        String reduceOne = list.stream().reduce("hello!",(a,b) -> a+b);
        System.out.println(reduceOne);
    }

}

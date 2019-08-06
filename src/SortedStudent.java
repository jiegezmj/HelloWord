import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedStudent {
    public static void main(String[] args){
        List<Student> list = new ArrayList<Student>();
        list.add(new Student(12,"王十二"));
        list.add(new Student(6,"王6"));
        list.add(new Student(18,"王十8"));
        list.add(new Student(1,"王1"));
        Collections.sort(list);
        for(Student s:list){
            System.out.println(s.getAge());
        }
    }

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

class Student implements Comparable<Student>{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;

    public Student(){ }
    public Student(int age,String name){
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student o) {
        if(o.age>this.age)
            return 1;
        else if(o.age==this.age)
            return 0;
        else
            return -1;
    }
}

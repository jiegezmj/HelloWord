import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class SortedStudent {
    public static void main(String[] args){
        List<Student> list = new ArrayList<Student>();
        list.add(new Student(12,"王十二","陕西"));
        list.add(new Student(6,"王6","成都"));
        list.add(new Student(18,"王十8","西安"));
        list.add(new Student(1,"王1","西安"));

        //jdk8之前的写法
        Collections.sort(list);
        for(Student s:list){
            System.out.println(s.getAge());
        }

        //jdk8的写法
        list.stream().forEach(System.out::println);

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

class Student implements Comparable<Student>{

    private String name;
    private int age;
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

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


    public Student(){ }
    public Student(int age,String name,String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
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

    @Override
    public boolean equals(Object o){
        if(this == o)
            return true;
        if(o==null||o.getClass()!=getClass())
            return false;
        Student other = (Student)o;
        //return (other.age == this.age&&other.name == this.name?true:false);
        return age==other.age&& Objects.equals(name,other.name)&&Objects.equals(address,other.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age,name);
    }
}

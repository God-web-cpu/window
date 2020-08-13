/**
 * @program: 20200813
 * @description
 * @author: sun
 * @create: 2020-08-12 18:05
 **/

class Person{
    private String name;
    private  int age;

    public Person(){
        System.out.println("Person<init>");
    }
    /*public  Person(String name,int age){
        this.name = name;
        this.age = age;
        System.out.println("Person<String,int>");
    }*/

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person<String,int>");
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


public class TestDemo2{
    public static void main(String[] args) {
        Person person = new Person();
        Person person1 = new Person ("bit",20);

    }
}
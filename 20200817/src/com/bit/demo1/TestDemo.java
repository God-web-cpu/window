package com.bit.demo1;

import java.util.concurrent.Callable;

/**
 * @program: 20200817
 * @description
 * @author: sun
 * @create: 2020-08-20 14:02
 **/
/*class Animal{
    public String name;
    public Animal(String name){
        this.name =name;
        System.out.println("Animal(String)");
    }
    public void eat(){
        System.out.println(this.name + "Animal::eat()");
    }
    public void sleep(){
        System.out.println("Animal::sleep()");
    }
}
class Bird extends Animal{
    public Bird(String name){
        super(name);
    }
    *//*public void eat(){
        System.out.println("Bird::eat()");
    }*//*

    public void fly(){
        System.out.println(this.name + "Bird::fly()");
    }
}
class Cat extends Animal{
    public Cat (String name){
        super(name);
        System.out.println("Cat(String)");
    }
   *//* public String name;
    public void eat(){
        System.out.println(this.name + "Cat::eat()");
    }*//*
}*/



class Animal {
    public String name;

    public Animal(String name) {
        this.name = name;
        System.out.println("Animal(String)");
    }

    public void eat() {
        System.out.println(this.name + "Animal::eat()");
    }
}
class Cat extends Animal {
    public Cat(String name) {
        super(name);
        System.out.println("Cat(String)");
    }
}
class Bird extends Animal{
    public Bird(String name){
        super(name);
    }
    public void fly(){
        System.out.println(this.name + "Bird::fly()");
    }
}



public class TestDemo {

    public static void main(String[] args) {
        Animal animal = new Bird("八哥");
        animal.eat();
        //向下转型--> 父类的引用 赋值给了子类
        Bird bird = (Bird)animal;
        bird.fly();
    }



    //向上转型

    public static Animal func() {
        return new Cat("mimi");
    }
    public static void main4(String[] args) {
        Animal animal = func();
        animal.eat();
    }


    public static void func(Animal animal){
        animal.eat();
    }
    public static void main3(String[] args) {
        Cat cat = new Cat("咪咪");
        func(cat);

    }
    public static void main2(String[] args) {
        //向上转型---》父类引用 引用子类对象
        Animal animal = new Cat("mimi");
        animal.eat();
    }





    public static void main1(String[] args) {
        Cat cat = new Cat("mimi");
        //cat.name = "mimi";
        cat.eat();
        Bird bird = new Bird("八哥");
        bird.fly();
        bird.eat();
    }
}




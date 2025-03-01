package Learn_Java.src.Java_practice;

/*
* Method overloading means having two or more methods (or functions)
* in a class with the same name and different parameters
* */

public class Method_overloading {
    public static void main(String[] args) {
    fun(45);
    fun("Rahul");
    }

    static void fun(int a)
    {
        System.out.println(a);
    }

    static void fun(String name)
    {
        System.out.println(name);
    }
}

package oop.Demo01;
//值传递
public class Demo02 {
    public static void main(String[] args) {
        int a=1;
        System.out.println(a);
        change(a);
        System.out.println(a);
    }
    public static void change(int a){
        a=10;
    }
}

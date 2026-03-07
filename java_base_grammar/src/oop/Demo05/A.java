package oop.Demo05;
//重写都是方法的重写，和属性无关
//继承
public class A extends B{
    public static void test(){
        System.out.println("A->Method TEST()");
    }

    //ctrl+o方法重写，override重写
    @Override//有功能的注释
    public void test1() {
        //super.test1();
        System.out.println("A->Method test1()");
    }
}

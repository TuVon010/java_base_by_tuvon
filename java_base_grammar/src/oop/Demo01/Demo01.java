package oop.Demo01;

import java.io.IOException;

public class Demo01 {
    public static void main(String[] args) {


    }
    /*
    修饰符 返回值类型  方法名 (...){
        //方法体
        return 返回值
    }
    */
    public String sayHello(){
        return "hello";
    }
    public void Hello(){
        return ;//可以不写也可以返回空
    }
    public int max(int a,int b){
        return a>b?a:b;
        // return 代表方法的结束
        //break用来跳出switch或者循环
    }
    //异常
    public void readFile(String file)throws IOException{

    }
}

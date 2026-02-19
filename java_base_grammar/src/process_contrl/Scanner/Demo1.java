package process_contrl.Scanner;
//导入相关包

import java.util.Scanner;


public class Demo1 {
    public static void main(String[] args) {
        //创建一个扫描对象,用于接收键盘数据
        Scanner a = new Scanner(System.in);//自动补全alt+enter,先写后面new的，然后自动补全定义变量
        System.out.println("使用next方式接收：");
        //判断用户有没有输入字符串
        if(a.hasNext()){
            //使用next方式接收
            String str=a.next();
            System.out.println("输出内容为："+str);
        }
        a.close();//用完关闭，凡是属于IO流的如果不关闭就会一直占用资源，要养成好习惯用完就关掉

    }
}

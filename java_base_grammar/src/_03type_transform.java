public class _03type_transform {
    public static void main(String[] args) {
        int i =128;
        byte b =(byte)i;//强制转换
        System.out.println(i);//128
        System.out.println(b);//-128,内存溢出
        //自动转换  低到高
        double c = i;
        System.out.println(i);//128
        System.out.println(c);//128.0
        /*注意：
        1.不能对布尔值进行转换
        2.不能把对象类型转换为不相干的类型
        3.大容量转为低容量，强制转换
        4.转换的时候可能存在内存异常溢出，或者精度问题

         */
        System.out.println("============================");
        System.out.println((int)23.8);//23
        System.out.println((int)-45.89);//-45
        System.out.println("============================");
        char c1 ='a';
        int d=c1+1;
        System.out.println(d);//98
        System.out.println((char)d);//b
    }
}

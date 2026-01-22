public class _03type_transform_extend {
    public static void main(String[] args) {
        //操作比较大的数的时候注意溢出问题
        //jdk7新特性，数字之间可以用下划线分割
        //int money = 1000000000;
        int money = 10_0000_0000;
        System.out.println(money);//1000000000
        int years =20;
        int total =money*years;//-1474836480
        System.out.println(total);
        long total2 =money*years;//先计算结果再转换
        System.out.println(total2);//-1474836480
        long total3 =(long)money*years;//计算时式子按照里面最高优先级的类型来转换再进行计算
        System.out.println(total3);//20000000000
        long total4 =money*(long)years;//
        System.out.println(total3);//20000000000


    }
}

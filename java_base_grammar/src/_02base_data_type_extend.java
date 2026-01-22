public class _02base_data_type_extend {
    public static void main(String[] args) {
        //整数拓展：进制  二进制0b    十进制         八进制0        十六进制0x
        int i = 10;
        int i0=0b100;//二进制
        int i1 = 010;//八进制
        int i2 = 0x10;//十六进制
        System.out.println(i);
        System.out.println(i0);
        System.out.println(i1);
        System.out.println(i2);
        System.out.println("======================================");
        //============================================================================
        //浮点数拓展
        //============================================================================
        //浮点数，银行业务怎么表示钱
        //用BigDecimal 数学工具类进行比较
        //float  浮点数表现是优先的 离散，  有舍入误差  大约， 接近但不等于，详细了解可以去看计组
        //double
        //最好避免使用浮点数进行比较
        //最好避免使用浮点数进行比较
        //最好避免使用浮点数进行比较

        float f =0.1f;//0.1
        double d=1.0/10;//0.1
        System.out.println(f==d);//false
        System.out.println(f);
        System.out.println(d);
        float d1 = 234567812345556f;
        float d2= d1+1;
        System.out.println(d1==d2);//true

        //============================================================================
        //字符拓展
        //============================================================================
        char c1 ='a';
        char c2 ='中';
        System.out.println(c1);
        System.out.println((int)c1);//强制转换
        System.out.println(c2);
        System.out.println((int)c2);//强制转换
        //所有的字符本质还是数字
        //编码 Unicode 表：97=a，65=A,大小写中间差32
        //U0000~UFFFF
        char c3='\u0061';// "\ u"是转义，16进制
        System.out.println(c3);//输出a
        System.out.println("======================================");
        //转义字符
        // \t 制表符
        // \n  换行
        // ........
        System.out.println("hello\nworld\t你好，世界");
        //字符串
        System.out.println("======================================");
        String sa = new String("hello world");
        String sb = new String("hello world");
        System.out.println(sa==sb);//false
        System.out.println("======================================");
        System.out.println("======================================");
        String sc = "hello world";
        String sd = "hello world";
        System.out.println(sc==sd);//True,没new放在常量池了
        //比较的对象是基本数据类型则比较数值；如果比较的是引用数据类型则比较的是对象的地址值是否一致
        System.out.println("======================================");

        //布尔值拓展
        boolean flag = true;
        //if(flag)与if(flag==true)等价

    }
}

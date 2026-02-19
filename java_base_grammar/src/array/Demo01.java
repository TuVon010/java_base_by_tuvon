package array;

public class Demo01 {
    //变量的类型  变量名  = 变量的值
    //数组类型
    public static void main(String[] args) {
        int[] nums;//定义
        nums =new int[10];//这里可以存放十个int类型的数字，创建一个数组
        //int []nums =new int[10];也可以
        //给数组中的元素赋值
        nums[0]=1;
        nums[1]=1;
        nums[2]=1;
        nums[3]=1;
        nums[4]=1;
        nums[5]=1;
        nums[6]=1;
        nums[7]=1;
        for(int i=0;i<nums.length;i++){
            // 使用println每次输出会自动（换行，不黏连）

            System.out.println(nums[i]);
        }

    }}
/*输出：
1
1
1
1
1
1
1
1
0
0
*/

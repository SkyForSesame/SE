import java.util.Random;
import java.util.Scanner;

public class RandomDemo {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        //随机产生Int整数范围内的随机数
//        System.out.println(rd.nextInt());
        //随机产生0-100之间的随机数 [0,index)
//        System.out.println(rd.nextInt(101));
        //随机产生n-m之间的随机数（m>n && m,n都为整数） 要求：-100 - 300
//        System.out.println(rd.nextInt(300-(-100))-100);
        /**
         * 结合之前的知识点
         *  猜下辈子性别
         *      请输入您的姓名
         *      随机输出您下辈子性别为男-1或女-0或妖-2 【随机产生0-3之间的随机数】
         */
        System.out.println("请输入您的姓名");
        String name = sc.next();
        //随机产生下辈子性别0-女，1-男，2-妖
        int sex = rd.nextInt(3);
        //对性别进行判断
        switch (sex){
            case 0:
                System.out.println(name+"，下辈子性别为男");
                break;
            case 1:
                System.out.println(name+"，下辈子性别为女");
                break;
            default:
                System.out.println(name+"，下辈子性别为妖");
        }

    }
}

public class OperatorDemo {
    public static void main(String[] args) {
        //数学运算符
//        int a = 14;
//        System.out.println(1+2);
//        String content = "hello world";
//        System.out.println(content+4);
//        System.out.println(1+1+"1"+1);
//        System.out.println("1"+1+2+3);
//        int a = 1,b=2;
//        System.out.println(++a-(b--));
//        System.out.println("a = "+a);
//        System.out.println("b = "+b);
//        a += 5; //等同于 a = a+5;
//        b -= 4; //等同于 b = b-4;
//        System.out.println(a);
//        System.out.println(b);
        //逻辑运算符
//        boolean flag = 1!=2;
//        System.out.println(!flag);
        //数据交换（常用）
        int a = 126,b=126;
        //交换前
        System.out.println("交换前....");
        System.out.println("a = "+a);
        System.out.println("b = "+b);

        //方法2
        a = a+b; // a=9,b=5
        b = a-b;// b=4,a=9
        a = a-b;// a=5,b=4
        //交换后
        System.out.println("交换后....");
        System.out.println("a = "+a);
        System.out.println("b = "+b);

        //方法1
//        int c;
//        //交换前
//        System.out.println("交换前....");
//        System.out.println("a = "+a);
//        System.out.println("b = "+b);
//        //交换过程
//        c = a;
//        a = b;
//        b = c;
//        //交换后
//        System.out.println("交换后....");
//        System.out.println("a = "+a);
//        System.out.println("b = "+b);


    }
}

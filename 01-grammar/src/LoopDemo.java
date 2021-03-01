import java.util.Scanner;

public class LoopDemo {
    public static void main(String[] args) {
        //循环结果： 打印10次，我想喝可乐 （有限次数循环：条件为循环次数）
//        int i = 1;
//        //do...while （了解）
////        do{
////            //重复代码 - 循环体（不会循环体内部进行定义循环次数）
////            System.out.println("第"+i+"次，我想喝可乐");
////            //将循环次数累计+1
////            i++;
////        }while(false);
//        //while(掌握)
//        while(true){
//            System.out.println("第"+i+"次，我想喝可乐");
//            i++;
//        }
        //修改为for
//        for(int i=1;i<11;i++){
//            System.out.println("第"+i+"次，我想喝可乐");
//        }
//        System.out.println(i);
//        int i = 1;
//        for(;i<11;){
//            System.out.println("第"+i+"次，我想喝可乐");
//            i++;
//        }
        //while使用场景
        Scanner sc = new Scanner(System.in);
        //记录循环次数
        int number = 1;
        while (true){
            if(number%4==0){
                //手动给number递增
                number++;
                //结束当次循环
                continue;
            }
            //4的倍数不出现
            System.out.println("这是第"+number+"次回答");
            //提示：你喜不喜欢喝可乐
            System.out.println("你喜不喜欢喝可乐");
            //字符串类型接收
            String answer = sc.next();

            //判断字符串的内容数据
            if(answer.equals("喜欢")){
                //退出循环 - 联想switch语法关键字break
               break;
            }else{
                System.out.println("给你次，重新组织语言的机会");
                number++;
            }
        }
        System.out.println("退出循环");



    }
}

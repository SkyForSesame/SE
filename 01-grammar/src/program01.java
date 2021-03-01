import java.util.Random;
import java.util.Scanner;

/**
 *  猜拳游戏（语法部分的综合练习） - 生死局
 *   结果论：
 *  1. 提示玩家输入姓名  （Scanner扫描器）
 *  2. 提示玩家输入出拳（0-石头，1-剪刀，2-布） - 条件分支
 *  3. 电脑随机产生结果  （Random）
 *  4. 比较玩家出拳以及电脑产生结果，判断游戏输赢  - 分支结构
 *
 */
public class program01 {
    public static void main(String[] args) {
        //1.需要的工具-Scanner,Random
        Scanner scanner = new Scanner(System.in);
        Random rd = new Random();
        //2.提示用户输入昵称
        System.out.println("请输入玩家昵称：");
        //3.使用String类型变量接收玩家昵称，并保存
        String name = scanner.next();
        //4.提示玩家输入结果（0-石头，1-剪刀，2-布）
        System.out.print("请输入操作（0-石头，1-剪刀，2-布）:");
        //5.使用Int类型接收玩家输入的操作
        int player = scanner.nextInt();
        //6.判断玩家输入的内容
        switch (player){
            case 0:
                System.out.println("玩家\""+name+"\"：石头");
                break;
            case 1:
                System.out.println("玩家\""+name+"\"：剪刀");
                break;
            case 2:
                System.out.println("玩家\""+name+"\"：布");
                break;
            default:
                System.out.println("玩家输入操作有误");
        }
        //7.随机产生电脑的出拳方式 - 0,1,2(随机结果)
        int computer = rd.nextInt(3);
        switch (computer){
            case 0:
                System.out.println("电脑：石头");
                break;
            case 1:
                System.out.println("电脑：剪刀");
                break;
            case 2:
                System.out.println("电脑：布");
                break;
            default:
                System.out.println("玩家输入操作有误");
        }
        //8.比较电脑与玩家的出拳，并完成胜负判断（赢，输，平局）
        if((player==0&&computer==1) || (player==1&&computer==2) || (player==2&&computer==0)){
            //玩家赢
            System.out.println("恭喜\""+name+"\"获得胜利");
        }else if(player==computer){
            //平局
            System.out.println("平局！");
        }else{
            //玩家输
            System.out.println("再接再厉，\""+name+"\"请重新来过");
        }

    }
}

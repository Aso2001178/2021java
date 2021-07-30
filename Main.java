import java.util.*;

public class Main{
    public static void main(String[] args){
        System.out.println("戦艦ゲーム");

        Shipgame ship1 = new Shipgame();
        Shipgame ship2 = new Shipgame();
        Shipgame ship3 = new Shipgame();

        Scanner sc = new Scanner(System.in);
        int turn = 1;
        int i = 1;
        while(Shipgame.finish()!=true){
            System.out.println("-------[ターン"+turn+"]-------");
            if(ship1.shipdie() == false){
                System.out.println("船1：生きてる");
            }else{
                System.out.println("船1：撃沈している");
            }
            if(ship2.shipdie() == false){
                System.out.println("船2：生きてる");
            }else{
                System.out.println("船2：撃沈している");
            }
            if(ship3.shipdie() == false){
                System.out.println("船3：生きてる");
            }else{
                System.out.println("船3：撃沈している");
            }
            if(ship1.shipdie() == true && ship2.shipdie() == true && ship3.shipdie() == true){
                System.out.println("全ての戦艦が沈んだ！ゲームクリア！");
                break;
            }
            System.out.println("爆弾のX座標を(1-5)で入力してください");
            int x = sc.nextInt();
            System.out.println("爆弾のY座標を(1-5)で入力してください");
            int y = sc.nextInt();
            ship1.shipHp(x,y,i++);
            ship2.shipHp(x,y,i++);
            ship3.shipHp(x,y,i++);
            turn += 1;
            i = 1;
        }
        sc.close();
    }
}
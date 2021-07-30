import java.util.*;

public class Shipgame {
    Random random = new Random(); 
    public int hp = 3;
    public int x = move();
    public int y = move();
    public static int shipsu = 3;

    

    public static boolean finish(){
        if(shipsu>0){
            return false;
        }else{
            return true;
        }
    }

    public int move(){
        int min = 1;
        int max = 5;
        return random.nextInt(min + max)+ min;
    }

    public boolean shipdie(){
        if(this.hp > 0){
            return false;
        }else{
            return true;
        }
    }

    public void shipHp(int x,int y,int i){
        if(this.x == x && this.y == y){
            if(this.hp>1){
                System.out.print("船"+ i +"：");
                System.out.println("爆弾が当たった！しかしまだ沈まない。船が移動します。");
                this.hp--;
                this.x = move();
                this.y = move();
            }else if(this.hp == 1){
                System.out.print("船"+ i +"：");
                System.out.println("やっと沈んだ！");
                this.hp--;
            }else if(this.hp == 0){
                System.out.print("船"+ i +"：");
                System.out.println("撃沈している");
                shipsu--;
            }
        }else if(this.x+1 == x+1 || this.x-1 == x-1){
            if(this.hp == 0){
                System.out.print("船"+ i +"：");
                System.out.println("撃沈している");
            }else{
                System.out.print("船"+ i +"：");
                System.out.println("波高し！");
            }
        }else if(this.y+1 == y+1||this.y-1 == y-1){
            if(this.hp == 0){
                System.out.print("船"+ i +"：");
                System.out.println("撃沈している");
            }else{
                System.out.print("船"+ i +"：");
                System.out.println("波高し！");
            }
        }else{
            if(this.hp == 0){
                System.out.print("船"+ i +"：");
                System.out.println("撃沈している");
            }else{
                System.out.print("船"+ i +"：");
                System.out.println("はずれ！");
            }
        }
    }
}
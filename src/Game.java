import java.util.Scanner;

public  class Game {
    int life;
    int energy;
    int power;
    int speed;
    String name;
    String sound;
    int weapon;

  public Game(int life,int energy,int power,int speed,String name){
      this.life=life;
      this.energy=energy;
      this.power=power;
      this.speed=speed;
      this.name=name;
  }

    Scanner sc =new Scanner(System.in);

    public void shoot(int weapon) {
        System.out.println("Shoot?");
        System.out.println("1-Yes");
        System.out.println("2-No");
        int decision = sc.nextInt();
        if (decision == 1) {
            switch (weapon) {
                case 1:
                    sound = "BUM";
                    break;
                case 2:
                    sound = "TSHOU";
                    break;
                case 3:
                    sound = "SHSHSHSHSH";
                    break;
                case 4:
                    sound = "BUUUM";
                    break;
            }
            System.out.println(sound);
        }
        else {
            System.out.println("Let's go to the next place and shoot there");
        }
    }

    public int chooseWeapon(){
        System.out.println("Choose weapon");
        System.out.println("1-Gun");
        System.out.println("2-Crossbow");
        System.out.println("3-Rocket");
        System.out.println("4-Bomb");
        int weapon = sc.nextInt();
        System.out.println("Weapon chosen");
        return weapon;
    }

}

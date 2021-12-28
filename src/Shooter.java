
public class Shooter extends Game{
    public Shooter(int life,int energy,int power,int speed,String name){
        super(life,energy,power,speed,name);
    }

    public static void main(String[] args) {
        Shooter contra=new Shooter(100,100,100,100,"Joe");

        contra.weapon=contra.chooseWeapon();
        contra.shoot(contra.weapon);

    }
}

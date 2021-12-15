public class Object {
    String name;
    int hp;
    int armor;
    int speed;

    public Object(String name, int hp, int armor, int speed) {
        this.name = name;
        this.hp = hp;
        this.armor = armor;
        this.speed = speed;
    }

    public void heal(int heal){
        this.hp += heal;
    }

    public void ShowAddress(){ //直接打印对象，显示地址
        System.out.println("Address: " + this);
    }
    public static void main(String[] args) {
        Object ljy = new Object("LJY", 100, 200, 10);

        System.out.println(ljy.name + " " + ljy.hp + " " + ljy.armor + " " + ljy.speed);
        //ljy.ShowAddress();
        ljy.heal(100);
        System.out.println("After Healing: " + ljy.name + " " + ljy.hp + " " + ljy.armor + " " + ljy.speed);
    }
}

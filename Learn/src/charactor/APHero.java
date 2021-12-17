package charactor;

public class APHero extends Hero implements AP{

    public APHero(String heroName, float heroHp) {
        super(heroName, heroHp);
    }

    public void APattack() {
        System.out.println("APattack");
    }
}

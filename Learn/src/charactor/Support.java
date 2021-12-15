package charactor;

public class Support extends Hero{

	public Support(String heroName, float heroHp) {
		super(heroName, heroHp);
	}
	
	public void heal(float healHp, Hero hero) {
			hero.hp += healHp;
			System.out.println(this.name + "恢复了" + hero.name + healHp + "的HP, 现在是" + hero.hp);
			hero.ma = true;
			System.out.println(this.name + "复活了" + hero.name + "的马");
		}
}

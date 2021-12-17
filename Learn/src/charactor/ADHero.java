package charactor;

import java.util.Objects;

public class ADHero extends Hero{

	public ADHero(String heroName, float heroHp) {
		super(heroName, heroHp);
	}

	public void attack(Hero hero) {
		hero.hp -= this.weapon.atk;
		if(Objects.equals(this.weapon.name, "MotherKiller"))
			hero.ma = false;
		System.out.println(this.name + "使用" + this.weapon.name + "攻击了" + hero.name + this.weapon.atk + "的hp");
		System.out.println(hero.name + "还剩" + hero.hp + "的hp");
		if(hero.ma)
			System.out.println(hero.name + "马还在");
		else
			System.out.println(hero.name + "马没了");
	}
	
}

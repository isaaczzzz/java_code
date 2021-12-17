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
		System.out.println(this.name + "ʹ��" + this.weapon.name + "������" + hero.name + this.weapon.atk + "��hp");
		System.out.println(hero.name + "��ʣ" + hero.hp + "��hp");
		if(hero.ma)
			System.out.println(hero.name + "����");
		else
			System.out.println(hero.name + "��û��");
	}
	
}

package charactor;

import property.Weapon;

public class Hero {
	String name;
	float hp;
	float armor;
	int moveSpeed;
	Weapon weapon = new Weapon();
	boolean ma;
	
	{
		ma = true;
	}
	
	public Hero(String heroName, float heroHp) {
		name = heroName;
		hp = heroHp;
		//System.out.println("ππΩ®¡À" + this.name);
	}
	
	public void equip(String weaponName, float atk) {
		weapon.name = weaponName;
		weapon.atk = atk;
	}
}

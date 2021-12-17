package charactor;

import property.Weapon;

public class Hero {
	String name;
	float hp;
	float armor;
	int moveSpeed;
	Weapon weapon = new Weapon();
	boolean ma;

	private Hero(){
	}
	private static Hero instance;
	//Hero instance = new Hero();//饿汉式单例模式

	{
		ma = true;
	}
	
	public Hero(String heroName, float heroHp) {
		name = heroName;
		hp = heroHp;
		//System.out.println("构建了" + this.name);
	}
	
	public void equip(String weaponName, float atk) {
		weapon.name = weaponName;
		weapon.atk = atk;
	}

	public static Hero getInstance() {//懒汉式单例模式
		if(null == instance){
			Hero instance = new Hero();
		}
		return instance;
	}
}

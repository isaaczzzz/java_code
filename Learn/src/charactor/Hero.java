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
	//Hero instance = new Hero();//����ʽ����ģʽ

	{
		ma = true;
	}
	
	public Hero(String heroName, float heroHp) {
		name = heroName;
		hp = heroHp;
		//System.out.println("������" + this.name);
	}
	
	public void equip(String weaponName, float atk) {
		weapon.name = weaponName;
		weapon.atk = atk;
	}

	public static Hero getInstance() {//����ʽ����ģʽ
		if(null == instance){
			Hero instance = new Hero();
		}
		return instance;
	}
}

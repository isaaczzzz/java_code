package charactor;

public class Support extends Hero{

	public Support(String heroName, float heroHp) {
		super(heroName, heroHp);
	}
	
	public void heal(float healHp, Hero hero) {
			hero.hp += healHp;
			System.out.println(this.name + "�ָ���" + hero.name + healHp + "��HP, ������" + hero.hp);
			hero.ma = true;
			System.out.println(this.name + "������" + hero.name + "����");
		}
}

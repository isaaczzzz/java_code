import charactor.APHero;
import charactor.Hero;
import charactor.ADHero;
import charactor.Support;
public class Main {
	public static void main(String[] args) {
		ADHero ah = new ADHero("LKY", 100f);
		
		Support sp = new Support("HQJ", 50f);
		
		Hero h1 = new Hero("ZZY", 100000f);
		//Hero h2 = new Hero("B", 200f);
		ah.equip("MotherKiller", 114514f);
		
		ah.attack(h1);
		sp.heal(1919810f, h1);

		//Hero g1 = Hero.getInstance();
		//Hero g2 = Hero.getInstance();
		//System.out.println(g1 == g2);

		APHero ap = new APHero("QWE", 222f);
		ap.APattack();
	}
}

package step9_01.OOP_Theory;

/*
 * 
 *  # 상속
 * 
 *  - 클래스간의 부모자식관계를 설정해서 클래스를 광범위하게 사용가능하다.
 *  - 단일 상속만 가능하다. ( 다중상속 불가 )
 *    Ex) Class A extends B,C,D,E  (불가능)
 *  - 부모(상위,슈퍼,기반) 클래스 , 자식(하위,서브,파생) 클래스
 *  - 모든 클래스는 Object클래스를 상속받은 상태에서 시작한다.
 *  - [ 형식 ]
 * 
 *   	class 자식클래스 이름 extends 부모클래스이름 {
 *   
 *   	}
 * 
 * */

class Character {
	
	int level  = 1;
	int hp     = 1;
	int mana   = 1;
	int attack = 1;
	
	
	void levelUp() {
		this.level++;
		this.hp += 5;
		this.mana += 5;
		this.attack += 5;
		showStatus();
	}
	
	
	void showStatus() {
		System.out.println("level : " + this.level);
		System.out.println("hp : " + this.hp);
		System.out.println("mana : " + this.mana);
		System.out.println("attack : " + this.attack);
		System.out.println();
	}
	
}


class Wizard extends Character{
	
}

class Warrior extends Character{
	
}



public class OOPEx03 {

	public static void main(String[] args) {

		Character c1 = new Character();
		c1.showStatus();
		c1.levelUp();
		c1.levelUp();
		
		System.out.println("//////////////////////////////");
		Warrior war1 = new Warrior();
		war1.showStatus();
		war1.levelUp();
		war1.levelUp();
		
		System.out.println("//////////////////////////////");
		Wizard wiz1 = new Wizard();
		wiz1.showStatus();
		wiz1.levelUp();
		wiz1.levelUp();
		
	}

}

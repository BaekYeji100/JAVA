package step9_01.OOP_Theory;

class Parent {
	
	String name;
	boolean gender;
	
	Parent() {
		System.out.println("부모 클래스의 기본 생성자 실행");
	}
	
	Parent(String name , boolean gender) {
		this.name = name;
		this.gender = gender;
		System.out.println("부모 클래스의 추가된 생성자 실행");
	}
	
	@Override
	public String toString() {
		return this.name +"("+ (gender ? "여성":"남성")+")";
	}
	
}


class Child extends Parent {
	
	int age;
	String nickName;
	
	Child() {
		//super(); // 부모클래스의 기본생성자 실행
		super("제임스고슬링",false);
		System.out.println("자녀 클래스의 기본 생성자 실행");
	}
	
	Child(String name , boolean gender , int age , String nickName) {
		this.name = name;
		this.gender = gender;
		this.age    = age;
		this.nickName = nickName;
		System.out.println("자녀 클래스의 추가된 생성자 실행");
	}
	
	@Override
	public String toString() {
		return name +"("+ (gender ? "여성":"남성")+") - " + age +", " +nickName;
	}
	
	
	
}





public class OOPEx05 {

	public static void main(String[] args) {

		Parent p1 = new Parent();
		System.out.println(p1);
		
		Parent p2 = new Parent("데니스리치", false);
		System.out.println(p2);
		
		System.out.println("============================");
		
		// 자식클래스의 생성자가 실행되기 전에 부모클래스의 생성자가 먼저 실행된다.
		Child c1 = new Child();
		System.out.println(c1);
		
		Child c2 = new Child("앨런 튜링" , false , 43 , "튜링상");
		System.out.println(c2);
		
		
	}

}

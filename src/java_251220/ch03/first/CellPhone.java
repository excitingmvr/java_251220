package java_251220.ch03.first;

public class CellPhone {

	// parent class
	
	//필드
	String model;
	String color;
	
	//생성자
	CellPhone(){
	}
	
	CellPhone(String model, String color){
		this.model = model;
		this.color = color;
	}
	
	//메소드
	void powerOn() { 
		System.out.println("전원을 켭니다."); 
	}	
	void powerOff() { System.out.println("전원을 끕니다."); }
	void bell() { System.out.println("벨이 울립니다."); }	
	void sendVoice(String message) { System.out.println("자기: " + message); }	
	void receiveVoice(String message) { System.out.println("상대방: " + message); }	
	void hangUp() { System.out.println("전화를 끊습니다."); }
	void powerOn(int a) {System.out.println("전원을 켭니다.2");}
	
}

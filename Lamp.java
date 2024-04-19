class lamp{
	boolean isOn;
	void turnOn(){
		isOn=true;
		System.out.println("ligth on?"+isOn);
	}
	void turnOff(){
		isOn=false;
		System.out.println("light is off?"+isOn);
	}
}
class Lamp{
	public static void main(String[] args){
		lamp led=new lamp();
		lamp halogen=new lamp();
		led.turnOn();
		halogen.turnOff();
	}
}

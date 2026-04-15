package interface_code;

public class ElectronicsDevice {
	public static void main(String[] args) {
		Light l = new Light();
		l.turnOn();
		l.turnOff();
		
		Fan f = new Fan();
		f.turnOn();
		f.turnOff();
		
		Speaker s = new Speaker();
		s.turnOn();
		s.ConnectToWifi();
		s.turnOff();
	}
}

interface Electronic{
	void turnOn();
	
	void turnOff();
}

interface SmartDevice{
	void ConnectToWifi();
}

class Light implements Electronic{
	public void turnOn() {
		System.out.println("Light turn on...");
	}
	
	public void turnOff() {
		System.out.println("Light turn off...");
	}
}

class Fan implements Electronic{
	public void turnOn() {
		System.out.println("Fan turn on...");
	}
	
	public void turnOff() {
		System.out.println("Fun turn off...");
	}
}

class Speaker implements Electronic, SmartDevice{
	public void turnOn() {
		System.out.println("Speaker turn on...");
	}
	
	public void turnOff() {
		System.out.println("Speaker turn off...");
	}
	
	public void ConnectToWifi() {
		System.out.println("Wifi is Connected.");
	}
}
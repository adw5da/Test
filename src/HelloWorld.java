import lejos.nxt.*;
import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args){
		System.out.println("Hello World");
		int speed =0;
		Button.waitForPress();
		while(true){
			speed+=50;
			Motor.A.setSpeed(speed);
			Motor.A.rotate(90);
			Button.waitForPress();
		//Motor.A.setSpeed(300);
 		//Motor.A.rotate(-900);
   		//Button.waitForPress();
		//Motor.A.stop();
			System.out.println("Finished");
			Button.waitForPress();
		}
		
	}
}
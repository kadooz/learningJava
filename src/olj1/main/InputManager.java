package olj1.main;

import java.util.Scanner;

public class InputManager {
	private static InputManager instance = null;
	private static boolean isInitialized = false;
	
	private Scanner input;
	
	private InputManager() {
		input = new Scanner(System.in);
		
		isInitialized = true;
	}
	
	public static InputManager getInstance() {
		if(!isInitialized) {
			instance = new InputManager();
		}
		return instance;
	}
	
	public String nextLine() {
		return input.nextLine();
	}
}

package lesson03.c_interfaces;

public interface Climatable {

	default void climateControl(int temp) {
		System.out.println("AC works with temp: " + temp);
	}

	default void climateStop() {
		System.out.println("Climate control system is turned off");
	}
}


package encapsulation;

public class Bank {
	private int pin;

	public void setPin(int pin) {
		this.pin = pin;
	}
	public void validatePin() {
		if(pin>=1000 && pin<=9999) {
			System.out.println("Entered pin is valid");
		}
		else
			System.out.println("Entered pin is invalid");
		}

}

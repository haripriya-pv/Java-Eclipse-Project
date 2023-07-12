
package encapsulation;

public class Bank {
	private int pin;

	public void setPin(int pin) {
		this.pin = pin;
	}
	public boolean validatePin() {
		return this.pin== 1001 ||this.pin== 1234||this.pin == 1212;
		}

}

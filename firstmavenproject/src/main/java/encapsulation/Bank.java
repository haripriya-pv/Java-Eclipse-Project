package encapsulation;

public class Bank {
	private int pin;

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public static void main(String[] args) {
		Bank b = new Bank();
		b.setPin(10);
		System.out.println(b.getPin());
		
	}

}

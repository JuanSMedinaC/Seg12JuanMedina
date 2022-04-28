package model;

public class Turn {
	private int value;
	private int passed;
	private Turn next;
	private Turn prev;
	
	public Turn(int value) {
		this.setValue(value);
		this.passed=0;
	}
	
	public Turn getNext() {
		return next;
	}
	public void setNext(Turn next) {
		this.next = next;
	}
	public Turn getPrev() {
		return prev;
	}
	public void setPrev(Turn prev) {
		this.prev = prev;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getPassed() {
		return passed;
	}

	public void setPassed(int passed) {
		this.passed = passed;
	}
	
	public boolean isErasable() {
		if(passed>=3) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
}

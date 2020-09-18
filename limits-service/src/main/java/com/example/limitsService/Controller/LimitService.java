package com.example.limitsService.Controller;

public class LimitService {
	
	private int minimum;
	private int maximum;
	
	@Override
	public String toString() {
		return "LimitService [minimum=" + minimum + ", maximum=" + maximum + "]";
	}
	public LimitService(int minimum, int maximum) {
		super();
		this.minimum = minimum;
		this.maximum = maximum;
	}
	public LimitService() {
		super();
	}
	public int getMinimum() {
		return minimum;
	}
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}
	public int getMaximum() {
		return maximum;
	}
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}

}

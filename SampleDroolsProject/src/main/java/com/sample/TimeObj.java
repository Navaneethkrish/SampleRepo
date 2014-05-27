package com.sample;

public class TimeObj {
	public long getValue() {
		return value;
	}

	public void setValue(long value) {
		this.value = value;
	}

	long value;

	public TimeObj(long value) {
		value = getCurrentTime();
	}
	
	public long getCurrentTime()
    {
         return System.currentTimeMillis();
    }

}

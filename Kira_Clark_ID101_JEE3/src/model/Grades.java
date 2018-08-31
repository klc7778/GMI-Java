package model;

public class Grades {
	String rollNo;
	String name;
	int mark1;
	int mark2;
	double percent;
	boolean valid;
	
	
	public int getMark1() {
		return mark1;
	}
	public int getMark2() {
		return mark2;
	}
	public void setMark1(int mark1) {
		this.mark1 = mark1;
	}
	public void setMark2(int mark2) {
		this.mark2 = mark2;
	}
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public double getPercent() {
		return percent;
	}
	
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPercent(double percent) {
		this.percent = percent;
	}
	
	
	public boolean isValid() {
		return valid;
	}
	public void setValid(boolean valid) {
		this.valid = valid;
	}

	
	
	
	
}

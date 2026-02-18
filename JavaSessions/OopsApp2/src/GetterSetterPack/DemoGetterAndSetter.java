package GetterSetterPack;

public class DemoGetterAndSetter {

	private String pname;
	private int age;
	
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>0)
			this.age = age;
		else
			System.out.println("Invalid Age! It must be +ve");
	}
}

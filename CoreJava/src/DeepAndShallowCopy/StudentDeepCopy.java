package DeepAndShallowCopy;

public class StudentDeepCopy implements Cloneable {
	
	int rollNo;
	
	AddressDeepCopy address; //This type of object only reference copy not object copy

	@Override
	protected Object clone() throws CloneNotSupportedException {
		StudentDeepCopy student = (StudentDeepCopy) super.clone();
		student.address = (AddressDeepCopy) address.clone();
		return student;
	}

	@Override
	public String toString() {
		return "StudentDeepCopy [rollNo=" + rollNo + ", address=" + address + "]";
	}
}

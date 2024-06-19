package DeepAndShallowCopy;

public class StudentShallow implements Cloneable {
	int rollNo;

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + "]";
	}

	//clone() method by default return shallow copy
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}

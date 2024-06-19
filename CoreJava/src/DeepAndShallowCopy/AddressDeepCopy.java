package DeepAndShallowCopy;

public class AddressDeepCopy implements Cloneable {
	int addressId;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}



	@Override
	public String toString() {
		return "AddressDeepCopy [addressId=" + addressId + "]";
	}
	
}

package ProtoType;

public class Main {
	public static void main(String[] args) {
		NetworkConnection nw = new NetworkConnection();
		nw.setIp("100.100.45.5");
		nw.loadImpData();
		System.out.println(nw);
		
		try {
			NetworkConnection nw2 =(NetworkConnection) nw.clone();
			System.out.println(nw2);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}

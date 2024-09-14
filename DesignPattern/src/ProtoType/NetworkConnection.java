package ProtoType;

public class NetworkConnection implements Cloneable {
	
	private String ip;
	private String data;
	
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "NetworkConnection [ip=" + ip + ", data=" + data + "]";
	}
	
	
	public void loadImpData() {
		this.data = "Railway Data";
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
		
	

}

package Comparasion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorInterface {
	private String roomNo;
	private int roomRent;

	public ComparatorInterface(String roomNo, int roomRent) {
		super();
		this.roomNo = roomNo;
		this.roomRent = roomRent;
	}

	public String getRoomNo() {
		return roomNo;
	}

	public int getRoomRent() {
		return roomRent;
	}

	@Override
	public String toString() {
		return "RoomRent [roomNo=" + roomNo + ", roomRent=" + roomRent + "]";
	}

	public static void main(String[] args) {
		List<ComparatorInterface> rentList = new ArrayList<>();
		rentList.add(new ComparatorInterface("RMT", 2500));
		rentList.add(new ComparatorInterface("SRM", 1500));
		rentList.add(new ComparatorInterface("UM0", 7500));
		rentList.add(new ComparatorInterface("IM08", 2500));
		
		Collections.sort(rentList, new RoomNoComparator());
		for(ComparatorInterface rr : rentList) {
			System.out.println(rr);
		}
		
		Collections.sort(rentList, new RoomRentComparator());
		for(ComparatorInterface rr : rentList) {
			System.out.println(rr);
		}

	}

}

class RoomNoComparator implements Comparator<ComparatorInterface> {

	@Override
	public int compare(ComparatorInterface o1, ComparatorInterface o2) {
		return o1.getRoomNo().compareTo(o2.getRoomNo());
	}

	
}

class RoomRentComparator implements Comparator<ComparatorInterface> {

	@Override
	public int compare(ComparatorInterface o1, ComparatorInterface o2) {
		return o1.getRoomRent() - o2.getRoomRent();
	}

}


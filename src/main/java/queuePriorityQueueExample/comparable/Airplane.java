package queuePriorityQueueExample.comparable;

public class Airplane implements Comparable<Airplane> {
	int id;
	boolean isCargo;

	public Airplane(int id, boolean isCargo) {
		this.id = id;
		this.isCargo = isCargo;
	}

	@Override
	public int compareTo(Airplane o) {

		// if (isCargo) {
		// return -1;
		// } else if (o.isCargo) {
		// return 1;
		// } else {
		// return 0;
		// }

		return isCargo ? -1 : o.isCargo ? 1 : 0;

		// For int isCargo.
		// return Integer.compare(isCargo, o.isCargo);

	}

	@Override
	public String toString() {
		return "Airplane " + id;
	}

}

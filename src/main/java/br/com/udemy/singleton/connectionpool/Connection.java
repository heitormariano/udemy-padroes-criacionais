package br.com.udemy.singleton.connectionpool;

public class Connection {

	private boolean inUse;
	private int numConnnection;

	public Connection() {
		this.inUse = false;
	}

	public boolean query(String sql) {
		System.out.println("Running '" + sql + "' in Connection " + this);
		return true;
	}

	public boolean isInUse() {
		return inUse;
	}

	public void setInUse(boolean inUse) {
		this.inUse = inUse;
	}

	public int getNumConnnection() {
		return numConnnection;
	}

	public void setNumConnnection(int numConnnection) {
		this.numConnnection = numConnnection;
	}

	@Override
	public String toString() {
		return "Connection [inUse=" + inUse + ", numConnnection=" + numConnnection + "]";
	}

}

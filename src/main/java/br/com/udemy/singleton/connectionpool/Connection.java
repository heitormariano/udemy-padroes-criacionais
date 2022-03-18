package br.com.udemy.singleton.connectionpool;

public class Connection {

	private boolean inUse;
	private int connectionCount;

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

	public int getConnectionCount() {
		return connectionCount;
	}

	public void setConnectionCount(int connectionCount) {
		this.connectionCount = connectionCount;
	}

	@Override
	public String toString() {
		return "Connection [inUse=" + inUse + ", numConnnection=" + connectionCount + "]";
	}

}

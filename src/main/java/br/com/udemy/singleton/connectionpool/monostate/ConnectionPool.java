package br.com.udemy.singleton.connectionpool.monostate;

import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {

	public static final int POOL_SIZE = 2;
	private static List<Connection> connections;

	static {
		System.out.println("Creating connection pool");
		System.out.println("Connection pool size: " + POOL_SIZE);
		connections = new ArrayList<>();
		for (int i = 0; i < POOL_SIZE; i++) {
			connections.add(new Connection());
		}
	}

	public ConnectionPool() {

	}

	public Connection getConnection() {
		Connection currentConnection = null;
		for (Connection conn : connections) {
			if (!conn.isInUse()) {
				currentConnection = conn;
				break;
			}
		}

		if (currentConnection == null) {
			System.out.println("No connections available");
			return null;
		}

		currentConnection.setInUse(true);
		return currentConnection;
	}

}

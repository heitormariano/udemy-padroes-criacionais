package br.com.udemy.singleton.connectionpool;

import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {
	private static ConnectionPool instante = new ConnectionPool();
	public final static int POOL_SIZE = 2;

	private List<Connection> connections;

	public static ConnectionPool getInstance() {
		return instante;
	}

	private ConnectionPool() {
		System.out.println("");
		Connection conn = null;
		connections = new ArrayList<Connection>();
		for (int i = 0; i < POOL_SIZE; i++) {
			conn = new Connection();
			conn.setConnectionCount(i + 1);
			connections.add(conn);
		}
	}

	public Connection getConnection() {
		Connection available = null;
		for (Connection connection : connections) {
			if (!connection.isInUse()) {
				available = connection;
				break;
			}
		}

		if (available == null) {
			System.out.println("No Connections available");
			return null;
		}

		available.setInUse(true);
		return available;
	}

	public void leaveConnection(Connection connection) {
		connection.setInUse(false);
	}

}

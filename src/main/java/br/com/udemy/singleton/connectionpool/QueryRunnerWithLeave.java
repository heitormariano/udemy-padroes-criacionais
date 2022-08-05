package br.com.udemy.singleton.connectionpool;

public class QueryRunnerWithLeave {

	public void doQuery1() {
		ConnectionPool pool = ConnectionPool.getInstance();
		Connection connection = pool.getConnection();
		if (connection != null)
			connection.query("SELECT * FROM TAB_A1");
		
		pool.leaveConnection(connection);
	}

	public void doQuery2() {
		ConnectionPool pool = ConnectionPool.getInstance();
		Connection connection = pool.getConnection();
		if (connection != null)
			connection.query("SELECT * FROM TAB_A2");
		
		pool.leaveConnection(connection);
	}

	public void doQuery3() {
		ConnectionPool pool = ConnectionPool.getInstance();
		Connection connection = pool.getConnection();
		if (connection != null)
			connection.query("SELECT * FROM TAB_A3");
		
		pool.leaveConnection(connection);
	}
}

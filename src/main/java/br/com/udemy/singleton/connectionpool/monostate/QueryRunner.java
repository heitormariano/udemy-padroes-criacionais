package br.com.udemy.singleton.connectionpool.monostate;

public class QueryRunner {

	public void doQuery1() {
		ConnectionPool pool = new ConnectionPool();
		Connection connection = pool.getConnection();
		if (connection != null)
			connection.query("SELECT * FROM TAB_A1");
	}

	public void doQuery2() {
		ConnectionPool pool = new ConnectionPool();
		Connection connection = pool.getConnection();
		if (connection != null)
			connection.query("SELECT * FROM TAB_A2");
	}

	public void doQuery3() {
		ConnectionPool pool = new ConnectionPool();
		Connection connection = pool.getConnection();
		if (connection != null)
			connection.query("SELECT * FROM TAB_A3");
	}
}

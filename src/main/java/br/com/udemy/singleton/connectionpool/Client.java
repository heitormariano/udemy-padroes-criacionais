package br.com.udemy.singleton.connectionpool;

public class Client {

	public static void main(String[] args) {
		int poolSize = ConnectionPool.POOL_SIZE;

		System.out.println("Connection Pool Size: " + poolSize);

		QueryRunner queryRunner = new QueryRunner();
		queryRunner.doQuery1();
		queryRunner.doQuery2();
		queryRunner.doQuery3(); // prints 'No Connections available'
	}

}

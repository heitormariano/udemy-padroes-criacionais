package br.com.udemy.singleton.connectionpool.monostate;

public class Client {

	public static void main(String[] args) {
		System.out.println("Learning about monostate");

		QueryRunner queryRunner = new QueryRunner();
		queryRunner.doQuery1();
		queryRunner.doQuery2();
		queryRunner.doQuery3(); // prints 'No Connections available'
	}

}

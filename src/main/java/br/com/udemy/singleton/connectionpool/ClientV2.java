package br.com.udemy.singleton.connectionpool;

public class ClientV2 {

	public static void main(String[] args) {
		// Using Query Runner with leaveConnection method
		QueryRunnerWithLeave queryRunner02 = new QueryRunnerWithLeave();
		queryRunner02.doQuery1();
		queryRunner02.doQuery2();
		queryRunner02.doQuery3();
	}
}

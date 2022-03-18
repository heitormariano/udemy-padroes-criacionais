package br.com.udemy.prototype.functionalCloneBuilder.client;

import br.com.udemy.prototype.functionalCloneBuilder.model.Address;
import br.com.udemy.prototype.functionalCloneBuilder.model.User;

public class Client {

	public static void main(String[] args) {
		User originalUser = new User("John", 30, new Address("A Street", 12));
		System.out.println(originalUser);

		User cloneUser = originalUser.cloneBuilder().withName("Brian Clone").now();
		System.out.println(cloneUser);

		User anotherUser = cloneUser.cloneBuilder().withName("Philip Another").withAge(55)
				.withAddress(new Address("XYZ Street", 400)).now();

		System.out.println(anotherUser);
	}
}

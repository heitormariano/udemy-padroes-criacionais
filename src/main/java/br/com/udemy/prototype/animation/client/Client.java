package br.com.udemy.prototype.animation.client;

import java.util.ArrayList;
import java.util.List;

import br.com.udemy.prototype.animation.model.Person;
import br.com.udemy.prototype.animation.model.PersonSample;

public class Client {

	private static List<Person> frames = new ArrayList<>();

	public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {
		PersonSample sample = new PersonSample();

		// Person person = samples.get("stickMan");
		Person person = sample.get("fatMan");
		frames.add(person);

		person = setAnimationSteps(person, "left", 3);
		person = setAnimationSteps(person, "right", 7);
		person = setAnimationSteps(person, "left", 3);

		animate();
	}

	private static Person setAnimationSteps(Person person, String stepType, int stepCount)
			throws CloneNotSupportedException {
		Person clone = null;

		if ("left".equalsIgnoreCase(stepType)) {
			for (int i = 0; i < stepCount; i++) {
				clone = addLeft(person);
				person = clone;
			}

		} else if ("right".equalsIgnoreCase(stepType)) {
			for (int i = 0; i < stepCount; i++) {
				clone = addRight(person);
				person = clone;
			}
		}

		return clone;
	}

	public static void animate() throws InterruptedException {
		System.out.println("*********************************");
		System.out.println("* ");
		System.out.println("* Adjust your screen's height!");
		System.out.println("* ");
		System.out.print("*********************************");
		Thread.sleep(3000);
		for (Person frame : frames) {
			frame.draw();
			Thread.sleep(500);
		}
		System.out.println("**********************");
		System.out.println("* ");
		System.out.println("* The End!");
		System.out.println("* ");
		System.out.print("**********************");
	}

	public static Person addLeft(Person p) throws CloneNotSupportedException {
		Person person = (Person) p.clone();
		person.left();
		frames.add(person);
		return person;
	}

	public static Person addRight(Person p) throws CloneNotSupportedException {
		Person person = (Person) p.clone();
		person.right();
		frames.add(person);
		return person;
	}

}

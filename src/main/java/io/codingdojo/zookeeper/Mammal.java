package io.codingdojo.zookeeper;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Mammal {
	protected int energyLevel;

	public int displayEnergy() {
		System.out.println("Current energy levels: " + energyLevel);
		return energyLevel;
	}

	protected void increaseEnergy(int num) {
		energyLevel+= num;
	}

	protected void decreaseEnergy(int num) {
		energyLevel-= num;
	}

}

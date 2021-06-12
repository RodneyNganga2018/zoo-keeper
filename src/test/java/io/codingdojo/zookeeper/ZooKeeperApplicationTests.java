package io.codingdojo.zookeeper;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ZooKeeperApplicationTests {

	@Test
	void contextLoads() {
		Gorilla kong = new Gorilla();
		kong.throwSomething();
		kong.throwSomething();
		kong.throwSomething();
		kong.eatBananas();
		kong.eatBananas();
		kong.climb();
		kong.climb();
		kong.displayEnergy();
	}

}

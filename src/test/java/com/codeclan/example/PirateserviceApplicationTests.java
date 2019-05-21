package com.codeclan.example;

import com.codeclan.example.models.Pirate;
import com.codeclan.example.models.Raid;
import com.codeclan.example.models.Ship;
import com.codeclan.example.repositories.PirateRepository;
import com.codeclan.example.repositories.RaidsRepository;
import com.codeclan.example.repositories.ShipRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.GenerationType;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PirateserviceApplicationTests {

	@Autowired
	PirateRepository pirateRepository;

	@Autowired
	ShipRepository shipRepository;

	@Autowired
	RaidsRepository raidsRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createPirate() {
		Ship ship = new Ship("Black Pearl");
		shipRepository.save(ship);
		Pirate jack = new Pirate( "Jack", "Sparrow", 32, ship);
		pirateRepository.save(jack);
	}


	@Test
	public void createPirateShipAndRaid(){
		Ship ship = new Ship("Black Pearl");
		shipRepository.save(ship);

		Pirate pirate2 = new Pirate("Barbossa", "Hook", 56, ship);
		pirateRepository.save(pirate2);

		Raid raid = new Raid("Carribean", "30Kg Gold");
		raid.addPirate(pirate2);
		raidsRepository.save(raid);




	}

}

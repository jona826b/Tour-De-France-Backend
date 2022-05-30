package com.example.tourdefrance.service;

import com.example.tourdefrance.model.Rider;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Import(RiderService.class)
class RiderServiceTest {

  @Autowired
  RiderService riderService;

  @Test
  void createRider() {
    Rider rider = new Rider();
    rider.setRiderName("erik");
    rider.setMtnPoints(123);
    rider.setSprintPoints(20);
    rider.setTotalTime(20.20);

    Rider createdRider = riderService.save(rider);

    Assertions.assertNotNull(createdRider);

  }

  @Test
  void findAll() {
    Rider rider = new Rider();
    riderService.save(rider);
    List<Rider> foundRider = riderService.findAll();

    Assertions.assertNotNull(foundRider);
  }


  @Test
  void getRider() {
    Rider r1 = new Rider();
    List<Rider> riders = new ArrayList<>();
    riders.add(r1);


    Assertions.assertNotEquals(0, riders.size());
  }

}
package com.example.tourdefrance.controller;

import com.example.tourdefrance.model.Rider;
import com.example.tourdefrance.service.RiderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@CrossOrigin
@RequestMapping("api/riders")
public class RiderRESTController {

  private final RiderService riderService;

  @Autowired
  public RiderRESTController(RiderService riderService) {
    this.riderService = riderService;
  }

  @PostMapping()
  public ResponseEntity<Rider> createRider(@RequestBody Rider rider){
  return new ResponseEntity<>(riderService.createRider(rider),HttpStatus.CREATED);
  }

  @GetMapping
  public ResponseEntity<List<Rider>> getRiders() {
    return new ResponseEntity<>(riderService.findAll(), HttpStatus.OK);
  }

  @GetMapping("/{id}")
  public ResponseEntity<Rider> get(@PathVariable Long id) {
    try {
      Rider rider = riderService.getRider(id);
      return new ResponseEntity<Rider>(rider, HttpStatus.OK);
    } catch (NoSuchElementException e) {
      return new ResponseEntity<Rider>(HttpStatus.NOT_FOUND);
    }
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Rider> deleteUserById(@PathVariable Long id) {
    riderService.deleteById(id);
    return new ResponseEntity<>(HttpStatus.OK);
  }

  @PutMapping("/{id}")
  public ResponseEntity<?> update(@RequestBody Rider rider, @PathVariable Long id) {
    try {
      Rider existRider = riderService.getRider(id);
      rider.setId(id);
      riderService.saveRider(rider);
      return new ResponseEntity<>(HttpStatus.OK);
    } catch (NoSuchElementException e) {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
  }
}

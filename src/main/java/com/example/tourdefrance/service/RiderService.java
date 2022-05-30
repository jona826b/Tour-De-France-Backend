package com.example.tourdefrance.service;

import com.example.tourdefrance.model.Rider;
import com.example.tourdefrance.repository.RiderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RiderService {

  private final RiderRepository riderRepository;

  @Autowired
  public RiderService(RiderRepository riderRepository) {
    this.riderRepository = riderRepository;
  }

  public Rider createRider(Rider rider) {
    return riderRepository.save(rider);
  }

  public List<Rider> findAll(){
  return riderRepository.findAll();
  }

  public void deleteById(Long id) {
    riderRepository.deleteById(id);
  }

  public Rider getRider(Long id) {
    return riderRepository.findById(id).get();
  }

  public Rider saveRider(Rider rider) {
    return riderRepository.save(rider);
  }
}


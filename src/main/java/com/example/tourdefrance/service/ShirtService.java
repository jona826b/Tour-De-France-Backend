package com.example.tourdefrance.service;

import com.example.tourdefrance.repository.ShirtRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShirtService {
  private final ShirtRepository shirtRepository;

  @Autowired
  public ShirtService(ShirtRepository shirtRepository) {
    this.shirtRepository = shirtRepository;
  }
}

package com.example.tourdefrance.controller;

import com.example.tourdefrance.service.ShirtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("api/shirts")
public class ShirtRESTController {

  private final ShirtService shirtService;

  @Autowired
  public ShirtRESTController(ShirtService shirtService) {
    this.shirtService = shirtService;
  }
}

package com.example.tourdefrance.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
public class Shirt {

  @Id
  @Column(name = "shirt_id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column
  private String yellowShirt;

  @Column
  private String whiteShirt;

  @Column
  private String greenShirt;

  @Column
  private String dottedShirt;
}

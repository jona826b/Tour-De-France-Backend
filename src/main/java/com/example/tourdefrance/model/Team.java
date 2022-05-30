package com.example.tourdefrance.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
public class Team {

  @Id
  @Column(name = "team_id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;


  @Column(name = "team_name")
  private String teamName;

}

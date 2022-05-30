package com.example.tourdefrance.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
public class Rider {

  @Id
  @Column(name = "rider_id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "rider_name")
  private String riderName;

  @Column(name = "nationality")
  private String nationality;

  @Column(name = "total_time")
  private Double totalTime;

  @Column(name = "mtn_points")
  private Integer mtnPoints;

  @Column(name = "sprint_points")
  private Integer sprintPoints;
}

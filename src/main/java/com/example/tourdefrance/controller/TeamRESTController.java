package com.example.tourdefrance.controller;

import com.example.tourdefrance.model.Team;
import com.example.tourdefrance.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@CrossOrigin
@RequestMapping("api/teams")
public class TeamRESTController {

  private final TeamService teamService;

  @Autowired
  public TeamRESTController(TeamService teamService) {
    this.teamService = teamService;
  }

  @PostMapping()
  public ResponseEntity<Team> createRider(@RequestBody Team team){
    return new ResponseEntity<>(teamService.createTeam(team), HttpStatus.CREATED);
  }

  @GetMapping
  public ResponseEntity<List<Team>> getTeams() {
    return new ResponseEntity<>(teamService.findAll(), HttpStatus.OK);
  }

  @GetMapping("/{id}")
  public ResponseEntity<Team> get(@PathVariable Long id) {
    try {
      Team team = teamService.getTeam(id);
      return new ResponseEntity<Team>(team, HttpStatus.OK);
    } catch (NoSuchElementException e) {
      return new ResponseEntity<Team>(HttpStatus.NOT_FOUND);
    }
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Team> deleteUserById(@PathVariable Long id) {
    teamService.deleteById(id);
    return new ResponseEntity<>(HttpStatus.OK);
  }

  @PutMapping("/{id}")
  public ResponseEntity<?> update(@RequestBody Team team, @PathVariable Long id) {
    try {
      Team existTeam = teamService.getTeam(id);
      team.setId(id);
      teamService.saveTeam(team);
      return new ResponseEntity<>(HttpStatus.OK);
    } catch (NoSuchElementException e) {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
  }
}


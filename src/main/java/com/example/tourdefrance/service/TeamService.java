package com.example.tourdefrance.service;

import com.example.tourdefrance.model.Team;
import com.example.tourdefrance.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamService {
  private final TeamRepository teamRepository;

  @Autowired
  public TeamService(TeamRepository teamRepository) {
    this.teamRepository = teamRepository;
  }

  public Team createTeam(Team team) {
    return teamRepository.save(team);
  }

  public List<Team> findAll() {
    return teamRepository.findAll();
  }

  public Team getTeam(Long id) {
    return teamRepository.findById(id).get();
  }

  public void deleteById(Long id) {
    teamRepository.deleteById(id);
  }

  public Team saveTeam(Team team) {
    return teamRepository.save(team);
  }
}

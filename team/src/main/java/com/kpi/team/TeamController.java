package com.kpi.team;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by AndrewB on 27.04.18.
 */

@RestController
class TeamController {

    @Autowired
    private TeamService teamService;

    @GetMapping("/")
    public String home() {
        return "<a href=\"/api/teams\">/api/teams</a>" +
                "<br />" +
                "<a href=\"/api/teams/0\">/api/teams/{id}</a>";
    }

    @GetMapping("/api/teams")
    public List<Team> getTeams() {
        return teamService.list();
    }

    @GetMapping("/api/teams/{teamId}")
    public Team getTeams(@PathVariable Integer teamId) {
        return teamService.get(teamId);
    }

    @PostMapping(path = "/api/teams", consumes = "application/json", produces = "application/json")
    public Team createTeam(@RequestBody Team team) {
        return teamService.create(team);
    }

}
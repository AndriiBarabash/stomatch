package com.kpi.tournament;

import com.kpi.team.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by AndrewB on 27.04.18.
 */

@EnableFeignClients
@RestController
public class TournamentController {

    @Autowired
    private TournamentService tournamentService;

    @Autowired
    private TeamClient teamClient;

    @GetMapping("/")
    public String home() {
        StringBuilder endpoints = new StringBuilder();
        endpoints.append("/api/tournament/\n");
        endpoints.append("/api/tournament/{id}/");
        return endpoints.toString();
    }

    @GetMapping("/api/teams")
    public List<Team> getTeams() {
        return teamClient.getTeams();
    }

    @GetMapping("/api/tournament/")
    public List<Tournament> getAllTournaments() {
        return tournamentService.getAllTournaments();
    }

    @GetMapping("/api/tournament/{tournamentId}")
    public Tournament getTournament(@PathVariable Long tournamentId) {
        return tournamentService.getTournament(tournamentId);
    }

    @PostMapping(path = "/api/tournament/", consumes = "application/json", produces = "application/json")
    public Tournament createTournament(@RequestBody Tournament tournament) {
        return tournamentService.createTournament(tournament);
    }
}

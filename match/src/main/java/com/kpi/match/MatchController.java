package com.kpi.match;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
class MatchController {

    @Autowired
    private MatchService matchService;

    @GetMapping("/")
    public String home() {
        return "<a href=\"/api/matches\">/api/matches</a>" +
                "<br />" +
                "<a href=\"/api/matches/0\">/api/matches/{id}</a>";
    }

    @GetMapping("/api/matches")
    public List<Match> getAllMatches() {
        return matchService.getAllMatches();
    }

    @GetMapping("/api/matches/{matchId}")
    public Match getMatch(@PathVariable Long matchId) {
        return matchService.getMatch(matchId);
    }

    @PostMapping(path = "/api/matches", consumes = "application/json", produces = "application/json")
    public Match createMatch(@RequestBody Match match) {
        return matchService.createMatch(match);
    }

}
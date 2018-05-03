package com.kpi.tournament;

import com.kpi.team.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TournamentService {

    @Autowired
    private TeamClient teamClient;

    private static List<Tournament> tournaments = new ArrayList<>();

    static {
        Tournament starLadder = new Tournament(1L);
        List<Team> starLadderTeams = new ArrayList<>();
        starLadderTeams.add(new Team(1));
        starLadder.setTeams(starLadderTeams);
        starLadder.setName("StarLadder Season VI");

        Tournament bostonMajor = new Tournament(2L);
        List<Team> bostonTeams = new ArrayList<>();
        bostonTeams.add(new Team(2));
        bostonMajor.setTeams(bostonTeams);
        bostonMajor.setName("Boston Major");

        tournaments.add(starLadder);
        tournaments.add(bostonMajor);
    }

    public List<Tournament> getAllTournaments() {
        for (Tournament tournament : tournaments) {
            List<Team> fullTeams = new ArrayList<>();
            for (Team team : tournament.getTeams()) {
                fullTeams.add(teamClient.getTeam(team.getId()));
            }
            tournament.setTeams(fullTeams);
        }
        return tournaments;
    }

    public Tournament createTournament(Tournament tournament) {
        tournaments.add(tournament);
        return tournaments.get(tournaments.size() - 1);
    }

    public Tournament getTournament(Long tournamentId) {
        return tournaments
                .stream()
                .filter(tournament -> tournament.getId().equals(tournamentId))
                .findAny()
                .orElse(new Tournament());
    }
}
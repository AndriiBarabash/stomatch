package com.kpi.tournament;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TournamentService {
    private static List<Tournament> tournaments = new ArrayList<>();

    static {
        Tournament starLadder = new Tournament(1L);
        List<Long> starLadderTeams = new ArrayList<>();
        starLadderTeams.add(1L);
        starLadderTeams.add(2L);
        starLadderTeams.add(3L);
        starLadderTeams.add(4L);
        starLadderTeams.add(5L);
        starLadder.setTeams(starLadderTeams);
        starLadder.setName("StarLadder Season VI");

        Tournament bostonMajor = new Tournament(2L);
        List<Long> bostonTeams = new ArrayList<>();
        bostonTeams.add(2L);
        bostonTeams.add(3L);
        bostonTeams.add(4L);
        bostonTeams.add(5L);
        bostonTeams.add(6L);
        bostonTeams.add(7L);
        bostonMajor.setTeams(bostonTeams);
        bostonMajor.setName("Boston Major");

        tournaments.add(starLadder);
        tournaments.add(bostonMajor);
    }

    public List<Tournament> getAllTournaments() {
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
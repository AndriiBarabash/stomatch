package com.kpi.team;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class TeamService {
    private static List<Team> teams = new ArrayList<Team>();
    private static Integer idIndex = 3;

    static {
        List<Player> TeamPlayer = new ArrayList<Player>();
        Team a = new Team(0, "Natuse Vincere", "Na'Vi", TeamPlayer, "Ukraine", "XBOCT");
        teams.add(a);
        Team b = new Team(1, "Another Team", "A-Team", TeamPlayer, "Ukraine", "Sideshow");
        teams.add(b);
        Team c = new Team(2, "Virtuse Pro", "VP", TeamPlayer, "Russia", "ArtStyle");
        teams.add(c);
    }

    public static List<Team> list() {
        return teams;
    }

    public static Team create(Team team) {
        teams.add(team);
        return team;
    }

    public static Team get(Integer id) {
        return teams.get(id);
    }

}

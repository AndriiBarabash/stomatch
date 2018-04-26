package com.kpi.team;

import java.util.List;

public class Team {
    private Integer id;

    private String TeamName;

    private String TeamTag;

    private List<Player> TeamPlayers;

    private String Country;

    private String Coach;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTeamName() {
        return TeamName;
    }

    public void setTeamName(String teamName) {
        TeamName = teamName;
    }

    public String getTeamTag() {
        return TeamTag;
    }

    public void setTeamTag(String teamTag) {
        TeamTag = teamTag;
    }

    public List<Player> getTeamPlayers() {
        return TeamPlayers;
    }

    public void setTeamPlayers(List<Player> teamPlayers) {
        TeamPlayers = teamPlayers;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getCoach() {
        return Coach;
    }

    public void setCoach(String coach) {
        Coach = coach;
    }

    Team() { }

    Team(Integer id, String TeamName, String TeamTag, List<Player> TeamPlayers, String Country, String Coach){
        this.id = id;
        this.TeamName = TeamName;
        this.TeamTag = TeamTag;
        this.TeamPlayers = TeamPlayers;
        this.Country = Country;
        this.Coach = Coach;
    }
}

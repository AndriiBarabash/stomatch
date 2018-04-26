package com.kpi.team;


public class Player {
    private Integer id;

    private String PlayerName;

    private String PlayerTeam;

    private String Role;

    private String Country;

    private Integer Age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlayerName() {
        return PlayerName;
    }

    public void setPlayerName(String playerName) {
        PlayerName = playerName;
    }

    public String getPlayerTeam() {
        return PlayerTeam;
    }

    public void setPlayerTeam(String playerTeam) {
        PlayerTeam = playerTeam;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String role) {
        Role = role;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }

    Player()
    {
        this.id = 0;
        this.PlayerName = "PlayerName";
        this.Role = "Role";
        this.Country = "Country";
        this.Age = 0;
    }

    Player(Integer id, String PlayerName, String PlayerTeam, String Role, String Country, Integer Age){
        this.id = id;
        this.PlayerName = PlayerName;
        this.PlayerTeam = PlayerTeam;
        this.Role = Role;
        this.Country = Country;
        this.Age = Age;
    }
}

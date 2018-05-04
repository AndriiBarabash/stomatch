package com.kpi.match;

import java.time.Duration;
import java.util.Date;

public class Match {
    private Long id;
    private Date beginTime;
    private Duration duration;
    private int team1ID;
    private int team2ID;

    Match() {}

    Match(Long id) {
        this.id = id;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginDate) {
        this.beginTime = beginDate;
    }

    public Duration getduration() {
        return duration;
    }

    public void setduration(Duration duration) {
        this.duration = duration;
    }

    public int getTeam1ID() {
        return team1ID;
    }

    public void setTeam1ID(int team1ID) {
        this.team1ID = team1ID;
    }

    public int getTeam2ID() {
        return team2ID;
    }

    public void setTeam2ID(int team2ID) {
        this.team2ID = team2ID;
    }
}

package com.kpi.tournament;

import com.kpi.team.Team;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * Created by AndrewB on 04.05.18.
 */

@FeignClient("team")
public interface TeamClient {

    @GetMapping("/api/teams")
    public List<Team> getTeams();

    @GetMapping("/api/teams/{teamId}")
    public Team getTeam(@PathVariable("teamId") Integer teamId);
}

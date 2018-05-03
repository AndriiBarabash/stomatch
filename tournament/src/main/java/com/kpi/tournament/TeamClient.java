package com.kpi.tournament;

import com.kpi.team.Team;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


@FeignClient("team")
public interface TeamClient {
    @RequestMapping(method = RequestMethod.GET, value = "/api/teams")
    List<Team> getTeams();

    @RequestMapping(method = RequestMethod.GET, value = "/api/teams/{teamId}")
    Team getTeam(@PathVariable("teamId") Integer teamId);

    @RequestMapping(method = RequestMethod.POST, value = "/api/teams",
            consumes = "application/json", produces = "application/json")
    Team createTeam(@RequestBody Team team);

}

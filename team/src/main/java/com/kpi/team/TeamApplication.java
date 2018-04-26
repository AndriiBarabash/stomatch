package com.kpi.team;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@EnableDiscoveryClient
@SpringBootApplication
public class TeamApplication {
    public static void main(String[] args) {
        SpringApplication.run(TeamApplication.class, args);
    }
}

@RestController
class ServiceInstanceRestController {

    @Autowired
    private TeamService teamService;
    // private DiscoveryClient discoveryClient;


    //@RequestMapping("/service-instances/{applicationName}")
    //public List<ServiceInstance> serviceInstancesByApplicationName(
    //        @PathVariable String applicationName) {
    //    return  this.discoveryClient.getInstances(applicationName);
    //}

    @GetMapping("/")
    public String home() {
        return "<a href=\"/api/teams\">/api/teams</a>" +
                "<br />" +
                "<a href=\"/api/teams/0\">/api/teams/{id}</a>";
    }

    @GetMapping("/api/teams")
    public List<Team> getTeams() {
        return teamService.list();
    }

    @GetMapping("/api/teams/{teamId}")
    public Team getTeams(@PathVariable Integer teamId) {
        return teamService.get(teamId);
    }

    @PostMapping(path = "/api/teams", consumes = "application/json", produces = "application/json")
    public Team createTeam(@RequestBody Team team) {
        return teamService.create(team);
    }

}
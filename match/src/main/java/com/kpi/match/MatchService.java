package com.kpi.match;

import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

@Service
public class MatchService {
    private static List<Match> matches = new ArrayList<>();

    static {
        Match first = new Match(1L);
        first.setTeam1ID(1);
        first.setTeam2ID(2);
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd");
        try {
            first.setBeginTime(ft.parse("2018-11-11"));
        }catch (ParseException e) {
            System.out.println("Нераспаршена с помощью " + ft);
        }
        LocalDateTime from = LocalDateTime.of(2018, Month.NOVEMBER, 11, 12, 00);
        LocalDateTime to = LocalDateTime.of(2018, Month.NOVEMBER, 11, 13, 00);
        Duration duration = Duration.between(from, to);
        first.setduration(duration);

        Match second = new Match(2L);
        second.setTeam1ID(3);
        second.setTeam2ID(4);
        try {
            second.setBeginTime(ft.parse("2018-11-12"));
        }catch (ParseException e) {
            System.out.println("Нераспаршена с помощью " + ft);
        }
        from = LocalDateTime.of(2018, Month.NOVEMBER, 12, 12, 00);
        to = LocalDateTime.of(2018, Month.NOVEMBER, 12, 13, 00);
        duration = Duration.between(from, to);
        first.setduration(duration);

        matches.add(first);
        matches.add(second);
    }

    public List<Match> getAllMatches() {
        return matches;
    }

    public Match createMatch(Match match) {
        matches.add(match);
        return matches.get(matches.size()-1);
    }

    public Match getMatch(Long matchId) {
        return matches
                .stream()
                .filter(match -> match.getId().equals(matchId))
                .findAny()
                .orElse(new Match());
    }
}

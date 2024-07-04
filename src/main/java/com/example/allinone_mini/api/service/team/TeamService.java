package com.example.allinone_mini.api.service.team;

import com.example.allinone_mini.api.controller.team.request.TeamCreateRequest;
import com.example.allinone_mini.domain.team.Team;
import com.example.allinone_mini.domain.team.TeamRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@RequiredArgsConstructor
public class TeamService {

    private final TeamRepository teamRepository;

    @Transactional
    public void save(TeamCreateRequest request) {
        Team team = Team.builder().name(request.getName()).build();
        teamRepository.save(team);
        log.info("create team :: {}", team.getId());
    }
}

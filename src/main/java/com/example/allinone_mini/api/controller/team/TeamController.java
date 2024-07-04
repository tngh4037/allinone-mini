package com.example.allinone_mini.api.controller.team;

import com.example.allinone_mini.api.controller.team.request.TeamCreateRequest;
import com.example.allinone_mini.api.service.team.TeamService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TeamController {

    private final TeamService teamService;

    @PostMapping("/api/team")
    public void teams(@RequestBody TeamCreateRequest request) {
        teamService.save(request);
    }
}

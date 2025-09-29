package com.zahir.backend.controller;


import com.zahir.backend.model.Player;
import com.zahir.backend.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/players")
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @GetMapping("/api/players")
    public ResponseEntity<List<Player>> getAllPlayers() {
        List<Player> players = playerService.getAllPlayers();
        return ResponseEntity.ok(players);
    }

    @GetMapping("/{playerId}")
    public ResponseEntity<?> getPlayerById(@PathVariable UUID playerId) {
        Optional<>
    }

    @GetMapping("/username/{username}")
    public ResponseEntity<List<Player>> getPlayersById() {
        List<Player> players = playerService.getAllPlayers();
        return ResponseEntity.ok(players);
    }

    @GetMapping("/leaderboard/high-score")
    public ResponseEntity<List<Player>> getLeaderboardByHighScore(@RequestParam(defaultValue = "10") int limit) {
        List<Player> leaderboard = playerService.getLeaderboardByHighScore(limit);
        return ResponseEntity.ok(leaderboard);
    }

    @GetMapping("/leaderboard/total-coins")
    public ResponseEntity<List<Player>> getLeaderboardByTotalCoins() {
        List<Player> leaderboard = playerService.getLeaderboardByHighScore(limit);
        return ResponseEntity.ok(leaderboard);
    }

    @GetMapping("/leaderboard/high-score")
    public ResponseEntity<List<Player>> getLeaderboardByHighScore(@RequestParam(defaultValue = "10") int limit) {
        List<Player> leaderboard = playerService.getLeaderboardByHighScore(limit);
        return ResponseEntity.ok(leaderboard);
    }
}

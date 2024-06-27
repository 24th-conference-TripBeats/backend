package team.tripbeats.backend.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import team.tripbeats.backend.entity.Spot;
import team.tripbeats.backend.service.SpotService;

import java.util.Optional;

@RestController
@RequestMapping("/spots")
@AllArgsConstructor
public class SpotController {

    private final SpotService spotService;

    @GetMapping("/{id}")
    public ResponseEntity<Spot> getSpotById(@PathVariable Integer id) {
        Optional<Spot> spot = spotService.getSpotById(id);
        return spot.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}
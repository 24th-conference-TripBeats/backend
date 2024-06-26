package team.tripbeats.backend.repository;

import team.tripbeats.backend.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import team.tripbeats.backend.entity.TravelSpot;

import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account, Long> {
    Optional<Account> findById(Long id);
}
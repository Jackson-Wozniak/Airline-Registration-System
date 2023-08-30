package github.wozniak.flightbookingservice.repository;

import github.wozniak.flightbookingservice.entity.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : Jackson Wozniak
 * @created : 8/29/2023, Tuesday
 **/
public interface FlightRepository extends JpaRepository<Flight, Long> {
}

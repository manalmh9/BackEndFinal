package UFOLEP_POLYTECH.Controller;

import UFOLEP_POLYTECH.Model.Clubs;
import UFOLEP_POLYTECH.Service.ClubsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clubs")
public class ClubsController {

    @Autowired
    private ClubsService clubsService;

    @PostMapping
    public Clubs addClub(@RequestBody Clubs club) {
        return clubsService.saveClub(club);
    }

    @PutMapping("/{id}")
    public Clubs updateClub(@PathVariable Long id, @RequestBody Clubs club) {
        return clubsService.updateClub(id, club);
    }

    @DeleteMapping("/{id}")
    public void deleteClub(@PathVariable Long id) {
        clubsService.deleteClub(id);
    }

    @GetMapping("/{id}")
    public Clubs getClubById(@PathVariable Long id) {
        return clubsService.getClubById(id);
    }

    @GetMapping
    public List<Clubs> getAllClubs() {
        return clubsService.getAllClubs();
    }
}

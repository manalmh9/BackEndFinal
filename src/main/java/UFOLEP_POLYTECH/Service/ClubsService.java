package UFOLEP_POLYTECH.Service;

import UFOLEP_POLYTECH.Model.Clubs;
import UFOLEP_POLYTECH.Repositories.ClubsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClubsService {

    @Autowired
    private ClubsRepository clubsRepository;

    // Enregistrer un club
    public Clubs saveClub(Clubs club) {
        return clubsRepository.save(club);
    }

    // Mettre à jour un club
    public Clubs updateClub(Long id, Clubs club) {
        club.setId(id);
        return clubsRepository.save(club);
    }

    // Supprimer un club
    public void deleteClub(Long id) {
        clubsRepository.deleteById(id);
    }

    // Récupérer un club par ID
    public Clubs getClubById(Long id) {
        return clubsRepository.findById(id).orElse(null);
    }

    // Récupérer tous les clubs
    public List<Clubs> getAllClubs() {
        return clubsRepository.findAll();
    }
}

package UFOLEP_POLYTECH.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import UFOLEP_POLYTECH.Model.Cibles;

import java.util.List;
import java.util.Optional;

@Repository
public interface CiblesRepository extends JpaRepository<Cibles, Long> {

    // Trouver une cible par son code
    Optional<Cibles> findByCode(String code);

    // Trouver toutes les cibles par événement
    List<Cibles> findByIdEvenement(Long idEvenement);
}

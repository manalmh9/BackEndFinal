package com.ufolep.polytech.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ufolep.polytech.model.Clubs;
import org.springframework.stereotype.Repository;


import java.util.List;
import java.util.Optional;

@Repository
public interface ClubsRepository extends JpaRepository<Clubs, Long> {

    // Trouver un club par son nom
    Optional<Clubs> findByNom(String nom);

    List<Clubs> findByDepartement(String departement);
    List<Clubs> findByRegion_Dept(String dept);


}

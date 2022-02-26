package com.PracticeSB.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.PracticeSB.Domain.Videogames;

@Repository
public interface VGRepository extends JpaRepository<Videogames, Integer> {

    @Query("from Videogames v order by v.name")
    List<Videogames> findGames();

    @Query("from Videogames v where v.distributor.id = ?1 order by v.name")
    List<Videogames> findPublisher(int distributor);

    //@Query("from Videogames v where v.name like %?1%")
    List<Videogames> findByNameContaining(String search);
}
    


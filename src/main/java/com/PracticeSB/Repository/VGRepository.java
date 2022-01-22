package com.PracticeSB.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.PracticeSB.Domain.videogames;

@Repository

public interface VGRepository extends JpaRepository<videogames, Integer> {

    @Query("from videogames v order by v.name")
    List<videogames> findGames();

    @Query("from videogames v where v.distribuidor.id = ?1 order by v.name")
    List<videogames> findPublisher(int distribuidor);

    //@Query("from videogames v where v.name like %?1%")
    List<videogames> findByNameContaining(String search);
}
    


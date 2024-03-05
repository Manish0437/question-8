/*
 * You can use the following import statements
 *
 * import org.springframework.data.jpa.repository.JpaRepository;
 * import org.springframework.stereotype.Repository;
 * 
 */

// Write your code here

package com.example.artgallery.repository;

import com.example.artgallery.model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public interface ArtistJpaRepository extends JpaRepository<Artist, Integer> {
    List<Artist> findByGallery(Gallery gallery);
}
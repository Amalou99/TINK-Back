package com.tink.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.tink.demo.entities.Profils;

public interface ProfilsRepository extends JpaRepository<Profils, Long> {
	
	Profils findByType(String type);
	Profils findByTypeContains(String type);
	
	//?1 ---> first parametre in function 
	//?2 ---> Second parametre in the function
	@Query("select p from Profils p where p.type like %?1 and p.description like %?2")
	List<Profils> findBTypeDescription (String type, String description);
	
	@Query("select p from Profils p where p.type like %:type and p.description like %:description")
	List<Profils> findBTypeDescriptionV2 (@Param("type") String type,@Param("description") String description);
	
	List<Profils> findByOrderByTypeAsc();
	
	@Query("select p from Profils p order by p.type ASC, p.description DESC")
	List<Profils> trierProfilsTypeDescription ();

}

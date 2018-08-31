package com.liobouchan.BuildingSpringBootMavenNeo4J.Repositories;

import java.util.Collection;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;

import com.liobouchan.BuildingSpringBootMavenNeo4J.Domain.Movie;

public interface MovieRepository extends Neo4jRepository<Movie,Long>{
	
	Movie findByTitle(@Param("title") String title);
	
	Collection<Movie> findByTitleLike(@Param("title") String title);
	
	@Query("MATCH (movie:Movie)<-[relation:ACTED_IN]-(actor:Person) RETURN movie,relation,actor LIMIT {limit}")
	Collection<Movie> graph(@Param("limit") int limit);
	
}

package com.liobouchan.BuildingSpringBootMavenNeo4J.Repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.liobouchan.BuildingSpringBootMavenNeo4J.Domain.Person;

public interface PersonRepository extends Neo4jRepository<Person, Long> {

	Person findByName(String name);
	
}
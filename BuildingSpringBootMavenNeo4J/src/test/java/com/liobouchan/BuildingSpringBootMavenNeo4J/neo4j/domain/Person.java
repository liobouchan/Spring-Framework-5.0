package com.liobouchan.BuildingSpringBootMavenNeo4J.neo4j.domain;

import java.util.ArrayList;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
public class Person {
	@Id  @GeneratedValue private long id;
	private String name;
	private int born;
	
	@Relationship(type = "ACTED_IN")
	private List<Movie> movies = new ArrayList<>();

	
	public Person(long id, String name, int born) {
		this.name = name;
		this.born = born;
	}

	public Person() {
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getBorn() {
		return born;
	}

	public List<Movie> getMovies() {
		return movies;
	}
	
	
}

package com.gamingroom;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * A simple class to hold information about a game
 * 
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a game is
 * created.
 * </p>
 * 
 * @author coce@snhu.edu
 *
 */
public class Game extends Entity {
	
	private static List<Team> teams = new ArrayList<Team>();

	

	
	/**
	 * Constructor with an identifier and name
	 */
	public Game(long id, String name) {
		super(id, name);
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		
		return name;
	}

	@Override
	public String toString() {
		
		return "Game [id=" + id + ", name=" + name + "]";
	}
	
	public Team addTeam(String name) {
		Team team = null;
		
		Iterator<Team>iterator = teams.iterator();
		while (iterator.hasNext()) {
			Team teamInstance = iterator.next();
			if (teamInstance.getName().equals(name)) {
				team = teamInstance;
				break;
			}
			else {
				teams.add(team);
			}
		}
		return team;
	}
}
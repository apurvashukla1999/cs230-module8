package com.gamingroom;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
/**
 * A simple class to hold information about a team
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a team is
 * created.o
 * </p>
 * @author coce@snhu.edu
 *
 */
public class Team extends Entity {
	
	private List<Player> players = new ArrayList<Player>();
	/*
	 * Constructor with an identifier and name
	 */
	public Team(long id, String name) {
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
		return "Team [id=" + id + ", name=" + name + "]";
	}
	
	public Player addPlayer(String name) {
		Player player = null;
		
		Iterator<Player> iterator = players.iterator();
		
		while(iterator.hasNext()) {
			Player playerInstance = iterator.next();
			
			if (playerInstance.getName().equals(name)) {
				player = playerInstance;
			}
			else {
				players.add(player);
			}
		}
		return player;
	}
}

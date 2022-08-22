package com.gamingroom;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * A singleton service for the game engine
 * 
 * @author coce@snhu.edu
 */
public class GameService {

	private static GameService obj;

	/**
	 * A list of the active games
	 */
	private static List<Game> games = new ArrayList<Game>();

	/*
	 * Holds the next game identifier
	 */
	private static long nextGameId = 1;
	
	private static long nextPlayerId = 1;
	
	private static long nextTeamId = 1;

	// FIXME: Add missing pieces to turn this class a singleton, done
	private GameService() {} // creating an empty constructor

	public static GameService getInstance() //checks for existing Gameservice instance. If exists, then it makes new and returns instance.
	{
		if (obj == null)
			obj = new GameService();
		return obj;
	}


	/**
	 * Construct a new game instance
	 * 
	 * @param name the unique name of the game
	 * @return the game instance (new or existing)
	 */
	public Game addGame(String name) {

		// a local game instance
		Game game = null;

		// FIXME: Use iterator to look for existing game with same name, done
		// if found, simply return the existing instance
		/*
		The below iterator code creates an iterator by filling the iterator method with Game class objects, then iterating
		the games List defined above, which then proceeds to check if there is a name already given to the instance, and then proceeds to
		stop if the game exists.
		 */
		Iterator<Game> iterator = games.iterator();
		while (iterator.hasNext()) {
			Game next = iterator.next();
			if (next.getName().equals(name)) {
				game = next;
				break;
			}
			return game;
		}



		// if not found, make a new game instance and add to list of games
		if (game == null) {
			game = new Game(nextGameId++, name);
			games.add(game);
		}

		// return the new/existing game instance to the caller
		return game;
	}

	/**
	 * Returns the game instance at the specified index.
	 * <p>
	 * Scope is package/local for testing purposes.
	 * </p>
	 * @param index index position in the list to return
	 * @return requested game instance
	 */
	Game getGame(int index) {
		return games.get(index);
	}
	
	/**
	 * Returns the game instance with the specified id.
	 * 
	 * @param id unique identifier of game to search for
	 * @return requested game instance
	 */
	public Game getGame(long id) {

		// a local game instance
		Game game = null;

		// FIXME: Use iterator to look for existing game with same id, done
		// if found, simply assign that instance to the local variable
		/*
		The below iterator code creates an iterator by filling the iterator method with Game class objects, then iterating
		the games List defined above, which then proceeds to check if there is an ID already given to the instance, and then proceeds to
		stop if the gameID exists.
		 */
		Iterator<Game> iterator = games.iterator();
		while (iterator.hasNext()) {
			Game next = iterator.next();

			if (next.getId() == id) {
				game = next;
				break;
			}
		}

		return game;
	}

	/**
	 * Returns the game instance with the specified name.
	 * 
	 * @param name unique name of game to search for
	 * @return requested game instance
	 */
	public Game getGame(String name) {

		// a local game instance
		Game game = null;

		// FIXME: Use iterator to look for existing game with same name, done
		// if found, simply assign that instance to the local variable
		Iterator<Game> iterator = games.iterator();
		while(iterator.hasNext()) {
			Game next = iterator.next();

			if (next.getName().equals(name)) {
				game = next;
				break;

			}
		}
		return game;
	}

	/**
	 * Returns the number of games currently active
	 * 
	 * @return the number of games currently active
	 */
	public int getGameCount() {
		return games.size();
	}

	public long getNextPlayerId() {
		return nextPlayerId;
	}
	
	public long getNextTeamId() {
		return nextTeamId;
	}
}
	
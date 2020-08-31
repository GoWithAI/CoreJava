package hashCodeEquals;

import java.util.HashMap;
import java.util.Map;

/**
 * hashCode() Contract : 1. internal consistency: the value of hashCode() may
 * only change if a property that is in equals() changes 
 * 2. equals consistency:
 * objects that are equal to each other must return the same hashCode 
 * 3.collisions: unequal objects may have the same hashCode
 **/
public class HashCodeContract {

	public static void main(String[] args) {

		Map<Team, String> leaders = new HashMap<>();

		Team team = new Team("New York", "development");
		Team team2 = new Team("Boston", "development");
		Team team3 = new Team("Boston", "marketing");

		leaders.put(team, "Anne");
		leaders.put(team2, "Brian");
		leaders.put(team3, "Charlie");

		Team myTeam = new Team("New York", "development");

		System.out.println(team);
		System.out.println(team2);
		System.out.println(team3);
		System.out.println(myTeam);

		String myTeamLeader = leaders.get(myTeam);
		System.out.println("Result expected Anne :" + myTeamLeader);

		// We need to : Equal objects return the same hashCode.
		System.out.println("***************************************");
		/**
		 * we want to use instances of the Team class as HashMap keys, we have to
		 * override the hashCode() method
		 */
		Map<Team2, String> leaders2 = new HashMap<>();

		Team2 team4 = new Team2("New York", "development");
		Team2 team5 = new Team2("Boston", "development");
		Team2 team6 = new Team2("Boston", "marketing");

		leaders2.put(team4, "Anne");
		leaders2.put(team5, "Brian");
		leaders2.put(team6, "Charlie");

		Team2 myTeam2 = new Team2("New York", "development");

		System.out.println(team4);
		System.out.println(team5);
		System.out.println(team6);
		System.out.println(myTeam2);

		String myTeamLeader2 = leaders2.get(myTeam2);
		System.out.println("Result expected Anne :" + myTeamLeader2);

	}

}

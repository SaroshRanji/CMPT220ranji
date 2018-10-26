package Package;
import java.util.*;

public class SoccerMatch {
	Date startTime;
	Date endTime;
	String venue;
	String home;
	String visitor;
	Player[] homePlayers = new Player[11];
	Player[] visitorPlayers = new Player[11];
	Goal[] homeGoals = new Goal[10];
	Goal[] visitorGoals = new Goal[10];
	int numHPlayers = 0;
	int numVPlayers = 0;
	
	public SoccerMatch() {
		this.startTime = null;
		this.endTime = null;
		this.venue = null;
		this.home = null;
		this.visitor = null;
		this.homePlayers = null;
		this.visitorPlayers = null;
		this.homeGoals = null;
		this.visitorGoals = null;
		
		
	}
	
	public SoccerMatch(Date startTime, Date endTime, String venue, String home, String visitor, Player[] homePlayers, Player[] visitorPlayers, Goal[] homeGoals, Goal[] visitorGoals) {
		this.startTime = startTime;
		this.endTime = endTime;
		this.venue = venue;
		this.home = home;
		this.visitor = visitor;
		this.homePlayers = homePlayers;
		this.visitorPlayers = visitorPlayers;
		this.homeGoals = homeGoals;
		this.visitorGoals = visitorGoals;
		
	}
	
//	Player p = new Player(name, )
	public static void  addHomePlayer(Player p, Player[] homePlayers, int numHPlayers) {
		homePlayers[numHPlayers].setName(p.getName());
		homePlayers[numHPlayers].setGoals(p.getGoals());
		homePlayers[numHPlayers].setTeam(p.getTeam());
		numHPlayers++;
		
		
	}
	public static void  addVisitorPlayer(Player p, Player[] visitorPlayers, int numVPlayers) {
		visitorPlayers[numVPlayers].setName(p.getName());
		visitorPlayers[numVPlayers].setGoals(p.getGoals());
		visitorPlayers[numVPlayers].setTeam(p.getTeam());
		numVPlayers++;
	

}



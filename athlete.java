import java.util.ArrayList;

public class athlete{

	private String name;
	private ArrayList<game> games;
	
	athlete(String Ename)
	{
		name = Ename;
		games = new ArrayList<game>();
	}
	
	public String getName(){
		return name;
	}
	
	public ArrayList<game> getAllGame(){ //Not sure if I'll need, reaccount for this later :P also just a getter function idk im hungry
		return games;
	}
	
	public game getGame(int i){
		if(i <= -1)
		{
			return null;
		}
		else
		{
			return games.get(i);
		}
	}
	
	public void addGame(game Egame){
			games.add(Egame.getGameNum()-1, Egame); //Done to prevent any problems in game loaded
	}
}

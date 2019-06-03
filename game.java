import java.util.ArrayList;

public class game {
	
	private int gameNum = 0;
	private ArrayList<symptom> symptoms; 
	private int prevGameIndex;

	
	game(int EgameNum){
		gameNum = EgameNum;
		symptoms = new ArrayList<symptom>();
	}
	
	
	public int getTotalSeverityScore(){
		int severityScore = 0;
		for (int i = 0; i < symptoms.size(); i++)
		{
			severityScore += symptoms.get(i).getSympSeverityScore();
		}
		return severityScore;
	}
	
	public void setPrevGame(int EprevGameIndex)
	{
		prevGameIndex = EprevGameIndex;
	}
	
	public int getPrevIndex()
	{
		return prevGameIndex;
	}
	
	public int getGameNum()
	{
		return gameNum;
	}
	
	public ArrayList<symptom> getSymptomList()
	{
		return symptoms;
	}
	
	
	public void addSymptom(String name, int severity)
	{
		symptom nSymptom = new symptom(name, severity);
		symptoms.add(nSymptom);
		return;
	}
	
	public int getOverallRating(game currentGame, game prevGame) 
	{
		if (prevGame == null)
		{
			return 3;
		}
		int currentGameScore = currentGame.getTotalSeverityScore();
		int prevGameScore = prevGame.getTotalSeverityScore();
		int difference = currentGameScore - prevGameScore;
		/*
		System.out.println("Debug Difference: " + difference);
		System.out.println("Debug Prev game score: " + prevGameScore);
		*/
		if (difference < 3 && currentGame.getTotalSeverityScore() < 10)
		{
			return 0; //No difference
		}
		else if (difference < 3 && currentGame.getTotalSeverityScore() >= 10 && currentGame.getTotalSeverityScore() <= 15)
		{
			return 1; //Unsure
		}
		else if (difference >= 3 || currentGame.getTotalSeverityScore() >= 15)
		{
			return 2; //Very different
		}
		else
		{
			return 3; //No previous game
		}
	}
}


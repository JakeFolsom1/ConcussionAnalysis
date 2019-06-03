
public class symptom {
	private String name;
	private int severityScore;
	
	symptom(String Ename, int score){
		name = Ename;
		severityScore = score;
	}
	
	public int getSympSeverityScore()
	{
		return severityScore;
	}
	
	public String getSympName()
	{
		return name;
	}
	
}

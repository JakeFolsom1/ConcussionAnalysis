import java.util.Scanner;
import java.util.ArrayList;



public class main {
	public static final String ANSI_RED = "\u001B[31m"; //Testing red text in console.
	public static final String ANSI_RESET = "\u001B[0m"; //used for console colors
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";


	public static void main(String [] args) {
		boolean finalLoop = true;
		ArrayList<athlete> players = new ArrayList<athlete>(); 
		athlete currentPlayer;
		boolean newGameReset = true;
		int userIdentity = 0;
		Scanner scan = new Scanner(System.in);

		while(finalLoop){
			System.out.println("Enter 1 if you are a player, enter 2 if you are a Sports Medical Practitioner, enter anything else to exit the program");
			userIdentity = scan.nextInt();
			switch(userIdentity){
			case 1:
				boolean userExit = false;
				String pName;
				System.out.println("Please enter a name: ");
				scan.nextLine(); //Cleaning out scanner for next input
				pName = scan.nextLine();
				currentPlayer = new athlete(pName);
				int gameNum = 1;
				game currentGame = new game(gameNum);
				currentGame.setPrevGame(-1);
				while(!userExit)
				{
					int uChoice = 0;
					System.out.println("Welcome to Sport Concussion Assessment System " + currentPlayer.getName() + " ");
					System.out.println("Please enter one of the following options");
					System.out.println("1.Enter Symptoms");
					System.out.println("2.Display Symptoms Summary");
					System.out.println("3.Am I at risk?");
					System.out.println("4.Add new game");
					System.out.println("5.Exit");
					uChoice = scan.nextInt();
					switch (uChoice)
					{
					case 1:
						if(!newGameReset)
						{
							System.out.println("You have already entered your symptoms and severity for this game");
							System.out.println("press 4 on the next menu to enter a new game\n");
							break;
						}
						int score;
						System.out.println("Please enter your headache score (none (0), mild (1-2), moderate (3-4), & severe (5-6):");
						score = scan.nextInt();
						currentGame.addSymptom("Headache", score);					

						System.out.println("Please enter your Pressure in head score (none (0), mild (1-2), moderate (3-4), & severe (5-6):");
						score = scan.nextInt();
						currentGame.addSymptom("Pressure in Head", score);		

						System.out.println("Please enter your Neck Pain score (none (0), mild (1-2), moderate (3-4), & severe (5-6):");
						score = scan.nextInt();
						currentGame.addSymptom("Neck Pain", score);		

						System.out.println("Please enter your Nausea or vomiting score (none (0), mild (1-2), moderate (3-4), & severe (5-6):");
						score = scan.nextInt();
						currentGame.addSymptom("Nausea or Vomiting", score);		

						System.out.println("Please enter your Dizziness score (none (0), mild (1-2), moderate (3-4), & severe (5-6):");
						score = scan.nextInt();
						currentGame.addSymptom("Dizziness", score);		

						System.out.println("Please enter your Blurred Vision score (none (0), mild (1-2), moderate (3-4), & severe (5-6):");
						score = scan.nextInt();
						currentGame.addSymptom("Blurred Vision", score);		

						System.out.println("Please enter your Balance problems score (none (0), mild (1-2), moderate (3-4), & severe (5-6):");
						score = scan.nextInt();
						currentGame.addSymptom("Balance problems", score);		

						System.out.println("Please enter your Sensitivity to Light score (none (0), mild (1-2), moderate (3-4), & severe (5-6):");
						score = scan.nextInt();
						currentGame.addSymptom("Sensitivity to Light", score);		

						System.out.println("Please enter your Sensitivity to Noise score (none (0), mild (1-2), moderate (3-4), & severe (5-6):");
						score = scan.nextInt();
						currentGame.addSymptom("Sensitivity to Noise", score);		

						System.out.println("Please enter your Feeling slowed down score (none (0), mild (1-2), moderate (3-4), & severe (5-6):");
						score = scan.nextInt();
						currentGame.addSymptom("Feeling slowed down", score);		

						System.out.println("Please enter your Feeling like in a fog score (none (0), mild (1-2), moderate (3-4), & severe (5-6):");
						score = scan.nextInt();
						currentGame.addSymptom("Feeling like in a fog", score);

						System.out.println("Please enter your Dont feel right score (none (0), mild (1-2), moderate (3-4), & severe (5-6):");
						score = scan.nextInt();
						currentGame.addSymptom("Dont feel right", score);

						System.out.println("Please enter your Difficulty Concentrating score (none (0), mild (1-2), moderate (3-4), & severe (5-6):");
						score = scan.nextInt();
						currentGame.addSymptom("Difficulty concentrating", score);

						System.out.println("Please enter your Difficulty remembering score (none (0), mild (1-2), moderate (3-4), & severe (5-6):");
						score = scan.nextInt();
						currentGame.addSymptom("Difficulty Remembering", score);

						System.out.println("Please enter your Fatigue or low energy score (none (0), mild (1-2), moderate (3-4), & severe (5-6):");
						score = scan.nextInt();
						currentGame.addSymptom("Fatigue or low energy", score);

						System.out.println("Please enter your Confusion score (none (0), mild (1-2), moderate (3-4), & severe (5-6):");
						score = scan.nextInt();
						currentGame.addSymptom("Confusion", score);

						System.out.println("Please enter your Drowsiness score (none (0), mild (1-2), moderate (3-4), & severe (5-6):");
						score = scan.nextInt();
						currentGame.addSymptom("Drowsiness", score);

						System.out.println("Please enter your Trouble falling asleep score (none (0), mild (1-2), moderate (3-4), & severe (5-6):");
						score = scan.nextInt();
						currentGame.addSymptom("Trouble falling asleep", score);

						System.out.println("Please enter your More emotional score (none (0), mild (1-2), moderate (3-4), & severe (5-6):");
						score = scan.nextInt();
						currentGame.addSymptom("More emotional", score);

						System.out.println("Please enter your Irritability score (none (0), mild (1-2), moderate (3-4), & severe (5-6):");
						score = scan.nextInt();
						currentGame.addSymptom("Irritability", score);

						System.out.println("Please enter your Sadness score (none (0), mild (1-2), moderate (3-4), & severe (5-6):");
						score = scan.nextInt();
						currentGame.addSymptom("Sadness", score);

						System.out.println("Please enter your Nervous or anxious score (none (0), mild (1-2), moderate (3-4), & severe (5-6):");
						score = scan.nextInt();
						currentGame.addSymptom("Nervous or anxious", score);

						System.out.println("Finished! Taking you back to the main menu, press 2 to view results");
						currentPlayer.addGame(currentGame);	
						newGameReset = false;
						break;

					case 2:
						if (currentPlayer.getAllGame().size() < 1)
						{
							System.out.println("No games to display\n");
						}
						else 
						{
							for(int i=0; i < currentPlayer.getAllGame().size(); i++)
							{
								System.out.println("\n================================================================================");
								game g1 = currentPlayer.getGame(i);
								System.out.println("Game number: " + g1.getGameNum());
								System.out.println("================================================================================");
								for(int j = 0; j < g1.getSymptomList().size(); j++)
								{
									symptom s = g1.getSymptomList().get(j);
									System.out.println("Sympton #" + (j+1) + ": " + s.getSympName() + " Score: " + s.getSympSeverityScore()); //J + 1 so we don't start at 0
								}
								System.out.println("Symptom severity score: " + g1.getTotalSeverityScore());
								System.out.print("Overall Rating: ");
								int overallRatingCode = g1.getOverallRating(g1,currentPlayer.getGame(g1.getPrevIndex()));
								if (overallRatingCode == 0)
								{
									System.out.print("No difference\n\n");	
								}
								else if (overallRatingCode == 1)
								{
									System.out.print("Unsure\n\n");
								}
								else if (overallRatingCode == 2)
								{
									System.out.print("Very different\n\n");
								}
								else if (overallRatingCode == 3)
								{
									System.out.print("No previous game to give overall rating from\n\n");
								}
							}
						}
						break;
					case 3:
						int overallRatingCode = currentGame.getOverallRating(currentGame,currentPlayer.getGame(currentGame.getPrevIndex()));
						if (overallRatingCode == 0)
						{
							System.out.println(ANSI_GREEN + "No difference: Minimal difference inbetween the last 2 games\n\n" + ANSI_RESET); 
						}
						else if (overallRatingCode == 1)
						{
							System.out.println(ANSI_YELLOW + "Unsure: You might be fine" + "\n\n" + ANSI_RESET); //WONT WORK IN ANY IDE
						}
						else if (overallRatingCode == 2)
						{
							System.out.println(ANSI_RED + "Very Different: Consult a medical professional you may have a concussion." + "\n\n" + ANSI_RESET);
						}
						else if (overallRatingCode == 3)
						{
							System.out.println("Not enough games to provide a rating\n\n");
						}
						break;
					case 4:
						//currentPlayer.getAllGame().add(currentGame); Done when adding new details which makes sense
						if(currentPlayer.getAllGame().size() >= 5)
						{
							gameNum = 0;
						}
						gameNum++;
						game newGame = new game(gameNum);
						int index = currentGame.getGameNum()-1;
						newGame.setPrevGame(index);
						currentGame = newGame;
						newGameReset = true;
						System.out.println("New game has been added! Please enter symptoms after the game by typing 1\n");
						break;
					case 5:
						userExit = true;
						players.add(currentPlayer);
						break;
					default:
						System.out.println("Incorrect selection, please enter a number from 1-5");
						break;
					}
				}

				break;
			case 2:
				boolean MedPracDone = false;
				while(!MedPracDone)
				{
					System.out.println("Welcome Sports Medical Practicioner to the control panel");
					System.out.println("Please enter one of the following options");
					System.out.println("1.Look at player's previous health summarys");
					System.out.println("2.Look at player's risky condition indicator");
					System.out.println("3.Exit");
					int userChoice = scan.nextInt();
					switch(userChoice)
					{
					case 1:
						for(int i = 0; i < players.size(); i++)
						{
							athlete ath = players.get(i);
							System.out.println("\n=================================================================");
							System.out.println("Player name: " + ath.getName());
							for(int j = 0; j < ath.getAllGame().size(); j++)
							{
								game g1 = ath.getAllGame().get(j);
								System.out.println("Game number: " + g1.getGameNum());
								for(int k = 0; k < g1.getSymptomList().size(); k++)
								{
									symptom s = g1.getSymptomList().get(k);
									System.out.println("Sympton #" + (j+1) + ": " + s.getSympName() + " Score: " + s.getSympSeverityScore()); //J + 1 so we don't start at 0
								}
								System.out.println("Symptom severity score: " + g1.getTotalSeverityScore());
								System.out.print("Overall Rating: ");
								int overallRatingCode = g1.getOverallRating(g1,ath.getGame(g1.getPrevIndex()));
								if (overallRatingCode == 0)
								{
									System.out.print("No difference\n\n");	
								}
								else if (overallRatingCode == 1)
								{
									System.out.print("Unsure\n\n");
								}
								else if (overallRatingCode == 2)
								{
									System.out.print("Very different\n\n");
								}
								else if (overallRatingCode == 3)
								{
									System.out.print("No previous game to give overall rating from\n\n");
								}
							}
						}
						break;
					case 2:
						for (int i = 0; i < players.size(); i++)
						{
							athlete ath = players.get(i);
							System.out.println("Player name: " + ath.getName());
							for(int j = 0; j < ath.getAllGame().size(); j++)
							{
								game g1 = ath.getAllGame().get(j);
								System.out.println("Game Number: " + g1.getGameNum());
								int overallRatingCode = g1.getOverallRating(g1,ath.getGame(g1.getPrevIndex()));
								if (overallRatingCode == 0)
								{
									System.out.println(ANSI_GREEN + "No difference: Minimal difference inbetween the last 2 games\n\n" + ANSI_RESET); 
								}
								else if (overallRatingCode == 1)
								{
									System.out.println(ANSI_YELLOW + "Unsure: You might be fine" + "\n\n" + ANSI_RESET); //WONT WORK IN ANY IDE
								}
								else if (overallRatingCode == 2)
								{
									System.out.println(ANSI_RED + "Very Different: Consult a medical professional you may have a concussion." + "\n\n" + ANSI_RESET);
								}
								else if (overallRatingCode == 3)
								{
									System.out.println("Not enough games to provide a rating\n\n");
								}
							}
						}
						break;
					case 3: 
						MedPracDone = true;
						break;
					default:
						System.out.println("Incorrect Selection, Please enter a number from 1-3");
						break;
					}
				}
			default:
				finalLoop = false;
				break;
			} //End Switch
		} //End while
		scan.close();

	}
}
/**
 * Program: NFLPlayer File: NFLPlayer.java Summary: Programs creates a NFL
 * Player class and Driver method to test the class Author: Jason E. Borum Date:
 * December 17, 2017
 **/

public class NFLPlayer { // Begin NFL Player Class
	// Declaring NFL Player Instance Variables
	private String playerNameFirst; // Player First Name
	private String playerNameLast; // Player Last Name
	private String playerNameFull; // Player Full Name
	private String playerCollege; // Player College
	private String playerPosition; // Player position
	private Double playerHeight; // Player height in inches
	private Double playerWeight; // Player weight in pounds
	private String playerBirthDate; // Player Birthday
	private int playerAge; // Player age in years
	private double playerBodyMassIndex; // Player BMI number
	private double player40yardDash; // Player 40 yrd dash in seconds
	private double playerVerticalJump; // Player vertical jump height in inches

	// NFL Player Constructor with Arguments
	public NFLPlayer(String cplayerNameFirst, String cplayerNameLast, String cplayerCollege, String cplayerPosition,
			double cplayerHeight, double cplayerWeight, String cplayerBirthDate, int cplayerAge,
			double cplayer40yardDash, double cplayerVerticalJump) {
		playerNameFirst = cplayerNameFirst; // Player First Name
		playerNameLast = cplayerNameLast; // Player Last Name

		playerNameFull = cplayerNameFirst + " " + cplayerNameLast; // Combine players first name and last name
		playerCollege = cplayerCollege; // Player College
		playerPosition = cplayerPosition;// Player position
		playerHeight = cplayerHeight;// Player height in inches
		playerWeight = cplayerWeight;// Player weight in pounds
		playerBirthDate = cplayerBirthDate;// Player Birthday
		playerAge = cplayerAge;// Player age in years

		playerBodyMassIndex = 703 * (cplayerWeight / (cplayerHeight * cplayerHeight)); // Calculate players body mas
																						// index
		player40yardDash = cplayer40yardDash; // Player 40 yrd dash in seconds
		playerVerticalJump = cplayerVerticalJump; // Player vertical jump height in inches
	} // End of NFLPlayer Constructor

	// NFL Player Constructor without Arguments
	public NFLPlayer() {
		playerNameFirst = "Mitchell";
		playerNameLast = "Trubisky";
		playerNameFull = playerNameFirst + " " + playerNameLast;
		playerCollege = "North Carolina";
		playerPosition = "QB";
		playerHeight = 74.0;
		playerWeight = 222.0;
		playerBirthDate = "08/20/94";
		playerAge = 23;
		playerBodyMassIndex = (int) ((703 * (playerWeight / (playerHeight * playerHeight))) * 100) / 100.0;
		player40yardDash = 4.67;
		playerVerticalJump = 27.5;
	}// End of NFLPlayer Constructor

	// Create Setters and Getters for NFL Player Attributes
	public String getPlayerNameFirst() {
		return playerNameFirst;
	} // End of getPlayerNameFirst method

	public void setPlayerNameFirst(String playerNameFirst) {
		this.playerNameFirst = playerNameFirst;
	} // End of setPlayerNameFirst method

	public String getPlayerNameLast() {
		return playerNameLast;
	} // End of getPlayerNameLast method

	public void setPlayerNameLast(String playerNameLast) {
		this.playerNameLast = playerNameLast;
	} // End of setPlayerNameLast method

	public String getPlayerNameFull() {
		playerNameFull = playerNameFirst + " " + playerNameLast;
		return playerNameFull;
	} // End of getPlayerNameFull method

	public void setPlayerNameFull(String playerNameFull) {
		this.playerNameFull = playerNameFull;
	} // End of setPlayerNameFull method

	public String getPlayerCollege() {
		return playerCollege;
	} // End of getPlayerCollege method

	public void setPlayerCollege(String playerCollege) {
		this.playerCollege = playerCollege;
	} // End of setPlayerCollege method

	public String getPlayerPosition() {
		return playerPosition;
	} // End of getPlayerPosition method

	public void setPlayerPosition(String playerPosition) {
		this.playerPosition = playerPosition;
	} // End of setPlayerPosition method

	public Double getPlayerHeight() {
		return playerHeight;
	} // End of getPlayerHeight method

	public void setPlayerHeight(Double playerHeight) {
		this.playerHeight = playerHeight;
	} // End of setPlayerHeight method

	public Double getPlayerWeight() {
		return playerWeight;
	} // End of getPlayerWeight method

	public void setPlayerWeight(Double playerWeight) {
		this.playerWeight = playerWeight;
	} // End of setPlayerWeight method

	public String getPlayerBirthDate() {
		return playerBirthDate;
	} // End of getPlayerBirthDate method

	public void setPlayerBirthDate(String playerBirthDate) {
		this.playerBirthDate = playerBirthDate;
	} // End of setPlayerBirthDate method

	public int getPlayerAge() {
		return playerAge;
	} // End of getPlayerAge method

	public void setPlayerAge(int playerAge) {
		this.playerAge = playerAge;
	} // End of setPlayerAge method

	public double getPlayerBodyMassIndex() {
		playerBodyMassIndex = (int) ((703 * (playerWeight / (playerHeight * playerHeight))) * 100) / 100.0;
		return playerBodyMassIndex;
	} // End of getPlayerBodyMassIndex method

	public void setPlayerBodyMassIndex(double playerBodyMassIndex) {
		this.playerBodyMassIndex = playerBodyMassIndex;
	} // End of setPlayerBodyMassIndex method

	public double getPlayer40yardDash() {
		return player40yardDash;
	} // End of getPlayer40yardDash method

	public void setPlayer40yardDash(double player40yardDash) {
		this.player40yardDash = player40yardDash;
	} // End of setPlayer40yardDash method

	public double getPlayerVerticalJump() {
		return playerVerticalJump;
	} // End of getPlayerVerticalJump method

	public void setPlayerVerticalJump(double playerVerticalJump) {
		this.playerVerticalJump = playerVerticalJump;
	} // End of setPlayerVerticalJump method

	// To String Method Returning NFL Players
	@Override
	public String toString() {
		return "NFLPlayer [playerNameFirst=" + playerNameFirst + ", playerNameLast=" + playerNameLast
				+ ", playerNameFull=" + playerNameFull + ", playerCollege=" + playerCollege + ", playerPosition="
				+ playerPosition + ", playerHeight=" + playerHeight + ", playerWeight=" + playerWeight
				+ ", playerBirthDate=" + playerBirthDate + ", playerAge=" + playerAge + ", playerBodyMassIndex="
				+ playerBodyMassIndex + ", player40yardDash=" + player40yardDash + ", playerVerticalJump="
				+ playerVerticalJump + "]";
	} // End of toString Method

	public static void Driver() {
		// Declare player1 object without arguments
		NFLPlayer player1 = new NFLPlayer();

		// Declare player2 object with arguments
		NFLPlayer player2 = new NFLPlayer("Colin", "Kaepernick", "Nevada", "QB", 76, 230, "11/3/1987", 30, 4.18, 32.5);

		// Print player1 variables
		System.out.println("Test Constructor No Arguments - Player1");
		System.out.println("-------------------------------------------------");
		System.out.println("Player Name: " + player1.getPlayerNameFull());
		System.out.println("Player College: " + player1.getPlayerCollege());
		System.out.println("Player Position: " + player1.getPlayerPosition());
		System.out.println("Player Height: " + player1.getPlayerHeight());
		System.out.println("Player Weight: " + player1.getPlayerWeight());
		System.out.println("Player BMI: " + player1.getPlayerBodyMassIndex());
		System.out.println();

		// Print player2 variables
		System.out.println("Test Constructor With Arguments - Player2");
		System.out.println("-------------------------------------------------");
		System.out.println("Player Name: " + player2.getPlayerNameFull());
		System.out.println("Player College: " + player2.getPlayerCollege());
		System.out.println("Player Position: " + player2.getPlayerPosition());
		System.out.println("Player Height: " + player2.getPlayerHeight());
		System.out.println("Player Weight: " + player2.getPlayerWeight());
		System.out.println("Player BMI: " + player2.getPlayerBodyMassIndex());
		System.out.println();

		// Testing Setter Methods on player2 object
		player2.setPlayerNameFirst("Cam");
		player2.setPlayerNameLast("Newton");
		player2.setPlayerCollege("Auburn");
		player2.setPlayerHeight(77.0);
		player2.setPlayerWeight(245.0);

		// Print player2 variables
		System.out.println("Testing Setter Methods - Player2 Revised");
		System.out.println("-------------------------------------------------");
		System.out.println("Player Name: " + player2.getPlayerNameFull());
		System.out.println("Player College: " + player2.getPlayerCollege());
		System.out.println("Player Position: " + player2.getPlayerPosition());
		System.out.println("Player Height: " + player2.getPlayerHeight());
		System.out.println("Player Weight: " + player2.getPlayerWeight());
		System.out.println("Player BMI: " + player2.getPlayerBodyMassIndex());
		System.out.println();

	} // End of Driver Method

	public static void main(String[] args) { // Beginning of main
		// Initialize driver method
		Driver();
	} // End of main

} // End of NFL Player Class

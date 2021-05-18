
public class PlayerTurn {
	private boolean switchToPlayer1;
	
	PlayerTurn() {
		switchToPlayer1 = true;
	}
	public void switchTurn() {
		switchToPlayer1 = !switchToPlayer1;
	}
	public boolean getTurn() {
		return switchToPlayer1;
	}
}

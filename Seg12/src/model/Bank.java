package model;

public class Bank {

	private TurnList turnList;
	
	public Bank() {
		turnList=new TurnList();
	}
	
	public void giveTurn() {
		turnList.add();
	}
	
	public String showTurn() {
		if(turnList.getActual()!=null) {
			return ""+turnList.getActual().getValue();			
		}
		else {
			return"";
		}
	}
	
	public void passTurn() {
		turnList.passTurn();
	}
	
	public void deleteTurn() {
		turnList.deleteTurn();
	}
	
	public String showList() {
		return turnList.toString();
	}
}

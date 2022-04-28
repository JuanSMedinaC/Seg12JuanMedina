package model;

public class TurnList {
	private Turn first;
	private Turn actual;
	private int lastAdded;
	private int amount;
	
	public TurnList() {
		// TODO Auto-generated constructor stub
	}
	
	public Turn getActual() {
		return actual;
	}
	
	public void setActual(Turn actual) {
		this.actual = actual;
	}
	
	public int getLastAdded() {
		return lastAdded;
	}
	
	public void setLastAdded(int lastAdded) {
		this.lastAdded = lastAdded;
	}
	
	public Turn getFirst() {
		return first;
	}

	public void setFirst(Turn first) {
		this.first = first;
	}

	public int getAmount() {
		return lastAdded;
	}

	public void setAmount(int amount) {
		this.lastAdded = amount;
	}

	public void add() {
		Turn newNode = new Turn(lastAdded+1);
		
		if (first == null) { // Lista vacia
			first = newNode;
			first.setNext(first);
			first.setPrev(first);
			actual=first;
		} else {
			Turn last=first.getPrev();
			last.setNext(newNode);
			newNode.setPrev(last);
			first.setPrev(newNode);
			newNode.setNext(first);
			
		}
		lastAdded++;
		amount++;
	}

	public boolean delete(int value) {
		boolean deleted = false;

		Turn temp = first;
		if(first!=null) {
			do {
				if (temp.getValue() == value) {
					if (temp == first && temp == first.getPrev()) {
						first = null;
						actual=null;
					} else if (temp == first) {
						Turn last=first.getPrev();
						first = first.getNext();
						first.setPrev(last);
					} else {
						temp.getPrev().setNext(temp.getNext());
						temp.getNext().setPrev(temp.getPrev());
					}
					deleted = true;
				} else {
					temp = temp.getNext();
				}
				if(deleted==true) {
					break;
				}
			}while(first!=null&&temp!=first.getPrev());
			if(deleted==true) {
				amount--;
			}
		}
		return deleted;
	}
	
	public void passTurn() {
		actual.setPassed(actual.getPassed()+1);
		Turn temp=actual;
		actual=actual.getNext();
		if (temp.isErasable()) {
			delete(temp.getValue());
		}
	}
	
	public void deleteTurn() {
		Turn temp=actual;
		if(actual!=actual.getNext()) {
			actual=actual.getNext();	
		}else {
			actual=null;
		}
		
		delete(temp.getValue());
	}
	
	public String toString() {
		Turn temp=null;
		temp=first;
		String message=""+temp.getValue();
		while(temp.getNext()!=first) {
			temp=temp.getNext();
			message+=", "+temp.getValue();
		}
		return message;
	}
	
	



	
}

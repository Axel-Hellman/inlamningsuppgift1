package model;

import java.util.HashMap;
import java.util.Observable;

import expr.Environment;

public class Sheet extends Observable implements Environment, Cell {

	private HashMap<String,Cell> sheet;
	
	public Sheet(){
		this.sheet = new HashMap<String,Cell>();
	}
	
	public String getComment(){
		return null;
	}
	
	public String toString(Environment e){
		return null;
	}


	@Override
	public double value(Environment env) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double value(String name) {
		// TODO Auto-generated method stub
		return 0;
	}

}
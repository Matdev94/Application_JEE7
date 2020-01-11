package dao;

import java.util.ArrayList;

public interface DAO <T> {
	
	public static  boolean inserer (Object T) {
		return false;
	}


	public  T trouver(Object critere);
	

public ArrayList<T> selectionner(Object critere);
}
package ejb;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class CalculBons
 */
@Stateless
@LocalBean
public class CalculBons {

	private int nbbons;
    /**
     * Default constructor. 
     */
    public CalculBons() {
        // TODO Auto-generated constructor stub
    }
    public void calculerBons(int bons){
    	nbbons = bons + nbbons ;
    	if (nbbons >20)
    	nbbons = 20;
    	}
    	public void genererBons(int code){
    	int n = Math.round((float)(code * Math.random()));
    	nbbons = n/2 ;
    	}
    	public int getNbbons() {

    	return nbbons;
    	}
}

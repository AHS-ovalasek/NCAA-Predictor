/**
 * Owen Valasek
 * Team Class
 * 2/21/19
 */
import java.util.Scanner;
import java.util.ArrayList;
public class Team {
    String name; 
    int pR;
    
    public Team(String n, int p){  //n = name, p = power ranking
        name = n;
        pR = p;
    }
    
    
    public int getPowerRanking(){
        return pR;
    }
    
    public String getName(){
        return name;
    }
}

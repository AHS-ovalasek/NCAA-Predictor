/**
 * Owen Valasek
 * Project - NCAA Basketball Tournament Predictor
 * Programming III - AP CS
 * 2/21/19
 */
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
public class Predictor {

    public static void main(String[] args) {
        int name;
        int count = 0;
        
        Scanner keyboard = new Scanner(System.in);
        ArrayList<Team> south_round1 = new ArrayList<>();
        ArrayList<Team> west_round1 = new ArrayList<>();
        ArrayList<Team> midwest_round1 = new ArrayList<>();
        ArrayList<Team> east_round1 = new ArrayList<>();
        
        //Add all teams to the south round 1 of the team class
        south_round1.add(new Team("Virginia - 1", 9));
        south_round1.add(new Team("Bucknell - 16", 2));
        south_round1.add(new Team("TCU - 8", 6));
        south_round1.add(new Team("Wofford - 9", 5));
        south_round1.add(new Team("Nevada - 5", 7));
        south_round1.add(new Team("Belmont - 12", 4));
        south_round1.add(new Team("Purdue - 4", 7));
        south_round1.add(new Team("Vermont - 13", 4));
        south_round1.add(new Team("Cincinatti - 6", 6));
        south_round1.add(new Team("NC State - 11", 5));
        south_round1.add(new Team("Texas Tech - 3", 8));
        south_round1.add(new Team("Texas St. - 14", 5));
        south_round1.add(new Team("Buffalo - 7", 5));
        south_round1.add(new Team("Minnesota - 10", 4));
        south_round1.add(new Team("Tennessee - 2", 9));
        south_round1.add(new Team("Loyola-Chi. - 15", 3));
        
        //get south_round2
        
        ArrayList<Team> south_round2 = new ArrayList<>();
        
        for(int x = 0; x < south_round1.size(); x+=2){
           south_round2.add(checkWinner(south_round1.get(x), 
                   south_round1.get(x+1)));
        }
        
        //get south_round3
        
        ArrayList<Team> south_round3 = new ArrayList<>();
        
        for(int x = 0; x < south_round2.size(); x+=2){
            south_round3.add(checkWinner(south_round2.get(x),
                    south_round2.get(x+1)));
        }
        
        //get south_round4
        
        ArrayList<Team> south_round4 = new ArrayList<>();
        
        for(int x = 0; x < south_round3.size(); x+=2){
            south_round4.add(checkWinner(south_round3.get(x), 
                    south_round3.get(x+1)));
        }
        
        //get south_round5
        
        ArrayList<Team> south_round5 = new ArrayList<>();
        
        for(int x = 0; x < south_round4.size(); x+=2){
            south_round5.add(checkWinner(south_round4.get(x), 
                    south_round4.get(x+1)));
        }
        
        //Add all teams to the west round 1 of the team class
        west_round1.add(new Team("Gonzaga - 1", 9));
        west_round1.add(new Team("Sam Houston - 16", 2));
        west_round1.add(new Team("Louisville - 8", 5));
        west_round1.add(new Team("Oklahoma - 9", 6));
        west_round1.add(new Team("Iowa - 5", 7));
        west_round1.add(new Team("Lipscomb - 12", 4));
        west_round1.add(new Team("Florida St. - 4", 8));
        west_round1.add(new Team("Yale - 13", 5));
        west_round1.add(new Team("Iowa St. - 6", 6));
        west_round1.add(new Team("Arizona St. - 11", 5));
        west_round1.add(new Team("Marquette - 3", 8));
        west_round1.add(new Team("Old Dominion - 14", 3));
        west_round1.add(new Team("Villanova - 7", 6));
        west_round1.add(new Team("Auburn - 10", 4));
        west_round1.add(new Team("Michigan St. - 2", 8));
        west_round1.add(new Team("S. Dak. St. - 15", 3));
        
        //get west_round2
        
        ArrayList<Team> west_round2 = new ArrayList<>();
        
        for(int x = 0; x < west_round1.size(); x+= 2){
            west_round2.add(checkWinner(west_round1.get(x), 
                    west_round1.get(x+1)));
        }
        
        //get west_round3
        
        ArrayList<Team> west_round3 = new ArrayList<>();
        
        for(int x = 0; x < west_round2.size(); x+=2){
            west_round3.add(checkWinner(west_round2.get(x), 
                    west_round2.get(x+1)));
        }
        
        //get west_round4
        
        ArrayList<Team> west_round4 = new ArrayList<>();
        
        for(int x = 0; x < west_round3.size(); x+=2){
            west_round4.add(checkWinner(west_round3.get(x), 
                    west_round3.get(x+1)));
        }
        
        //get west_round5
        
        ArrayList<Team> west_round5 = new ArrayList<>();
        
        for(int x = 0; x < west_round4.size(); x+=2){
            west_round5.add(checkWinner(west_round4.get(x), 
                    west_round4.get(x+1)));
        }
        
        //Add all teams to the midwest round 1 of the team class
        midwest_round1.add(new Team("Kentucky - 1", 9));
        midwest_round1.add(new Team("Prairie View - 16", 2));
        midwest_round1.add(new Team("St. John's - 8", 5));
        midwest_round1.add(new Team("Syracuse - 9", 5));
        midwest_round1.add(new Team("Wisconsin - 5", 6));
        midwest_round1.add(new Team("Seton Hall - 12", 5));
        midwest_round1.add(new Team("Kansas St. - 4", 7));
        midwest_round1.add(new Team("N. Mex. St. - 13", 4));
        midwest_round1.add(new Team("Miss. State - 6", 6));
        midwest_round1.add(new Team("Texas - 11", 5));
        midwest_round1.add(new Team("Houston - 3", 8));
        midwest_round1.add(new Team("Hofstra - 14", 5));
        midwest_round1.add(new Team("Baylor - 7", 7));
        midwest_round1.add(new Team("Ohio St. - 10", 6));
        midwest_round1.add(new Team("North Carolina - 2", 9));
        midwest_round1.add(new Team("Radford - 15", 3));
        
        //get midwest_round2
        
        ArrayList<Team> midwest_round2 = new ArrayList<>();
        
        for(int x = 0; x < midwest_round1.size(); x+=2){
            midwest_round2.add(checkWinner(midwest_round1.get(x), 
                    midwest_round1.get(x+1)));
        }
        
        //get midwest_round3
        
        ArrayList<Team> midwest_round3 = new ArrayList<>();
        
        for(int x = 0; x < midwest_round2.size(); x+=2){
            midwest_round3.add(checkWinner(midwest_round2.get(x), 
                    midwest_round2.get(x+1)));
        }
        
        //get midwest_round4
        
        ArrayList<Team> midwest_round4 = new ArrayList<>();
        
        for(int x = 0; x < midwest_round3.size(); x+=2){
            midwest_round4.add(checkWinner(midwest_round3.get(x), 
                    midwest_round3.get(x+1)));
        }
        
        //get midwest_round5
        
        ArrayList<Team> midwest_round5 = new ArrayList<>();
        
        for(int x = 0; x < midwest_round4.size(); x+=2){
            midwest_round5.add(checkWinner(midwest_round4.get(x), 
                    midwest_round4.get(x+1)));
        }
        
        //Add all teams to the east round 1 of the team class
        east_round1.add(new Team("Duke - 1", 9));
        east_round1.add(new Team("Norfolk St. - 16", 2));
        east_round1.add(new Team("Ole Miss - 8", 5));
        east_round1.add(new Team("VCU - 9", 5));
        east_round1.add(new Team("Maryland - 5", 7));
        east_round1.add(new Team("Alabama - 12", 3));
        east_round1.add(new Team("Kansas - 4", 7));
        east_round1.add(new Team("UC Irvine - 13", 3));
        east_round1.add(new Team("VIrginia Tech - 6", 7));
        east_round1.add(new Team("Temple - 11", 3));
        east_round1.add(new Team("LSU - 3", 8));
        east_round1.add(new Team("Montana - 14", 3));
        east_round1.add(new Team("Washington - 7", 6));
        east_round1.add(new Team("Florida - 10", 5));
        east_round1.add(new Team("Michigan - 2", 8));
        east_round1.add(new Team("Wright St. - 15", 2));
        
        //get east_round2
        
        ArrayList<Team> east_round2 = new ArrayList<>();
        
        for(int x = 0; x < east_round1.size(); x+=2){
            east_round2.add(checkWinner(east_round1.get(x), 
                    east_round1.get(x+1)));
        }
        
        //get east_round3
        
        ArrayList<Team> east_round3 = new ArrayList<>();
        
        for(int x = 0; x < east_round2.size(); x+=2){
            east_round3.add(checkWinner(east_round2.get(x), 
                    east_round2.get(x+1)));
        }
        
        //get east_round4
        
        ArrayList<Team> east_round4 = new ArrayList<>();
        
        for(int x = 0; x < east_round3.size(); x+=2){
            east_round4.add(checkWinner(east_round3.get(x), 
                    east_round3.get(x+1)));
        }
        
        //get east_round5
        
        ArrayList<Team> east_round5 = new ArrayList<>();
        
        for(int x = 0; x < east_round4.size(); x+=2){
            east_round5.add(checkWinner(east_round4.get(x), 
                    east_round4.get(x+1)));
        }
        
        //Print out teams in NCAA Tournament
        
        System.out.println("NCAA Tournament Teams: ");
        System.out.println("");
        System.out.println("South: ");
        System.out.println("-------");
        System.out.println("");
        for(int x = 0; x < 16; x++){
            System.out.println(south_round1.get(x).getName());
            System.out.println("Power Ranking: " + 
                    south_round1.get(x).getPowerRanking());           
        }
        System.out.println("");
        System.out.println("West: ");
        System.out.println("------");
        System.out.println("");
        for(int x = 0; x < 16; x++){
            System.out.println(west_round1.get(x).getName());
            System.out.println("Power Ranking: " + 
                    west_round1.get(x).getPowerRanking());
        }
        System.out.println("");
        System.out.println("MidWest: ");
        System.out.println("--------");
        System.out.println("");
        for(int x = 0; x < 16; x++){
            System.out.println(midwest_round1.get(x).getName());
            System.out.println("Power Ranking: " + 
                    midwest_round1.get(x).getPowerRanking());
        }
        System.out.println("");
        System.out.println("East: ");
        System.out.println("------");
        System.out.println("");
        for(int x = 0; x < 16; x++){
            System.out.println(east_round1.get(x).getName());
            System.out.println("Power Ranking: " + 
                    east_round1.get(x).getPowerRanking());
        }
        
        //Print out teams in round 2
        System.out.println("");
        System.out.println("----------------Round 2---------------");
        //print south round 2
        System.out.println("");
        System.out.println("South Round 2: ");
        System.out.println("-------------");
        System.out.println("");
        for(int x = 0; x < 8; x++){
            System.out.println(south_round2.get(x).getName());
            System.out.println("Power Ranking: " + 
                    south_round2.get(x).getPowerRanking());            
            System.out.println("");
        }
        //print west round 2
        System.out.println("");
        System.out.println("West Round 2: ");
        System.out.println("--------------");
        System.out.println("");
        for(int x = 0; x < 8; x++){
            System.out.println(west_round2.get(x).getName());
            System.out.println("Power Ranking: " + 
                    west_round2.get(x).getPowerRanking());
            System.out.println("");
        }
        //print midwest round 2
        System.out.println("");
        System.out.println("MidWest Round 2: ");
        System.out.println("----------------");
        System.out.println("");
        for(int x = 0; x < 8; x++){
            System.out.println(midwest_round2.get(x).getName());
            System.out.println("Power Ranking: " + 
                    west_round2.get(x).getPowerRanking());
            System.out.println("");
        }
        //print east round 2
        System.out.println("");
        System.out.println("East Round 2: ");
        System.out.println("-------------");
        System.out.println("");
        for(int x = 0; x < 8; x++){
            System.out.println(east_round2.get(x).getName());
            System.out.println("Power Ranking: " + 
                    east_round2.get(x).getPowerRanking());
            System.out.println("");
        }
        
        //Print out teams in round 3
        
        System.out.println("------------------Round 3-----------------");
        //print south round 3
        System.out.println("");
        System.out.println("South Round 3: ");
        System.out.println("-------------");
        System.out.println("");
        for(int x = 0; x < 4; x++){
            System.out.println(south_round3.get(x).getName());
            System.out.println("Power Ranking: " + 
                    east_round3.get(x).getPowerRanking());
            System.out.println("");
        }
        //print west round 3
        System.out.println("");
        System.out.println("West Round 3: ");
        System.out.println("-------------");
        System.out.println("");
        for(int x = 0; x < 4; x++){
            System.out.println(west_round3.get(x).getName());
            System.out.println("Power Ranking: " + 
                    west_round3.get(x).getPowerRanking());
            System.out.println("");
        }
        //print midwest round 3
        System.out.println("");
        System.out.println("Midwest Round 3: ");
        System.out.println("----------------");
        System.out.println("");
        for(int x = 0; x < 4; x++){
            System.out.println(midwest_round3.get(x).getName());
            System.out.println("Power Ranking: " + 
                    midwest_round3.get(x).getPowerRanking());
            System.out.println("");
        }
        //print east round 3
        System.out.println("");
        System.out.println("East Round 3: ");
        System.out.println("-------------");
        System.out.println("");
        for(int x = 0; x < 4; x++){
            System.out.println(east_round3.get(x).getName());
            System.out.println("Power Ranking: " +
                    east_round3.get(x).getPowerRanking());
            System.out.println("");
        }
        
        //Print out teams in round 4
        
        System.out.println("------------------Round 4----------------");
        //print south round 4
        System.out.println("");
        System.out.println("South Round 4: ");
        System.out.println("---------------");
        System.out.println("");
        for(int x = 0; x < 2; x++){
            System.out.println(south_round4.get(x).getName());
            System.out.println("Power Ranking: " + 
                    east_round4.get(x).getPowerRanking());
            System.out.println("");
        }
        //print west round 4
        System.out.println("");
        System.out.println("West Round 4: ");
        System.out.println("--------------");
        System.out.println("");
        for(int x = 0; x < 2; x++){
            System.out.println(west_round4.get(x).getName());
            System.out.println("Power Ranking: " + 
                    west_round4.get(x).getPowerRanking());
            System.out.println("");
        }
        //print midwest round 4
        System.out.println("");
        System.out.println("Midwest Round 4: ");
        System.out.println("-----------------");
        System.out.println("");
        for(int x = 0; x < 2; x++){
            System.out.println(midwest_round4.get(x).getName());
            System.out.println("Power Ranking: " + 
                    midwest_round4.get(x).getPowerRanking());
            System.out.println("");
        }
        //print east round 4
        System.out.println("");
        System.out.println("East Round 4: ");
        System.out.println("--------------");
        System.out.println("");
        for(int x = 0; x < 2; x++){
            System.out.println(east_round4.get(x).getName());
            System.out.println("Power Ranking: " + 
                    east_round4.get(x).getPowerRanking());
            System.out.println("");
        }
        //print round 5
        System.out.println("----------------Round 5-----------------");
        //print south round 5
        System.out.println("");
        System.out.println("South Round 5: ");
        System.out.println("---------------");
        System.out.println("");
        for(int x = 0; x < 1; x++){
            System.out.println(south_round5.get(x).getName());
            System.out.println("Power Ranking: " + 
                    south_round5.get(x).getPowerRanking());
            System.out.println("");
        }
        //print west round 5
        System.out.println("");
        System.out.println("West Round 5: ");
        System.out.println("---------------");
        System.out.println("");
        for(int x = 0; x < 1; x++){
            System.out.println(west_round5.get(x).getName());
            System.out.println("Power Ranking: " + 
                    west_round5.get(x).getPowerRanking());
            System.out.println("");
        }
        //print midwest round 5
        System.out.println("");
        System.out.println("Midwest Round 5: ");
        System.out.println("-----------------");
        System.out.println("");
        for(int x = 0; x < 1; x++){
            System.out.println(midwest_round5.get(x).getName());
            System.out.println("Power Ranking: " + 
                    midwest_round5.get(x).getPowerRanking());
            System.out.println("");
        }
        //print east round 5
        System.out.println("");
        System.out.println("East Round 5: ");
        System.out.println("-----------------");
        System.out.println("");
        for(int x = 0; x < 1; x++){
            System.out.println(east_round5.get(x).getName());
            System.out.println("Power Ranking: " + 
                    east_round5.get(x).getPowerRanking());
            System.out.println("");
        }
        
        //get Final Four
        
        ArrayList<Team> finalFour = new ArrayList<>();
        
        finalFour.add(south_round5.get(0));
        finalFour.add(west_round5.get(0));
        finalFour.add(midwest_round5.get(0));
        finalFour.add(east_round5.get(0));
        
        //print out final four
        
        System.out.println("---------------FINAL FOUR---------------");
        
        System.out.println("");
        System.out.println(finalFour.get(0).getName());
        System.out.println("Power Ranking: " + 
                finalFour.get(0).getPowerRanking());
        System.out.println("");
        System.out.println(finalFour.get(1).getName());
        System.out.println("Power Ranking: " + 
                finalFour.get(1).getPowerRanking());
        System.out.println("");
        System.out.println(finalFour.get(2).getName());
        System.out.println("Power Ranking: " + 
                finalFour.get(2).getPowerRanking());
        System.out.println("");
        System.out.println(finalFour.get(3).getName());
        System.out.println("Power Ranking: " + 
                finalFour.get(3).getPowerRanking());
        System.out.println("");
        
        //find winners of FinalFour and add to Championship ArrayList

        ArrayList<Team> championship = new ArrayList<>();
        
        for(int x = 0; x <= 2; x+=2){
            championship.add(checkWinner(finalFour.get(x), 
                    finalFour.get(x+1)));
        }
        
        //print out winners of FinalFour
        
        System.out.println("----------------CHAMPIONSHIP---------------");
        
        System.out.println("");
        System.out.println(championship.get(0).getName());
        System.out.println("Power Ranking: " + 
                championship.get(0).getPowerRanking());
        System.out.println("");
        System.out.println(championship.get(1).getName());
        System.out.println("Power Ranking: " + 
                championship.get(1).getPowerRanking());
        System.out.println("");
        
        //find winner of championship
        
        ArrayList<Team> champion = new ArrayList<>();

        for(int x = 0; x < 1; x+=2){
            champion.add(checkWinner(championship.get(x), 
                    championship.get(x+1)));
        }
        
        //print out champion
        
        System.out.println("*****************CHAMPION*****************");
        
        System.out.println("");
        System.out.println(champion.get(0).getName());
        System.out.println("Power Ranking: " + 
                champion.get(0).getPowerRanking());
    }
    
    
        public static Team checkWinner(Team one, Team two){
            //code to compare winner here
            
            if(one.getPowerRanking() > two.getPowerRanking()){
                return one;
            }else if(one.getPowerRanking() < two.getPowerRanking()){
                return two;
            }else if(one.getPowerRanking() == two.getPowerRanking()){
                Random r = new Random();
                int num = r.nextInt(2) + 1;
                if(num == 1){
                    return one;
                }else{
                return two;
                }
              
            
                
            }
            return one;
        }
}
        
    



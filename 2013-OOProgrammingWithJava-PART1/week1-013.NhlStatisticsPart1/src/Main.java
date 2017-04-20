
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {
        System.out.println("Top ten by goals:");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);

        System.out.println("Top 25 by penalties:");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);

        System.out.println("Sidney Crosby Stats:");
        NHLStatistics.searchByPlayer("Sidney Crosby");

        System.out.println("Stats for Philadephia Flyers:");
        NHLStatistics.teamStatistics("PHI");

        System.out.println("Stats for Ducks by points:");
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");

    }
}

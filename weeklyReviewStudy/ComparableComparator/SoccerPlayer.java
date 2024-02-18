package weeklyReviewStudy.ComparableComparator;

public class SoccerPlayer implements Comparable<SoccerPlayer> {
    int goal;
    int help;

    SoccerPlayer(int goal, int help) {
        this.goal = goal;
        this.help = help;
    }

    @Override
    public int compareTo(SoccerPlayer o) {
        if (this.goal > o.goal) {
            return 1;
        } else if (this.goal == o.goal) {
            return 0;
        } else {
            return -1;
        }
    }
}

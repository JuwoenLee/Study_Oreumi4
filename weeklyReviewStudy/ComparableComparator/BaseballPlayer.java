package weeklyReviewStudy.ComparableComparator;

public class BaseballPlayer {
    int homeRun;
    int strikeout;

    public BaseballPlayer(int homeRun, int strikeout) {
        this.homeRun = homeRun;
        this.strikeout = strikeout;
    }
//
//    @Override
//    public int compare(BaseballPlayer o1, BaseballPlayer o2) {
//        if(o1.homeRun > o2.homeRun) {
//            return 1;
//        } else if(o1.homeRun == o2.homeRun) {
//            return 0;
//        } else {
//            return -1;
//        }
//    }
}

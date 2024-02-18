package weeklyReviewStudy.ComparableComparator;

import java.util.Comparator;

public class AnonymousObject {
    public static void main(String[] args) {

        BaseballPlayer roh = new BaseballPlayer(31, 118);
        BaseballPlayer choi = new BaseballPlayer(29, 87);

        Comparator<BaseballPlayer> strikeoutComparator = new Comparator<BaseballPlayer>() {
            @Override
            public int compare(BaseballPlayer o1, BaseballPlayer o2) {
                return o1.strikeout - o2.strikeout;
            }
        };

        int strikeoutCompare = strikeoutComparator.compare(roh, choi);

        if(strikeoutCompare > 0) {
            System.out.println("roh has more strikeouts : " + roh.strikeout);
        } else if(strikeoutCompare == 0) {
            System.out.println("roh and choi have same strikeouts : " + roh.strikeout);
        } else {
            System.out.println("choi has more strikeouts : " + choi.strikeout);
        }
    }
}

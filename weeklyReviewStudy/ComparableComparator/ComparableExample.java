package weeklyReviewStudy.ComparableComparator;

public class ComparableExample {
    public static void main(String[] args) {
        SoccerPlayer son = new SoccerPlayer(12, 6);
        SoccerPlayer hwang = new SoccerPlayer(10, 3);

        int isBig = son.compareTo(hwang);

        if(isBig > 0) {
            System.out.println("Son scored more goals : " + son.goal);
        } else if(isBig == 0) {
            System.out.println("Son and Hwang scored same goals : " + son.goal);
        } else {
            System.out.println("Hwang scored more goals : " + hwang.goal);
        }
    }
}

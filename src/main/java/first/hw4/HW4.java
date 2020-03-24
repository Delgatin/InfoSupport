package first.hw4;

import java.util.ArrayList;

public class HW4 {

    private ArrayList<Season> seasonlist = new ArrayList<>();

    public HW4() { createSeasons(); }

    private void createSeasons() {
        Season spring = new Season(SeasonTemperature.WARM, "spring");
        Season summer = new Season(SeasonTemperature.WARM, "summer");
        Season fall = new Season(SeasonTemperature.COLD, "fall");
        Season winter = new Season(SeasonTemperature.COLD, "winter");

        seasonlist.add(spring);
        seasonlist.add(summer);
        seasonlist.add(fall);
        seasonlist.add(winter);
    }

    public void season(String season) {
        switch (season) {
            case "spring":
                loopThroughSeason(season);
                break;
            case "summer":
                loopThroughSeason(season);
                break;
            case "fall":
                loopThroughSeason(season);
                break;
            case "winter":
                loopThroughSeason(season);
                break;
            default:
                System.out.println("Unknown.");
        }
    }

    private void loopThroughSeason(String season) {
        for(Season s : seasonlist) {
            if (season.equals(s.getSeason())) {
                System.out.println(s.toString());
            }
        }
    }

    public void printHourGlass(int length) throws EvenNumberException {
        if (length%2 != 0) {
            for(int i = 0; i < length; i++) {
                if (i == 0) {
                    printEntireLine(length);
                } else if (i == length-1) {
                    printEntireLine(length);
                } else {
                    printEdges(length, i);
                }
                System.out.println();
            }
        } else {
            throw new EvenNumberException("This method only allows for uneven numbers to be used.");
        }
    }

    private void printEntireLine(int length) {
        for (int i = 0; i < length; i++) {
            System.out.print("*");
        }
    }

    private void printEdges(int maxLength, int i) {
        for (int j = 0; j < maxLength; j++) {
            if (j == i || j == (maxLength-1)-i) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }
}

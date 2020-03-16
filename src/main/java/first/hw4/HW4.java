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
}

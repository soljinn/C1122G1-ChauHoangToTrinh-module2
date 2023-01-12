package ss8_clean_code;

public class TennisGame {
    public static String getScore(String player1Name, String player2Name, int score1, int score2) {
        String score = "";
        int tempScore;
        if (score1 == score2) {
            score = switch (score1) {
                case 0 -> "Love-All";
                case 1 -> "Fifteen-All";
                case 2 -> "Thirty-All";
                case 3 -> "Forty-All";
                default -> "Deuce";
            };
            return score;
        } else if (score1 >= 4 || score2 >= 4) {
            int minusResult = score1 - score2;
            if (minusResult == 1) {
                score = "Advantage player1";
            } else if (minusResult == -1) {
                score = "Advantage player2";
            } else if (minusResult >= 2) {
                score = "Win for player1";
            } else {
                score = "Win for player2";
            }
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) {
                    tempScore = score1;
                } else {
                    score += "-";
                    tempScore = score2;
                }
                score = getString(score, tempScore);
            }
        }
        return score;
    }

    public static String getString(String score, int tempScore) {
        switch (tempScore) {
            case 0 -> score += "Love";
            case 1 -> score += "Fifteen";
            case 2 -> score += "Thirty";
            case 3 -> score += "Forty";
        }
        return score;
    }
}

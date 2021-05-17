package baseball.domain;

import java.util.List;

public class Judge {

    public int correctCount(List<Integer> computer, List<Integer> player) {
        int result = 0;

        for (int i = 0; i < computer.size(); i++) {
            int playerNumber = player.get(i);

            if (computer.contains(playerNumber)) {
                result++;
            }
        }

        return result;
    }

    public boolean hsaPlace(List<Integer> computer, int placeNumber, int number) {
        return false;
    }

}

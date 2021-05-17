package baseball.domain;

import java.util.List;

public class Refree {

    public String compare(List<Integer> computer, List<Integer> player) {
        // 일치하는 숫자의 개수를 구한다.
        // 스트라이크의 개수를 구한다.
        // 숫자의 개수 - 스트라이크의 개수 = 볼의 개수
        Judge judge = new Judge();
        int correctCount = judge.correctCount(computer, player);

        int strike = 0;

        for (int i = 0; i < player.size(); i++) {
            if(judge.hsaPlace(computer, i, player.get(i))) {
                strike++;
            }
        }

        int ball = correctCount - strike;

        if(correctCount == 0) {
            return "아웃";
        }

        return ball + " 볼 " + strike + " 스트라이크";
    }

}

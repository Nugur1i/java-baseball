package baseball;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현

        List<Integer> computer = new ArrayList<>();
        while (computer.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!computer.contains(randomNumber)) {
                computer.add(randomNumber);
            }
        }
        System.out.println("숫자 야구 게임을 시작합니다.");

        int escapeNumber = 1;
        while (escapeNumber != 1){

            System.out.println("숫자를 입력해주세요 :");
            Scanner scanner = new Scanner(System.in);
            int userInputNumber = scanner.nextInt();

            List<Integer> user = new ArrayList<>();

            for (int i = 0; i < 3 ; i++) {
                user.add(userInputNumber%10);
                userInputNumber /= 10;
            }


            for (int position = 0 ; position<3 ; position++ ){

                if (computer.contains(user.get(position))){

                    if (computer.indexOf(user.get(position)) == position){

                        //strike 상황

                    } else if (computer.indexOf(user.get(position)) != position){

                        //ball 상황

                    }



                }


            }

            // 예외사항 (아직 x)//






        }







    }
}

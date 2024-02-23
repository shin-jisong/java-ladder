package view;

import domain.Ladder;
import domain.Line;

import domain.Participants;
import domain.StepPoint;
import java.util.List;

public class OutputView {

    public static final String START_OF_LINE = "    |";
    public static final String EXIST_POINT = "-----|";
    public static final String EMPTY_POINT = "     |";

    public void printResult(Participants participants, Ladder ladder) {
        System.out.println("\n실행결과\n");
        printNames(participants);
        printLadder(ladder);
    }

    private void printNames(Participants participants) {
        List<String> participantsName = participants.getParticipantsName();
        for (String name : participantsName) {
            System.out.printf("%5s ", name);
        }
        System.out.println();
    }

    private void printLadder(Ladder ladder) {
        List<Line> lines = ladder.getLines();
        for (Line line : lines) {
            printOneLine(line);
        }
    }

    private void printOneLine(Line line) {
        List<StepPoint> stepPoints = line.getStepPoints();
        System.out.print(START_OF_LINE);
        for (StepPoint stepPoint : stepPoints) {
            printOnePoint(stepPoint);
        }
        System.out.println();
    }

    private void printOnePoint(StepPoint stepPoint) {
        if (stepPoint.isExist()) {
            System.out.print(EXIST_POINT);
            return;
        }
        System.out.print(EMPTY_POINT);
    }
}

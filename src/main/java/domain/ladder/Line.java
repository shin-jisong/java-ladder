package domain.ladder;

import java.util.ArrayList;
import java.util.List;
import utils.StepGenerator;

public class Line {

    public static final int ONE_STEP = 1;

    private final List<StepPoint> stepPointCount;

    public Line(int numberOfCell, StepGenerator stepGenerator) {
        stepPointCount = new ArrayList<>();
        stepPointCount.add(stepGenerator.generate());
        for (int cellIndex = 1; cellIndex < numberOfCell; cellIndex++) {
            stepPointCount.add(makeOnePoint(cellIndex, stepGenerator));
        }
    }

    public boolean isExistLeftStep(int nowStep) {
        if (nowStep == 0) {
            return false;
        }
        return isExistStep(nowStep - ONE_STEP);
    }

    public boolean isExistRightStep(int nowStep) {
        if (nowStep == lineLastStep()) {
            return false;
        }

        return isExistStep(nowStep);
    }

    private int lineLastStep() {
        return stepPointCount.size();
    }

    private StepPoint makeOnePoint(int cellIndex, StepGenerator stepGenerator) {
        if (isPreviousStepExist(cellIndex)) {
            return StepPoint.ABSENT;
        }
        return stepGenerator.generate();
    }

    private boolean isPreviousStepExist(int cellIndex) {
        return isExistStep(cellIndex - 1);
    }

    public boolean isExistStep(int index) {
        return stepPointCount.get(index)
                .isExist();
    }

    public List<StepPoint> getStepPointCount() {
        return stepPointCount;
    }
}

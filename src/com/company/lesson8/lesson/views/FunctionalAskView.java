package com.company.lesson8.lesson.views;

public class FunctionalAskView extends SimpleAskView {

    private final Runnable yesFunction;
    private final Runnable noFunction;

    public FunctionalAskView(String message, Runnable yesFunction, Runnable noFunction) {
        super(message);
        this.yesFunction = yesFunction;
        this.noFunction = noFunction;
    }

    @Override
    public boolean run() {
        boolean answer = super.run();
        if (answer) {
            yesFunction.run();
        } else {
            noFunction.run();
        }

        return answer;
    }
}

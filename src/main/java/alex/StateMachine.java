package alex;

import java.util.Optional;

public class StateMachine {
    private static final State initialState;
    private static final State finalState;

    static {
//(c|d)*(bb)+a*n*m+
        State state_initial = new State("");
        State state_c = new State("c");
        State state_d = new State("d");
        State state_bb = new State("bb");
        State state_a = new State("a");
        State state_n = new State("n");
        State state_m = new State("m");

        state_initial.addState(state_c);
        state_initial.addState(state_d);
        state_initial.addState(state_bb);

        state_c.addState(state_c);
        state_c.addState(state_d);
        state_c.addState(state_bb);

        state_d.addState(state_d);
        state_d.addState(state_c);
        state_d.addState(state_bb);

        state_bb.addState(state_bb);
        state_bb.addState(state_a);
        state_bb.addState(state_n);
        state_bb.addState(state_m);

        state_a.addState(state_a);
        state_a.addState(state_n);
        state_a.addState(state_n);

        state_n.addState(state_n);
        state_n.addState(state_m);

        state_m.addState(state_m);

        initialState = state_initial;
        finalState = state_m;
    }

    public static boolean check(String s) {
        //(c|d)*(bb)+a*n*m+
        State state = initialState;
        while (s.length() > 0) {
            Optional<State> nextState = state.nextState(s);
            if (nextState.isPresent()) {
                s = s.substring(nextState.get().getCondition().length());
                state = nextState.get();
            } else {
                return false;
            }
        }
        return state == finalState;
    }

}

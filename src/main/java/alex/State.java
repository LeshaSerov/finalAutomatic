package alex;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class State {
    private final String condition;
    private List<State> stateList = new ArrayList<>();

    public State(String condition) {
        this.condition = condition;
    }

    public void addState(State state) {
        this.stateList.add(state);
    }

    Optional<State> nextState(String s) {
        return this.stateList.stream().filter(x -> s.startsWith(x.condition)).findFirst();
    }

    public String getCondition() {
        return condition;
    }
}

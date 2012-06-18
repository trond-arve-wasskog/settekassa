package settakassa.core;

import java.util.ArrayList;
import java.util.List;

public class MakroExecutable<T> implements Executable<T> {
    private final List<Executable<T>> executableList = new ArrayList<Executable<T>>();

    public void add(Executable<T> executable) {
        executableList.add(executable);
    }

    public JobbInfo execute(T context) {
        JobbInfo jobbInfo = new JobbInfo();
        for (Executable<T> executable : executableList) {
            jobbInfo.aggreger(executable.execute(context));
        }
        return jobbInfo;
    }

    public void clear() {
        executableList.clear();
    }
}

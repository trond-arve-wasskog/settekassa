package settakassa.core;

import java.util.ArrayList;
import java.util.List;

public class MakroExecutable<T> implements Executable<T> {
    private final List<Executable<T>> executableList = new ArrayList<Executable<T>>();
    private JobbInfo jobbInfo;

    public void add(Executable<T> executable) {
        executableList.add(executable);
    }

    public void execute(T context) {
        for (Executable<T> executable : executableList) {
            executable.execute(context);
        }
    }

    public void clear() {
        executableList.clear();
    }
}

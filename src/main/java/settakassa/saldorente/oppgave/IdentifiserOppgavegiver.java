package settakassa.saldorente.oppgave;

import settakassa.core.Executable;
import settakassa.core.JobbInfo;
import settakassa.domene.LeveranseId;

public class IdentifiserOppgavegiver implements Executable<LeveranseId> {
    public JobbInfo execute(LeveranseId leveranseId) {
        return new JobbInfo();
    }

}

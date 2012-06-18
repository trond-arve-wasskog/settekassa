package settakassa.saldorente.oppgave;

import settakassa.core.Executable;
import settakassa.core.JobbInfo;
import settakassa.domene.OppgaveId;

public class OppgaveSannsynlighetskontroll implements Executable<OppgaveId> {
    public JobbInfo execute(OppgaveId oppgaveId) {
        System.out.println(String.format("Sannsynlighetskontroll for oppgave med id %s", oppgaveId));
        return new JobbInfo();
    }

}

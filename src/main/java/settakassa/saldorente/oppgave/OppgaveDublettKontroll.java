package settakassa.saldorente.oppgave;

import settakassa.core.Executable;
import settakassa.domene.OppgaveId;

public class OppgaveDublettKontroll implements Executable<OppgaveId> {
    public void execute(OppgaveId oppgaveId) {
        System.out.println(String.format("Dublettkontroll for oppgave med id %s", oppgaveId));
    }

}

package settakassa.saldorente.leveranse;

import settakassa.core.Executable;
import settakassa.core.MakroExecutable;
import settakassa.domene.LeveranseId;
import settakassa.domene.OppgaveId;
import settakassa.saldorente.oppgave.IdentifiserOppgaveeier;
import settakassa.saldorente.oppgave.OppgaveDublettKontroll;
import settakassa.saldorente.oppgave.OppgaveInnholdskontroll;
import settakassa.saldorente.oppgave.OppgaveSannsynlighetskontroll;
import settakassa.saldorente.repository.OppgaveRepository;

/**
 * Design diskusjon: execute metoden her er den samme som for OppgavekontrollAku. Her kan vi gjøre det samme som for
 * Leveransekontroll og LeveransekontrollAKU. LeveransekontrollAku extender Leveransekontroll (hhhmmmmm....)
 */
public class Oppgavekontroll implements Executable<LeveranseId> {
    private MakroExecutable<OppgaveId> makroExecutable = new MakroExecutable<OppgaveId>();

    public Oppgavekontroll() {
        makroExecutable.add(new IdentifiserOppgaveeier());
        makroExecutable.add(new OppgaveInnholdskontroll());
        makroExecutable.add(new OppgaveDublettKontroll());
        makroExecutable.add(new OppgaveSannsynlighetskontroll());
    }

    public void execute(LeveranseId leveranseId) {
        Iterable<OppgaveId> oppgaveIDer = OppgaveRepository.hentOppgaveIDer();
        for (OppgaveId oppgaveId : oppgaveIDer) {
            makroExecutable.execute(oppgaveId);
        }
    }
}

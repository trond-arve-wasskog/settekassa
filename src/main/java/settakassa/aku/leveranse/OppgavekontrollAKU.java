package settakassa.aku.leveranse;

import settakassa.core.Executable;
import settakassa.core.MakroExecutable;
import settakassa.domene.LeveranseId;
import settakassa.domene.OppgaveId;
import settakassa.saldorente.oppgave.IdentifiserOppgaveeier;
import settakassa.saldorente.oppgave.OppgaveInnholdskontroll;
import settakassa.saldorente.oppgave.OppgaveSannsynlighetskontroll;
import settakassa.saldorente.repository.OppgaveRepository;

/**
 * Design kommentar: Siden vi i AKU ikke skal gjennomføre dublettkontroll må vi lage en egen OppgavekontrollAKU uten
 * dublettkontroll
 */
public class OppgavekontrollAKU implements Executable<LeveranseId> {

    private MakroExecutable<OppgaveId> makroExecutable = new MakroExecutable<OppgaveId>();

    public OppgavekontrollAKU() {
        makroExecutable.add(new IdentifiserOppgaveeier());
        makroExecutable.add(new OppgaveInnholdskontroll());
        makroExecutable.add(new OppgaveSannsynlighetskontroll());
    }

    public void execute(LeveranseId leveranseId) {
        Iterable<OppgaveId> oppgaveIDer = OppgaveRepository.hentOppgaveIDer();
        for (OppgaveId oppgaveId : oppgaveIDer) {
            makroExecutable.execute(oppgaveId);
        }
    }

}

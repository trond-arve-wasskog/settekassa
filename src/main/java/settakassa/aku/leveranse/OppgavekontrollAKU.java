package settakassa.aku.leveranse;

import settakassa.core.EntityId;
import settakassa.core.Executable;
import settakassa.core.MakroExecutable;
import settakassa.saldorente.oppgave.IdentifiserOppgaveeier;
import settakassa.saldorente.oppgave.OppgaveInnholdskontroll;
import settakassa.saldorente.oppgave.OppgaveSannsynlighetskontroll;
import settakassa.saldorente.repository.LeveranseRepository;

/**
 * TODO: Siden vi i AKU ikke skal gjennomføre dublettkontroll må vi lage en egen OppgavekontrollAKU uten dublettkontroll
 */
public class OppgavekontrollAKU implements Executable {

    private MakroExecutable makroExecutable = new MakroExecutable();

    public OppgavekontrollAKU() {
        makroExecutable.add(new IdentifiserOppgaveeier());
        makroExecutable.add(new OppgaveInnholdskontroll());
        makroExecutable.add(new OppgaveSannsynlighetskontroll());
    }

    public void execute(EntityId leveranseId) {
        Iterable<EntityId> oppgaveIDer = LeveranseRepository.hentOppgaveIDer(leveranseId);
        for (EntityId oppgaveId : oppgaveIDer) {// Her skal vi traversere alle oppgaver som ligger i innbøtte
            makroExecutable.execute(oppgaveId);
        }
    }

}

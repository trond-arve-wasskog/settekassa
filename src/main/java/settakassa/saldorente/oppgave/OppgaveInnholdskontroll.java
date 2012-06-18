package settakassa.saldorente.oppgave;

import settakassa.core.Executable;
import settakassa.core.JobbInfo;
import settakassa.domene.Oppgave;
import settakassa.domene.OppgaveId;
import settakassa.saldorente.repository.OppgaveRepository;

/**
 * Design kommentar: Bruker abstrakte metoder og arv for skille hvordan innholdskontrollen gjøres. Andre mekanismer for
 * å få til det samme?
 */
public class OppgaveInnholdskontroll implements Executable<OppgaveId> {
    public JobbInfo execute(OppgaveId id) {
        Oppgave oppgave = OppgaveRepository.OPPGAVER_INN.get(id);
        oppgave.innholdskontroll();
        System.out.println(String.format("Innholdskontroll for oppgave med id %s", id));
        return new JobbInfo();
    }

}

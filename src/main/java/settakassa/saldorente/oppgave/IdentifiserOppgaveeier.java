package settakassa.saldorente.oppgave;

import settakassa.core.Executable;
import settakassa.core.JobbInfo;
import settakassa.domene.Oppgave;
import settakassa.domene.OppgaveId;
import settakassa.saldorente.repository.OppgaveRepository;
import settakassa.service.PartsregisterKlient;

public class IdentifiserOppgaveeier implements Executable<OppgaveId> {
    private PartsregisterKlient partsregisterKlient = new PartsregisterKlient();

    public JobbInfo execute(OppgaveId oppgaveId) {
        System.out.println(String.format("Identifisere oppgaveeier for oppgave med id %s", oppgaveId));
        Oppgave oppgave = OppgaveRepository.OPPGAVER_INN.get(oppgaveId);
        Long partsnummer = partsregisterKlient.identifiserPartMedIdentifikator(oppgave.getIdentifikatorer());
        if (partsnummer == null) {
            partsnummer = partsregisterKlient.identifiserPartsFraNavnFoedselsdatoOgAdresse(oppgave);
        }
        oppgave.setOppgaveeiersPartsnummer(partsnummer);
        return new JobbInfo();
    }
}

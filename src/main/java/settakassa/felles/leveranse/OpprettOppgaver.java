package settakassa.felles.leveranse;

import settakassa.aku.domene.OppgaveAku;
import settakassa.core.Executable;
import settakassa.core.JobbInfo;
import settakassa.domene.Leveranse;
import settakassa.domene.LeveranseId;
import settakassa.domene.Oppgave;
import settakassa.saldorente.leveranse.OppgaveSaldoRente;
import settakassa.saldorente.repository.LeveranseRepository;
import settakassa.saldorente.repository.OppgaveRepository;

public class OpprettOppgaver<O extends Oppgave> implements Executable<LeveranseId> {
    private Class<O> oppgaveklasse;

    public OpprettOppgaver(Class<O> oppgaveklasse) {
        this.oppgaveklasse = oppgaveklasse;
    }

    public JobbInfo execute(LeveranseId leveranseId) {
        Leveranse leveranse = LeveranseRepository.LEVERANSER.get(leveranseId);
        O oppgave = opprettOppgave(oppgaveklasse);
        OppgaveRepository.OPPGAVER_INN.put(oppgave.getOppgaveId(), oppgave);
        return new JobbInfo();
    }

    private O opprettOppgave(Class<O> oppgaveklasse) {
        // unmarshaller på bakgrunn av oppgaveklasse
        // O oppgave = xmlGrunnlagsdata.getAs(getOppgaveClass());
        return emulerUnmarshallingGjoresIkkeSlikIMagnetKode(oppgaveklasse);
    }

    private O emulerUnmarshallingGjoresIkkeSlikIMagnetKode(Class<O> oppgaveklasse) {
        if (oppgaveklasse.getName().equals("settakassa.aku.domene.OppgaveAku")) {
            return (O) new OppgaveAku();
        } else if (oppgaveklasse.getName().equals("settakassa.saldorente.leveranse.OppgaveSaldoRente")) {
            return (O) new OppgaveSaldoRente();
        }
        return null;
    }

}

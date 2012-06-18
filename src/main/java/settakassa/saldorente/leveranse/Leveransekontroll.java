package settakassa.saldorente.leveranse;

import settakassa.core.JobbInfo;
import settakassa.core.MakroExecutable;
import settakassa.domene.Innsending;
import settakassa.domene.Leveranse;
import settakassa.domene.LeveranseId;
import settakassa.domene.Oppgave;
import settakassa.felles.leveranse.Innsenderkontroll;
import settakassa.felles.leveranse.Oppgavegiverkontroll;
import settakassa.felles.leveranse.OpprettOppgaver;
import settakassa.saldorente.repository.LeveranseRepository;

/**
 * Design diskusjon: Trenger generics type for å spesifisere gjeldende implementasjon av oppgaven. Og trenger klasse som
 * parameter for unmarshalling. Mulig å opprette riktig klasse basert på generics typen?
 * 
 * @param <O>
 */
public class Leveransekontroll<O extends Oppgave> extends MakroExecutable<Innsending> {
    protected MakroExecutable<LeveranseId> makroExecutable = new MakroExecutable<LeveranseId>();

    public Leveransekontroll(Class<O> klasse) {
        makroExecutable.add(new OpprettOppgaver<O>(klasse));
        makroExecutable.add(new Oppgavegiverkontroll());
        makroExecutable.add(new Innsenderkontroll());
        makroExecutable.add(new Oppgavekontroll());
        makroExecutable.add(new Kvalitetskontroll());
        makroExecutable.add(new GenererKvittering());
    }

    @Override
    public JobbInfo execute(Innsending innsending) {
        JobbInfo jobbInfoLeveranser = new JobbInfo();
        for (Leveranse leveranse : innsending.getLeveranser()) {
            LeveranseRepository.LEVERANSER.put(leveranse.getLeveranseId(), leveranse);
            jobbInfoLeveranser.aggreger(makroExecutable.execute(leveranse.getLeveranseId()));
        }
        return jobbInfoLeveranser;
    }

}

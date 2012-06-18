package settakassa.felles.fil;

import settakassa.core.JobbInfo;
import settakassa.core.MakroExecutable;
import settakassa.domene.Fil;
import settakassa.domene.Innsending;
import settakassa.felles.Oppgavetypekontroll;
import settakassa.felles.OpprettLeveranser;

public class LesFiler extends MakroExecutable<Innsending> {
    private MakroExecutable<Fil> makroExecutable = new MakroExecutable<Fil>();

    public LesFiler() {
        makroExecutable.add(new Oppgavetypekontroll());
        makroExecutable.add(new OpprettLeveranser());
    }

    @Override
    public JobbInfo execute(Innsending innsending) {
        JobbInfo jobbInfoFiler = new JobbInfo();
        System.out.println(String.format("Laster opp leveranser for innsending med id %s", innsending.id));

        if (innsending.erGyldig()) {
            for (Fil fil : innsending.filer) {
                jobbInfoFiler.aggreger(makroExecutable.execute(fil));
            }
        }
        return jobbInfoFiler;

        // henter xml
        // parser og populerer SaldoRenteLeveranseData og oppretter leveranse og legger på grid
        // Leveranse leveranse = LeveranseRepository.LEVERANSER.get(innsendingId);
        // hentUtOppgaverFraXML(leveranse.getOppgavetype());
    }

    // private void hentUtOppgaverFraXML(String oppgavetype) {
    // EntityId<Integer> oppgaveId = new EntityId<Integer>(10);
    // Oppgave oppgave = lagNyOppgave();
    // LeveranseRepository.OPPGAVER.put(oppgaveId, oppgave);
    // }

    // protected abstract Oppgave lagNyOppgave();
}

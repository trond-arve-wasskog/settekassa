package settakassa.saldorente;

import settakassa.core.Executable;
import settakassa.core.JobbInfo;
import settakassa.core.MakroExecutable;
import settakassa.domene.Innsending;
import settakassa.felles.fil.LesFiler;
import settakassa.felles.leveranse.Innsendingskontroll;
import settakassa.saldorente.leveranse.Leveransekontroll;
import settakassa.saldorente.leveranse.OppgaveSaldoRente;
import settakassa.service.InnsendingService;

public class SaldoRenteProsess implements Executable<Void> {
    private MakroExecutable<Innsending> makroExecutable = new MakroExecutable<Innsending>();
    private InnsendingService innsendingService = new InnsendingService();

    public SaldoRenteProsess() {
        makroExecutable.add(new Innsendingskontroll());
        makroExecutable.add(new LesFiler());
        makroExecutable.add(new Leveransekontroll<OppgaveSaldoRente>(OppgaveSaldoRente.class));
    }

    public JobbInfo execute(Void id) {
        JobbInfo jobbInfoProsess = new JobbInfo();
        System.out.println("************* SaldoRenteProsess ********************");
        Innsending innsending = innsendingService.hentNesteInnsending("SALDO_RENTE");
        return jobbInfoProsess.aggreger(makroExecutable.execute(innsending));
    }
}

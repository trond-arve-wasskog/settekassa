package settakassa.saldorente;

import settakassa.core.Executable;
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

    public void execute(Void id) {
        System.out.println("************* SaldoRenteProsess ********************");
        Innsending innsending = innsendingService.hentNesteInnsending("SALDO_RENTE");
        makroExecutable.execute(innsending);
    }
}

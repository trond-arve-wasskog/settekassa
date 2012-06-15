package settakassa.aku;

import settakassa.aku.leveranse.LeveranseKontrollAKU;
import settakassa.core.MakroExecutable;
import settakassa.domene.Innsending;
import settakassa.felles.fil.LesFiler;
import settakassa.felles.leveranse.Innsendingskontroll;
import settakassa.service.InnsendingService;

/**
 * Design kommentar: Identifiser oppgavegiver må håndteres på en egen måte. Dette medfører at alle nivåene over må
 * endres. Har vurdert å benytte en flatere struktur. Men inntil videre beholder vi det slik.
 */
public class AkuProsess extends MakroExecutable<Void> {
    private MakroExecutable<Innsending> makroExecutable = new MakroExecutable<Innsending>();
    private InnsendingService innsendingService = new InnsendingService();

    public AkuProsess() {
        makroExecutable.add(new Innsendingskontroll());
        makroExecutable.add(new LesFiler());
        makroExecutable.add(new LeveranseKontrollAKU());
    }

    public void execute(Void id) {
        System.out.println("************* AkuProsess ********************");
        Innsending innsending = innsendingService.hentNesteInnsending("AKU");
        makroExecutable.execute(innsending);
    }

}

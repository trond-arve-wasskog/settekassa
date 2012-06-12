package settakassa.saldorente;

import settakassa.core.EntityId;
import settakassa.core.Executable;
import settakassa.core.MakroExecutable;
import settakassa.domene.Innsending;
import settakassa.felles.fil.ValiderXmlLeveranseFil;
import settakassa.felles.leveranse.Innlesningskontroll;
import settakassa.saldorente.leveranse.GenererKvittering;
import settakassa.saldorente.leveranse.SaldoRenteKontroll;
import settakassa.service.InnsendingService;
import settekassa.domene.Leveranse;

public class SaldoRenteProsess implements Executable {
    private MakroExecutable makroExecutable = new MakroExecutable();
    private InnsendingService innsendingService = new InnsendingService();

    public SaldoRenteProsess() {
        makroExecutable.add(new Innlesningskontroll());
        makroExecutable.add(new ValiderXmlLeveranseFil());
        makroExecutable.add(new SaldoRenteKontroll());
        makroExecutable.add(new GenererKvittering());
    }

    public void execute(EntityId id) {
        Innsending innsending = innsendingService.hentNesteInnsending("SALDO_RENTE");
        // Her skal vi egentlig traversere alle filer i en innsending, splitte filer, filkontroll etc
        for (Leveranse leveranse : innsending.getLeveranser()) {
            makroExecutable.execute(leveranse.getId());
        }

    }
}

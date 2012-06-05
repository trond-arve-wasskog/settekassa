package settakassa.saldorente;

import settakassa.core.MakroExecutable;
import settakassa.fil.LastOppLeveranse;
import settakassa.fil.ValiderXmlLeveranseFil;
import settakassa.leveranse.GenererKvittering;

public class SaldoRenteBehandler extends MakroExecutable {
	public SaldoRenteBehandler() {
		add(new ValiderXmlLeveranseFil());
		add(new LastOppLeveranse());
		add(new SaldoRenteLeveransekontroll());
		add(new GenererKvittering());
	}

}

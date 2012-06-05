package settakassa.saldorente;

import settakassa.core.MakroExecutable;
import settakassa.fil.ValiderXmlLeveranseFil;

public class SaldoRenteBehandler extends MakroExecutable {
	public SaldoRenteBehandler() {
		add(new ValiderXmlLeveranseFil());
		add(new LastOppLeveranse());
		add(new SaldoRenteLeveransekontroll());
		add(new GenererKvittering());
	}

}

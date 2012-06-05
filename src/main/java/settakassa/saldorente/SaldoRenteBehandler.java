package settakassa.saldorente;

import settakassa.core.MakroExecutable;
import settakassa.saldorente.fil.LastOppLeveranse;
import settakassa.saldorente.fil.ValiderXmlLeveranseFil;
import settakassa.saldorente.leveranse.GenererKvittering;

public class SaldoRenteBehandler extends MakroExecutable {
	public SaldoRenteBehandler() {
		add(new ValiderXmlLeveranseFil());
		add(new LastOppLeveranse());
		add(new SaldoRenteLeveransekontroll());
		add(new GenererKvittering());
	}

}

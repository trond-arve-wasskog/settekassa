package settakassa.saldorente.leveranse;

import settakassa.core.MakroExecutable;
import settakassa.felles.leveranse.Innsenderkontroll;
import settakassa.felles.leveranse.Oppgavegiverkontroll;

public class SaldoRenteLeveransekontroll extends MakroExecutable {
	
	public SaldoRenteLeveransekontroll() {
		add(new Innsenderkontroll());
		add(new Oppgavegiverkontroll());
		add(new Oppgavekontroll());
		add(new Leveransekontroll());
	}
}

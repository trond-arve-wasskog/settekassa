package settakassa.saldorente;

import settakassa.core.MakroExecutable;
import settakassa.felles.leveranse.Innsenderkontroll;
import settakassa.saldorente.leveranse.Leveransekontroll;
import settakassa.saldorente.leveranse.Oppgavegiverkontroll;
import settakassa.saldorente.leveranse.Oppgavekontroll;

public class SaldoRenteLeveransekontroll extends MakroExecutable {
	
	public SaldoRenteLeveransekontroll() {
		add(new Innsenderkontroll());
		add(new Oppgavegiverkontroll());
		add(new Oppgavekontroll());
		add(new Leveransekontroll());
	}
}

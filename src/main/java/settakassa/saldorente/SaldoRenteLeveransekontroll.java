package settakassa.saldorente;

import settakassa.core.MakroExecutable;
import settakassa.leveranse.Innsenderkontroll;
import settakassa.leveranse.Leveransekontroll;
import settakassa.leveranse.Oppgavegiverkontroll;
import settakassa.leveranse.Oppgavekontroll;

public class SaldoRenteLeveransekontroll extends MakroExecutable {
	
	public SaldoRenteLeveransekontroll() {
		add(new Innsenderkontroll());
		add(new Oppgavegiverkontroll());
		add(new Oppgavekontroll());
		add(new Leveransekontroll());
	}
}

package settakassa.saldorente.leveranse;

import settakassa.core.MakroExecutable;
import settakassa.felles.leveranse.Innsenderkontroll;
import settakassa.felles.leveranse.Oppgavegiverkontroll;

public class SaldoRenteKontroll extends MakroExecutable {

   public SaldoRenteKontroll() {
      add(new Innsenderkontroll());
      add(new Oppgavegiverkontroll());
      add(new Oppgavekontroll());
      add(new Leveransekontroll());
   }
}

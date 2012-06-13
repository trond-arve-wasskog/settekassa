package settakassa.felles.leveranse;

import settakassa.core.MakroExecutable;
import settakassa.saldorente.leveranse.Leveransekontroll;
import settakassa.saldorente.leveranse.Oppgavekontroll;

public class Kontroll extends MakroExecutable {

   public Kontroll() {
      add(new Innsenderkontroll());
      add(new Oppgavegiverkontroll());
      add(new Oppgavekontroll());
      add(new Leveransekontroll());
   }
}

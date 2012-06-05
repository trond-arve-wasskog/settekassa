package settakassa.felles.leveranse;

import settakassa.core.MakroExecutable;

public class Oppgavegiverkontroll extends MakroExecutable {
   public Oppgavegiverkontroll() {
      add(new IdentifisereOppgavegiver());
      add(new OppgavegiverGyldighetskontroll());
   }

}

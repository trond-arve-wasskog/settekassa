package settakassa.felles.leveranse;

import settakassa.core.MakroExecutable;

public class Innsenderkontroll extends MakroExecutable {
   public Innsenderkontroll() {
      add(new IdentifisereInnsender());
      add(new InnsenderGyldighetskontroll());
   }
}

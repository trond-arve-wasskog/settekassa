package settakassa.kop;

import settakassa.core.MakroExecutable;
import settakassa.felles.fil.LastOppLeveranse;
import settakassa.felles.fil.ValiderXmlLeveranseFil;
import settakassa.kop.leveranse.KopLeveransekontroll;

public class KopProsess extends MakroExecutable {
   public KopProsess() {
      add(new ValiderXmlLeveranseFil());
      add(new LastOppLeveranse());
      add(new KopLeveransekontroll());
   }
}

package settakassa.saldorente;

import settakassa.core.MakroExecutable;
import settakassa.felles.fil.LastOppLeveranse;
import settakassa.felles.fil.ValiderXmlLeveranseFil;
import settakassa.saldorente.leveranse.GenererKvittering;
import settakassa.saldorente.leveranse.SaldoRenteLeveransekontroll;

public class SaldoRenteProsess extends MakroExecutable {
   public SaldoRenteProsess() {
      add(new ValiderXmlLeveranseFil());
      add(new LastOppLeveranse());
      add(new SaldoRenteLeveransekontroll());
      add(new GenererKvittering());
   }

}

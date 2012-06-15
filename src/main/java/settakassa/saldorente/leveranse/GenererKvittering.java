package settakassa.saldorente.leveranse;

import settakassa.core.Executable;
import settakassa.domene.LeveranseId;

public class GenererKvittering implements Executable<LeveranseId> {
    public void execute(LeveranseId leveranseId) {
        System.out.println(String.format("Generere kvittering for leveranse med id %s", leveranseId));
    }

}

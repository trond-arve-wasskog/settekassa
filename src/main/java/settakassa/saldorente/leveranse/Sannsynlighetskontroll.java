package settakassa.saldorente.leveranse;

import settakassa.core.Executable;
import settakassa.domene.LeveranseId;

public class Sannsynlighetskontroll implements Executable<LeveranseId> {
    public void execute(LeveranseId leveranseId) {
        System.out.println(String.format("Sannsynlighetskontroll for leveranse med id %s", leveranseId));
    }

}

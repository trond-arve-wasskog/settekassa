package settakassa.saldorente.leveranse;

import settakassa.core.EntityId;
import settakassa.core.Executable;

public class LeveranseSannsynlighetskontroll implements Executable {
    public void execute(EntityId id) {
        System.out.println(String.format("Sannsynlighetskontroll for leveranse med id %s", id));
    }

}

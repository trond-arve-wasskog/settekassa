package settakassa.saldorente.leveranse;

import settakassa.core.EntityId;
import settakassa.core.Executable;

public class GenererKvittering implements Executable {
    public void execute(EntityId id) {
        System.out.println(String.format("Generere kvittering for leveranse med id %s", id));
    }

}

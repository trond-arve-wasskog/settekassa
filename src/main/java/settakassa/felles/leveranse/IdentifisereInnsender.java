package settakassa.felles.leveranse;

import settakassa.core.EntityId;
import settakassa.core.Executable;

public class IdentifisereInnsender implements Executable {
    public void execute(EntityId id) {
        System.out.println(String.format("Identifiserer innsender for leveranse med id %s", id));
    }

}

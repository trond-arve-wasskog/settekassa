package settakassa.felles.fil;

import settakassa.core.EntityId;
import settakassa.core.Executable;

public class ValiderXmlLeveranseFil implements Executable {
    public void execute(EntityId id) {
        System.out.println(String.format("Validerer leveranse fil for id %s", id));
    }
}

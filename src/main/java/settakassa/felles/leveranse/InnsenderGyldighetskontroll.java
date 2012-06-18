package settakassa.felles.leveranse;

import settakassa.core.Executable;
import settakassa.core.JobbInfo;
import settakassa.domene.LeveranseId;

public class InnsenderGyldighetskontroll implements Executable<LeveranseId> {
    public JobbInfo execute(LeveranseId id) {
        System.out.println(String.format("Gyldighetskontroll for leveranse med id %s", id));
        return new JobbInfo();
    }

}

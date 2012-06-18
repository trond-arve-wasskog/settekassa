package settakassa.saldorente.leveranse;

import settakassa.core.Executable;
import settakassa.core.JobbInfo;
import settakassa.domene.LeveranseId;

public class Innholdskontroll implements Executable<LeveranseId> {
    public JobbInfo execute(LeveranseId id) {
        System.out.println(String.format("Innholdskontroll for leveranse med id %s", id));
        return new JobbInfo();
    }

}

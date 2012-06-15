package settakassa.domene;

import java.util.UUID;

import settakassa.core.EntityId;

public abstract class Oppgave {
    // bruke UUID direkte...
    protected EntityId<String> id = new EntityId<String>(UUID.randomUUID().toString());
    private Long oppgaveeiersPartsnummer;

    public abstract String getIdentifikatorer();

    public abstract void innholdskontroll();

    public void setOppgaveeiersPartsnummer(Long partsnummer) {
        this.oppgaveeiersPartsnummer = partsnummer;
    }

    public abstract OppgaveId getOppgaveId();
}

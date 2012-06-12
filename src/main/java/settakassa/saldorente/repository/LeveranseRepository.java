package settakassa.saldorente.repository;

import java.util.Map;

import settakassa.core.EntityId;
import settakassa.domene.Oppgave;
import settekassa.domene.Leveranse;

import com.google.common.collect.Maps;

public class LeveranseRepository {
    public static final Map<EntityId, Oppgave> OPPGAVER = Maps.newHashMap();
    public static final Map<EntityId, Leveranse> LEVERANSE = Maps.newHashMap();

    public static Iterable<EntityId> hentOppgaveIDer(EntityId leveranseId) {
        return OPPGAVER.keySet();
    }

}

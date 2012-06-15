package settakassa.saldorente.repository;

import java.util.Map;

import settakassa.domene.Oppgave;
import settakassa.domene.OppgaveId;

import com.google.common.collect.Maps;

/**
 * Design kommentar: Leveranserepository vil være felles. I felles modulen har vi et generelt
 * oppgave-repository/interface. Hver ordning implementerer sin oppgave repository med sine bøtter. OPPGAVE_INN
 * inneholder de oppgavene som skal prosesseres. Denne ligger i felles modulen.
 */
public class OppgaveRepository {
    public static final Map<OppgaveId, Oppgave> OPPGAVER_INN = Maps.newHashMap();

    public static Iterable<OppgaveId> hentOppgaveIDer() {
        // vil hente oppgaveId'er som ligger på lokal node
        return OPPGAVER_INN.keySet();
    }

}

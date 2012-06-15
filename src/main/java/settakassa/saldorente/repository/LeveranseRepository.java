package settakassa.saldorente.repository;

import java.util.Map;

import settakassa.domene.Leveranse;
import settakassa.domene.LeveranseId;

import com.google.common.collect.Maps;

/**
 * Design kommentar: Leveranserepository vil være felles. I felles modulen har vi et generelt
 * oppgave-repository/interface. Hver ordning implementerer sin oppgave repository med sine bøtter. OPPGAVE_INN
 * inneholder de oppgavene som skal prosesseres. Denne ligger i felles modulen.
 */
public class LeveranseRepository {
    public static final Map<LeveranseId, Leveranse> LEVERANSER = Maps.newHashMap();
}

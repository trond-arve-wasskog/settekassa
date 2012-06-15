package settakassa.domene;

import java.io.Serializable;
import java.util.Set;

import settakassa.core.EntityId;

import com.google.common.collect.Sets;

/**
 * Emulerer en fil fra mottak. <br>
 * Foreløpig på dette formatet: <ORDNING>,leveranseId <br>
 * Eksempel: AKU,1
 */
public class Fil implements Serializable {

    private static Fil fil = null;
    public String oppgavetype;
    public Set<Leveranse> leveranser = Sets.newHashSet();
    public EntityId<Integer> id;

    public Fil(String oppgavetype, EntityId<Integer> id) {
        this.oppgavetype = oppgavetype;
        this.id = id;
    }

    public boolean erGyldig() {
        return true;
    }

}

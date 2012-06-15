package settakassa.domene;

import java.io.Serializable;
import java.util.Set;

import settakassa.core.EntityId;

import com.google.common.collect.Sets;

public class Innsending implements Serializable {
    public EntityId<Integer> id;

    private String oppgavetype; // dette ligger egentlig på Fil
    public final Set<Fil> filer = Sets.newHashSet();

    public Innsending(String oppgavetype) {
        this.oppgavetype = oppgavetype;
    }

    public void kontrollerFiler() {

    }

    public boolean erGyldig() {
        return true;
    }

    public Set<Leveranse> getLeveranser() {
        Set<Leveranse> leveranser = Sets.newHashSet();
        for (Fil fil : filer) {
            leveranser.addAll(fil.leveranser);
        }
        return leveranser;
    }

}

package settakassa.domene;

import java.util.Set;
import java.util.UUID;

import com.google.common.collect.Sets;

public class Innsending {
    public UUID id = UUID.randomUUID();

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

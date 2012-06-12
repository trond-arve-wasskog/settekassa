package settakassa.domene;

import java.util.Set;

import settakassa.core.EntityId;

import com.google.common.collect.Sets;

public class Innsending {

    Set<Leveranse> leveranser = Sets.newHashSet();

    public Set<Leveranse> getLeveranser() {
        // tilsvarende kode i magnet benytter Fil klassen til å generere leveransene fra Fil
        Leveranse leveranse = new Leveranse(new EntityId<Integer>(1));
        leveranser.add(leveranse);
        return leveranser;
    }

}

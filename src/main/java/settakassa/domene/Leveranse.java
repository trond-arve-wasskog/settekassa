package settakassa.domene;

import settakassa.core.EntityId;

public class Leveranse {

    private EntityId<Integer> id;// UUID

    public Leveranse(EntityId<Integer> id) {
        this.id = id;
    }

    public String getOppgavegiverOrgansisasjonsnummer() {
        return "981628736";
    }

    public void setOppgavegiverPartsnummer(Long partsnummer) {
        // TODO Auto-generated method stub
    }

    public EntityId<Integer> getId() {
        return id;
    }
}

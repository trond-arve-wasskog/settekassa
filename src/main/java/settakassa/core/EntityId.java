package settakassa.core;

import java.io.Serializable;

public class EntityId<V extends Serializable> {
    private V verdi;

    public EntityId(V verdi) {
        this.verdi = verdi;
    }

    public V getVerdi() {
        return verdi;
    }

    @Override
    public String toString() {
        return verdi.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((verdi == null) ? 0 : verdi.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        EntityId other = (EntityId) obj;
        if (verdi == null) {
            if (other.verdi != null)
                return false;
        } else if (!verdi.equals(other.verdi))
            return false;
        return true;
    }
}

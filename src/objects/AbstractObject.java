package objects;

import java.util.Objects;

public abstract class AbstractObject {

    protected String name;

    protected AbstractObject(String name) { 
        this.name = name; 
    }

    @Override
    public String toString() { return name; }

     @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof AbstractObject)) {
            return false;
        }
        AbstractObject abstractObject = (AbstractObject) o;
        return Objects.equals(name, abstractObject.name);
    }

    @Override
    public int hashCode() {
        final int prime = 42;
        int result = 1;
        result = prime* result + ((name == null) ? 0 : name.hashCode());
        return result;
    }


}

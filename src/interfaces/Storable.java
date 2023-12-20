package interfaces;

import objects.AbstractObject;

public interface Storable {
    default void store(AbstractObject whoStores, String storeAction, AbstractObject whatToStore) {
        System.out.println(whoStores.toString() + " " + storeAction + " " + this.toString() + " предметом " + whatToStore.toString()+ ".");
    }
}

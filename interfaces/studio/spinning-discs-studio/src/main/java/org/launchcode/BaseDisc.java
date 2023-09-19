package org.launchcode;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class BaseDisc {

    private final Integer storageCapacity;
    private final Integer minRPM;
    private final Integer maxRPM;
    private Integer storageUsed;

    private Integer storageLeft;
    private HashMap<String, Integer> storedInformation = new HashMap<>();

    public BaseDisc(Integer storageCapacity, Integer minRPM, Integer maxRPM, Integer storageUsed) {
        this.storageCapacity = storageCapacity;
        this.minRPM = minRPM;
        this.maxRPM = maxRPM;
        this.storageUsed = storageUsed;
        this.storageLeft = storageCapacity - storageUsed;
    }

    public Integer getStorageCapacity() {
        return storageCapacity;
    }

    public Integer getMinRPM() {
        return minRPM;
    }

    public Integer getMaxRPM() {
        return maxRPM;
    }

    public Integer getStorageUsed() {
        return storageUsed;
    }

    public HashMap<String, Integer> getStoredInformation(){
        return storedInformation;
    }

    public void writeData(String nameOfInfo, Integer spaceRequired){

        if (storageLeft < spaceRequired) {
            System.out.println("Not enough space.");
        } else {
            System.out.println("Added " + nameOfInfo + " to the CD.");
            storedInformation.put(nameOfInfo, spaceRequired);
            storageUsed += spaceRequired;
            storageLeft -= spaceRequired;
        }

    };

    public abstract void reportInformation();
}

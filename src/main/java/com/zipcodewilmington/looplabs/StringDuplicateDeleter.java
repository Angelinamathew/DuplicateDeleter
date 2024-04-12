package com.zipcodewilmington.looplabs;

import java.util.Arrays;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {
    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {

        String[] myArr = new String[array.length];
        int newArrayLength =0;
        for (int i=0; i<this.array.length; i++){
            int counter =0;
            for (int j=0; j<this.array.length; j++){
                if (this.array[i].equals(this.array[j])){
                    counter++;
                }
            }
            if(counter < maxNumberOfDuplications){
                myArr[newArrayLength] = this.array[i];
                newArrayLength++;

            }
        }
        return Arrays.copyOf(myArr, newArrayLength);
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        String[] myArr = new String[array.length];
        int newArrLength = 0;
        for (int i=0; i<array.length; i++){
            int duplicateCounter =0;
            for (int j=0; j<array.length; j++) {
                if (this.array[i].equals(this.array[j])) {
                    duplicateCounter++;
                }
            }
            if(duplicateCounter != exactNumberOfDuplications){
                myArr[newArrLength] = this.array[i];
                newArrLength++;
            }
        }
        return Arrays.copyOf(myArr, newArrLength);
    }

}


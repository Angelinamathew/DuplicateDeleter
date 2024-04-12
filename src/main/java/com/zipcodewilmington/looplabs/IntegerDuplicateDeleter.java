package com.zipcodewilmington.looplabs;

import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {
    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        Integer[] myArr = new Integer[array.length];
        int newArrayLength =0;
        for (int i=0; i<this.array.length; i++){
            int duplicateCounter =0;
            for (int j=0; j<this.array.length; j++){
                if (this.array[i].equals(this.array[j])){
                    duplicateCounter++;
                }
            }
            if(duplicateCounter < maxNumberOfDuplications){
                myArr[newArrayLength] = this.array[i];
                newArrayLength++;

            }
        }
        return Arrays.copyOf(myArr, newArrayLength);
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        Integer[] myArr = new Integer[array.length];
        int newArrayLength = 0;
        for (int i = 0; i < this.array.length; i++) {
            int duplicateCounter = 0;
            for (int j = 0; j < this.array.length; j++) {
                if (this.array[i].equals(this.array[j])) {
                    duplicateCounter++;
                }
            }
            if (duplicateCounter != exactNumberOfDuplications) {
                myArr[newArrayLength] = this.array[i];
                newArrayLength++;

            }
        }
        return Arrays.copyOf(myArr, newArrayLength);
    }
}

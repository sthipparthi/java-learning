/**
 *
 Given two non-empty arrays of integers, write a function that determines
 whether the second array is a subsequence of the first one.


 A subsequence of an array is a set of numbers that aren't necessarily adjacent
 in the array but that are in the same order as they appear in the array. For
 instance, the numbers <span>[1, 3, 4]</span> form a subsequence of the array
 <span>[1, 2, 3, 4]</span>, and so do the numbers <span>[2, 4]</span>. Note
 that a single number in an array and the array itself are both valid
 subsequences of the array.
 */
import java.util.*;

class Program {
    public static boolean isValidSubsequence(
            List<Integer> array, List<Integer> sequence
    ) {
        int arrayStartIndex = 0;
        int sequenceStartIndex = 0;
        List<Integer> sequenceValidatedArray = new ArrayList();
        for(;sequenceStartIndex< sequence.size(); sequenceStartIndex++) {
            System.out.println("SequenceStartIndex :: "+sequenceStartIndex);
            System.out.println("Sequence :: "+sequence.get(sequenceStartIndex));
            for(; arrayStartIndex < array.size(); arrayStartIndex++) {
                System.out.println("arrayStartIndex :: "+arrayStartIndex);
                System.out.println("Array :: "+array.get(arrayStartIndex));
                if(sequence.get(sequenceStartIndex) == array.get(arrayStartIndex)) {
                    sequenceValidatedArray.add(sequence.get(sequenceStartIndex));
                    System.out.println("Match!!");
                    arrayStartIndex++;
                    break;
                }
            }
        }
        if(sequenceValidatedArray.size() == sequence.size()) {
            return true;
        }
        return false;
    }
}


/**
 * Write a description of class SelfDivisor here.
 *
 * @author (Casey Groves)
 * @version (November 1, 2018)
 */
public class SelfDivisor
{

    /**
     * @param  number the number to be tested
     * @return true if every decimal digit is a divisor of number; 
     *         false otherwise
     */
    public static boolean isSelfDivisor(int number)
    {
        int currentNum = number;
        while (currentNum > 0){
            int last = currentNum % 10;
            if (last == 0 || number % last != 0){
                return false;
            }
            currentNum /= 10;
        }
        return true;
    }
    
    /**
     * @param start starting point for values to be checked
     * @param num the size of the array to be returned
     * @return an array containing the first num integers >= start that are 
     *         self-divisors
     */
    public static int[] firstNumSelfDivisors(int start, int num){
        int[] selfDivisors = new int[num];
        int spacesLeft = num;
        int loc = 0;
        int number = start;
        while (loc < num){
            if (isSelfDivisor(number)){
                selfDivisors[loc] = number;
                loc++;
            }
            number++;
        }
        return selfDivisors;
    }
    
    public static void main(String [] args){
        System.out.println(isSelfDivisor(128));
        System.out.println(isSelfDivisor(26));
        System.out.println(firstNumSelfDivisors(10, 3));
        System.out.println(firstNumSelfDivisors(21, 4));
    }
}

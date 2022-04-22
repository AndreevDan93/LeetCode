/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
   public int guessNumber(int n) {
        int k = 1,
        kN = n;
        int imputNumber = 1;
        while(k <= kN){
            imputNumber = k+(kN-k)/2;     
            if(guess(imputNumber) == 0) break;
            else if(guess(imputNumber) == -1) kN = imputNumber-1;
            else
                k = imputNumber+1;
        }
       return imputNumber; 
    }
}
/*
 *****
 *   *
 *   *
 *   *
 *****
 */

package DSAPractice;
public class SquarePattern {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i<=n; i++){
            int stars = i==1 || i==n ? n : 1;
            int spaces = i==1 || i==n ? 0 : n-2;
            for (int j = 1; j<=stars; j++){
                System.out.print("*");
            }
            for (int k =1 ; k<=spaces; k++){
                System.out.print(" ");
            }
            for (int l = 1; l<=stars; l++){
                if (i==1 || i==n){}
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}

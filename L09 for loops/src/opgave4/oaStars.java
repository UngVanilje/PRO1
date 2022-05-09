package opgave4;

public class oaStars
{
    public static void starExA(int rowCount)
    {
        for (int row = 1; row <= rowCount; row++) {
            System.out.printf("%2d: ", row);
            int starCount = row;
            int dashCount = rowCount - starCount;
            for (int i = 1; i <= dashCount; i++) {
                System.out.print("-");
            }
            for (int i = 1; i <= starCount; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}

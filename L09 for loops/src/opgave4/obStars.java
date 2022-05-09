package opgave4;

public class obStars {
    public void starExA(int rowCount)
    {
        for (int row = 0; row < rowCount; row++) {
            System.out.printf("%2d: ", row);
            int starCount = rowCount - row;
            int dashCount = row;
            for (int i = 1; i <= starCount; i++) {
                System.out.print("*");
            }
            for (int i = 1; i <= dashCount; i++) {
                System.out.print("-");
            }
            System.out.println();
        }
    }
}

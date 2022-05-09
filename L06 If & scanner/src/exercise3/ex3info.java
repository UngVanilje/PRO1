package exercise3;

import org.w3c.dom.css.Counter;

import javax.crypto.interfaces.PBEKey;

//a)
public class ex3info {
    private int paperCount;
    private boolean paperStuck = false;

    public ex3info() {
        paperCount = 0;
    }

    public ex3info(int paperCount) {
        this.paperCount = paperCount;
    }

    public int getPaperCount() {
        return paperCount;
    }

    //b)
    public void makeCopy() {
        paperCount = paperCount - 1;
        if (paperCount == 0) {
            System.out.println("Error no more paper");
        }
        if (paperStuck == true) {
            System.out.println("Error paper is stuck");
        }
    }

    //c)
    public void insertPaper(int count) {
        this.paperCount = paperCount + count;
        if (paperCount > 500) {
            System.out.println("Error paper storage is full");
        }
        if (paperStuck == true) {
            System.out.println("Error paper is stuck");
        }
    }
    //d)

    public void makeCopy(int copies) {
        if (paperCount < copies) {
            System.out.println("Not enough paper");
        }
        if (paperStuck == true) {
            System.out.println("Error paper is stuck");
        }
        if (paperCount == 0) {
            System.out.println("Error no more paper");
        }
    }

    //e)
    public void makePaperJam() {
        this.paperStuck = true;

    }

    //g)
    public void fixJam() {
        if (paperStuck == true) {
            this.paperStuck = false;
            System.out.println("Paper jam has been resolved");
        }
    }


}

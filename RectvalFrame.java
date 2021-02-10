import javax.swing.JFrame;
import java.awt.Container;


public class RectvalFrame extends JFrame {
	// Constants for setting the colors of the shapes
    static final int R_RED = 22, R_GREEN = 2, R_BLUE = 159;
    static final int O_RED = 0, O_GREEN = 255, O_BLUE = 0;
	
	// Default constructor for the class
    RectvalFrame(){
        setTitle("The frame for this project");
        setBounds(250,150,400,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        TwoShapes rO = new TwoShapes(R_RED, R_GREEN, R_BLUE, O_RED, O_GREEN, O_BLUE);
       
        Container paneForContent = getContentPane();

        paneForContent.add(rO);
    }

    // Constructor for class
    RectvalFrame(int rR, int rG, int rB, int oR, int oG, int oB){
        setTitle("The frame for this project");
        setBounds(250,150,400,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        TwoShapes rO = new TwoShapes(rR, rG, rB, oR, oG, oB);
       
        Container paneForContent = getContentPane();

        paneForContent.add(rO);
    }
}

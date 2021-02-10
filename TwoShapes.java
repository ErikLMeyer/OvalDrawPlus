import javax.swing.JPanel;
import java.awt.*;

public class TwoShapes extends JPanel {
	// Variables for the colors of the shapes
    private Color rColor;
    private Color oColor;

	// Sets the color of the rectangle
    public void setRColor(int r, int g, int b){
        rColor = new Color(r,g,b);
    }

	// Sets the color of the oval
    public void setOColor(int r, int g, int b){
        oColor = new Color(r,g,b);
    }
	
	// Returns the color of the rectangle
    public Color getRColor(){
        return rColor;
    }

	// Returns the color of the oval
    public Color getOColor(){
        return oColor;
    }

	// Default constructor
    TwoShapes(){
        setRColor(0, 0, 255);
        setOColor(255, 0, 0);
    }

	// Class constructor. Takes int values for the rgb values of the rectangle and oval
    TwoShapes(int rR, int rG, int rB, int oR, int oG, int oB){
        setRColor(rR, rG, rB);
        setOColor(oR, oG, oB);
    }

	// Implementation of the paintComponent abstract method. First paints the rectangle, and then 
	// the oval
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        int width = super.getWidth();
        int height = super.getHeight();

        g.setColor(rColor);
        g.fillRect(0, 0, width, height);
        g.setColor(oColor);
        g.fillOval(0, 0, width, height);
    }
}

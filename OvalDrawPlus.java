import java.awt.event.*;

public class OvalDrawPlus {
    public static void main(String args[]){
        System.out.println("Starting OvalDrawPlus...");

        RectvalFrame roFrame = new RectvalFrame();
        roFrame.setVisible(true);
        
        WindowListener l = new WindowAdapter(){
            public void windowClosing(WindowEvent ev){
                System.out.println("Closing OvalDrawPlus...");
            }
        };
        roFrame.addWindowListener(l);
    }
}

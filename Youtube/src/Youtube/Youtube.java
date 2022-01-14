
package Youtube;
import java.util.Scanner;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;


public class Youtube {

    
    public static void main(String[] args) {
 
      
     final JFrame frame = new JFrame();
     frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
     frame.setSize(720, 1380);
     frame.setTitle("Youtube");
   
     
     
     final JFXPanel fxpanel = new JFXPanel();
     frame.add(fxpanel);
 Scanner url = new Scanner(System.in);
        
     Platform.runLater(new Runnable() {
         @Override
         public void run(){
             
             
             WebEngine engine;
             WebView wv = new WebView();
             engine = wv.getEngine();
             fxpanel.setScene(new Scene(wv));
             engine.load("http://www.youtube.com");
           ;
             
             
         }
        
    });
     
     frame.setVisible(true);
    
    }
    
}

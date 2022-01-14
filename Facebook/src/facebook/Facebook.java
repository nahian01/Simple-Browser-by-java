<<<<<<< HEAD

package Facebook;
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


public class Facebook {

    
    public static void main(String[] args) {
 
      
     final JFrame frame = new JFrame();
     frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
     frame.setSize(720, 1380);
     frame.setTitle("Facebook");
   
     
     
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
             engine.load("http://www.facebook.com");
           ;
             
             
         }
        
    });
     
     frame.setVisible(true);
    
    }
    
}
=======

package Facebook;
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


public class Facebook {

    
    public static void main(String[] args) {
 
      
     final JFrame frame = new JFrame();
     frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
     frame.setSize(720, 1380);
     frame.setTitle("Facebook");
   
     
     
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
             engine.load("http://www.facebook.com");
           ;
             
             
         }
        
    });
     
     frame.setVisible(true);
    
    }
    
}
>>>>>>> 4542fbd2c3343e2eeaf44e9a57c9a58f9d9b8213

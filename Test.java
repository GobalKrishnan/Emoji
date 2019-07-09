package gki.test;
import java.awt.image.BufferedImage;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import gki.emoji.Emoji;
import gki.emoji.EmojiListener;



public class Test extends JFrame{
    public Test() throws MalformedURLException, URISyntaxException {
    	
      JLabel se=new JLabel();
      se.setBounds(0, 0, 250, 250);
      add(se);
    	Emoji e=new Emoji(this);
    	e.addEmojiListener(new EmojiListener() {
			
			@Override
			public void emoji(BufferedImage arg0, URL arg1) {
				// TODO Auto-generated method stub
				se.setIcon(new ImageIcon(arg1));
				//System.out.println(new File(arg1.getFile()).getName());
			}
		});
    	add(e);
    	setIconImage(new ImageIcon(getClass().getResource("/gki/logo/logo.png")).getImage());
    	setVisible(true);
    	setSize(500, 500);
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
    	setTitle("Gobal Krishnan V");
    }
    
   
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
       try {
		new Test();
	} catch (MalformedURLException | URISyntaxException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}

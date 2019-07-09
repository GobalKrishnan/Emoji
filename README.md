# Emoji
Emoji class Code in java
https://www.youtube.com/watch?v=0pcqL8ogla4

package gki.test;<br>
import java.awt.image.BufferedImage;<br>
import java.net.MalformedURLException;<br>
import java.net.URISyntaxException;<br>
import java.net.URL;<br>
import javax.swing.ImageIcon;<br>
import javax.swing.JFrame;<br>
import javax.swing.JLabel;<br>
import javax.swing.UIManager;<br>
import javax.swing.UnsupportedLookAndFeelException;<br>

import gki.emoji.Emoji;<br>
import gki.emoji.EmojiListener;<br>



public class Test extends JFrame{<br>
    public Test() throws MalformedURLException, URISyntaxException {<br>
    	
      JLabel se=new JLabel();<br>
      se.setBounds(0, 0, 250, 250);<br>
      add(se);<br>
    	Emoji e=new Emoji(this);<br>
    	e.addEmojiListener(new EmojiListener() {<br>
			
			@Override<br>
			public void emoji(BufferedImage arg0, URL arg1) {<br>
				// TODO Auto-generated method stub<br>
				se.setIcon(new ImageIcon(arg1));<br>
				//System.out.println(new File(arg1.getFile()).getName());<br>
			}<br>
		});<br>
    	add(e);<br>
    	setIconImage(new ImageIcon(getClass().getResource("/gki/logo/logo.png")).getImage());<br>
    	setVisible(true);<br>
    	setSize(500, 500);<br>
    	setDefaultCloseOperation(EXIT_ON_CLOSE);<br>
    	setTitle("Gobal Krishnan V");<br>
    }<br>
    
   
    
	public static void main(String[] args) {<br>
		// TODO Auto-generated method stub<br>
		try {<br>
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());<br>
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException<br>
				| UnsupportedLookAndFeelException e) {<br>
			// TODO Auto-generated catch block<br>
			e.printStackTrace();<br>
		}
		
       try {<br>
		new Test();<br>
	} catch (MalformedURLException | URISyntaxException e) {<br>
		// TODO Auto-generated catch block<br>
		e.printStackTrace();<br>
	}<br>
	}<br>

}<br>


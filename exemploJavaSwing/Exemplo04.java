package exemploJavaSwing;

import java.awt.Frame;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Exemplo04 {
	Exemplo04(){
		final Frame f= new Frame("PopupMenu Example");  
        final PopupMenu popupmenu = new PopupMenu("Edit");   
        MenuItem cut = new MenuItem("Cut");  
        cut.setActionCommand("Cut");  
        MenuItem copy = new MenuItem("Copy");  
        copy.setActionCommand("Copy");  
        MenuItem paste = new MenuItem("Paste");  
        paste.setActionCommand("Paste");      
        popupmenu.add(cut);  
        popupmenu.add(copy);  
        popupmenu.add(paste);        
        f.addMouseListener(new MouseAdapter() {  
           public void mouseClicked(MouseEvent e) {              
               popupmenu.show(f , e.getX(), e.getY());  
           }                 
        });  
        f.add(popupmenu);   
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);  
    }  
public static void main(String args[])  {  
       new Exemplo04();  
}  

} 

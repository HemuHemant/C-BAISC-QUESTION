
package listbox;

import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame
{
    List l;
    Choice c;
    TextArea ta;
    MyFrame()
    {
        super("list Box Demo");
        l=new List(4,true);//;at time 4 show
        c=new Choice();
        ta=new TextArea(20,30);
        
        l.add("Monday");
        l.add("Tuesday");
        l.add("Wed");
        l.add("thuresday");
        l.add("Friday");
        l.add("saturaday");
        l.add("sunday");
        
        c.add("Janurary");
        c.add("Feb");
        c.add("March");
        c.add("April");
        
        setLayout(new FlowLayout());
        add(l);
        add(c);
        add(ta);
    }
}
public class lec11 {
    
}

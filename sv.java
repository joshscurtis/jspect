

/*
 * Java Core libarary calls
 */ 
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;
import java.io.*;


public class sv	extends JFrame
{

	
	//
	// this class will be the interface
	//	so we now need a thread for the
	//	capture of data
	//
	public sv(){
		super("JSpect Spectrum Analysis");
		
		getContentPane().setLayout(new BorderLayout());
		
		try{
		
		// set-up rta canvas, should be a class
		rta_canvas rt = new rta_canvas();
		rt.setSize(800,400);
		getContentPane().add("Center",rt);
		
		// create capture thread and start, need to link to rta_canvas
		
		input_source i = new input_source(rt);
		i.start();
		
		
		}catch(Exception e){}
		
	}

	public static void main(String[] args){
		JFrame s = new sv();
	
		
	
		s.setDefaultCloseOperation( EXIT_ON_CLOSE);
		s.pack();
		s.setSize(800,400);
		s.setVisible(true);
		s.setResizable(false);
	}


}

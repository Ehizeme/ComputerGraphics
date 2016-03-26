//
//  lineTest.java
//
//  Created by Joe Geigel on 1/21/10.
//  Copyright 2014 Rochester Institute of Technology. All rights reserved.
//
//  Modified by Vasudev Prasad Bethamcherla on 08/19/2014
//
//  Contributor:  Ehizeme Aruya
//

import java.awt.*;
import java.awt.event.*;

public class lineTest implements KeyListener {

    private static int drawHeight = 600;
    private static int drawWidth = 600;

    private simpleCanvas S;
    private Rasterizer R;

    lineTest( int w, int h )
    {

        S = new simpleCanvas( 600, 600 );
        R = new Rasterizer( 600 );

        S.setColor (0.0f, 0.0f, 0.0f);
        S.clear();
        S.setColor (1.0f, 1.0f, 1.0f);

// Idea for lettering style from:
// http://patorjk.com/software/taag/#p=display&f=Star%20Wars&t=Type%20Something
//          _______   ______   
//         /  _____| /  __  \
//        |  |  __  |  |  |  | 
//        |  | |_ | |  |  |  | 
//        |  |__| | |  `--'  | 
//         \______|  \______/

        // ######## The letter 'G' in green ########
        S.setColor( 0.0f, 1.0f, 0.0f );
        R.drawLine( 80, 340, 220, 340, S );   // Horizontal left to right 
        R.drawLine( 40, 380, 80, 340, S );    // 315 degree slope        
        R.drawLine( 220, 340, 260, 380, S );  // 45 degree slope          
        R.drawLine( 260, 380, 260, 440, S );  // Vertical bottom to top
        R.drawLine( 260, 440, 180, 440, S );  // Horizontal right to left
        R.drawLine( 180, 440, 180, 400, S );
        R.drawLine( 180, 400, 220, 400, S );
        R.drawLine( 220, 400, 200, 380, S );
        R.drawLine( 200, 380, 100, 380, S );
        R.drawLine( 100, 380, 80, 400, S );
        R.drawLine( 80, 400, 80, 500, S );
        R.drawLine( 80, 500, 100, 520, S );
        R.drawLine( 100, 520, 200, 520, S );
        R.drawLine( 200, 520, 220, 500, S );
        R.drawLine( 220, 500, 220, 480, S );
        R.drawLine( 220, 480, 260, 480, S );
        R.drawLine( 260, 480, 260, 520, S );
        R.drawLine( 260, 520, 220, 560, S );  // 135 degree slope
        R.drawLine( 220, 560, 80, 560, S );
        R.drawLine( 80, 560, 40, 520, S );    // 225 degree slope
        R.drawLine( 40, 520, 40, 380, S );    // Vertical top to bottom

        // ######## The letter 'O' in orange ########
        S.setColor( 1.0f, 0.647f, 0.0f );
        R.drawLine( 450, 320, 520, 340, S );  // 16.6 degree slope
        R.drawLine( 520, 340, 540, 360, S );  // 45 degree slope
        R.drawLine( 540, 360, 560, 450, S );  // 77.47 degree slope
        R.drawLine( 560, 450, 540, 540, S );  // 102.83 degree slope
        R.drawLine( 540, 540, 520, 560, S );  // 135 degree slope
        R.drawLine( 520, 560, 450, 580, S );  // 163.3 degree slope
        R.drawLine( 450, 580, 380, 560, S );  // 196.71 degree slope
        R.drawLine( 380, 560, 360, 540, S );  // 225 degree slope
        R.drawLine( 360, 540, 340, 450, S );  
        R.drawLine( 340, 450, 360, 360, S );
        R.drawLine( 360, 360, 380, 340, S );
        R.drawLine( 380, 340, 450, 320, S );
        R.drawLine( 420, 380, 480, 380, S );
        R.drawLine( 480, 380, 520, 420, S );
        R.drawLine( 520, 420, 520, 480, S );
        R.drawLine( 520, 480, 480, 520, S );
        R.drawLine( 480, 520, 420, 520, S );
        R.drawLine( 420, 520, 380, 480, S );
        R.drawLine( 380, 480, 380, 420, S );
        R.drawLine( 380, 420, 420, 380, S );

        // ##### Use light blue to write your initials #####
        
        //
        // YOUR CODE HERE
        //

        // Initial E
        S.setColor( 0.678f, 0.847f, 0.902f );
        R.drawLine(40, 70, 40, 220, S ); // Longest Vertical Line
        R.drawLine(40, 70, 80, 40, S);   
        R.drawLine(80, 260, 220, 260, S); // Top horizontal line
        R.drawLine(80, 40, 220, 40, S);   // Lowest horizontal line
        R.drawLine(40, 220, 80, 260, S); 
        R.drawLine(220, 260, 260, 220, S);
        R.drawLine(260, 220, 100, 220, S);
        R.drawLine(100, 220, 90, 210, S);
        R.drawLine(90, 210, 90, 180, S);
        R.drawLine(90, 180, 100, 170, S);
        R.drawLine(100, 170, 260, 170, S);
        R.drawLine(260, 170, 260, 130, S);
        R.drawLine(260, 130, 100, 130, S);
        R.drawLine(100, 130, 90, 120, S);
        R.drawLine(90, 120, 90, 90, S);
        R.drawLine(90, 90, 100, 80, S);
        R.drawLine(100, 80, 260, 80, S);
        R.drawLine(220, 40, 260, 80, S);
        
        // Initial A
        // Outer polygon
        R.drawLine(430, 260, 470, 260, S);
        R.drawLine(430, 260, 340, 40, S);
        R.drawLine(340, 40, 390, 40, S);
        R.drawLine(390, 40, 420, 120, S);
        R.drawLine(420, 120, 480, 120, S);
        R.drawLine(480, 120,510, 40, S);
        R.drawLine(510,40, 560, 40, S);
        R.drawLine(470, 260, 560, 40, S);
        
        //Inner polygon for the A
        R.drawLine(425, 150, 470, 150, S);
        R.drawLine(425, 150, 440, 200, S);
        R.drawLine(440, 200, 455, 200, S);
        R.drawLine(455, 200, 470, 150, S);
    }

    // Because we are a KeyListener
    public void keyTyped(KeyEvent e)
    {
        // What key did we type?
        char key = e.getKeyChar();

        if( (key == 'Q') || (key == 'q') ) System.exit(0); // quit

    }
    public void keyPressed(KeyEvent e) {}
    public void keyReleased(KeyEvent e) {}

    static public void main(String[] args)
    {

        lineTest L = new lineTest (drawWidth, drawHeight);
        L.S.addKeyListener (L);

        Frame f = new Frame( "Line Test" );
        f.add("Center", L.S);
        f.pack();
        f.setResizable (false);
        f.setVisible(true);

        f.addWindowListener( new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        } );


    }
}

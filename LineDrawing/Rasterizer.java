//
//  Rasterizer.java
//
//  Created by Joe Geigel on 1/21/10.
//  Copyright 2010 Rochester Institute of Technology. All rights reserved.
//
//  Contributor:  Ehizeme Aruya
//

///
// 
// A simple class for performing rasterization algorithms.
//
///

import java.util.*;

public class Rasterizer {
    
    ///
    // number of scanlines
    ///

    int n_scanlines;
    
    ///
    // Constructor
    //
    // @param n number of scanlines
    //
    ///

    Rasterizer (int n)
    {
        n_scanlines = n;
    }
    
    ///
    // Draw a line from (x0,y0) to (x1, y1) on the simpleCanvas C.
    //
    // Implementation should be using the Midpoint Method
    //
    // You are to add the implementation here using only calls
    // to C.setPixel()
    //
    // @param x0 x coord of first endpoint
    // @param y0 y coord of first endpoint
    // @param x1 x coord of second endpoint
    // @param y1 y coord of second endpoint
    // @param C  The canvas on which to apply the draw command.
    ///

    public void drawLine (int x0, int y0, int x1, int y1, simpleCanvas C)
    {
        // YOUR IMPLEMENTATION GOES HERE
      
        // Calculate changes in x value for the line
        int deltaX = x1 - x0;
        
        // Calculate changes in y values for the line
        int deltaY = y1 - y0;
        
        // Values for checking the direction and slope of the line
        // We have to take care of situations containing arbitary values
        // of x and y.
        int absoluteDeltaX = Math.abs(deltaX);
        int absoluteDeltaY = Math.abs(deltaY);
        int numerator;
        int dx1 = 0;
        int dy1 = 0; 
        int dx2 = 0;
        int dy2 = 0;
        
        // Check for the direction of the line from right to left
        if(deltaX < 0)
        {
            dx1 = -1;
        }
        else if (deltaX > 0)
        {
            dx1 = 1;
        }
        
        // Check for lines sloping upwards and lines sloping downwards
        if(deltaY < 0)
        {
            dy1 = -1; 
        }
        else if(deltaY > 0)
        {
            dy1 = 1;
        }
        
        
        if(deltaX < 0) 
        {
            dx2 = -1; 
        }
        else if ( deltaX > 0)
        {
            dx2 = 1;
        }
        
        // If the slope is outside the range, we swap X and Y
        if( !(absoluteDeltaX > absoluteDeltaY))
        {
            absoluteDeltaX = Math.abs(deltaY);
            absoluteDeltaY = Math.abs(deltaX);
            if(deltaY  < 0) 
            {
                dy2 = -1; 
            }
            else if(deltaY > 0) 
            {
                dy2 = 1;
            }
            dx2 = 0;
        }
        
        numerator = absoluteDeltaX >> 1;
        for (int i=0 ; i<=absoluteDeltaX ; i++)
        {
            C.setPixel(x0,y0);
            numerator = numerator + absoluteDeltaY ;
            if (!(numerator<absoluteDeltaX)) 
            {
                numerator = numerator - absoluteDeltaX ;
                x0 = x0 + dx1 ;
                y0 = y0 + dy1 ;
            } 
            else 
            {
                x0 = x0 + dx2 ;
                y0 = y0 + dy2 ;
            }
        }
    }    
}

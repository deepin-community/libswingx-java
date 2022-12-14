/**
 * 
 */
package org.jdesktop.swingx;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

import junit.framework.TestCase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 *
 * @author Karl George Schaefer
 */
@RunWith(JUnit4.class)
public class HorizontalLayoutTest extends TestCase {
    /**
     * SwingX Issue #666: incorrect calculation of preferred size.
     */
    @Test
    public void testLayout() {
        JPanel panel = new JPanel(new HorizontalLayout());
        
        JPanel p = new JPanel();
        p.setOpaque(true);
        p.setBackground(Color.RED);
        p.setPreferredSize(new Dimension(50, 25));
        panel.add(p);
        
        p = new JPanel();
        p.setOpaque(true);
        p.setBackground(Color.WHITE);
        p.setPreferredSize(new Dimension(125, 15));
        panel.add(p);
        
        p = new JPanel();
        p.setOpaque(true);
        p.setBackground(Color.BLUE);
        p.setPreferredSize(new Dimension(30, 30));
        panel.add(p);
        
        assertEquals(new Dimension(205, 30), panel.getPreferredSize());
    }
}

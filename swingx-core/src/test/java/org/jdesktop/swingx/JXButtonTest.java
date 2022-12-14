/*
 * $Id: JXButtonTest.java 3729 2010-07-20 02:57:36Z kschaefe $
 *
 * Copyright 2006 Sun Microsystems, Inc., 4150 Network Circle,
 * Santa Clara, California 95054, U.S.A. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 *
 */
package org.jdesktop.swingx;


import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;
import junit.framework.TestCase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Unit test for <code>JXButton</code>.
 * <p>
 * 
 * All test methods in this class are expected to pass. 
 * 
 * @author rah003
 */
@RunWith(JUnit4.class)
public class JXButtonTest extends TestCase {
    /**
     *
     */
    @Test
    public void testDefaultIsNoPainters() {
        JXButton b = new JXButton();
    	assertThat(b.getForegroundPainter(), is(nullValue()));
    	assertThat(b.getBackgroundPainter(), is(nullValue()));
    }
 }

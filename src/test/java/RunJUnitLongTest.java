/*
 * Copyright (c) 2017, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

import org.junit.Ignore;
import org.junit.Test;

/**
 * Simple wrapper on Marlin long tests
 */
public class RunJUnitLongTest {

    @Test
    public void clipTests() {
        ClipShapeTest.main(new String[]{"-poly"});                    // OK
        ClipShapeTest.main(new String[]{"-poly", "-doDash"});         // OK
/*
        ClipShapeTest.main(new String[]{"-quad"});                    // OK (offsets are slightly fixed)
        ClipShapeTest.main(new String[]{"-quad", "-doDash"});         // OK (offsets are less different)
*/
        ClipShapeTest.main(new String[]{"-cubic"});                   // OK (offsets are slightly fixed)
        ClipShapeTest.main(new String[]{"-cubic", "-doDash"});        // OK
    }

    @Ignore
    @Test
    public void clipTestsDoScale() {
        ClipShapeTest.main(new String[]{"-doScale"});
    }

    @Ignore
    @Test
    public void clipTestsDoShear() {
        ClipShapeTest.main(new String[]{"-doScale", "-doShear"});
    }

    @Ignore
    @Test
    public void clipTestsSlow() {
        ClipShapeTest.main(new String[]{"-slow"});
    }
}
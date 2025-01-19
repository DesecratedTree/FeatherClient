/* QueryPerformanceCounter - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.runescape.jaclib.nanotime;

public class QueryPerformanceCounter {
	private QueryPerformanceCounter() throws Throwable {
		throw new Error();
	}

	public static native boolean init();

	public static native long nanoTime();

	public static native void quit();
}

/* VorbisBlock - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.runescape.jagtheora.vorbis;

import com.runescape.jagtheora.misc.SimplePeer;
import com.runescape.jagtheora.ogg.OggPacket;

public class VorbisBlock extends SimplePeer {
	public VorbisBlock(DSPState dspstate) {
		init(dspstate);
		if (a())
			throw new IllegalStateException();
	}

	private native void init(DSPState dspstate);

	public native int synthesis(OggPacket oggpacket);

	protected native void clear();

	protected native void k();

	protected native void d();
}

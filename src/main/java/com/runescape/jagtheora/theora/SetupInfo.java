/* SetupInfo - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.runescape.jagtheora.theora;

import com.runescape.jagtheora.misc.SimplePeer;
import com.runescape.jagtheora.ogg.OggPacket;

public class SetupInfo extends SimplePeer {
	public native int decodeHeader(TheoraInfo theorainfo, TheoraComment theoracomment, OggPacket oggpacket);

	protected native void clear();

	protected native void k();

	protected native void d();
}

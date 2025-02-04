package com.runescape;
/* Class298_Sub37_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class AnimFrameset extends Class298_Sub37 {
	private final boolean osrs;
	Class96[] aClass96Array9579;
	int framegroup;
	byte[][] aByteArrayArray9581;
	static CacheIndex aClass243_9582;

	public boolean method3412(byte i) {
		try {
			if (((AnimFrameset) this).aClass96Array9579 != null)
				return true;
			if (((AnimFrameset) this).aByteArrayArray9581 == null) {
				synchronized (Class317.aClass243_3321) {
					if (!Class317.aClass243_3321.method2291(1899473659 * ((AnimFrameset) this).framegroup, 334179097)) {
						boolean bool = false;
						return bool;
					}
					int[] is = (Class317.aClass243_3321.getFileIds((((AnimFrameset) this).framegroup * 1899473659), -2074944518));
					((AnimFrameset) this).aByteArrayArray9581 = new byte[is.length][];
					for (int i_0_ = 0; i_0_ < is.length; i_0_++)
						((AnimFrameset) this).aByteArrayArray9581[i_0_] = (Class317.aClass243_3321.getFileFromArchive((1899473659 * ((AnimFrameset) this).framegroup), is[i_0_], (byte) -7));
				}
			}
			boolean bool = true;
			for (int i_1_ = 0; (i_1_ < ((AnimFrameset) this).aByteArrayArray9581.length); i_1_++) {
				byte[] is = ((AnimFrameset) this).aByteArrayArray9581[i_1_];
				RsByteBuffer class298_sub53 = new RsByteBuffer(is);
				class298_sub53.index = osrs ? 0 : 116413311;
				int baseid = class298_sub53.readUnsignedShort();
				if (osrs) {
					baseid += OSRSData.BASES_OFFSET;
				}
				synchronized (aClass243_9582) {
					bool &= aClass243_9582.method2310(baseid, -457216440);
				}
			}
			if (!bool)
				return false;
			Class458 class458 = new Class458();
			int[] is;
			synchronized (Class317.aClass243_3321) {
				int i_3_ = (Class317.aClass243_3321.method2316(((AnimFrameset) this).framegroup * 1899473659, -222662329));
				((AnimFrameset) this).aClass96Array9579 = new Class96[i_3_];
				is = Class317.aClass243_3321.getFileIds((((AnimFrameset) this).framegroup * 1899473659), -2046558264);
			}
			for (int i_4_ = 0; i_4_ < is.length; i_4_++) {
				byte[] is_5_ = ((AnimFrameset) this).aByteArrayArray9581[i_4_];
				RsByteBuffer class298_sub53 = new RsByteBuffer(is_5_);
				class298_sub53.index = osrs ? 0 : 116413311;
				int baseid = class298_sub53.readUnsignedShort();
				if (osrs) {
					baseid += OSRSData.BASES_OFFSET;
				}
				AnimBase animBase = null;
				for (AnimBase animBase_7_ = (AnimBase) class458.method5967(2084946117); animBase_7_ != null; animBase_7_ = (AnimBase) class458.method5969((byte) -23)) {
					if (baseid == (((AnimBase) animBase_7_).anInt7276 * 1029066723)) {
						animBase = animBase_7_;
						break;
					}
				}
				if (null == animBase) {
					synchronized (aClass243_9582) {
						animBase = (new AnimBase(baseid, aClass243_9582.method2294(baseid, (byte) 34)));
					}
					class458.method5968(animBase, 805140432);
				}
				((AnimFrameset) this).aClass96Array9579[is[i_4_]] = new Class96(is_5_, animBase);
			}
			((AnimFrameset) this).aByteArrayArray9581 = null;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aih.f(").append(')').toString());
		}
	}

	public boolean method3413(int i, byte i_8_) {
		try {
			return (((Class96) ((AnimFrameset) this).aClass96Array9579[i]).aBoolean940);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aih.p(").append(')').toString());
		}
	}

	public boolean method3414(int i, byte i_9_) {
		try {
			return (((Class96) ((AnimFrameset) this).aClass96Array9579[i]).aBoolean941);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aih.i(").append(')').toString());
		}
	}

	public AnimFrameset(int framegroup) {
		if (osrs = (framegroup & 0x8000) != 0) {
			framegroup &= ~0x8000;
			framegroup += OSRSData.FRAMES_OFFSET;
		}
		((AnimFrameset) this).framegroup = -2073571277 * framegroup;
	}

	public boolean method3415(int i, int i_10_) {
		try {
			return (((Class96) ((AnimFrameset) this).aClass96Array9579[i]).aBoolean939);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aih.b(").append(')').toString());
		}
	}
}

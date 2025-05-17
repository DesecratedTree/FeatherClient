/* Class385 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class AtmosphereType {
	SceneObjectPosition sunAngle;
	float aFloat4130;
	float aFloat4131;
	float aFloat4132;
	int sunColor;
	int fogColor;
	int fogIntensity;
	EnvironmentMap aClass66_4136;
	float aFloat4137;
	float aFloat4138;
	float aFloat4139;
	Skybox aClass277_4140;
	public static client aClient4141;
	static Class89 aClass89_4142;

	public AtmosphereType(RsByteBuffer class298_sub53, AtmosphereConditions class364) {
		method4706(class298_sub53, class364, (short) 9475);
	}

	void method4704(AtmosphereType class385_0_, byte i) {
		try {
			((AtmosphereType) this).sunColor = ((AtmosphereType) class385_0_).sunColor * 1;
			((AtmosphereType) this).aFloat4130 = ((AtmosphereType) class385_0_).aFloat4130;
			((AtmosphereType) this).aFloat4131 = ((AtmosphereType) class385_0_).aFloat4131;
			((AtmosphereType) this).aFloat4137 = ((AtmosphereType) class385_0_).aFloat4137;
			((AtmosphereType) this).sunAngle.method2013(((AtmosphereType) class385_0_).sunAngle);
			((AtmosphereType) this).fogColor = ((AtmosphereType) class385_0_).fogColor * 1;
			((AtmosphereType) this).fogIntensity = 1 * ((AtmosphereType) class385_0_).fogIntensity;
			((AtmosphereType) this).aClass66_4136 = ((AtmosphereType) class385_0_).aClass66_4136;
			((AtmosphereType) this).aFloat4139 = ((AtmosphereType) class385_0_).aFloat4139;
			((AtmosphereType) this).aFloat4138 = ((AtmosphereType) class385_0_).aFloat4138;
			((AtmosphereType) this).aFloat4132 = ((AtmosphereType) class385_0_).aFloat4132;
			((AtmosphereType) this).aClass277_4140 = ((AtmosphereType) class385_0_).aClass277_4140;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pz.f(").append(')').toString());
		}
	}

	void method4705(GraphicsToolkit class_ra, AtmosphereType class385_1_, AtmosphereType class385_2_, float f, int i) {
		try {
			((AtmosphereType) this).sunColor = Class350.method4215((-1951302757 * ((AtmosphereType) class385_1_).sunColor), (((AtmosphereType) class385_2_).sunColor * -1951302757), f * 255.0F, -394247366) * 743535251;
			((AtmosphereType) this).aFloat4131 = (f * (((AtmosphereType) class385_2_).aFloat4131 - ((AtmosphereType) class385_1_).aFloat4131) + ((AtmosphereType) class385_1_).aFloat4131);
			((AtmosphereType) this).aFloat4137 = ((((AtmosphereType) class385_2_).aFloat4137 - ((AtmosphereType) class385_1_).aFloat4137) * f + ((AtmosphereType) class385_1_).aFloat4137);
			((AtmosphereType) this).aFloat4130 = (f * (((AtmosphereType) class385_2_).aFloat4130 - ((AtmosphereType) class385_1_).aFloat4130) + ((AtmosphereType) class385_1_).aFloat4130);
			((AtmosphereType) this).aFloat4132 = ((((AtmosphereType) class385_2_).aFloat4132 - ((AtmosphereType) class385_1_).aFloat4132) * f + ((AtmosphereType) class385_1_).aFloat4132);
			((AtmosphereType) this).aFloat4139 = (((AtmosphereType) class385_1_).aFloat4139 + f * (((AtmosphereType) class385_2_).aFloat4139 - ((AtmosphereType) class385_1_).aFloat4139));
			((AtmosphereType) this).aFloat4138 = (((AtmosphereType) class385_1_).aFloat4138 + f * (((AtmosphereType) class385_2_).aFloat4138 - ((AtmosphereType) class385_1_).aFloat4138));
			((AtmosphereType) this).fogColor = Class350.method4215((((AtmosphereType) class385_1_).fogColor * -1269717659), (-1269717659 * ((AtmosphereType) class385_2_).fogColor), f * 255.0F, 561967704) * -316996499;
			((AtmosphereType) this).fogIntensity = (1820271565 * (int) ((float) (((AtmosphereType) class385_1_).fogIntensity * -1939701499) + f * (float) ((((AtmosphereType) class385_2_).fogIntensity * -1939701499) - (((AtmosphereType) class385_1_).fogIntensity) * -1939701499)));
			if (((AtmosphereType) class385_1_).aClass66_4136 != ((AtmosphereType) class385_2_).aClass66_4136)
				((AtmosphereType) this).aClass66_4136 = class_ra.method5179((((AtmosphereType) class385_1_).aClass66_4136), (((AtmosphereType) class385_2_).aClass66_4136), f, ((AtmosphereType) this).aClass66_4136);
			if (((AtmosphereType) class385_2_).aClass277_4140 != ((AtmosphereType) class385_1_).aClass277_4140) {
				if (null == ((AtmosphereType) class385_1_).aClass277_4140) {
					((AtmosphereType) this).aClass277_4140 = ((AtmosphereType) class385_2_).aClass277_4140;
					if (((AtmosphereType) this).aClass277_4140 != null)
						((AtmosphereType) this).aClass277_4140.method2583((int) (f * 255.0F), 0, -909735354);
				} else {
					((AtmosphereType) this).aClass277_4140 = ((AtmosphereType) class385_1_).aClass277_4140;
					if (((AtmosphereType) this).aClass277_4140 != null)
						((AtmosphereType) this).aClass277_4140.method2583((int) (f * 255.0F), 255, 398258366);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pz.b(").append(')').toString());
		}
	}

	public void method4706(RsByteBuffer class298_sub53, AtmosphereConditions class364, short i) {
		try {
			int i_3_ = class298_sub53.readUnsignedByte();
			if (Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub15_7560.method5684(-1934130167) == 1 && Class373.aClass_ra4071.method5048() > 0) {
				if (0 != (i_3_ & 0x1))
					((AtmosphereType) this).sunColor = class298_sub53.readInt((byte) 33) * 743535251;
				else
					((AtmosphereType) this).sunColor = -980012211 * AtmosphereConditions.anInt3952;
				if ((i_3_ & 0x2) != 0)
					((AtmosphereType) this).aFloat4130 = ((float) class298_sub53.readUnsignedShort() / 256.0F);
				else
					((AtmosphereType) this).aFloat4130 = 1.1523438F;
				if (0 != (i_3_ & 0x4))
					((AtmosphereType) this).aFloat4131 = ((float) class298_sub53.readUnsignedShort() / 256.0F);
				else
					((AtmosphereType) this).aFloat4131 = 0.69921875F;
				if (0 != (i_3_ & 0x8))
					((AtmosphereType) this).aFloat4137 = ((float) class298_sub53.readUnsignedShort() / 256.0F);
				else
					((AtmosphereType) this).aFloat4137 = 1.2F;
			} else {
				if ((i_3_ & 0x1) != 0)
					class298_sub53.readInt((byte) 50);
				if ((i_3_ & 0x2) != 0)
					class298_sub53.readUnsignedShort();
				if ((i_3_ & 0x4) != 0)
					class298_sub53.readUnsignedShort();
				if ((i_3_ & 0x8) != 0)
					class298_sub53.readUnsignedShort();
				((AtmosphereType) this).sunColor = AtmosphereConditions.anInt3952 * -980012211;
				((AtmosphereType) this).aFloat4137 = 1.2F;
				((AtmosphereType) this).aFloat4131 = 0.69921875F;
				((AtmosphereType) this).aFloat4130 = 1.1523438F;
			}
			if ((i_3_ & 0x10) != 0)
				((AtmosphereType) this).sunAngle = SceneObjectPosition.get((float) class298_sub53.readShort(2126608204), (float) class298_sub53.readShort(1708860776), (float) class298_sub53.readShort(1771057202));
			else
				((AtmosphereType) this).sunAngle = SceneObjectPosition.get(-50.0F, -60.0F, -50.0F);
			if ((i_3_ & 0x20) != 0)
				((AtmosphereType) this).fogColor = class298_sub53.readInt((byte) 9) * -316996499;
			else
				((AtmosphereType) this).fogColor = AtmosphereConditions.defaultFogColor * 1359380751;
			if (0 != (i_3_ & 0x40))
				((AtmosphereType) this).fogIntensity = class298_sub53.readUnsignedShort() * 1820271565;
			else
				((AtmosphereType) this).fogIntensity = 0;
			if (0 != (i_3_ & 0x80)) {
				int i_4_ = class298_sub53.readUnsignedShort();
				int i_5_ = class298_sub53.readUnsignedShort();
				int i_6_ = class298_sub53.readUnsignedShort();
				int i_7_ = class298_sub53.readUnsignedShort();
				int i_8_ = class298_sub53.readUnsignedShort();
				int i_9_ = class298_sub53.readUnsignedShort();
				((AtmosphereType) this).aClass66_4136 = class364.createSkybox(i_4_, i_5_, i_6_, i_7_, i_8_, i_9_, 257018874);
			} else
				((AtmosphereType) this).aClass66_4136 = Class82_Sub12.aClass66_6864;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pz.p(").append(')').toString());
		}
	}

	public void method4707(RsByteBuffer class298_sub53, int i) {
		try {
			((AtmosphereType) this).aFloat4139 = (float) (class298_sub53.readUnsignedByte() * 8) / 255.0F;
			((AtmosphereType) this).aFloat4138 = (float) (class298_sub53.readUnsignedByte() * 8) / 255.0F;
			((AtmosphereType) this).aFloat4132 = ((float) (class298_sub53.readUnsignedByte() * 8) / 255.0F);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pz.i(").append(')').toString());
		}
	}

	public AtmosphereType() {
		method4711((byte) 115);
	}

	boolean method4708(AtmosphereType class385_10_, int i) {
		try {
			return ((-1951302757 * ((AtmosphereType) class385_10_).sunColor == ((AtmosphereType) this).sunColor * -1951302757) && (((AtmosphereType) this).aFloat4130 == ((AtmosphereType) class385_10_).aFloat4130) && (((AtmosphereType) class385_10_).aFloat4131 == ((AtmosphereType) this).aFloat4131) && (((AtmosphereType) class385_10_).aFloat4137 == ((AtmosphereType) this).aFloat4137) && (((AtmosphereType) class385_10_).aFloat4138 == ((AtmosphereType) this).aFloat4138) && (((AtmosphereType) this).aFloat4139 == ((AtmosphereType) class385_10_).aFloat4139) && (((AtmosphereType) class385_10_).aFloat4132 == ((AtmosphereType) this).aFloat4132) && (-1269717659 * ((AtmosphereType) this).fogColor == ((AtmosphereType) class385_10_).fogColor * -1269717659) && (((AtmosphereType) class385_10_).fogIntensity * -1939701499 == ((AtmosphereType) this).fogIntensity * -1939701499) && (((AtmosphereType) class385_10_).aClass66_4136 == ((AtmosphereType) this).aClass66_4136) && (((AtmosphereType) class385_10_).aClass277_4140 == ((AtmosphereType) this).aClass277_4140));
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pz.d(").append(')').toString());
		}
	}

	public int getFogColor(int i) {
		try {
			return -1269717659 * ((AtmosphereType) this).fogColor;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pz.u(").append(')').toString());
		}
	}

	public Skybox getSkybox(byte i) {
		try {
			return ((AtmosphereType) this).aClass277_4140;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pz.x(").append(')').toString());
		}
	}

	void method4711(byte i) {
		try {
			((AtmosphereType) this).sunColor = AtmosphereConditions.anInt3952 * -980012211;
			((AtmosphereType) this).sunAngle = SceneObjectPosition.get(-50.0F, -60.0F, -50.0F);
			((AtmosphereType) this).aFloat4130 = 1.1523438F;
			((AtmosphereType) this).aFloat4131 = 0.69921875F;
			((AtmosphereType) this).aFloat4137 = 1.2F;
			((AtmosphereType) this).fogColor = AtmosphereConditions.defaultFogColor * 1359380751;
			((AtmosphereType) this).fogIntensity = 0;
			((AtmosphereType) this).aClass66_4136 = Class82_Sub12.aClass66_6864;
			((AtmosphereType) this).aFloat4139 = 1.0F;
			((AtmosphereType) this).aFloat4138 = 0.25F;
			((AtmosphereType) this).aFloat4132 = 1.0F;
			((AtmosphereType) this).aClass277_4140 = Class254.aClass277_2789;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pz.a(").append(')').toString());
		}
	}

	public void setSkybox(RsByteBuffer class298_sub53, AtmosphereConditions conditions, byte i) {
		try {
			int skyboxId = class298_sub53.readUnsignedShort();
			int i_12_ = class298_sub53.readShort(2107553233);
			int i_13_ = class298_sub53.readShort(1662518170);
			int i_14_ = class298_sub53.readShort(2045049677);
			int i_15_ = class298_sub53.readUnsignedShort();
			Class163.anInt1685 = 1827318333 * i_15_;
			((AtmosphereType) this).aClass277_4140 = conditions.createSkybox(skyboxId, i_12_, i_13_, i_14_, (short) -3311);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pz.k(").append(')').toString());
		}
	}

	static final void method4713(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = client.aByte8959;
			if (client.aByte8959 != -1)
				client.aByte8959 = (byte) -6;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pz.abk(").append(')').toString());
		}
	}

	public static void method4714(int i) {
		try {
			if (IcmpService_Sub1.anIcmpService_Sub1_8551 != null) {
				try {
					IcmpService_Sub1.anIcmpService_Sub1_8551.quit();
				} catch (Throwable throwable) {
					/* empty */
				}
				IcmpService_Sub1.anIcmpService_Sub1_8551 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pz.d(").append(')').toString());
		}
	}

	static final void method4715(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anInt5241 -= 969361751;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pz.aj(").append(')').toString());
		}
	}

	public static Class343_Sub1 method4716(byte i) {
		try {
			Class474.anInt5977 = 0;
			return Class365_Sub1_Sub5_Sub2.method4537(-1079868050);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pz.i(").append(')').toString());
		}
	}
}

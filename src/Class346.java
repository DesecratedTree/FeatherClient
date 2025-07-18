/* Class346 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class346 {
	public static int anInt3689 = 1024;
	public static int anInt3690 = 9;
	public static int anInt3691 = 7;
	public static int anInt3692 = 512;
	public static int anInt3693 = 511;
	public static int anInt3694 = 8;
	public static int anInt3695 = 256;
	public static int anInt3696 = 2;
	public static int anInt3697 = 128;

	static {
		Math.sqrt(131072.0);
	}

	Class346() throws Throwable {
		throw new Error();
	}

	static final void method4170(ClientScript2 class403, short i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub16_7557.method5686(-550588042) ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw method4175(runtimeexception, new StringBuilder().append("ol.anh(").append(')').toString());
		}
	}

	static void method4171(int i, int i_0_, IComponentDefinition class105, Class_ta class_ta, int i_1_, int i_2_, int i_3_) {
		try {
			int i_4_ = Class10.anInt129 * 1168366243;
			int[] is = Class10.anIntArray135;
			for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
				Player class365_sub1_sub1_sub2_sub2 = client.aClass365_Sub1_Sub1_Sub2_Sub2Array8805[is[i_5_]];
				if (null != class365_sub1_sub1_sub2_sub2 && class365_sub1_sub1_sub2_sub2.method4477(526198823) && !class365_sub1_sub1_sub2_sub2.hidden && (class365_sub1_sub1_sub2_sub2 != Class287.myPlayer) && (class365_sub1_sub1_sub2_sub2.plane == (Class287.myPlayer.plane))) {
					SceneObjectPosition class217 = (class365_sub1_sub1_sub2_sub2.method4337().aClass217_2599);
					int i_6_ = (int) class217.aFloat2451 / 128 - i / 128;
					int i_7_ = (int) class217.aFloat2454 / 128 - i_0_ / 128;
					boolean bool = false;
					for (int i_8_ = 0; i_8_ < client.anInt8941 * -1054937867; i_8_++) {
						if (class365_sub1_sub1_sub2_sub2.aString10195.equals(client.aStringArray8704[i_8_]) && client.anIntArray8946[i_8_] != 0) {
							bool = true;
							break;
						}
					}
					boolean bool_9_ = false;
					for (int i_10_ = 0; i_10_ < -1801543887 * Class489.anInt6071; i_10_++) {
						if (class365_sub1_sub1_sub2_sub2.aString10195.equals(Class82_Sub6.aClass7Array6846[i_10_].aString93)) {
							bool_9_ = true;
							break;
						}
					}
					boolean bool_11_ = false;
					if (0 != -1473655357 * (Class287.myPlayer.anInt10208) && 0 != (-1473655357 * class365_sub1_sub1_sub2_sub2.anInt10208) && ((class365_sub1_sub1_sub2_sub2.anInt10208 * -1473655357) == (Class287.myPlayer.anInt10208) * -1473655357))
						bool_11_ = true;
					if (class365_sub1_sub1_sub2_sub2.aBoolean10203)
						Class443.method5883(class105, class_ta, i_1_, i_2_, i_6_, i_7_, SubIncommingPacket.aClass57Array2349[6], (byte) 52);
					else if (bool_11_)
						Class443.method5883(class105, class_ta, i_1_, i_2_, i_6_, i_7_, SubIncommingPacket.aClass57Array2349[4], (byte) -19);
					else if (class365_sub1_sub1_sub2_sub2.aBoolean10222)
						Class443.method5883(class105, class_ta, i_1_, i_2_, i_6_, i_7_, SubIncommingPacket.aClass57Array2349[7], (byte) -81);
					else if (bool)
						Class443.method5883(class105, class_ta, i_1_, i_2_, i_6_, i_7_, SubIncommingPacket.aClass57Array2349[3], (byte) 25);
					else if (bool_9_)
						Class443.method5883(class105, class_ta, i_1_, i_2_, i_6_, i_7_, SubIncommingPacket.aClass57Array2349[5], (byte) -50);
					else
						Class443.method5883(class105, class_ta, i_1_, i_2_, i_6_, i_7_, SubIncommingPacket.aClass57Array2349[2], (byte) -40);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw method4175(runtimeexception, new StringBuilder().append("ol.n(").append(')').toString());
		}
	}

	public static void method4172(String string, boolean bool, boolean bool_12_, boolean bool_13_, boolean bool_14_, byte i) {
		try {
			Class273.method2559(string, bool, bool_12_, "openjs", bool_13_, bool_14_, -1892115895);
		} catch (RuntimeException runtimeexception) {
			throw method4175(runtimeexception, new StringBuilder().append("ol.a(").append(')').toString());
		}
	}

	static String method4174(Class298_Sub37_Sub5 class298_sub37_sub5, byte i) {
		try {
			return new StringBuilder().append(((Class298_Sub37_Sub5) class298_sub37_sub5).aString9585).append(Class285.method2709(16777215, -1514789129)).append(" >").toString();
		} catch (RuntimeException runtimeexception) {
			throw method4175(runtimeexception, new StringBuilder().append("ol.be(").append(')').toString());
		}
	}

	public static RuntimeException_Sub2 method4175(Throwable throwable, String string) {
		try {
			RuntimeException_Sub2 runtimeexception_sub2;
			if (throwable instanceof RuntimeException_Sub2) {
				runtimeexception_sub2 = (RuntimeException_Sub2) throwable;
				StringBuilder stringbuilder = new StringBuilder();
				RuntimeException_Sub2 runtimeexception_sub2_27_ = runtimeexception_sub2;
				((RuntimeException_Sub2) runtimeexception_sub2_27_).aString6308 = stringbuilder.append(((RuntimeException_Sub2) runtimeexception_sub2_27_).aString6308).append(' ').append(string).toString();
			} else
				runtimeexception_sub2 = new RuntimeException_Sub2(throwable, string);
			return runtimeexception_sub2;
		} catch (RuntimeException runtimeexception) {
			throw method4175(runtimeexception, new StringBuilder().append("ol.f(").append(')').toString());
		}
	}
}

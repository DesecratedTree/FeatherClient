/* Class364 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import javax.swing.*;
import java.awt.*;
import java.nio.ByteBuffer;

public class AtmosphereConditions {
	AtmosphereType aClass385_3932;
	static int defaultFogColor;
	long aLong3934;
	static float aFloat3935 = 0.69921875F;
	static float aFloat3936 = 1.2F;
	static int anInt3937 = -50;
	static int anInt3938 = -60;
	static int anInt3939 = -50;
	static int anInt3940 = 0;
	static float aFloat3941 = 1.1523438F;
	static int anInt3942;
	GraphicsToolkit aClass_ra3943;
	AtmosphereType[][] atmosphere_definitions;
	int anInt3945 = 0;
	int anInt3946 = -1117911945;
	public static int[] anIntArray3947;
	SceneObjectPosition aClass217_3948;
	AtmosphereType aClass385_3949;
	AtmosphereType aClass385_3950;
	AtmosphereType aClass385_3951;
	static int anInt3952 = 1373663905;
	CachingHashMap aClass348_3953;
	boolean aBoolean3954;
	CachingHashMap aClass348_3955;

	public AtmosphereConditions(GraphicsToolkit class_ra, int i, int i_0_) {
		((AtmosphereConditions) this).aLong3934 = 0L;
		((AtmosphereConditions) this).aBoolean3954 = false;
		((AtmosphereConditions) this).aClass217_3948 = new SceneObjectPosition(-50.0F, -60.0F, -50.0F);
		((AtmosphereConditions) this).aClass348_3953 = new CachingHashMap(8);
		((AtmosphereConditions) this).aClass348_3955 = new CachingHashMap(8);
		((AtmosphereConditions) this).aClass_ra3943 = class_ra;
		((AtmosphereConditions) this).atmosphere_definitions = new AtmosphereType[i][i_0_];
		if (null != anIntArray3947)
			Class82_Sub12.aClass66_6864 = createSkybox(anIntArray3947[0], anIntArray3947[1], anIntArray3947[2], anIntArray3947[3], anIntArray3947[4], anIntArray3947[5], 2001255265);
		Class254.aClass277_2789 = null;
		((AtmosphereConditions) this).aClass385_3949 = new AtmosphereType();
		((AtmosphereConditions) this).aClass385_3950 = new AtmosphereType();
		((AtmosphereConditions) this).aClass385_3932 = new AtmosphereType();
		((AtmosphereConditions) this).aClass385_3951 = new AtmosphereType();
		method4324(-1545496874);
	}

	public AtmosphereType method4316(byte i) {
		try {
			return ((AtmosphereConditions) this).aClass385_3950;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pd.f(").append(')').toString());
		}
	}

	public void method4317(byte i) {
		try {
			((AtmosphereConditions) this).aClass348_3953.method4187();
			((AtmosphereConditions) this).aClass348_3955.method4187();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pd.p(").append(')').toString());
		}
	}

	void method4318(byte i) {
		try {
			((AtmosphereConditions) this).aClass_ra3943.IA((0.7F + ((float) Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub1_7552.method5625(-712203354) * 0.1F) + client.map.method2633(2016671740)) * ((AtmosphereType) ((AtmosphereConditions) this).aClass385_3950).aFloat4130);
			((AtmosphereConditions) this).aClass_ra3943.m((-1951302757 * ((AtmosphereType) ((AtmosphereConditions) this).aClass385_3950).sunColor), ((AtmosphereType) ((AtmosphereConditions) this).aClass385_3950).aFloat4131, ((AtmosphereType) ((AtmosphereConditions) this).aClass385_3950).aFloat4137, (float) ((int) ((AtmosphereConditions) this).aClass217_3948.aFloat2451 << 2), (float) ((int) ((AtmosphereConditions) this).aClass217_3948.aFloat2455 << 2), (float) ((int) ((AtmosphereConditions) this).aClass217_3948.aFloat2454 << 2));
			((AtmosphereConditions) this).aClass_ra3943.method5095(((AtmosphereType) ((AtmosphereConditions) this).aClass385_3950).aClass66_4136);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pd.s(").append(')').toString());
		}
	}

	public void method4319(int i, int i_1_, AtmosphereType class385, byte i_2_) {
		try {
			((AtmosphereConditions) this).atmosphere_definitions[i][i_1_] = class385;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pd.d(").append(')').toString());
		}
	}

	public void method4320(byte i) {
		try {
			for (int i_3_ = 0; i_3_ < ((AtmosphereConditions) this).atmosphere_definitions.length; i_3_++) {
				for (int i_4_ = 0; i_4_ < (((AtmosphereConditions) this).atmosphere_definitions[i_3_]).length; i_4_++)
					((AtmosphereConditions) this).atmosphere_definitions[i_3_][i_4_] = ((AtmosphereConditions) this).aClass385_3949;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pd.u(").append(')').toString());
		}
	}

	public void method4321(int i, int i_5_, int i_6_) {
		try {
			AtmosphereType class385 = ((AtmosphereConditions) this).atmosphere_definitions[i][i_5_];
			if (class385 != null)
				((AtmosphereConditions) this).aClass217_3948.method2013(((AtmosphereType) class385).sunAngle);
			method4318((byte) -41);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pd.x(").append(')').toString());
		}
	}

	void method4322(int i, int i_7_, int i_8_, int i_9_) {
		try {
			AtmosphereType class385 = ((AtmosphereConditions) this).atmosphere_definitions[i][i_7_];
			if (null == class385)
				class385 = ((AtmosphereConditions) this).aClass385_3949;
			if (((AtmosphereConditions) this).aBoolean3954) {
				((AtmosphereConditions) this).aBoolean3954 = false;
				i_8_ = 0;
			}
			if (!((AtmosphereConditions) this).aClass385_3951.method4708(class385, -759773054)) {
				((AtmosphereConditions) this).aClass385_3951.method4704(class385, (byte) -51);
				((AtmosphereConditions) this).aLong3934 = Class122.method1319((byte) 1) * 858881257410153067L;
				((AtmosphereConditions) this).anInt3945 = ((((AtmosphereConditions) this).anInt3946 = 1117911945 * i_8_) * -2145126213);
				if (913546523 * ((AtmosphereConditions) this).anInt3945 != 0) {
					((AtmosphereConditions) this).aClass385_3932.method4704(((AtmosphereConditions) this).aClass385_3950, (byte) -80);
					if ((((AtmosphereType) ((AtmosphereConditions) this).aClass385_3950).aClass277_4140) != null) {
						if (((AtmosphereType) ((AtmosphereConditions) this).aClass385_3950).aClass277_4140.method2586((byte) -18))
							((AtmosphereType) ((AtmosphereConditions) this).aClass385_3950).aClass277_4140 = ((AtmosphereType) ((AtmosphereConditions) this).aClass385_3932).aClass277_4140 = ((AtmosphereType) ((AtmosphereConditions) this).aClass385_3950).aClass277_4140.method2587(1076468319);
						if ((null != (((AtmosphereType) ((AtmosphereConditions) this).aClass385_3950).aClass277_4140)) && ((((AtmosphereType) ((AtmosphereConditions) this).aClass385_3951).aClass277_4140) != (((AtmosphereType) ((AtmosphereConditions) this).aClass385_3950).aClass277_4140)))
							((AtmosphereType) ((AtmosphereConditions) this).aClass385_3950).aClass277_4140.method2584((((AtmosphereType) ((AtmosphereConditions) this).aClass385_3951).aClass277_4140), -583959548);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pd.r(").append(')').toString());
		}
	}

	public void method4323(GameMap class283, int i) {
		try {
			if (Class413.method5584(-1233866115 * client.anInt8752, 2068577506) || Class299.method3682(-1233866115 * client.anInt8752, 1765230881))
				method4322(Class367.anInt4000 * -1740717447 >> 12, -299812095 * Class146.anInt1575 >> 12, anInt3942 * -450037889, -1055017698);
			else {
				int i_10_ = -1;
				int i_11_ = -1;
				if (null != Class287.myPlayer) {
					i_10_ = (Class287.myPlayer.scenePositionXQueue[0]) >> 3;
					i_11_ = (Class287.myPlayer.scenePositionYQueue[0]) >> 3;
				}
				if (i_10_ < 0 || i_10_ >= class283.method2629(-2064159072) >> 3 || i_11_ < 0 || i_11_ >= class283.method2630(-1098820218) >> 3)
					method4322(class283.method2629(-1944264656) >> 4, class283.method2630(211843254) >> 4, 0, -1158726222);
				else
					method4322(i_10_, i_11_, anInt3942 * -450037889, -908271345);
			}
			method4330(828656850);
			method4318((byte) 67);
			method4325(394959545);
			method4331((byte) 7);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pd.a(").append(')').toString());
		}
	}

	public void method4324(int i) {
		try {
			((AtmosphereConditions) this).aBoolean3954 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pd.n(").append(')').toString());
		}
	}

	void method4325(int i) {
		try {
			((AtmosphereConditions) this).aClass_ra3943.method5152(((AtmosphereType) ((AtmosphereConditions) this).aClass385_3950).aFloat4132, ((AtmosphereType) ((AtmosphereConditions) this).aClass385_3950).aFloat4139, ((AtmosphereType) ((AtmosphereConditions) this).aClass385_3950).aFloat4138, -1795302913);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pd.y(").append(')').toString());
		}
	}

	public void method4326(byte i) {
		try {
			((AtmosphereConditions) this).aClass_ra3943.IA((0.7F + ((float) Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub1_7552.method5625(-1693044274) * 0.1F) + client.map.method2633(1910914073)) * 1.1523438F);
			((AtmosphereConditions) this).aClass_ra3943.m(anInt3952 * 332664479, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
			((AtmosphereConditions) this).aClass_ra3943.c(defaultFogColor * -1971415573, -1, 0);
			((AtmosphereConditions) this).aClass_ra3943.method5095(Class82_Sub12.aClass66_6864);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pd.t(").append(')').toString());
		}
	}

	static {
		defaultFogColor = 615272440;
		anInt3942 = -816669807;
	}

	public void method4327(AtmosphereConditions class364_12_, int i) {
		try {
			((AtmosphereConditions) this).aClass385_3950.method4704((((AtmosphereConditions) class364_12_).aClass385_3950), (byte) 37);
			((AtmosphereConditions) this).aClass385_3932.method4704((((AtmosphereConditions) class364_12_).aClass385_3932), (byte) -76);
			((AtmosphereConditions) this).aClass385_3951.method4704((((AtmosphereConditions) class364_12_).aClass385_3951), (byte) 34);
			((AtmosphereConditions) this).aLong3934 = ((AtmosphereConditions) class364_12_).aLong3934 * 1L;
			((AtmosphereConditions) this).anInt3945 = 1 * ((AtmosphereConditions) class364_12_).anInt3945;
			((AtmosphereConditions) this).anInt3946 = ((AtmosphereConditions) class364_12_).anInt3946 * 1;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pd.b(").append(')').toString());
		}
	}

	Skybox createSkybox(int i, int i_13_, int i_14_, int i_15_, short i_16_) {
		try {
			long l = (((long) i_13_ & 0xffffL) << 48 | ((long) i_14_ & 0xffffL) << 32 | ((long) i_15_ & 0xffffL) << 16 | (long) i & 0xffffL);
			Skybox class277 = (Skybox) ((AtmosphereConditions) this).aClass348_3955.get(l);
			if (null == class277) {
				class277 = ConfigDefinitions.aClass317_3472.method3845(i, i_13_, i_14_, i_15_, (Class138_Sub1.aClass131_7010), (byte) -51);
				((AtmosphereConditions) this).aClass348_3955.method4194(class277, l);
			}
			return class277;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pd.k(").append(')').toString());
		}
	}

	EnvironmentMap createSkybox(int i, int i_17_, int i_18_, int i_19_, int i_20_, int i_21_, int i_22_) {
		try {
			long textureId = (67481L * (long) i ^ (long) i_17_ * 97549L ^ 475427L * (long) i_18_ ^ (long) i_19_ * 986053L ^ (long) i_20_ * 32147369L ^ (long) i_21_ * 76724863L);
			EnvironmentMap skybox = (EnvironmentMap) ((AtmosphereConditions) this).aClass348_3953.get(textureId);
			if (null != skybox)
				return skybox;
			skybox = ((AtmosphereConditions) this).aClass_ra3943.method5028(i, i_17_, i_18_, i_19_, i_20_, i_21_);
			((AtmosphereConditions) this).aClass348_3953.method4194(skybox, textureId);
			return skybox;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pd.i(").append(')').toString());
		}
	}

	void method4330(int i) {
		try {
			if (((AtmosphereConditions) this).anInt3946 * -1051268423 >= 0) {
				long l = Class122.method1319((byte) 1);
				((AtmosphereConditions) this).anInt3946 -= ((l - 5777556104771211843L * ((AtmosphereConditions) this).aLong3934) * 1117911945L);
				if (-1051268423 * ((AtmosphereConditions) this).anInt3946 > 0)
					((AtmosphereConditions) this).aClass385_3950.method4705(((AtmosphereConditions) this).aClass_ra3943, ((AtmosphereConditions) this).aClass385_3932, ((AtmosphereConditions) this).aClass385_3951, ((float) (913546523 * ((AtmosphereConditions) this).anInt3945 - ((AtmosphereConditions) this).anInt3946 * -1051268423) / (float) (913546523 * ((AtmosphereConditions) this).anInt3945)), 937279263);
				else {
					((AtmosphereConditions) this).aClass385_3950.method4704(((AtmosphereConditions) this).aClass385_3951, (byte) -42);
					if ((((AtmosphereType) ((AtmosphereConditions) this).aClass385_3950).aClass277_4140) != null)
						((AtmosphereType) ((AtmosphereConditions) this).aClass385_3950).aClass277_4140.method2585((byte) -128);
					((AtmosphereConditions) this).anInt3946 = -1117911945;
				}
				((AtmosphereConditions) this).aLong3934 = 858881257410153067L * l;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pd.q(").append(')').toString());
		}
	}

	public void method4331(byte i) {
		try {
			int i_23_ = 0;
			int i_24_ = i_23_ + ((((AtmosphereType) ((AtmosphereConditions) this).aClass385_3950).fogIntensity) * -1939701499 + 256 << 2);
			((AtmosphereConditions) this).aClass_ra3943.c((((AtmosphereType) ((AtmosphereConditions) this).aClass385_3950).fogColor * -1269717659), Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub3_7556.method5633(1323547629) == 1 ? i_24_ : -1, 0);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pd.z(").append(')').toString());
		}
	}

	static final void method4332(ClientScript2 class403, int i) {
		try {
			String string = (String) (((ClientScript2) class403).anObjectArray5240[(((ClientScript2) class403).anInt5241 -= 969361751) * -203050393]);
			Class25 class25 = Class429.method5760((short) 512);
			Class298_Sub36 class298_sub36 = Class18.method359(OutcommingPacket.QUICK_CHAT_PRIVATE_MESSAGE, class25.aClass449_330, (byte) 109);
			class298_sub36.aClass298_Sub53_Sub2_7396.writeByte(0);
			int i_25_ = (385051775 * class298_sub36.aClass298_Sub53_Sub2_7396.index);
			class298_sub36.aClass298_Sub53_Sub2_7396.writeString(string, 2120587039);
			class298_sub36.aClass298_Sub53_Sub2_7396.writeShort(((ClientScript2) class403).aClass177_5243.anInt1787 * -2034569943, 16711935);
			((ClientScript2) class403).aClass177_5243.aClass298_Sub37_Sub14_1788.method3464(class298_sub36.aClass298_Sub53_Sub2_7396, ((ClientScript2) class403).aClass177_5243.anIntArray1789, 535185989);
			class298_sub36.aClass298_Sub53_Sub2_7396.method3649((class298_sub36.aClass298_Sub53_Sub2_7396.index * 385051775) - i_25_, (byte) -99);
			class25.method390(class298_sub36, (byte) -26);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pd.acd(").append(')').toString());
		}
	}

	static final void method4333(ClientScript2 class403, int i) {
		try {
			Class216.method2001(false, (byte) 38);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pd.ahb(").append(')').toString());
		}
	}

	public static boolean method4334(char c, int i) {
		try {
			return c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z';
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pd.s(").append(')').toString());
		}
	}

	static final void method4335(ClientScript2 class403, byte i) {
		try {
			Class390 class390 = (((ClientScript2) class403).aBoolean5261 ? ((ClientScript2) class403).aClass390_5247 : ((ClientScript2) class403).aClass390_5246);
			IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
			Class119 class119 = ((Class390) class390).aClass119_4167;
			Class522.method6326(class105, class119, class403, -1905856494);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pd.ir(").append(')').toString());
		}
	}

	public static Class412 method4336(int i) {
		try {
			if (null == Class525.aClass412_6299)
				return Class412.aClass412_6568;
			return Class525.aClass412_6299;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pd.d(").append(')').toString());
		}
	}

	public void createGUI() {
		SwingUtilities.invokeLater(() -> {
			JFrame frame = new JFrame("Atmosphere Conditions");
			frame.setLayout(new GridLayout(0, 2));
			frame.setPreferredSize(new Dimension(800, 500));
			frame.setLocationRelativeTo(null);
			createFogSliders(frame);
			createSunSliders(frame);
			createSunColorSliders(frame);
			createSkyboxSliders(frame);
			frame.pack();
			frame.setVisible(true);
		});
	}

	public void createSkyboxSliders(JFrame frame) {
		SwingUtilities.invokeLater(() -> {

			JLabel divider = new JLabel("Skybox");
			frame.add(divider);
			frame.add("divider", new JPanel());

			JSlider skyboxIdSlider = new JSlider();
			skyboxIdSlider.setMinimum(0);
			skyboxIdSlider.setMaximum(10);

			JSlider unknown1 = new JSlider();
			unknown1.setMinimum(0);
			unknown1.setMaximum(10);

			JSlider unknown2 = new JSlider();
			unknown2.setMinimum(0);
			unknown2.setMaximum(10);

			JSlider unknown3 = new JSlider();
			unknown3.setMinimum(0);
			unknown3.setMaximum(10);

			JSlider unknown4 = new JSlider();
			unknown4.setMinimum(0);
			unknown4.setMaximum(10);

			JLabel unknown1label = new JLabel("Unknown 1");
			JLabel unknown2label = new JLabel("Unknown 2");
			JLabel unknown3label = new JLabel("Unknown 3");
			JLabel unknown4label = new JLabel("Unknown 4");


			JLabel skyboxIdLabel = new JLabel("Skybox ID: ");
			frame.add(skyboxIdLabel);
			skyboxIdSlider.addChangeListener((e -> {
				for (AtmosphereType[] atmospheres : atmosphere_definitions) {
					for (AtmosphereType type : atmospheres) {

						ByteBuffer buffer = ByteBuffer.allocate(10);
						buffer.putShort((short) (skyboxIdSlider.getValue() & 0xffff));
						buffer.putShort((short) unknown1.getValue());
						buffer.putShort((short) unknown2.getValue());
						buffer.putShort((short) unknown3.getValue());
						buffer.putShort((short) (unknown4.getValue() & 0xffff));

						type.setSkybox(new RsByteBuffer((byte[]) buffer.flip().array()), this, (byte) -1);
					}
				}
			}));
			frame.add(skyboxIdSlider);

			frame.add(unknown1label);
			unknown1.setMinimum(0);
			unknown1.setMaximum(255);
			unknown1.addChangeListener(e -> {
				for (AtmosphereType[] atmospheres : atmosphere_definitions) {
					for (AtmosphereType type : atmospheres) {

						ByteBuffer buffer = ByteBuffer.allocate(10);
						buffer.putShort((short) (skyboxIdSlider.getValue() & 0xffff));
						buffer.putShort((short) unknown1.getValue());
						buffer.putShort((short) unknown2.getValue());
						buffer.putShort((short) unknown3.getValue());
						buffer.putShort((short) (unknown4.getValue() & 0xffff));

						type.setSkybox(new RsByteBuffer((byte[]) buffer.flip().array()), this, (byte) -1);
					}
				}
			});
			frame.add(unknown1);

			frame.add(unknown2label);
			unknown2.setMinimum(0);
			unknown2.setMaximum(255);
			unknown2.addChangeListener(e -> {
				for (AtmosphereType[] atmospheres : atmosphere_definitions) {
					for (AtmosphereType type : atmospheres) {

						ByteBuffer buffer = ByteBuffer.allocate(10);
						buffer.putShort((short) (skyboxIdSlider.getValue() & 0xffff));
						buffer.putShort((short) unknown1.getValue());
						buffer.putShort((short) unknown2.getValue());
						buffer.putShort((short) unknown3.getValue());
						buffer.putShort((short) (unknown4.getValue() & 0xffff));

						type.setSkybox(new RsByteBuffer((byte[]) buffer.flip().array()), this, (byte) -1);
					}
				}
			});
			frame.add(unknown2);

			frame.add(unknown3label);
			unknown3.setMinimum(0);
			unknown3.setMaximum(255);
			unknown3.addChangeListener(e -> {
				for (AtmosphereType[] atmospheres : atmosphere_definitions) {
					for (AtmosphereType type : atmospheres) {

						ByteBuffer buffer = ByteBuffer.allocate(10);
						buffer.putShort((short) (skyboxIdSlider.getValue() & 0xffff));
						buffer.putShort((short) unknown1.getValue());
						buffer.putShort((short) unknown2.getValue());
						buffer.putShort((short) unknown3.getValue());
						buffer.putShort((short) (unknown4.getValue() & 0xffff));

						type.setSkybox(new RsByteBuffer((byte[]) buffer.flip().array()), this, (byte) -1);
					}
				}
			});
			frame.add(unknown3);

			frame.add(unknown4label);
			unknown4.setMinimum(0);
			unknown4.setMaximum(255);
			unknown4.addChangeListener(e -> {
				for (AtmosphereType[] atmospheres : atmosphere_definitions) {
					for (AtmosphereType type : atmospheres) {

						ByteBuffer buffer = ByteBuffer.allocate(10);
						buffer.putShort((short) (skyboxIdSlider.getValue() & 0xffff));
						buffer.putShort((short) unknown1.getValue());
						buffer.putShort((short) unknown2.getValue());
						buffer.putShort((short) unknown3.getValue());
						buffer.putShort((short) (unknown4.getValue() & 0xffff));

						type.setSkybox(new RsByteBuffer((byte[]) buffer.flip().array()), this, (byte) -1);
					}
				}
			});
			frame.add(unknown4);

		});
	}

	public void createSunSliders(JFrame frame) {
		SwingUtilities.invokeLater(() -> {
			JLabel divider = new JLabel("Sun Angle");
			frame.add(divider);
			frame.add("divider", new JPanel());

			JLabel angle_x_label = new JLabel("X: ");
			JSlider angle_x = new JSlider();
			angle_x.setMinimum(-180);
			angle_x.setMaximum(180);

			JLabel angle_y_label = new JLabel("Y: ");

			JSlider angle_y = new JSlider();
			angle_y.setMinimum(-180);
			angle_y.setMaximum(180);

			JLabel angle_z_label = new JLabel("Z: ");

			JSlider angle_z = new JSlider();
			angle_z.setMinimum(-180);
			angle_z.setMaximum(180);

			frame.add(angle_x_label);
			angle_x.addChangeListener(e -> {
				SceneObjectPosition pos = SceneObjectPosition.get(angle_x.getValue(), angle_y.getValue(), angle_z.getValue());
				for (AtmosphereType[] atmospheres : atmosphere_definitions) {
					for (AtmosphereType type : atmospheres) {
						type.sunAngle = pos;
					}
				}
				angle_x_label.setText("X: " + angle_x.getValue());
			});
			frame.add(angle_x);

			frame.add(angle_y_label);
			angle_y.addChangeListener(e -> {
				SceneObjectPosition pos = SceneObjectPosition.get(angle_x.getValue(), angle_y.getValue(), angle_z.getValue());
				for (AtmosphereType[] atmospheres : atmosphere_definitions) {
					for (AtmosphereType type : atmospheres) {
						type.sunAngle = pos;
					}
				}
				angle_y_label.setText("Y: " + angle_y.getValue());
			});
			frame.add(angle_y);

			frame.add(angle_z_label);
			angle_z.addChangeListener(e -> {
				SceneObjectPosition pos = SceneObjectPosition.get(angle_x.getValue(), angle_y.getValue(), angle_z.getValue());
				for (AtmosphereType[] atmospheres : atmosphere_definitions) {
					for (AtmosphereType type : atmospheres) {
						type.sunAngle = pos;
					}
				}
				angle_z_label.setText("Z: " + angle_z.getValue());
			});
			frame.add(angle_z);

		});
	}

	public void createFogSliders(JFrame frame) {
		SwingUtilities.invokeLater(() -> {

			JLabel divider = new JLabel("Fog Conditions");
			frame.add(divider);
			frame.add("divider", new JPanel());

			JSlider fog_r = new JSlider();
			JSlider fog_g = new JSlider();
			JSlider fog_b = new JSlider();
			fog_r.setMaximum(255);
			fog_g.setMaximum(255);
			fog_b.setMaximum(255);

			JLabel r_label = new JLabel("R (0-255)");
			frame.add(r_label);
			fog_r.addChangeListener((e -> {
				for (AtmosphereType[] atmospheres : atmosphere_definitions) {
					for (AtmosphereType type : atmospheres) {
						type.fogColor = (fog_r.getValue() << 16 | fog_g.getValue() << 8 | fog_b.getValue()) * -316996499;
					}
				}
				r_label.setText("R (0-255) " + fog_r.getValue());
			}));
			frame.add(fog_r);

			JLabel g_label = new JLabel("G (0-255)");
			frame.add(g_label);
			fog_g.addChangeListener((e -> {
				for (AtmosphereType[] atmospheres : atmosphere_definitions) {
					for (AtmosphereType type : atmospheres) {
						type.fogColor = (fog_r.getValue() << 16 | fog_g.getValue() << 8 | fog_b.getValue()) * -316996499;
					}
				}
				g_label.setText("G (0-255) " + fog_g.getValue());
			}));
			frame.add(fog_g);

			JLabel b_label = new JLabel("B (0-255)");
			frame.add(b_label);
			fog_b.addChangeListener((e -> {
				for (AtmosphereType[] atmospheres : atmosphere_definitions) {
					for (AtmosphereType type : atmospheres) {
						type.fogColor = (fog_r.getValue() << 16 | fog_g.getValue() << 8 | fog_b.getValue()) * -316996499;
					}
				}
				b_label.setText("B (0-255) " + fog_b.getValue());
			}));
			frame.add(fog_b);
		});
	}

	public void createSunColorSliders(JFrame frame) {
		SwingUtilities.invokeLater(() -> {

			JLabel divider = new JLabel("Sun Colors");
			frame.add(divider);
			frame.add("divider", new JPanel());

			JSlider fog_r = new JSlider();
			JSlider fog_g = new JSlider();
			JSlider fog_b = new JSlider();
			fog_r.setMaximum(255);
			fog_g.setMaximum(255);
			fog_b.setMaximum(255);

			JLabel r_label = new JLabel("R (0-255)");
			frame.add(r_label);
			fog_r.addChangeListener((e -> {
				for (AtmosphereType[] atmospheres : atmosphere_definitions) {
					for (AtmosphereType type : atmospheres) {
						type.sunColor = (fog_r.getValue() << 16 | fog_g.getValue() << 8 | fog_b.getValue()) * -316996499;
					}
				}
				r_label.setText("R (0-255) " + fog_r.getValue());
			}));
			frame.add(fog_r);

			JLabel g_label = new JLabel("G (0-255)");
			frame.add(g_label);
			fog_g.addChangeListener((e -> {
				for (AtmosphereType[] atmospheres : atmosphere_definitions) {
					for (AtmosphereType type : atmospheres) {
						type.sunColor = (fog_r.getValue() << 16 | fog_g.getValue() << 8 | fog_b.getValue()) * -316996499;
					}
				}
				g_label.setText("G (0-255) " + fog_g.getValue());
			}));
			frame.add(fog_g);

			JLabel b_label = new JLabel("B (0-255)");
			frame.add(b_label);
			fog_b.addChangeListener((e -> {
				for (AtmosphereType[] atmospheres : atmosphere_definitions) {
					for (AtmosphereType type : atmospheres) {
						type.sunColor = (fog_r.getValue() << 16 | fog_g.getValue() << 8 | fog_b.getValue()) * -316996499;
					}
				}
				b_label.setText("B (0-255) " + fog_b.getValue());
			}));
			frame.add(fog_b);
		});
	}
}

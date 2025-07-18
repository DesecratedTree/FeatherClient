/* Class426 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class426 {
	static char[] aCharArray5357;
	static char[] aCharArray5358 = new char[64];
	static int[] anIntArray5359;

	Class426() throws Throwable {
		throw new Error();
	}

	static {
		for (int i = 0; i < 26; i++)
			aCharArray5358[i] = (char) (65 + i);
		for (int i = 26; i < 52; i++)
			aCharArray5358[i] = (char) (i + 97 - 26);
		for (int i = 52; i < 62; i++)
			aCharArray5358[i] = (char) (i + 48 - 52);
		aCharArray5358[62] = '+';
		aCharArray5358[63] = '/';
		aCharArray5357 = new char[64];
		for (int i = 0; i < 26; i++)
			aCharArray5357[i] = (char) (65 + i);
		for (int i = 26; i < 52; i++)
			aCharArray5357[i] = (char) (i + 97 - 26);
		for (int i = 52; i < 62; i++)
			aCharArray5357[i] = (char) (48 + i - 52);
		aCharArray5357[62] = '*';
		aCharArray5357[63] = '-';
		anIntArray5359 = new int[128];
		for (int i = 0; i < anIntArray5359.length; i++)
			anIntArray5359[i] = -1;
		for (int i = 65; i <= 90; i++)
			anIntArray5359[i] = i - 65;
		for (int i = 97; i <= 122; i++)
			anIntArray5359[i] = 26 + (i - 97);
		for (int i = 48; i <= 57; i++)
			anIntArray5359[i] = i - 48 + 52;
		int[] is = anIntArray5359;
		anIntArray5359[43] = 62;
		is[42] = 62;
		int[] is_0_ = anIntArray5359;
		anIntArray5359[47] = 63;
		is_0_[45] = 63;
	}

	public static void method5743(int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_) {
		try {
			Class86.method967(i_5_, i_6_, 100, 1873797164);
			Class300.aClass303_3215 = new Class303(i, i_1_ << 9, i_2_ << 9, i_3_ << 8, 8 * i_4_);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rq.t(").append(')').toString());
		}
	}

}

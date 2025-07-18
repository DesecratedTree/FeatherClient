public class Sprites {
    public static void loadSpriteArchiveIds(Js5 js5) {
        try {
            Class74.anInt692 = js5.getArchiveIdByName("hitbar_default") * 2112064137;
            Class74.anInt694 = js5.getArchiveIdByName("timerbar_default") * 1617597269;
            Class143.anInt1558 = js5.getArchiveIdByName("headicons_pk") * 1432033185;
            Class400.anInt5223 = js5.getArchiveIdByName("headicons_prayer") * -1214334111;
            Class74.anInt693 = js5.getArchiveIdByName("hint_headicons") * 250641705;
            Class74.anInt696 = js5.getArchiveIdByName("hint_mapmarkers") * 1711228595;
            Class298_Sub36.anInt7398 = js5.getArchiveIdByName("mapflag") * 1542214111;
            Class82_Sub6.anInt6842 = js5.getArchiveIdByName("cross") * -626988461;
            Class494.anInt6092 = js5.getArchiveIdByName("mapdots") * -1409898789;
            Class74.anInt697 = js5.getArchiveIdByName("name_icons") * 1606490933;
            Class257.anInt2802 = (js5.getArchiveIdByName("floorshadows") * -1276802557);
            Class237.anInt6667 = js5.getArchiveIdByName("compass") * 1540144067;
            Class128_Sub1.anInt8557 = js5.getArchiveIdByName("otherlevel") * -233695275;
            Class298_Sub24_Sub1.anInt9281 = js5.getArchiveIdByName("hint_mapedge") * 902133497;
        } catch (RuntimeException runtimeexception) {
            throw Class346.method4175(runtimeexception, "pt.f(" + ')');
        }
    }

    public static void method806(Js5 class243) {
        try {
            Class74.anInt691 = class243.getArchiveIdByName("p11_full") * 1133798363;
            Class74.anInt690 = class243.getArchiveIdByName("p12_full") * 399685195;
            Class74.anInt698 = class243.getArchiveIdByName("b12_full") * 1666679073;
        } catch (RuntimeException runtimeexception) {
            throw Class346.method4175(runtimeexception, "cv.a(" + ')');
        }
    }

    public static int method3334(Js5 class243) {
        try {
            int var1 = 0;
            if (class243.method2310(-1217066055 * Class74.anInt692))
                var1++;
            if (class243.method2310(Class74.anInt694 * -355151363))
                var1++;
            if (class243.method2310(1838189665 * Class143.anInt1558))
                var1++;
            if (class243.method2310(Class400.anInt5223 * 1862609057))
                var1++;
            if (class243.method2310(Class74.anInt693 * -81301735))
                var1++;
            if (class243.method2310(-2088314757 * Class74.anInt696))
                var1++;
            if (class243.method2310(-1199789537 * Class298_Sub36.anInt7398))
                var1++;
            if (class243.method2310(Class82_Sub6.anInt6842 * -2107184677))
                var1++;
            if (class243.method2310(Class494.anInt6092 * -1624054445))
                var1++;
            if (class243.method2310(1200791325 * Class74.anInt697))
                var1++;
            if (class243.method2310(493809835 * Class257.anInt2802))
                var1++;
            if (class243.method2310(1359711467 * Class237.anInt6667))
                var1++;
            if (class243.method2310(Class128_Sub1.anInt8557 * -1848350339))
                var1++;
            if (class243.method2310(Class298_Sub24_Sub1.anInt9281 * -328242359))
                var1++;
            return var1;
        } catch (RuntimeException runtimeexception) {
            throw Class346.method4175(runtimeexception, "ahs.i(" + ')');
        }
    }

    public static void loadSprites(GraphicsToolkit graphicsToolkit, Js5 js5) {
        try {
            Class89[] class89s = Class89.method993(js5, Class74.anInt692 * -1217066055, 0);
            Class160.aClass57Array1646 = new Class57[class89s.length];
            for (int i_15_ = 0; i_15_ < class89s.length; i_15_++)
                Class160.aClass57Array1646[i_15_] = graphicsToolkit.method5125(class89s[i_15_], true);
            class89s = Class89.method993(js5, -355151363 * Class74.anInt694, 0);
            Class401.aClass57Array6561 = new Class57[class89s.length];
            for (int i_16_ = 0; i_16_ < class89s.length; i_16_++)
                Class401.aClass57Array6561[i_16_] = graphicsToolkit.method5125(class89s[i_16_], true);
            class89s = Class89.method993(js5, 1838189665 * Class143.anInt1558, 0);
            Class416.aClass57Array5334 = new Class57[class89s.length];
            for (int i_17_ = 0; i_17_ < class89s.length; i_17_++)
                Class416.aClass57Array5334[i_17_] = graphicsToolkit.method5125(class89s[i_17_], true);
            class89s = Class89.method993(js5, Class400.anInt5223 * 1862609057, 0);
            Class422.aClass57Array5351 = new Class57[class89s.length];
            for (int i_18_ = 0; i_18_ < class89s.length; i_18_++)
                Class422.aClass57Array5351[i_18_] = graphicsToolkit.method5125(class89s[i_18_], true);
            class89s = Class89.method993(js5, -81301735 * Class74.anInt693, 0);
            Class128_Sub2.aClass57Array8560 = new Class57[class89s.length];
            for (int i_19_ = 0; i_19_ < class89s.length; i_19_++)
                Class128_Sub2.aClass57Array8560[i_19_] = graphicsToolkit.method5125(class89s[i_19_], true);
            class89s = Class89.method993(js5, Class74.anInt696 * -2088314757, 0);
            Class74.aClass57Array699 = new Class57[class89s.length];
            for (int i_20_ = 0; i_20_ < class89s.length; i_20_++)
                Class74.aClass57Array699[i_20_] = graphicsToolkit.method5125(class89s[i_20_], true);
            class89s = Class89.method993(js5, Class298_Sub36.anInt7398 * -1199789537, 0);
            assert class89s != null;
            Class234.aClass57Array2598 = new Class57[class89s.length];
            int i_21_ = 25;
            for (int i_22_ = 0; i_22_ < class89s.length; i_22_++) {
                class89s[i_22_].method991(-i_21_ + (int) (Math.random() * (double) i_21_ * 2.0), -i_21_ + (int) (Math.random() * (double) i_21_ * 2.0), -i_21_ + (int) (Math.random() * (double) i_21_ * 2.0));
                Class234.aClass57Array2598[i_22_] = graphicsToolkit.method5125(class89s[i_22_], true);
            }
            class89s = Class89.method993(js5, Class82_Sub6.anInt6842 * -2107184677, 0);
            assert class89s != null;
            Class82_Sub11.aClass57Array6861 = new Class57[class89s.length];
            for (int i_23_ = 0; i_23_ < class89s.length; i_23_++)
                Class82_Sub11.aClass57Array6861[i_23_] = graphicsToolkit.method5125(class89s[i_23_], true);
            class89s = Class89.method993(js5, Class494.anInt6092 * -1624054445, 0);
            assert class89s != null;
            SubIncommingPacket.aClass57Array2349 = new Class57[class89s.length];
            i_21_ = 12;
            for (int i_24_ = 0; i_24_ < class89s.length; i_24_++) {
                class89s[i_24_].method991(-i_21_ + (int) (Math.random() * (double) i_21_ * 2.0), -i_21_ + (int) (Math.random() * (double) i_21_ * 2.0), -i_21_ + (int) (Math.random() * (double) i_21_ * 2.0));
                SubIncommingPacket.aClass57Array2349[i_24_] = graphicsToolkit.method5125(class89s[i_24_], true);
            }
            class89s = Class89.method993(js5, Class74.anInt697 * 1200791325, 0);
            assert class89s != null;
            Class130_Sub2.aClass57Array6959 = new Class57[class89s.length];
            for (int i_25_ = 0; i_25_ < class89s.length; i_25_++) {
                class89s[i_25_].method991(-i_21_ + (int) (Math.random() * (double) i_21_ * 2.0), -i_21_ + (int) (Math.random() * (double) i_21_ * 2.0), -i_21_ + (int) (Math.random() * (double) i_21_ * 2.0));
                Class130_Sub2.aClass57Array6959[i_25_] = graphicsToolkit.method5125(class89s[i_25_], true);
            }
            Class144.aClass57_1562 = graphicsToolkit.method5125(Class89.method987(js5, (Class237.anInt6667 * 1359711467), 0), true);
            Graphics.aClass57_573 = graphicsToolkit.method5125(Class89.method987(js5, ((Class128_Sub1.anInt8557) * -1848350339), 0), true);
            class89s = Class89.method993(js5, Class298_Sub24_Sub1.anInt9281 * -328242359, 0);
            assert class89s != null;
            Class250.aClass57Array2766 = new Class57[class89s.length];
            for (int i_26_ = 0; i_26_ < class89s.length; i_26_++)
                Class250.aClass57Array2766[i_26_] = graphicsToolkit.method5125(class89s[i_26_], true);
        } catch (RuntimeException runtimeexception) {
            throw Class346.method4175(runtimeexception, "ol.d(" + ')');
        }
    }

    public static int[] method6287(int i) {
        try {
            return new int[] { 399302739 * Class74.anInt691, Class74.anInt690 * 1178461027, Class74.anInt698 * -1372765471 };
        } catch (RuntimeException runtimeexception) {
            throw Class346.method4175(runtimeexception, "vc.b(" + ')');
        }
    }

    public static void setupFonts(GraphicsToolkit arg0) {
        try {
            Class298_Sub46.aClass264_7534 = ((Font) Class497.aClass197_6105.method1883((client.fontFactory), (399302739 * Class74.anInt691), true, true, -2063324548));
            Class74.aClass505_695 = Class497.aClass197_6105.method1879(client.fontFactory, (399302739 * Class74.anInt691), 414059625);
            Class343.aClass264_3673 = ((Font) Class497.aClass197_6105.method1883((client.fontFactory), (1178461027 * Class74.anInt690), true, true, -2063324548));
            Class422_Sub2.aClass505_8369 = Class497.aClass197_6105.method1879(client.fontFactory, (1178461027 * Class74.anInt690), 350969034);
            Class101.aClass264_1084 = ((Font) Class497.aClass197_6105.method1883((client.fontFactory), (-1372765471 * Class74.anInt698), true, true, -2063324548));
            Class82_Sub19_Sub1.aClass505_9111 = Class497.aClass197_6105.method1879(client.fontFactory, (Class74.anInt698 * -1372765471), -1335234186);
        } catch (RuntimeException runtimeexception) {
            throw Class346.method4175(runtimeexception, "rq.p(" + ')');
        }
    }
}

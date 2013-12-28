import com.ibm.icu.text.ArabicShaping;
import com.ibm.icu.text.ArabicShapingException;
import com.ibm.icu.text.Bidi;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import javax.imageio.ImageIO;
import org.lwjgl.opengl.GL11;

public class ban implements brs {

   private static final brq[] c = new brq[256];
   private int[] d = new int[256];
   public int a = 9;
   public Random b = new Random();
   private byte[] e = new byte[65536];
   private int[] f = new int[32];
   private final brq g;
   private final bqy h;
   private float i;
   private float j;
   private boolean k;
   private boolean l;
   private float m;
   private float n;
   private float o;
   private float p;
   private int q;
   private boolean r;
   private boolean s;
   private boolean t;
   private boolean u;
   private boolean v;


   public ban(bac var1, brq var2, bqy var3, boolean var4) {
      this.g = var2;
      this.h = var3;
      this.k = var4;
      var3.a(this.g);

      for(int var5 = 0; var5 < 32; ++var5) {
         int var6 = (var5 >> 3 & 1) * 85;
         int var7 = (var5 >> 2 & 1) * 170 + var6;
         int var8 = (var5 >> 1 & 1) * 170 + var6;
         int var9 = (var5 >> 0 & 1) * 170 + var6;
         if(var5 == 6) {
            var7 += 85;
         }

         if(var1.e) {
            int var10 = (var7 * 30 + var8 * 59 + var9 * 11) / 100;
            int var11 = (var7 * 30 + var8 * 70) / 100;
            int var12 = (var7 * 30 + var9 * 70) / 100;
            var7 = var10;
            var8 = var11;
            var9 = var12;
         }

         if(var5 >= 16) {
            var7 /= 4;
            var8 /= 4;
            var9 /= 4;
         }

         this.f[var5] = (var7 & 255) << 16 | (var8 & 255) << 8 | var9 & 255;
      }

      this.d();
   }

   public void a(brr var1) {
      this.c();
   }

   private void c() {
      BufferedImage var1;
      try {
         var1 = ImageIO.read(azi.B().Q().a(this.g).b());
      } catch (IOException var17) {
         throw new RuntimeException(var17);
      }

      int var2 = var1.getWidth();
      int var3 = var1.getHeight();
      int[] var4 = new int[var2 * var3];
      var1.getRGB(0, 0, var2, var3, var4, 0, var2);
      int var5 = var3 / 16;
      int var6 = var2 / 16;
      byte var7 = 1;
      float var8 = 8.0F / (float)var6;
      int var9 = 0;

      while(var9 < 256) {
         int var10 = var9 % 16;
         int var11 = var9 / 16;
         if(var9 == 32) {
            this.d[var9] = 3 + var7;
         }

         int var12 = var6 - 1;

         while(true) {
            if(var12 >= 0) {
               int var13 = var10 * var6 + var12;
               boolean var14 = true;

               for(int var15 = 0; var15 < var5 && var14; ++var15) {
                  int var16 = (var11 * var6 + var15) * var2;
                  if((var4[var13 + var16] >> 24 & 255) != 0) {
                     var14 = false;
                  }
               }

               if(var14) {
                  --var12;
                  continue;
               }
            }

            ++var12;
            this.d[var9] = (int)(0.5D + (double)((float)var12 * var8)) + var7;
            ++var9;
            break;
         }
      }

   }

   private void d() {
      try {
         InputStream var1 = azi.B().Q().a(new brq("font/glyph_sizes.bin")).b();
         var1.read(this.e);
      } catch (IOException var2) {
         throw new RuntimeException(var2);
      }
   }

   private float a(int var1, char var2, boolean var3) {
      return var2 == 32?4.0F:("ÀÁÂÈÊËÍÓÔÕÚßãõğİıŒœŞşŴŵžȇ        !\"#$%&\'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~ ÇüéâäàåçêëèïîìÄÅÉæÆôöòûùÿÖÜø£Ø×ƒáíóúñÑªº¿®¬½¼¡«»░▒▓│┤╡╢╖╕╣║╗╝╜╛┐└┴┬├─┼╞╟╚╔╩╦╠═╬╧╨╤╥╙╘╒╓╫╪┘┌█▄▌▐▀αβΓπΣσμτΦΘΩδ∞∅∈∩≡±≥≤⌠⌡÷≈°∙·√ⁿ²■ ".indexOf(var2) != -1 && !this.k?this.a(var1, var3):this.a(var2, var3));
   }

   private float a(int var1, boolean var2) {
      float var3 = (float)(var1 % 16 * 8);
      float var4 = (float)(var1 / 16 * 8);
      float var5 = var2?1.0F:0.0F;
      this.h.a(this.g);
      float var6 = (float)this.d[var1] - 0.01F;
      GL11.glBegin(5);
      GL11.glTexCoord2f(var3 / 128.0F, var4 / 128.0F);
      GL11.glVertex3f(this.i + var5, this.j, 0.0F);
      GL11.glTexCoord2f(var3 / 128.0F, (var4 + 7.99F) / 128.0F);
      GL11.glVertex3f(this.i - var5, this.j + 7.99F, 0.0F);
      GL11.glTexCoord2f((var3 + var6 - 1.0F) / 128.0F, var4 / 128.0F);
      GL11.glVertex3f(this.i + var6 - 1.0F + var5, this.j, 0.0F);
      GL11.glTexCoord2f((var3 + var6 - 1.0F) / 128.0F, (var4 + 7.99F) / 128.0F);
      GL11.glVertex3f(this.i + var6 - 1.0F - var5, this.j + 7.99F, 0.0F);
      GL11.glEnd();
      return (float)this.d[var1];
   }

   private brq a(int var1) {
      if(c[var1] == null) {
         c[var1] = new brq(String.format("textures/font/unicode_page_%02x.png", new Object[]{Integer.valueOf(var1)}));
      }

      return c[var1];
   }

   private void b(int var1) {
      this.h.a(this.a(var1));
   }

   private float a(char var1, boolean var2) {
      if(this.e[var1] == 0) {
         return 0.0F;
      } else {
    	  if(ThaiFixes.isSpecialThaiChar(var1)) this.i -= 4;
         int var3 = var1 / 256;
         this.b(var3);
         int var4 = this.e[var1] >>> 4;
         int var5 = this.e[var1] & 15;
         float var6 = (float)var4;
         float var7 = (float)(var5 + 1);
         float var8 = (float)(var1 % 16 * 16) + var6;
         float var9 = (float)((var1 & 255) / 16 * 16);
         float var10 = var7 - var6 - 0.02F;
         float var11 = var2?1.0F:0.0F;
         GL11.glBegin(5);
         GL11.glTexCoord2f(var8 / 256.0F, var9 / 256.0F);
         GL11.glVertex3f(this.i + var11, this.j, 0.0F);
         GL11.glTexCoord2f(var8 / 256.0F, (var9 + 15.98F) / 256.0F);
         GL11.glVertex3f(this.i - var11, this.j + 7.99F, 0.0F);
         GL11.glTexCoord2f((var8 + var10) / 256.0F, var9 / 256.0F);
         GL11.glVertex3f(this.i + var10 / 2.0F + var11, this.j, 0.0F);
         GL11.glTexCoord2f((var8 + var10) / 256.0F, (var9 + 15.98F) / 256.0F);
         GL11.glVertex3f(this.i + var10 / 2.0F - var11, this.j + 7.99F, 0.0F);
         GL11.glEnd();
         return (var7 - var6) / 2.0F + 1.0F;
      }
   }

   public int a(String var1, int var2, int var3, int var4) {
      return this.a(var1, var2, var3, var4, true);
   }

   public int b(String var1, int var2, int var3, int var4) {
      return this.a(var1, var2, var3, var4, false);
   }

   public int a(String var1, int var2, int var3, int var4, boolean var5) {
      GL11.glEnable(3008);
      this.e();
      int var6;
      if(var5) {
         var6 = this.b(var1, var2 + 1, var3 + 1, var4, true);
         var6 = Math.max(var6, this.b(var1, var2, var3, var4, false));
      } else {
         var6 = this.b(var1, var2, var3, var4, false);
      }

      return var6;
   }

   private String b(String var1) {
      try {
         Bidi var2 = new Bidi((new ArabicShaping(8)).shape(var1), 127);
         var2.setReorderingMode(0);
         return var2.writeReordered(2);
      } catch (ArabicShapingException var3) {
         return var1;
      }
   }

   private void e() {
      this.r = false;
      this.s = false;
      this.t = false;
      this.u = false;
      this.v = false;
   }

   private void a(String var1, boolean var2) {
      for(int var3 = 0; var3 < var1.length(); ++var3) {
         char var4 = var1.charAt(var3);
         int var5;
         int var6;
         if(var4 == 167 && var3 + 1 < var1.length()) {
            var5 = "0123456789abcdefklmnor".indexOf(var1.toLowerCase().charAt(var3 + 1));
            if(var5 < 16) {
               this.r = false;
               this.s = false;
               this.v = false;
               this.u = false;
               this.t = false;
               if(var5 < 0 || var5 > 15) {
                  var5 = 15;
               }

               if(var2) {
                  var5 += 16;
               }

               var6 = this.f[var5];
               this.q = var6;
               GL11.glColor4f((float)(var6 >> 16) / 255.0F, (float)(var6 >> 8 & 255) / 255.0F, (float)(var6 & 255) / 255.0F, this.p);
            } else if(var5 == 16) {
               this.r = true;
            } else if(var5 == 17) {
               this.s = true;
            } else if(var5 == 18) {
               this.v = true;
            } else if(var5 == 19) {
               this.u = true;
            } else if(var5 == 20) {
               this.t = true;
            } else if(var5 == 21) {
               this.r = false;
               this.s = false;
               this.v = false;
               this.u = false;
               this.t = false;
               GL11.glColor4f(this.m, this.n, this.o, this.p);
            }

            ++var3;
         } else {
            var5 = "ÀÁÂÈÊËÍÓÔÕÚßãõğİıŒœŞşŴŵžȇ        !\"#$%&\'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~ ÇüéâäàåçêëèïîìÄÅÉæÆôöòûùÿÖÜø£Ø×ƒáíóúñÑªº¿®¬½¼¡«»░▒▓│┤╡╢╖╕╣║╗╝╜╛┐└┴┬├─┼╞╟╚╔╩╦╠═╬╧╨╤╥╙╘╒╓╫╪┘┌█▄▌▐▀αβΓπΣσμτΦΘΩδ∞∅∈∩≡±≥≤⌠⌡÷≈°∙·√ⁿ²■ ".indexOf(var4);
            if(this.r && var5 != -1) {
               do {
                  var6 = this.b.nextInt(this.d.length);
               } while(this.d[var5] != this.d[var6]);

               var5 = var6;
            }

            float var11 = this.k?0.5F:1.0F;
            boolean var7 = (var4 == 0 || var5 == -1 || this.k) && var2;
            if(var7) {
               this.i -= var11;
               this.j -= var11;
            }

            float var8 = this.a(var5, var4, this.t);
            if(var7) {
               this.i += var11;
               this.j += var11;
            }

            if(this.s) {
               this.i += var11;
               if(var7) {
                  this.i -= var11;
                  this.j -= var11;
               }

               this.a(var5, var4, this.t);
               this.i -= var11;
               if(var7) {
                  this.i += var11;
                  this.j += var11;
               }

               ++var8;
            }

            bna var9;
            if(this.v) {
               var9 = bna.a;
               GL11.glDisable(3553);
               var9.b();
               var9.a((double)this.i, (double)(this.j + (float)(this.a / 2)), 0.0D);
               var9.a((double)(this.i + var8), (double)(this.j + (float)(this.a / 2)), 0.0D);
               var9.a((double)(this.i + var8), (double)(this.j + (float)(this.a / 2) - 1.0F), 0.0D);
               var9.a((double)this.i, (double)(this.j + (float)(this.a / 2) - 1.0F), 0.0D);
               var9.a();
               GL11.glEnable(3553);
            }

            if(this.u) {
               var9 = bna.a;
               GL11.glDisable(3553);
               var9.b();
               int var10 = this.u?-1:0;
               var9.a((double)(this.i + (float)var10), (double)(this.j + (float)this.a), 0.0D);
               var9.a((double)(this.i + var8), (double)(this.j + (float)this.a), 0.0D);
               var9.a((double)(this.i + var8), (double)(this.j + (float)this.a - 1.0F), 0.0D);
               var9.a((double)(this.i + (float)var10), (double)(this.j + (float)this.a - 1.0F), 0.0D);
               var9.a();
               GL11.glEnable(3553);
            }

            this.i += (float)((int)var8);
         }
      }

   }

   private int a(String var1, int var2, int var3, int var4, int var5, boolean var6) {
      if(this.l) {
         int var7 = this.a(this.b(var1));
         var2 = var2 + var4 - var7;
      }

      return this.b(var1, var2, var3, var5, var6);
   }

   private int b(String var1, int var2, int var3, int var4, boolean var5) {
      if(var1 == null) {
         return 0;
      } else {
         if(this.l) {
            var1 = this.b(var1);
         }

         if((var4 & -67108864) == 0) {
            var4 |= -16777216;
         }

         if(var5) {
            var4 = (var4 & 16579836) >> 2 | var4 & -16777216;
         }

         this.m = (float)(var4 >> 16 & 255) / 255.0F;
         this.n = (float)(var4 >> 8 & 255) / 255.0F;
         this.o = (float)(var4 & 255) / 255.0F;
         this.p = (float)(var4 >> 24 & 255) / 255.0F;
         GL11.glColor4f(this.m, this.n, this.o, this.p);
         this.i = (float)var2;
         this.j = (float)var3;
         this.a(var1, var5);
         return (int)this.i;
      }
   }

   public int a(String var1) {
      if(var1 == null) {
         return 0;
      } else {
         int var2 = 0;
         boolean var3 = false;

         for(int var4 = 0; var4 < var1.length(); ++var4) {
            char var5 = var1.charAt(var4);
            int var6 = this.a(var5);
            if(var6 < 0 && var4 < var1.length() - 1) {
               ++var4;
               var5 = var1.charAt(var4);
               if(var5 != 108 && var5 != 76) {
                  if(var5 == 114 || var5 == 82) {
                     var3 = false;
                  }
               } else {
                  var3 = true;
               }

               var6 = 0;
            }

            var2 += var6;
            if(var3 && var6 > 0) {
               ++var2;
            }
         }

         return var2;
      }
   }

   public int a(char var1) {
	   if(ThaiFixes.isSpecialThaiChar(var1)) return 0;
      if(var1 == 167) {
         return -1;
      } else if(var1 == 32) {
         return 4;
      } else {
         int var2 = "ÀÁÂÈÊËÍÓÔÕÚßãõğİıŒœŞşŴŵžȇ        !\"#$%&\'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~ ÇüéâäàåçêëèïîìÄÅÉæÆôöòûùÿÖÜø£Ø×ƒáíóúñÑªº¿®¬½¼¡«»░▒▓│┤╡╢╖╕╣║╗╝╜╛┐└┴┬├─┼╞╟╚╔╩╦╠═╬╧╨╤╥╙╘╒╓╫╪┘┌█▄▌▐▀αβΓπΣσμτΦΘΩδ∞∅∈∩≡±≥≤⌠⌡÷≈°∙·√ⁿ²■ ".indexOf(var1);
         if(var1 > 0 && var2 != -1 && !this.k) {
            return this.d[var2];
         } else if(this.e[var1] != 0) {
            int var3 = this.e[var1] >>> 4;
            int var4 = this.e[var1] & 15;
            if(var4 > 7) {
               var4 = 15;
               var3 = 0;
            }

            ++var4;
            return (var4 - var3) / 2 + 1;
         } else {
            return 0;
         }
      }
   }

   public String a(String var1, int var2) {
      return this.a(var1, var2, false);
   }

   public String a(String var1, int var2, boolean var3) {
      StringBuilder var4 = new StringBuilder();
      int var5 = 0;
      int var6 = var3?var1.length() - 1:0;
      int var7 = var3?-1:1;
      boolean var8 = false;
      boolean var9 = false;

      for(int var10 = var6; var10 >= 0 && var10 < var1.length() && var5 < var2; var10 += var7) {
         char var11 = var1.charAt(var10);
         int var12 = this.a(var11);
         if(var8) {
            var8 = false;
            if(var11 != 108 && var11 != 76) {
               if(var11 == 114 || var11 == 82) {
                  var9 = false;
               }
            } else {
               var9 = true;
            }
         } else if(var12 < 0) {
            var8 = true;
         } else {
            var5 += var12;
            if(var9) {
               ++var5;
            }
         }

         if(var5 > var2) {
            break;
         }

         if(var3) {
            var4.insert(0, var11);
         } else {
            var4.append(var11);
         }
      }

      return var4.toString();
   }

   private String c(String var1) {
      while(var1 != null && var1.endsWith("\n")) {
         var1 = var1.substring(0, var1.length() - 1);
      }

      return var1;
   }

   public void a(String var1, int var2, int var3, int var4, int var5) {
      this.e();
      this.q = var5;
      var1 = this.c(var1);
      this.c(var1, var2, var3, var4, false);
   }

   private void c(String var1, int var2, int var3, int var4, boolean var5) {
      List var6 = this.c(var1, var4);

      for(Iterator var7 = var6.iterator(); var7.hasNext(); var3 += this.a) {
         String var8 = (String)var7.next();
         this.a(var8, var2, var3, var4, this.q, var5);
      }

   }

   public int b(String var1, int var2) {
      return this.a * this.c(var1, var2).size();
   }

   public void a(boolean var1) {
      this.k = var1;
   }

   public boolean a() {
      return this.k;
   }

   public void b(boolean var1) {
      this.l = var1;
   }

   public List c(String var1, int var2) {
      return Arrays.asList(this.d(var1, var2).split("\n"));
   }

   String d(String var1, int var2) {
      int var3 = this.e(var1, var2);
      if(var1.length() <= var3) {
         return var1;
      } else {
         String var4 = var1.substring(0, var3);
         char var5 = var1.charAt(var3);
         boolean var6 = var5 == 32 || var5 == 10;
         String var7 = d(var4) + var1.substring(var3 + (var6?1:0));
         return var4 + "\n" + this.d(var7, var2);
      }
   }

   private int e(String var1, int var2) {
      int var3 = var1.length();
      int var4 = 0;
      int var5 = 0;
      int var6 = -1;

      for(boolean var7 = false; var5 < var3; ++var5) {
         char var8 = var1.charAt(var5);
         switch(var8) {
         case 10:
            --var5;
            break;
         case 32:
            var6 = var5;
         case 167:
            if(var5 < var3 - 1) {
               ++var5;
               char var9 = var1.charAt(var5);
               if(var9 != 108 && var9 != 76) {
                  if(var9 == 114 || var9 == 82 || b(var9)) {
                     var7 = false;
                  }
               } else {
                  var7 = true;
               }
            }
            break;
         default:
            var4 += this.a(var8);
            if(var7) {
               ++var4;
            }
         }

         if(var8 == 10) {
            ++var5;
            var6 = var5;
            break;
         }

         if(var4 > var2) {
            break;
         }
      }

      return var5 != var3 && var6 != -1 && var6 < var5?var6:var5;
   }

   private static boolean b(char var0) {
      return var0 >= 48 && var0 <= 57 || var0 >= 97 && var0 <= 102 || var0 >= 65 && var0 <= 70;
   }

   private static boolean c(char var0) {
      return var0 >= 107 && var0 <= 111 || var0 >= 75 && var0 <= 79 || var0 == 114 || var0 == 82;
   }

   private static String d(String var0) {
      String var1 = "";
      int var2 = -1;
      int var3 = var0.length();

      while((var2 = var0.indexOf(167, var2 + 1)) != -1) {
         if(var2 < var3 - 1) {
            char var4 = var0.charAt(var2 + 1);
            if(b(var4)) {
               var1 = "§" + var4;
            } else if(c(var4)) {
               var1 = var1 + "§" + var4;
            }
         }
      }

      return var1;
   }

   public boolean b() {
      return this.l;
   }

}

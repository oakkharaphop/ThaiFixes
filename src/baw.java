/*     */ import org.lwjgl.opengl.GL11;
/*     */ 
/*     */ public class baw extends bap
/*     */ {
/*     */   private final ban a;
/*     */   private final int f;
/*     */   private final int g;
/*     */   private final int h;
/*     */   private final int i;
/*  31 */   private String j = "";
/*  32 */   private int k = 32;
/*     */   private int l;
/*  34 */   private boolean m = true;
/*  35 */   private boolean n = true;
/*     */   private boolean o;
/*  37 */   private boolean p = true;
/*     */   private int q;
/*     */   private int r;
/*     */   private int s;
/*  41 */   private int t1 = 14737632;
/*  42 */   private int u = 7368816;
/*  43 */   private boolean v = true;
/*     */ 
/*     */   public baw(ban paramban, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  46 */     this.a = paramban;
/*  47 */     this.f = paramInt1;
/*  48 */     this.g = paramInt2;
/*  49 */     this.h = paramInt3;
/*  50 */     this.i = paramInt4;
/*     */   }
/*     */ 
/*     */   public void a() {
/*  54 */     this.l += 1;
/*     */   }
/*     */ 
/*     */   public void a(String paramString) {
/*  58 */     if (paramString.length() > this.k)
/*  59 */       this.j = paramString.substring(0, this.k);
/*     */     else {
/*  61 */       this.j = paramString;
/*     */     }
/*     */ 
/*  64 */     e();
/*     */   }
/*     */ 
/*     */   public String b() {
/*  68 */     return this.j;
/*     */   }
/*     */ 
/*     */   public String c() {
/*  72 */     int i1 = this.r < this.s ? this.r : this.s;
/*  73 */     int i2 = this.r < this.s ? this.s : this.r;
/*     */ 
/*  75 */     return this.j.substring(i1, i2);
/*     */   }
/*     */ 
/*     */   public void b(String paramString) {
/*  79 */     String str1 = "";
/*  80 */     String str2 = t.a(paramString);
/*  81 */     int i1 = this.r < this.s ? this.r : this.s;
/*  82 */     int i2 = this.r < this.s ? this.s : this.r;
/*  83 */     int i3 = this.k - this.j.length() - (i1 - this.s);
/*  84 */     int i4 = 0;
/*     */ 
/*  86 */     if (this.j.length() > 0) str1 = str1 + this.j.substring(0, i1);
/*     */ 
/*  88 */     if (i3 < str2.length()) {
/*  89 */       str1 = str1 + str2.substring(0, i3);
/*  90 */       i4 = i3;
/*     */     } else {
/*  92 */       str1 = str1 + str2;
/*  93 */       i4 = str2.length();
/*     */     }
/*     */ 
/*  96 */     if ((this.j.length() > 0) && (i2 < this.j.length())) str1 = str1 + this.j.substring(i2);
/*     */ 
/*  98 */     this.j = str1;
/*  99 */     d(i1 - this.s + i4);
/*     */   }
/*     */ 
/*     */   public void a(int paramInt) {
/* 103 */     if (this.j.length() == 0) return;
/*     */ 
/* 105 */     if (this.s != this.r) {
/* 106 */       b("");
/* 107 */       return;
/*     */     }
/*     */ 
/* 110 */     b(c(paramInt) - this.r);
/*     */   }
/*     */ 
/*     */   public void b(int paramInt) {
/* 114 */     if (this.j.length() == 0) return;
/*     */ 
/* 116 */     if (this.s != this.r) {
/* 117 */       b("");
/* 118 */       return;
/*     */     }
/*     */ 
/* 121 */     int i1 = paramInt < 0 ? 1 : 0;
/* 122 */     int i2 = i1 != 0 ? this.r + paramInt : this.r;
/* 123 */     int i3 = i1 != 0 ? this.r : this.r + paramInt;
/* 124 */     String str = "";
/*     */ 
/* 126 */     if (i2 >= 0) str = this.j.substring(0, i2);
/*     */ 
/* 128 */     if (i3 < this.j.length()) str = str + this.j.substring(i3);
/*     */ 
/* 130 */     this.j = str;
/* 131 */     if (i1 != 0) d(paramInt); 
/*     */   }
/*     */ 
/*     */   public int c(int paramInt)
/*     */   {
/* 135 */     return a(paramInt, h());
/*     */   }
/*     */ 
/*     */   public int a(int paramInt1, int paramInt2) {
/* 139 */     return a(paramInt1, h(), true);
/*     */   }
/*     */ 
/*     */   public int a(int paramInt1, int paramInt2, boolean paramBoolean) {
/* 143 */     int i1 = paramInt2;
/* 144 */     int i2 = paramInt1 < 0 ? 1 : 0;
/* 145 */     int i3 = Math.abs(paramInt1);
/*     */ 
/* 147 */     for (int i4 = 0; i4 < i3; i4++) {
/* 148 */       if (i2 != 0) {
/* 149 */         while ((paramBoolean) && (i1 > 0) && (this.j.charAt(i1 - 1) == ' '))
/* 150 */           i1--;
/* 151 */         while ((i1 > 0) && (this.j.charAt(i1 - 1) != ' '))
/* 152 */           i1--;
/*     */       }
/* 154 */       int i5 = this.j.length();
/*     */ 
/* 156 */       i1 = this.j.indexOf(' ', i1);
/* 157 */       if (i1 == -1)
/* 158 */         i1 = i5;
/*     */       else {
/* 160 */         while ((paramBoolean) && (i1 < i5) && (this.j.charAt(i1) == ' ')) {
/* 161 */           i1++;
/*     */         }
/*     */       }
/*     */     }
/*     */ 
/* 166 */     return i1;
/*     */   }
/*     */ 
/*     */   public void d(int paramInt) {
/* 170 */     e(this.s + paramInt);
/*     */   }
/*     */ 
/*     */   public void e(int paramInt) {
/* 174 */     this.r = paramInt;
/*     */ 
/* 176 */     int i1 = this.j.length();
/* 177 */     if (this.r < 0) this.r = 0;
/* 178 */     if (this.r > i1) this.r = i1;
/*     */ 
/* 180 */     i(this.r);
/*     */   }
/*     */ 
/*     */   public void d() {
/* 184 */     e(0);
/*     */   }
/*     */ 
/*     */   public void e() {
/* 188 */     e(this.j.length());
/*     */   }
/*     */ 
/*     */   public boolean a(char paramChar, int paramInt) {
if(ThaiFixes.isThaiChar(ThaiFixes.covertToThai(paramChar))) paramChar = ThaiFixes.covertToThai(paramChar);
/* 192 */     if (!this.o) {
/* 193 */       return false;
/*     */     }
/*     */ 
/* 196 */     switch (paramChar) {
/*     */     case '\001':
/* 198 */       e();
/* 199 */       i(0);
/* 200 */       return true;
/*     */     case '\003':
/* 202 */       bcl.d(c());
/* 203 */       return true;
/*     */     case '\026':
/* 205 */       if (this.p) b(bcl.j());
/* 206 */       return true;
/*     */     case '\030':
/* 208 */       bcl.d(c());
/* 209 */       if (this.p) b("");
/* 210 */       return true;
/*     */     }
/*     */ 
/* 213 */     switch (paramInt) {
/*     */     case 203:
/* 215 */       if (bcl.n()) {
/* 216 */         if (bcl.m())
/* 217 */           i(a(-1, n()));
/*     */         else {
/* 219 */           i(n() - 1);
/*     */         }
/*     */       }
/* 222 */       else if (bcl.m())
/* 223 */         e(c(-1));
/*     */       else {
/* 225 */         d(-1);
/*     */       }
/*     */ 
/* 229 */       return true;
/*     */     case 205:
/* 231 */       if (bcl.n()) {
/* 232 */         if (bcl.m())
/* 233 */           i(a(1, n()));
/*     */         else {
/* 235 */           i(n() + 1);
/*     */         }
/*     */       }
/* 238 */       else if (bcl.m())
/* 239 */         e(c(1));
/*     */       else {
/* 241 */         d(1);
/*     */       }
/*     */ 
/* 245 */       return true;
/*     */     case 14:
/* 247 */       if (bcl.m()) {
/* 248 */         if (this.p) a(-1);
/*     */       }
/* 250 */       else if (this.p) b(-1);
/*     */ 
/* 253 */       return true;
/*     */     case 211:
/* 256 */       if (bcl.m()) {
/* 257 */         if (this.p) a(1);
/*     */       }
/* 259 */       else if (this.p) b(1);
/*     */ 
/* 262 */       return true;
/*     */     case 199:
/* 265 */       if (bcl.n())
/* 266 */         i(0);
/*     */       else {
/* 268 */         d();
/*     */       }
/*     */ 
/* 271 */       return true;
/*     */     case 207:
/* 274 */       if (bcl.n())
/* 275 */         i(this.j.length());
/*     */       else {
/* 277 */         e();
/*     */       }
/*     */ 
/* 280 */       return true;
/*     */     }
/*     */ 
/* 283 */     if (t.a(paramChar)) {
/* 284 */       if (this.p) b(Character.toString(paramChar));
/*     */ 
/* 286 */       return true;
/*     */     }
/*     */ 
/* 289 */     return false;
/*     */   }
/*     */ 
/*     */   public void a(int paramInt1, int paramInt2, int paramInt3) {
/* 293 */     boolean bool = (paramInt1 >= this.f) && (paramInt1 < this.f + this.h) && (paramInt2 >= this.g) && (paramInt2 < this.g + this.i);
/*     */ 
/* 295 */     if (this.n) {
/* 296 */       b(bool);
/*     */     }
/*     */ 
/* 299 */     if ((this.o) && (paramInt3 == 0)) {
/* 300 */       int i1 = paramInt1 - this.f;
/*     */ 
/* 302 */       if (this.m) {
/* 303 */         i1 -= 4;
/*     */       }
/*     */ 
/* 306 */       String str = this.a.a(this.j.substring(this.q), o());
/* 307 */       e(this.a.a(str, i1).length() + this.q);
/*     */     }
/*     */   }
/*     */ 
/*     */   public void f() {
/* 312 */     if (!q()) return;
/*     */ 
/* 314 */     if (i()) {
/* 315 */       a(this.f - 1, this.g - 1, this.f + this.h + 1, this.g + this.i + 1, -6250336);
/* 316 */       a(this.f, this.g, this.f + this.h, this.g + this.i, -16777216);
/*     */     }
/*     */ 
/* 319 */     int i1 = this.p ? this.t1 : this.u;
/* 320 */     int i2 = this.r - this.q;
/* 321 */     int i3 = this.s - this.q;
/* 322 */     String str1 = this.a.a(this.j.substring(this.q), o());
/* 323 */     int i4 = (i2 >= 0) && (i2 <= str1.length()) ? 1 : 0;
/* 324 */     int i5 = (this.o) && (this.l / 6 % 2 == 0) && (i4 != 0) ? 1 : 0;
/* 325 */     int i6 = this.m ? this.f + 4 : this.f;
/* 326 */     int i7 = this.m ? this.g + (this.i - 8) / 2 : this.g;
/* 327 */     int i8 = i6;
/*     */ 
/* 329 */     if (i3 > str1.length()) i3 = str1.length();
/*     */ 
/* 331 */     if (str1.length() > 0) {
/* 332 */       String str2 = i4 != 0 ? str1.substring(0, i2) : str1;
/* 333 */       i8 = this.a.a(str2, i8, i7, i1);
/*     */     }
/*     */ 
/* 336 */     int i9 = (this.r < this.j.length()) || (this.j.length() >= g()) ? 1 : 0;
/* 337 */     int i10 = i8;
/*     */ 
/* 339 */     if (i4 == 0) {
/* 340 */       i10 = i2 > 0 ? i6 + this.h : i6;
/* 341 */     } else if (i9 != 0) {
/* 342 */       i10--;
/* 343 */       i8--;
/*     */     }
/*     */ 
/* 346 */     if ((str1.length() > 0) && (i4 != 0) && (i2 < str1.length())) {
/* 347 */       i8 = this.a.a(str1.substring(i2), i8, i7, i1);
/*     */     }
/*     */ 
/* 350 */     if (i5 != 0) {
/* 351 */       if (i9 != 0)
/* 352 */         bap.a(i10, i7 - 1, i10 + 1, i7 + 1 + this.a.a, -3092272);
/*     */       else {
/* 354 */         this.a.a("_", i10, i7, i1);
/*     */       }
/*     */     }
/*     */ 
/* 358 */     if (i3 != i2) {
/* 359 */       int i11 = i6 + this.a.a(str1.substring(0, i3));
/* 360 */       c(i10, i7 - 1, i11 - 1, i7 + 1 + this.a.a);
/*     */     }
/*     */   }
/*     */ 
/*     */   private void c(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*     */     int i1;
/* 365 */     if (paramInt1 < paramInt3) {
/* 366 */       i1 = paramInt1;
/* 367 */       paramInt1 = paramInt3;
/* 368 */       paramInt3 = i1;
/*     */     }
/* 370 */     if (paramInt2 < paramInt4) {
/* 371 */       i1 = paramInt2;
/* 372 */       paramInt2 = paramInt4;
/* 373 */       paramInt4 = i1;
/*     */     }
/*     */ 
/* 376 */     if (paramInt3 > this.f + this.h) paramInt3 = this.f + this.h;
/* 377 */     if (paramInt1 > this.f + this.h) paramInt1 = this.f + this.h;
/*     */ 
/* 379 */     bna localbna = bna.a;
/*     */ 
/* 381 */     GL11.glColor4f(0.0F, 0.0F, 255.0F, 255.0F);
/* 382 */     GL11.glDisable(3553);
/* 383 */     GL11.glEnable(3058);
/* 384 */     GL11.glLogicOp(5387);
/*     */ 
/* 386 */     localbna.b();
/* 387 */     localbna.a(paramInt1, paramInt4, 0.0D);
/* 388 */     localbna.a(paramInt3, paramInt4, 0.0D);
/* 389 */     localbna.a(paramInt3, paramInt2, 0.0D);
/* 390 */     localbna.a(paramInt1, paramInt2, 0.0D);
/* 391 */     localbna.a();
/*     */ 
/* 393 */     GL11.glDisable(3058);
/* 394 */     GL11.glEnable(3553);
/*     */   }
/*     */ 
/*     */   public void f(int paramInt) {
/* 398 */     this.k = paramInt;
/*     */ 
/* 400 */     if (this.j.length() > paramInt)
/* 401 */       this.j = this.j.substring(0, paramInt);
/*     */   }
/*     */ 
/*     */   public int g()
/*     */   {
/* 406 */     return this.k;
/*     */   }
/*     */ 
/*     */   public int h() {
/* 410 */     return this.r;
/*     */   }
/*     */ 
/*     */   public boolean i() {
/* 414 */     return this.m;
/*     */   }
/*     */ 
/*     */   public void a(boolean paramBoolean) {
/* 418 */     this.m = paramBoolean;
/*     */   }
/*     */ 
/*     */   public void g(int paramInt)
/*     */   {
/* 426 */     this.t1 = paramInt;
/*     */   }
/*     */ 
/*     */   public void h(int paramInt)
/*     */   {
/* 434 */     this.u = paramInt;
/*     */   }
/*     */ 
/*     */   public void b(boolean paramBoolean) {
/* 438 */     if ((paramBoolean) && (!this.o))
/*     */     {
/* 440 */       this.l = 0;
/*     */     }
/* 442 */     this.o = paramBoolean;
/*     */   }
/*     */ 
/*     */   public boolean l() {
/* 446 */     return this.o;
/*     */   }
/*     */ 
/*     */   public void c(boolean paramBoolean)
/*     */   {
/* 454 */     this.p = paramBoolean;
/*     */   }
/*     */ 
/*     */   public int n() {
/* 458 */     return this.s;
/*     */   }
/*     */ 
/*     */   public int o() {
/* 462 */     return i() ? this.h - 8 : this.h;
/*     */   }
/*     */ 
/*     */   public void i(int paramInt) {
/* 466 */     int i1 = this.j.length();
/*     */ 
/* 468 */     if (paramInt > i1) paramInt = i1;
/* 469 */     if (paramInt < 0) paramInt = 0;
/*     */ 
/* 471 */     this.s = paramInt;
/*     */ 
/* 473 */     if (this.a != null) {
/* 474 */       if (this.q > i1) this.q = i1;
/* 475 */       int i2 = o();
/* 476 */       String str = this.a.a(this.j.substring(this.q), i2);
/* 477 */       int i3 = str.length() + this.q;
/*     */ 
/* 479 */       if (paramInt == this.q) {
/* 480 */         this.q -= this.a.a(this.j, i2, true).length();
/*     */       }
/* 482 */       if (paramInt > i3)
/* 483 */         this.q += paramInt - i3;
/* 484 */       else if (paramInt <= this.q) {
/* 485 */         this.q -= this.q - paramInt;
/*     */       }
/*     */ 
/* 488 */       if (this.q < 0) this.q = 0;
/* 489 */       if (this.q > i1) this.q = i1;
/*     */     }
/*     */   }
/*     */ 
/*     */   public void d(boolean paramBoolean)
/*     */   {
/* 498 */     this.n = paramBoolean;
/*     */   }
/*     */ 
/*     */   public boolean q() {
/* 502 */     return this.v;
/*     */   }
/*     */ 
/*     */   public void e(boolean paramBoolean) {
/* 506 */     this.v = paramBoolean;
/*     */   }
/*     */ }

/* Location:           E:\newHole\ThaiFixes_1.7.4\1.7.4\1.7.4.jar
 * Qualified Name:     baw
 * JD-Core Version:    0.6.2
 */
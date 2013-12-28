class nd {

   // $FF: synthetic field
   static final int[] a = new int[ik.values().length];


   static {
      try {
         a[ik.a.ordinal()] = 1;
      } catch (NoSuchFieldError var3) {
         ;
      }

      try {
         a[ik.b.ordinal()] = 2;
      } catch (NoSuchFieldError var2) {
         ;
      }

      try {
         a[ik.c.ordinal()] = 3;
      } catch (NoSuchFieldError var1) {
         ;
      }

   }
}

package net.minecraft.src;

public class ThaiFixes {
	
	public static boolean isThaiChar(char par1)
	{
		return par1 >= '¡' && par1 <= 'û';
	}
	
	public static boolean isSpecialThaiChar(char par1)
	{
		return "ÑÔÕÖ×ØÙÚçèéêëìíî".contains(par1 + "");
	}
	
	public static char covertToUnicode(char par1)
	{
		return (char)((int)par1 + 3424);
	}
	
	public static char covertToThai(char par1)
	{
		return isThaiChar(covertToUnicode(par1)) ? covertToUnicode(par1) : par1;
	}
}

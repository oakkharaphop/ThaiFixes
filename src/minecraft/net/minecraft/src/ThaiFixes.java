package net.minecraft.src;

public class ThaiFixes {
	
	public static boolean isThaiChar(char par1)
	{
		return par1 >= 'ก' && par1 <= '๛';
	}
	
	public static boolean isSpecialThaiChar(char par1)
	{
		return !("ัิีึืฺุู็่้๊๋์ํ๎".indexOf(par1) < 0);
		//return isLowerSara(par1) || isUpperSara(par1);
	}
	
	public static boolean wtfygtm(char c){
		return !("่้๊๋์".indexOf(c) < 0);
	}
	
	public static boolean isLowerSara(char c){
		return !("ฺุู".indexOf(c) < 0);
	}
	
	public static boolean isUpperSara(char c){
		return !("ัิีึื็่้๊๋์ํ๎".indexOf(c) < 0);
	}
	
	public static char covertKeycharToUnicode(char par1)
	{
		return (char)((int)par1 + 3424);
	}
	
	public static char covertToThai(char par1)
	{
		return isThaiChar(covertKeycharToUnicode(par1)) ? covertKeycharToUnicode(par1) : par1;
	}
}
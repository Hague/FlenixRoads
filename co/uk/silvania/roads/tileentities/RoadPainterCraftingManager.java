package co.uk.silvania.roads.tileentities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import co.uk.silvania.roads.Roads;

import net.minecraft.block.Block;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.RecipeFireworks;
import net.minecraft.item.crafting.RecipesArmor;
import net.minecraft.item.crafting.RecipesArmorDyes;
import net.minecraft.item.crafting.RecipesCrafting;
import net.minecraft.item.crafting.RecipesDyes;
import net.minecraft.item.crafting.RecipesFood;
import net.minecraft.item.crafting.RecipesIngots;
import net.minecraft.item.crafting.RecipesMapCloning;
import net.minecraft.item.crafting.RecipesMapExtending;
import net.minecraft.item.crafting.RecipesWeapons;
import net.minecraft.item.crafting.ShapedRecipes;
import net.minecraft.item.crafting.ShapelessRecipes;
import net.minecraft.world.World;

public class RoadPainterCraftingManager {
	private static final RoadPainterCraftingManager instance = new RoadPainterCraftingManager();

	private List recipes = new ArrayList();

	public static final RoadPainterCraftingManager getInstance()
	{
		return instance;
	}

	private RoadPainterCraftingManager() {
        ItemStack yellowPaintBlob = new ItemStack(Roads.yellowPaintBlob);
        ItemStack whitePaintBlob = new ItemStack(Roads.whitePaintBlob);
        ItemStack yellowPaintCan = new ItemStack(Roads.yellowPaintCan);
        ItemStack whitePaintCan = new ItemStack(Roads.whitePaintCan);
        ItemStack roadBlock = new ItemStack(Roads.roadBlockMiscSingles, 0);
        
        
		this.addShapedRecipe(new ItemStack(Roads.roadBlockDoubleYellow, 1, 0), new Object[] 		{"YY   ", "YY   ", "YYR  ", "YY   ", "YY   ", 'Y', yellowPaintBlob, 'R', roadBlock});
		this.addShapedRecipe(new ItemStack(Roads.roadBlockDoubleYellow, 1, 4), new Object[] 		{"YY   ", "YYR  ", "YY   ", "YY   ", 'Y', yellowPaintBlob, 'R', roadBlock});
		this.addShapedRecipe(new ItemStack(Roads.roadBlockDoubleYellow, 1, 8), new Object[] 		{"   YY", "  RYY", "   YY", "   YY", 'Y', yellowPaintBlob, 'R', roadBlock});
		this.addShapedRecipe(new ItemStack(Roads.roadBlockDoubleYellow, 1, 12), new Object[] 		{" Y Y ", " Y Y ", " YRY ", " Y Y ", " Y Y ", 'Y', yellowPaintBlob, 'R', roadBlock});
		this.addShapedRecipe(new ItemStack(Roads.roadBlockArrows, 1, 0), new Object[]				{"  W  ", " WWW ", " WRW ", "WWWWW", "WWWWW", 'W', whitePaintBlob, 'R', roadBlock});
		this.addShapedRecipe(new ItemStack(Roads.roadBlockArrows, 1, 4), new Object[] 				{"  W  ", " WW  ", "WWRWW", " WW  ", "  W  ", 'W', whitePaintBlob, 'R', roadBlock});
		this.addShapedRecipe(new ItemStack(Roads.roadBlockArrows, 1, 8), new Object[] 				{"  W  ", "  WW ", "WWRWW", "  WW ", "  W  ", 'W', whitePaintBlob, 'R', roadBlock});
		this.addShapedRecipe(new ItemStack(Roads.roadBlockArrows, 1, 12), new Object[] 				{"WW", "WW", "WR", "WW", "WW", 'W', whitePaintBlob, 'R', roadBlock});
		this.addShapedRecipe(new ItemStack(Roads.roadBlockCorners, 1, 0), new Object[] 				{"YYYYY", "YYYYY", "YYR  ", "YY   ", "YY   ", 'Y', yellowPaintBlob, 'R', roadBlock});
		this.addShapedRecipe(new ItemStack(Roads.roadBlockCorners, 1, 4), new Object[] 				{"     ", "     ", "  R  ", "   YY", "   YY", 'Y', yellowPaintBlob, 'R', roadBlock});
		this.addShapedRecipe(new ItemStack(Roads.roadBlockCorners, 1, 8), new Object[] 				{"    W", "     ", "  R  ", "     ", "     ", 'W', whitePaintBlob, 'R', roadBlock});
		this.addShapedRecipe(new ItemStack(Roads.roadBlockCorners, 1, 12), new Object[] 			{"    Y", "     ", "  R  ", "     ", "     ", 'Y', yellowPaintBlob, 'R', roadBlock});
		this.addShapedRecipe(new ItemStack(Roads.roadBlockCornerB, 1, 0), new Object[] 				{"WWWWW", "W    ", "W R  ", "W    ", "W    ", 'W', whitePaintBlob, 'R', roadBlock});
		this.addShapedRecipe(new ItemStack(Roads.roadBlockCornerB, 1, 4), new Object[] 				{"YYYYY", "Y    ", "Y R  ", "Y    ", "Y    ", 'Y', yellowPaintBlob, 'R', roadBlock});
		this.addShapedRecipe(new ItemStack(Roads.roadBlockCornerB, 1, 8), new Object[] 				{"   WW", "   WW", "  R  ", "     ", "     ", 'W', whitePaintBlob, 'R', roadBlock});
		this.addShapedRecipe(new ItemStack(Roads.roadBlockCornerB, 1, 12), new Object[] 			{"   YY", "   YY", "  R  ", "     ", "     ", 'Y', yellowPaintBlob, 'R', roadBlock});
		this.addShapedRecipe(new ItemStack(Roads.roadBlockJunctionIn, 1, 0), new Object[] 			{"     ", "WWWW ", "  R  ", "     ", "     ", 'W', whitePaintBlob, 'R', roadBlock});
		this.addShapedRecipe(new ItemStack(Roads.roadBlockJunctionIn, 1, 4), new Object[] 			{"     ", "WWWWW", "  R W", "    W", "    W", 'W', whitePaintBlob, 'R', roadBlock});
		this.addShapedRecipe(new ItemStack(Roads.roadBlockJunctionIn, 1, 8), new Object[] 			{"     ", "WWWW ", "W R  ", "W    ", "W    ", 'W', whitePaintBlob, 'R', roadBlock});
		this.addShapedRecipe(new ItemStack(Roads.roadBlockJunctionIn, 1, 12), new Object[] 			{"     ", "WWWWW", "  R  ", "WWW  ", "  W  ", 'W', whitePaintBlob, 'R', roadBlock});
		this.addShapedRecipe(new ItemStack(Roads.roadBlockJunctionOut, 1, 0), new Object[] 			{"     ", " WWWW", "  R  ", " WWWW", "     ", 'W', whitePaintBlob, 'R', roadBlock});
		this.addShapedRecipe(new ItemStack(Roads.roadBlockJunctionOut, 1, 4), new Object[] 			{"     ", " WWWW", "  R  ", " WWWW", "    W", 'W', whitePaintBlob, 'R', roadBlock});
		this.addShapedRecipe(new ItemStack(Roads.roadBlockJunctionOut, 1, 8), new Object[] 			{"     ", "WWWW ", "W R  ", "WWWW ", "W    ", 'W', whitePaintBlob, 'R', roadBlock});
		this.addShapedRecipe(new ItemStack(Roads.roadBlockJunctionOut, 1, 12), new Object[] 		{"     ", "WWWWW", "  RWW", "  WWW", "  W  ", 'W', whitePaintBlob, 'R', roadBlock});
		this.addShapedRecipe(new ItemStack(Roads.roadBlockMiscSingles, 1, 1), new Object[] 			{"WWWWW", "WWWWW", "WWRWW", "WWWWW", "WWWWW", 'W', whitePaintBlob, 'R', roadBlock});
		this.addShapedRecipe(new ItemStack(Roads.roadBlockMiscSingles, 1, 2), new Object[]			{"YYYYY", "YYYYY", "YYRYY", "YYYYY", "YYYYY", 'Y', yellowPaintBlob, 'R', roadBlock});
		this.addShapedRecipe(new ItemStack(Roads.roadBlockMiscSingles, 1, 3), new Object[] 			{"W   W", " W W ", "  R  ", " W W ", "W   W", 'W', whitePaintBlob, 'R', roadBlock});
		this.addShapedRecipe(new ItemStack(Roads.roadBlockMiscSingles, 1, 4), new Object[] 			{"Y   Y", " Y Y ", "  R  ", " Y Y ", "Y   Y", 'Y', yellowPaintBlob, 'R', roadBlock});
		this.addShapedRecipe(new ItemStack(Roads.roadBlockSideWhiteStripes, 1, 0), new Object[]		{" W   ", " W   ", " WR  ", " W   ", " W   ", 'W', whitePaintBlob, 'R', roadBlock});
		this.addShapedRecipe(new ItemStack(Roads.roadBlockSideWhiteStripes, 1, 4), new Object[] 	{"W    ", "W    ", "W R  ", "W    ", "W    ", 'W', whitePaintBlob, 'R', roadBlock});
		this.addShapedRecipe(new ItemStack(Roads.roadBlockSideWhiteStripes, 1, 8), new Object[] 	{" Y   ", " Y   ", " YR  ", " Y   ", " Y   ", 'Y', yellowPaintBlob, 'R', roadBlock});
		this.addShapedRecipe(new ItemStack(Roads.roadBlockSideWhiteStripes, 1, 12), new Object[]	{"Y    ", "Y    ", "Y R  ", "Y    ", "Y    ", 'Y', yellowPaintBlob, 'R', roadBlock});
		this.addShapedRecipe(new ItemStack(Roads.roadBlockSimpleLines, 1, 0), new Object[] 			{"  W  ", "  W  ", "  R  ", "  W  ", "  W  ", 'W', whitePaintBlob, 'R', roadBlock});
		this.addShapedRecipe(new ItemStack(Roads.roadBlockSimpleLines, 1, 4), new Object[] 			{"  Y  ", "  Y  ", "  R  ", "  Y  ", "  Y  ", 'Y', yellowPaintBlob, 'R', roadBlock});
		this.addShapedRecipe(new ItemStack(Roads.roadBlockSimpleLines, 1, 8), new Object[] 			{"W    ", " W   ", "  R  ", "   W ", "    W", 'W', whitePaintBlob, 'R', roadBlock});
		this.addShapedRecipe(new ItemStack(Roads.roadBlockSimpleLines, 1, 12), new Object[]			{"Y    ", " Y   ", "  R  ", "   Y ", "    Y", 'Y', yellowPaintBlob, 'R', roadBlock});
		this.addShapedRecipe(new ItemStack(Roads.roadBlockStripes, 1, 0), new Object[] 				{"     ", " W   ", " WR  ", " W   ", "     ", 'W', whitePaintBlob, 'R', roadBlock});
		this.addShapedRecipe(new ItemStack(Roads.roadBlockStripes, 1, 4), new Object[] 				{"     ", "  W  ", "  R  ", "  W  ", "     ", 'W', whitePaintBlob, 'R', roadBlock});
		this.addShapedRecipe(new ItemStack(Roads.roadBlockStripes, 1, 8), new Object[] 				{"     ", " Y   ", " YR  ", " Y   ", "     ", 'Y', yellowPaintBlob, 'R', roadBlock});
		this.addShapedRecipe(new ItemStack(Roads.roadBlockStripes, 1, 12), new Object[] 			{"     ", "  Y  ", "  R  ", "  Y  ", "     ", 'Y', yellowPaintBlob, 'R', roadBlock});
		/**/
		
		
		this.addShapedRecipe(new ItemStack(Roads.roadBlockDoubleYellow, 1, 0), new Object[] 		{"YY   ", "YY   ", "YYR  ", "YY   ", "YY   ", 'Y', yellowPaintCan, 'R', roadBlock});
		this.addShapedRecipe(new ItemStack(Roads.roadBlockDoubleYellow, 1, 4), new Object[] 		{"YY   ", "YYR  ", "YY   ", "YY   ", 'Y', yellowPaintCan, 'R', roadBlock});
		this.addShapedRecipe(new ItemStack(Roads.roadBlockDoubleYellow, 1, 8), new Object[] 		{"   YY", "  RYY", "   YY", "   YY", 'Y', yellowPaintCan, 'R', roadBlock});
		this.addShapedRecipe(new ItemStack(Roads.roadBlockDoubleYellow, 1, 12), new Object[] 		{" Y Y ", " Y Y ", " YRY ", " Y Y ", " Y Y ", 'Y', yellowPaintCan, 'R', roadBlock});
		this.addShapedRecipe(new ItemStack(Roads.roadBlockArrows, 1, 0), new Object[]				{"  W  ", " WWW ", " WRW ", "WWWWW", "WWWWW", 'W', whitePaintCan, 'R', roadBlock});
		this.addShapedRecipe(new ItemStack(Roads.roadBlockArrows, 1, 4), new Object[] 				{"  W  ", " WW  ", "WWRWW", " WW  ", "  W  ", 'W', whitePaintCan, 'R', roadBlock});
		this.addShapedRecipe(new ItemStack(Roads.roadBlockArrows, 1, 8), new Object[] 				{"  W  ", "  WW ", "WWRWW", "  WW ", "  W  ", 'W', whitePaintCan, 'R', roadBlock});
		this.addShapedRecipe(new ItemStack(Roads.roadBlockArrows, 1, 12), new Object[] 				{"WW", "WW", "WR", "WW", "WW", 'W', whitePaintCan, 'R', roadBlock});
		this.addShapedRecipe(new ItemStack(Roads.roadBlockCorners, 1, 0), new Object[] 				{"YYYYY", "YYYYY", "YYR  ", "YY   ", "YY   ", 'Y', yellowPaintCan, 'R', roadBlock});
		this.addShapedRecipe(new ItemStack(Roads.roadBlockCorners, 1, 4), new Object[] 				{"     ", "     ", "  R  ", "   YY", "   YY", 'Y', yellowPaintCan, 'R', roadBlock});
		this.addShapedRecipe(new ItemStack(Roads.roadBlockCorners, 1, 8), new Object[] 				{"    W", "     ", "  R  ", "     ", "     ", 'W', whitePaintCan, 'R', roadBlock});
		this.addShapedRecipe(new ItemStack(Roads.roadBlockCorners, 1, 12), new Object[] 			{"    Y", "     ", "  R  ", "     ", "     ", 'Y', yellowPaintCan, 'R', roadBlock});
		this.addShapedRecipe(new ItemStack(Roads.roadBlockCornerB, 1, 0), new Object[] 				{"WWWWW", "W    ", "W R  ", "W    ", "W    ", 'W', whitePaintCan, 'R', roadBlock});
		this.addShapedRecipe(new ItemStack(Roads.roadBlockCornerB, 1, 4), new Object[] 				{"YYYYY", "Y    ", "Y R  ", "Y    ", "Y    ", 'Y', yellowPaintCan, 'R', roadBlock});
		this.addShapedRecipe(new ItemStack(Roads.roadBlockCornerB, 1, 8), new Object[] 				{"   WW", "   WW", "  R  ", "     ", "     ", 'W', whitePaintCan, 'R', roadBlock});
		this.addShapedRecipe(new ItemStack(Roads.roadBlockCornerB, 1, 12), new Object[] 			{"   YY", "   YY", "  R  ", "     ", "     ", 'Y', yellowPaintCan, 'R', roadBlock});
		this.addShapedRecipe(new ItemStack(Roads.roadBlockJunctionIn, 1, 0), new Object[] 			{"     ", "WWWW ", "  R  ", "     ", "     ", 'W', whitePaintCan, 'R', roadBlock});
		this.addShapedRecipe(new ItemStack(Roads.roadBlockJunctionIn, 1, 4), new Object[] 			{"     ", "WWWWW", "  R W", "    W", "    W", 'W', whitePaintCan, 'R', roadBlock});
		this.addShapedRecipe(new ItemStack(Roads.roadBlockJunctionIn, 1, 8), new Object[] 			{"     ", "WWWW ", "W R  ", "W    ", "W    ", 'W', whitePaintCan, 'R', roadBlock});
		this.addShapedRecipe(new ItemStack(Roads.roadBlockJunctionIn, 1, 12), new Object[] 			{"     ", "WWWWW", "  R  ", "WWW  ", "  W  ", 'W', whitePaintCan, 'R', roadBlock});
		this.addShapedRecipe(new ItemStack(Roads.roadBlockJunctionOut, 1, 0), new Object[] 			{"     ", " WWWW", "  R  ", " WWWW", "     ", 'W', whitePaintCan, 'R', roadBlock});
		this.addShapedRecipe(new ItemStack(Roads.roadBlockJunctionOut, 1, 4), new Object[] 			{"     ", " WWWW", "  R  ", " WWWW", "    W", 'W', whitePaintCan, 'R', roadBlock});
		this.addShapedRecipe(new ItemStack(Roads.roadBlockJunctionOut, 1, 8), new Object[] 			{"     ", "WWWW ", "W R  ", "WWWW ", "W    ", 'W', whitePaintCan, 'R', roadBlock});
		this.addShapedRecipe(new ItemStack(Roads.roadBlockJunctionOut, 1, 12), new Object[] 		{"     ", "WWWWW", "  RWW", "  WWW", "  W  ", 'W', whitePaintCan, 'R', roadBlock});
		this.addShapedRecipe(new ItemStack(Roads.roadBlockMiscSingles, 1, 1), new Object[] 			{"WWWWW", "WWWWW", "WWRWW", "WWWWW", "WWWWW", 'W', whitePaintCan, 'R', roadBlock});
		this.addShapedRecipe(new ItemStack(Roads.roadBlockMiscSingles, 1, 2), new Object[]			{"YYYYY", "YYYYY", "YYRYY", "YYYYY", "YYYYY", 'Y', yellowPaintCan, 'R', roadBlock});
		this.addShapedRecipe(new ItemStack(Roads.roadBlockMiscSingles, 1, 3), new Object[] 			{"W   W", " W W ", "  R  ", " W W ", "W   W", 'W', whitePaintCan, 'R', roadBlock});
		this.addShapedRecipe(new ItemStack(Roads.roadBlockMiscSingles, 1, 4), new Object[] 			{"Y   Y", " Y Y ", "  R  ", " Y Y ", "Y   Y", 'Y', yellowPaintCan, 'R', roadBlock});
		this.addShapedRecipe(new ItemStack(Roads.roadBlockSideWhiteStripes, 1, 0), new Object[]		{" W   ", " W   ", " WR  ", " W   ", " W   ", 'W', whitePaintCan, 'R', roadBlock});
		this.addShapedRecipe(new ItemStack(Roads.roadBlockSideWhiteStripes, 1, 4), new Object[] 	{"W    ", "W    ", "W R  ", "W    ", "W    ", 'W', whitePaintCan, 'R', roadBlock});
		this.addShapedRecipe(new ItemStack(Roads.roadBlockSideWhiteStripes, 1, 8), new Object[] 	{" Y   ", " Y   ", " YR  ", " Y   ", " Y   ", 'Y', yellowPaintCan, 'R', roadBlock});
		this.addShapedRecipe(new ItemStack(Roads.roadBlockSideWhiteStripes, 1, 12), new Object[]	{"Y    ", "Y    ", "Y R  ", "Y    ", "Y    ", 'Y', yellowPaintCan, 'R', roadBlock});
		this.addShapedRecipe(new ItemStack(Roads.roadBlockSimpleLines, 1, 0), new Object[] 			{"  W  ", "  W  ", "  R  ", "  W  ", "  W  ", 'W', whitePaintCan, 'R', roadBlock});
		this.addShapedRecipe(new ItemStack(Roads.roadBlockSimpleLines, 1, 4), new Object[] 			{"  Y  ", "  Y  ", "  R  ", "  Y  ", "  Y  ", 'Y', yellowPaintCan, 'R', roadBlock});
		this.addShapedRecipe(new ItemStack(Roads.roadBlockSimpleLines, 1, 8), new Object[] 			{"W    ", " W   ", "  R  ", "   W ", "    W", 'W', whitePaintCan, 'R', roadBlock});
		this.addShapedRecipe(new ItemStack(Roads.roadBlockSimpleLines, 1, 12), new Object[]			{"Y    ", " Y   ", "  R  ", "   Y ", "    Y", 'Y', yellowPaintCan, 'R', roadBlock});
		this.addShapedRecipe(new ItemStack(Roads.roadBlockStripes, 1, 0), new Object[] 				{"     ", " W   ", " WR  ", " W   ", "     ", 'W', whitePaintCan, 'R', roadBlock});
		this.addShapedRecipe(new ItemStack(Roads.roadBlockStripes, 1, 4), new Object[] 				{"     ", "  W  ", "  R  ", "  W  ", "     ", 'W', whitePaintCan, 'R', roadBlock});
		this.addShapedRecipe(new ItemStack(Roads.roadBlockStripes, 1, 8), new Object[] 				{"     ", " Y   ", " YR  ", " Y   ", "     ", 'Y', yellowPaintCan, 'R', roadBlock});
		this.addShapedRecipe(new ItemStack(Roads.roadBlockStripes, 1, 12), new Object[] 			{"     ", "  Y  ", "  R  ", "  Y  ", "     ", 'Y', yellowPaintCan, 'R', roadBlock});
		//this.addShapelessRecipe(new ItemStack(Item.diamond, 1), new Object[] {Item.ingotGold, Item.ingotGold});
		Collections.sort(this.recipes, new RoadPainterRecipeSorter(this));
		System.out.println(this.recipes.size() + " recipes");
	}

	public RoadsShapedRecipe addShapedRecipe(ItemStack par1ItemStack, Object ... par2ArrayOfObj)
	{
		String var3 = "";
		int var4 = 0;
		int var5 = 0;
		int var6 = 0;
		
		if (par2ArrayOfObj[var4] instanceof String[])
		{
			String[] var7 = (String[])((String[])par2ArrayOfObj[var4++]);

			for (int var8 = 0; var8 < var7.length; ++var8)
			{
				String var9 = var7[var8];
				++var6;
				var5 = var9.length();
				var3 = var3 + var9;
			}
		}
		else
		{
			while (par2ArrayOfObj[var4] instanceof String)
			{
				String var11 = (String)par2ArrayOfObj[var4++];
				++var6;
				var5 = var11.length();
				var3 = var3 + var11;
			}
		}

		HashMap var12;

		for (var12 = new HashMap(); var4 < par2ArrayOfObj.length; var4 += 2)
		{
			Character var13 = (Character)par2ArrayOfObj[var4];
			ItemStack var14 = null;
			
			if (par2ArrayOfObj[var4 + 1] instanceof Item)
			{
				var14 = new ItemStack((Item)par2ArrayOfObj[var4 + 1]);
			}
			else if (par2ArrayOfObj[var4 + 1] instanceof Block)
			{
				var14 = new ItemStack((Block)par2ArrayOfObj[var4 + 1], 1, -1);
			}
			else if (par2ArrayOfObj[var4 + 1] instanceof ItemStack)
			{
				var14 = (ItemStack)par2ArrayOfObj[var4 + 1];
			}
			
			var12.put(var13, var14);
		}

		ItemStack[] var15 = new ItemStack[var5 * var6];
		
		for (int var16 = 0; var16 < var5 * var6; ++var16)
		{
			char var10 = var3.charAt(var16);
			
			if (var12.containsKey(Character.valueOf(var10)))
			{
				var15[var16] = ((ItemStack)var12.get(Character.valueOf(var10))).copy();
			}
			else
			{
				var15[var16] = null;
			}
		}	

		RoadsShapedRecipe var17 = new RoadsShapedRecipe(var5, var6, var15, par1ItemStack);
		this.recipes.add(var17);
		return var17;
	}	

	public void addShapelessRecipe(ItemStack par1ItemStack, Object ... par2ArrayOfObj)
	{
		ArrayList var3 = new ArrayList();
		Object[] var4 = par2ArrayOfObj;
		int var5 = par2ArrayOfObj.length;
		
		for (int var6 = 0; var6 < var5; ++var6)
		{
			Object var7 = var4[var6];
			
			if (var7 instanceof ItemStack)
			{
				var3.add(((ItemStack)var7).copy());
			}
			else if (var7 instanceof Item)
			{
				var3.add(new ItemStack((Item)var7));
			}
			else
			{
				if (!(var7 instanceof Block))
				{
					throw new RuntimeException("Invalid shapeless recipy!");
				}
				
				var3.add(new ItemStack((Block)var7));
			}
		}	

		this.recipes.add(new RoadsShapelessRecipe(par1ItemStack, var3));
	}

	public ItemStack findMatchingRecipe(InventoryCrafting par1InventoryCrafting, World par2World)
	{
		int var3 = 0;
		ItemStack var4 = null;
		ItemStack var5 = null;
		int var6;
		
		for (var6 = 0; var6 < par1InventoryCrafting.getSizeInventory(); ++var6)
		{
			ItemStack var7 = par1InventoryCrafting.getStackInSlot(var6);
			
			if (var7 != null)
			{
				if (var3 == 0)
				{
					var4 = var7;
				}
				
				if (var3 == 1)
				{
					var5 = var7;
				}
				
				++var3;
			}
		}

		if (var3 == 2 && var4.itemID == var5.itemID && var4.stackSize == 1 && var5.stackSize == 1 && Item.itemsList[var4.itemID].isRepairable())
		{
			Item var11 = Item.itemsList[var4.itemID];
			int var13 = var11.getMaxDamage() - var4.getItemDamageForDisplay();
			int var8 = var11.getMaxDamage() - var5.getItemDamageForDisplay();
			int var9 = var13 + var8 + var11.getMaxDamage() * 5 / 100;
			int var10 = var11.getMaxDamage() - var9;
			
			if (var10 < 0)
			{
				var10 = 0;
			}

			return new ItemStack(var4.itemID, 1, var10);
		}
		else
		{
			for (var6 = 0; var6 < this.recipes.size(); ++var6)
			{
				IRecipe var12 = (IRecipe)this.recipes.get(var6);
				
				if (var12.matches(par1InventoryCrafting, par2World))
				{
					return var12.getCraftingResult(par1InventoryCrafting);
				}
			}

			return null;
		}
	}

	public List getRecipeList()
	{
		return this.recipes;
	}
}
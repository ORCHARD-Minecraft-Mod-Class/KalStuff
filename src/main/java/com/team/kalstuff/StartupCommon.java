
package com.team.kalstuff;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;

import com.team.KalStuff;
import com.team.kalstuff.block.*;
import com.team.kalstuff.item.*;
import com.team.kalstuff.tileentity.*;
import com.team.kalstuff.worldgen.WorldGenGrapeVine;
import com.team.kalstuff.worldgen.WorldGenMoonFlower;
import com.team.kalstuff.structure.*;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemSeeds;
import net.minecraft.potion.Potion;
import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class StartupCommon {
    public static BlockBridge blockBridge;
    //public static BlockSquidMat blockSquidMat;
    public static BlockEnder blockEnder;
    public static BlockBlaze blockBlaze;
    public static BlockCarrot blockCarrot;
    public static BlockApple blockApple;
    public static BlockPotato blockPotato;
    public static BlockBakedPotato blockBakedPotato;
    public static BlockChickenNest blockChickenNest;
    public static BlockTrashCan blockTrashCan;
    public static BlockWildGrapeVine blockWildGrapeVine;
    public static BlockGrapeVine blockGrapeVine;
    public static BlockMoonFlower blockMoonFlower;
    public static BlockMoonFlower blockMoonFlower1;
    public static BlockMoonFlower blockMoonFlower2;
    public static BlockMoonFlower blockMoonFlower3;
    public static BlockMoonFlower blockMoonFlower4;
    public static BlockMoonFlower blockMoonFlower5;
    public static BlockLockedChest blockLockedChest;

    public static ItemEnderPowder itemEnderPowder;
    public static ItemCoffee itemCoffee;
    public static ItemJewelSoup itemJewelSoup;
    public static Item itemCoffeeMug;
    public static Item itemGoldenMug;
    public static Item itemSodaCan;
    public static ItemSoda itemRootBeer;
    public static ItemSoda itemMelonSoda;
    public static ItemSoda itemAppleSoda;
    public static ItemSoda itemGrapeSoda;
    //public static Item itemBlazeSoup;
    public static Item itemTea;
    public static ItemCoffee itemLightCoffee;
    public static ItemBaconWand itemBaconWand;
    public static Item itemChocolateCap;
    public static Item itemBaconCore;
    public static Item itemInfusedBaconCore;
    public static ItemFood itemGrapes;
    public static ItemSeeds itemGrapeSeeds;
    public static ItemWalkingStick itemWalkingStick;
    public static ItemClosedSoda itemClosedRootBeer;
    public static ItemClosedSoda itemClosedMelonSoda;
    public static ItemClosedSoda itemClosedAppleSoda;
    public static ItemClosedSoda itemClosedGrapeSoda;
    
    public static CreativeTabs kalStuffTab = new KalStuffCreativeTab("kalStuffTab");
    
    

    public static void preInitCommon() {

    	blockBridge = (BlockBridge) new BlockBridge().setUnlocalizedName("blockBridge");
    	//blockSquidMat = (BlockSquidMat) new BlockSquidMat().setUnlocalizedName("blockSquidMat");
    	blockEnder = (BlockEnder) new BlockEnder().setUnlocalizedName("blockEnder");
    	blockBlaze = (BlockBlaze) new BlockBlaze().setUnlocalizedName("blockBlaze");
    	blockCarrot = (BlockCarrot) new BlockCarrot().setUnlocalizedName("blockCarrot");
    	blockApple = (BlockApple) new BlockApple().setUnlocalizedName("blockApple");
    	blockPotato = (BlockPotato) new BlockPotato().setUnlocalizedName("blockPotato");
    	blockBakedPotato = (BlockBakedPotato) new BlockBakedPotato().setUnlocalizedName("blockBakedPotato");
    	blockChickenNest = (BlockChickenNest) new BlockChickenNest().setUnlocalizedName("blockChickenNest");
    	blockTrashCan = (BlockTrashCan) new BlockTrashCan().setUnlocalizedName("trashCan");
    	blockWildGrapeVine = (BlockWildGrapeVine) new BlockWildGrapeVine().setUnlocalizedName("blockWildGrapeVine");
    	blockGrapeVine = (BlockGrapeVine) new BlockGrapeVine().setUnlocalizedName("blockGrapeVine");
    	blockMoonFlower = (BlockMoonFlower) new BlockMoonFlower(0).setUnlocalizedName("blockMoonFlower").setCreativeTab(kalStuffTab);
    	blockMoonFlower1 = (BlockMoonFlower) new BlockMoonFlower(4).setUnlocalizedName("blockMoonFlower").setCreativeTab(null);
    	blockMoonFlower2 = (BlockMoonFlower) new BlockMoonFlower(6).setUnlocalizedName("blockMoonFlower").setCreativeTab(null);
    	blockMoonFlower3 = (BlockMoonFlower) new BlockMoonFlower(8).setUnlocalizedName("blockMoonFlower").setCreativeTab(null);
    	blockMoonFlower4 = (BlockMoonFlower) new BlockMoonFlower(10).setUnlocalizedName("blockMoonFlower").setCreativeTab(null);
    	blockMoonFlower5 = (BlockMoonFlower) new BlockMoonFlower(12).setUnlocalizedName("blockMoonFlower").setCreativeTab(null);
    	blockLockedChest = (BlockLockedChest) new BlockLockedChest(0).setUnlocalizedName("blockLockedChest");
    	
    	GameRegistry.registerBlock(blockBridge, "blockBridge");
    	//GameRegistry.registerBlock(blockSquidMat, "blockSquidMat");
    	GameRegistry.registerBlock(blockEnder, "blockEnder");
    	GameRegistry.registerBlock(blockBlaze, "blockBlaze");
    	GameRegistry.registerBlock(blockCarrot, "blockCarrot");
    	GameRegistry.registerBlock(blockApple, "blockApple");
    	GameRegistry.registerBlock(blockPotato, "blockPotato");
    	GameRegistry.registerBlock(blockBakedPotato, "blockBakedPotato");
    	GameRegistry.registerBlock(blockChickenNest, "blockChickenNest");
    	GameRegistry.registerBlock(blockTrashCan, "blockTrashCan");
    	GameRegistry.registerBlock(blockWildGrapeVine, "blockWildGrapeVine");
    	GameRegistry.registerBlock(blockGrapeVine, "blockGrapeVine");
    	GameRegistry.registerBlock(blockMoonFlower,  "blockMoonFlower");
    	GameRegistry.registerBlock(blockMoonFlower1,  "blockMoonFlower1");
    	GameRegistry.registerBlock(blockMoonFlower2,  "blockMoonFlower2");
    	GameRegistry.registerBlock(blockMoonFlower3,  "blockMoonFlower3");
    	GameRegistry.registerBlock(blockMoonFlower4,  "blockMoonFlower4");
    	GameRegistry.registerBlock(blockMoonFlower5,  "blockMoonFlower5");
    	 GameRegistry.registerBlock(blockLockedChest, "blockLockedChest");
    	
    	 itemEnderPowder = (ItemEnderPowder) new ItemEnderPowder().setUnlocalizedName("itemEnderPowder");
    	 itemCoffeeMug = new Item().setUnlocalizedName("itemCoffeeMug").setCreativeTab(kalStuffTab);
    	 itemCoffee = (ItemCoffee) new ItemCoffee(2, 2.0f, false, 200).setAlwaysEdible().setUnlocalizedName("itemCoffee").setCreativeTab(kalStuffTab);
    	 itemLightCoffee = (ItemCoffee) new ItemCoffee(2, 2.0f, false).setAlwaysEdible().setUnlocalizedName("itemLightCoffee").setCreativeTab(kalStuffTab);
    	 itemTea = (ItemTea) new ItemTea(2, 2.0f, false).setAlwaysEdible().setUnlocalizedName("itemTea").setCreativeTab(kalStuffTab);
    	 itemGoldenMug = new Item().setUnlocalizedName("itemGoldenMug").setCreativeTab(kalStuffTab);
    	 itemJewelSoup = (ItemJewelSoup) new ItemJewelSoup(2, 2.0f, false, 200).setAlwaysEdible().setUnlocalizedName("itemJewelSoup");
    	 //itemBlazeSoup = (ItemBlazeSoup) new ItemBlazeSoup(2, 2.0f, false).setUnlocalizedName("itemBlazeSoup");
    	 itemBaconWand = (ItemBaconWand) new ItemBaconWand().setUnlocalizedName("itemBaconWand");
    	 itemChocolateCap = new Item().setUnlocalizedName("itemChocolateCap").setCreativeTab(kalStuffTab);
    	 itemBaconCore = new Item().setUnlocalizedName("itemBaconCore").setCreativeTab(kalStuffTab);
    	 itemInfusedBaconCore = new Item().setUnlocalizedName("itemInfusedBaconCore").setCreativeTab(kalStuffTab);
    	 itemGrapes = (ItemFood) new ItemFood(3, 0.5f, false).setUnlocalizedName("itemGrapes").setCreativeTab(kalStuffTab);
    	 itemGrapeSeeds = (ItemSeeds) new ItemSeeds(blockGrapeVine, Blocks.farmland).setUnlocalizedName("itemGrapeSeeds").setCreativeTab(kalStuffTab);
    	 itemWalkingStick = (ItemWalkingStick) new ItemWalkingStick().setUnlocalizedName("itemWalkingStick").setCreativeTab(kalStuffTab);
    	 itemSodaCan = new Item().setUnlocalizedName("itemSodaCan").setCreativeTab(kalStuffTab);
    	 itemRootBeer = (ItemSoda) new ItemSoda(2, 2.0f, false, 600, Potion.fireResistance).setAlwaysEdible().setUnlocalizedName("itemRootBeer");
    	 itemAppleSoda = (ItemSoda) new ItemSoda(2, 2.0f, false, 600, Potion.nightVision).setAlwaysEdible().setUnlocalizedName("itemAppleSoda");
    	 itemMelonSoda = (ItemSoda) new ItemSoda(2, 2.0f, false, 600, Potion.digSpeed).setAlwaysEdible().setUnlocalizedName("itemMelonSoda");
    	 itemGrapeSoda = (ItemSoda) new ItemSoda(2, 2.0f, false, 600, Potion.jump).setAlwaysEdible().setUnlocalizedName("itemGrapeSoda");
      	 itemClosedRootBeer = (ItemClosedSoda) new ItemClosedSoda(itemRootBeer).setUnlocalizedName("itemRootBeer").setCreativeTab(kalStuffTab);
    	 itemClosedAppleSoda = (ItemClosedSoda) new ItemClosedSoda(itemAppleSoda).setUnlocalizedName("itemAppleSoda").setCreativeTab(kalStuffTab);
    	 itemClosedMelonSoda = (ItemClosedSoda) new ItemClosedSoda(itemMelonSoda).setUnlocalizedName("itemMelonSoda").setCreativeTab(kalStuffTab);
    	 itemClosedGrapeSoda = (ItemClosedSoda) new ItemClosedSoda(itemGrapeSoda).setUnlocalizedName("itemGrapeSoda").setCreativeTab(kalStuffTab);

    	 GameRegistry.registerItem(itemEnderPowder, "itemEnderPowder");
    	 GameRegistry.registerItem(itemCoffee, "itemCoffee");
    	 GameRegistry.registerItem(itemJewelSoup, "itemJewelSoup");
    	 GameRegistry.registerItem(itemLightCoffee, "itemLightCoffee");
    	 GameRegistry.registerItem(itemCoffeeMug, "itemCoffeeMug");
    	 GameRegistry.registerItem(itemGoldenMug, "itemGoldenMug");
    	 GameRegistry.registerItem(itemTea, "itemTea");
    	 GameRegistry.registerItem(itemBaconWand, "itemBaconWand");
    	 GameRegistry.registerItem(itemChocolateCap, "itemChocolateCap");
    	 GameRegistry.registerItem(itemBaconCore, "itemBaconCore");
    	 GameRegistry.registerItem(itemInfusedBaconCore, "itemInfusedBaconCore");
    	 GameRegistry.registerItem(itemGrapes, "itemGrapes");
    	 GameRegistry.registerItem(itemGrapeSeeds, "itemGrapeSeeds");
    	 //GameRegistry.registerItem(itemBlazeSoup, "itemBlazeSoup");
    	 GameRegistry.registerItem(itemWalkingStick, "itemWalkingStick");
    	 GameRegistry.registerItem(itemSodaCan, "itemSodaCan");
    	 GameRegistry.registerItem(itemRootBeer, "itemRootBeer");
    	 GameRegistry.registerItem(itemAppleSoda, "itemAppleSoda");
    	 GameRegistry.registerItem(itemMelonSoda, "itemMelonSoda");
    	 GameRegistry.registerItem(itemGrapeSoda, "itemGrapeSoda");
    	 GameRegistry.registerItem(itemClosedRootBeer, "itemClosedRootBeer");
    	 GameRegistry.registerItem(itemClosedAppleSoda, "itemClosedAppleSoda");
    	 GameRegistry.registerItem(itemClosedMelonSoda, "itemClosedMelonSoda");
    	 GameRegistry.registerItem(itemClosedGrapeSoda, "itemClosedGrapeSoda");
    	 
    	 ClientCommandHandler.instance.registerCommand(new CommandWorldGen());

    	 GameRegistry.registerWorldGenerator(new StructureFile("cottage", KalStuff.cottageRarity), 1);
    	 
    	 GameRegistry.registerWorldGenerator(new WorldGenGrapeVine(), 1);
    	 GameRegistry.registerWorldGenerator(new WorldGenMoonFlower(), 1);
    	 
    	 
    	 GameRegistry.registerTileEntity(TileEntityChickenNest.class, "tileEntityChickenNest");
    	 GameRegistry.registerTileEntity(TileEntityMoonFlower.class, "tileEntityMoonFlower");

 		
		NetworkRegistry.INSTANCE.registerGuiHandler(KalStuff.instance, new KalStuffGuiHandler());
    }
    
    public static void initCommon() {
		System.out.println("Hi there, nerdy geeks. You should just enjoy Minecraft and stop looking at the system output.");
    	
    	KalStuffRecipes.add();
    	
    	CoreEventHandler events = new CoreEventHandler();
		MinecraftForge.EVENT_BUS.register(events);
		FMLCommonHandler.instance().bus().register(events);
		
		if (!Files.exists(Paths.get("worldgen-export"), LinkOption.NOFOLLOW_LINKS)) {
			try {
				Files.createDirectory(Paths.get("worldgen-export"), new FileAttribute[] {});
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
    }
    
    public static void postInitCommon() {
    	System.out.println("Wait a minute... Guys! IT WORKS!?! WE MADE A MOD!!!");
    }
}
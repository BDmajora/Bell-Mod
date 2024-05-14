package com.Dabells.dabells;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import com.Dabells.dabells.blocks.BlockBell;
import dabells.tileentities.TEBellDiamond;
import dabells.tileentities.TEBellEmerald;
import dabells.tileentities.TEBellEnder;
import dabells.tileentities.TEBellGold;
import dabells.tileentities.TEBellLazurite;
import dabells.tileentities.TEBellNetherStar0;
import dabells.tileentities.TEBellNetherStar1;
import dabells.tileentities.TEBellNetherStar2;
import dabells.tileentities.TEBellNetherStar3;
import dabells.tileentities.TEBellNetherStar4;
import dabells.tileentities.TEBellNetherStar5;
import dabells.tileentities.TEBellNetherStar6;
import dabells.tileentities.TEBellNetherStar7;
import dabells.tileentities.TEBellQuartz;
import dabells.tileentities.TEBellRedStone;
import dabells.tileentities.TEBellSilver;
import dabells.tileentities.TEHBellDiamond;
import dabells.tileentities.TEHBellEmerald;
import dabells.tileentities.TEHBellEnder;
import dabells.tileentities.TEHBellGold;
import dabells.tileentities.TEHBellLazurite;
import dabells.tileentities.TEHBellQuartz;
import dabells.tileentities.TEHBellRedStone;
import dabells.tileentities.TEHBellSilver;
import dabells.tileentities.TEMBellDiamond;
import dabells.tileentities.TEMBellEmerald;
import dabells.tileentities.TEMBellEnder;
import dabells.tileentities.TEMBellGold;
import dabells.tileentities.TEMBellLazurite;
import dabells.tileentities.TEMBellQuartz;
import dabells.tileentities.TEMBellRedStone;
import dabells.tileentities.TEMBellSilver;
import dabells.tileentities.TEPBellDiamond;
import dabells.tileentities.TEPBellEmerald;
import dabells.tileentities.TEPBellEnder;
import dabells.tileentities.TEPBellGold;
import dabells.tileentities.TEPBellLazurite;
import dabells.tileentities.TEPBellQuartz;
import dabells.tileentities.TEPBellRedStone;
import dabells.tileentities.TEPBellSilver;

@Mod(modid = Infofile.ID, name = Infofile.NAME, version = Infofile.VERS)

public class DaBells
{
	public static CreativeTabs DaBellsTab = new CreativeTabs("DaBells")
	{
		public Item getTabIconItem()
		{
			return null;
		}
	};
		
//Blocks
	//Tier 0 (Decorative) Bell Blocks
		public static final Block BellSilver = new BlockBell("BellSilver");



	@Instance(Infofile.NAME)
	public static DaBells instance;
	
	@SidedProxy(clientSide=Infofile.CLIENTPROXY + "ClientProxy", serverSide=Infofile.COMMONPROXY + "CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		proxy.registerRenderers();
		
		proxy.config(event);
		
		ModMetadata mod = event.getModMetadata(); 
		mod.autogenerated = false;
		mod.authorList.add(Infofile.AUTH);
		mod.credits = Infofile.CRED;
		mod.description = Infofile.DESCRIP;
		mod.logoFile = Infofile.LOGO;
		mod.modId = Infofile.ID;
		mod.name = Infofile.NAME;
		mod.parent = Infofile.PARENT;
		mod.screenshots = Infofile.SCREEN;
		mod.updateUrl = Infofile.UDURL;
		mod.url = Infofile.URL;
		mod.version = Infofile.VERS;
		
//Tier 0 Bell Blocks
     	GameRegistry.registerBlock(BellSilver, "BellSilver");

      	if (CommonProxy.resolution == 0) 
      	{
     	GameRegistry.registerTileEntity(TEBellSilver.class, "TEBellSilver");
      	GameRegistry.registerTileEntity(TEBellQuartz.class, "TEBellQuartz");
      	GameRegistry.registerTileEntity(TEBellRedStone.class, "TEBellRedStone");
      	GameRegistry.registerTileEntity(TEBellLazurite.class, "TEBellLazurite");
      	GameRegistry.registerTileEntity(TEBellGold.class, "TEBellGold");
      	GameRegistry.registerTileEntity(TEBellDiamond.class, "TEBellDiamond");
      	GameRegistry.registerTileEntity(TEBellEnder.class, "TEBellEnder");
      	GameRegistry.registerTileEntity(TEBellEmerald.class, "TEBellEmerald");
     	GameRegistry.registerTileEntity(TEHBellSilver.class, "TEHBellSilver");
      	GameRegistry.registerTileEntity(TEHBellQuartz.class, "TEHBellQuartz");
      	GameRegistry.registerTileEntity(TEHBellRedStone.class, "TEHBellRedStone");
      	GameRegistry.registerTileEntity(TEHBellLazurite.class, "TEHBellLazurite");
      	GameRegistry.registerTileEntity(TEHBellGold.class, "TEHBellGold");
      	GameRegistry.registerTileEntity(TEHBellDiamond.class, "TEHBellDiamond");
      	GameRegistry.registerTileEntity(TEHBellEnder.class, "TEHBellEnder");
      	GameRegistry.registerTileEntity(TEHBellEmerald.class, "TEHBellEmerald");
     	GameRegistry.registerTileEntity(TEPBellSilver.class, "TEPBellSilver");
      	GameRegistry.registerTileEntity(TEPBellQuartz.class, "TEPBellQuartz");
      	GameRegistry.registerTileEntity(TEPBellRedStone.class, "TEPBellRedStone");
      	GameRegistry.registerTileEntity(TEPBellLazurite.class, "TEPBellLazurite");
      	GameRegistry.registerTileEntity(TEPBellGold.class, "TEPBellGold");
      	GameRegistry.registerTileEntity(TEPBellDiamond.class, "TEPBellDiamond");
      	GameRegistry.registerTileEntity(TEPBellEnder.class, "TEPBellEnder");
      	GameRegistry.registerTileEntity(TEPBellEmerald.class, "TEPBellEmerald");
      	GameRegistry.registerTileEntity(TEMBellSilver.class, "TEMBellSilver");
      	GameRegistry.registerTileEntity(TEMBellQuartz.class, "TEMBellQuartz");
      	GameRegistry.registerTileEntity(TEMBellRedStone.class, "TEMBellRedStone");
      	GameRegistry.registerTileEntity(TEMBellLazurite.class, "TEMBellLazurite");
      	GameRegistry.registerTileEntity(TEMBellGold.class, "TEMBellGold");
      	GameRegistry.registerTileEntity(TEMBellDiamond.class, "TEMBellDiamond");
      	GameRegistry.registerTileEntity(TEMBellEnder.class, "TEMBellEnder");
      	GameRegistry.registerTileEntity(TEMBellEmerald.class, "TEMBellEmerald");
      	GameRegistry.registerTileEntity(TEBellNetherStar0.class, "TEBellNetherStar0");
      	GameRegistry.registerTileEntity(TEBellNetherStar1.class, "TEBellNetherStar1");
      	GameRegistry.registerTileEntity(TEBellNetherStar2.class, "TEBellNetherStar2");
      	GameRegistry.registerTileEntity(TEBellNetherStar3.class, "TEBellNetherStar3");
      	GameRegistry.registerTileEntity(TEBellNetherStar4.class, "TEBellNetherStar4");
      	GameRegistry.registerTileEntity(TEBellNetherStar5.class, "TEBellNetherStar5");
      	GameRegistry.registerTileEntity(TEBellNetherStar6.class, "TEBellNetherStar6");
      	GameRegistry.registerTileEntity(TEBellNetherStar7.class, "TEBellNetherStar7");
      	}
//Blocks

     //Tier 0 (Decorative) Bell Blocks
     	GameRegistry.addRecipe(new ItemStack(BellSilver, 1), new Object[]
				{"TYT", "YXY", "YYY", 'T', Items.stick, 'Y', Items.iron_ingot, 'X', Items.string});

//Smelting (only for Tier 0 Bells)		
		//ItemStacks for Bell Breakdown		
		ItemStack ingiron6 = new ItemStack(Items.iron_ingot, 6);
		ItemStack quartz6 = new ItemStack(Items.quartz, 6);
		ItemStack redstone6 = new ItemStack(Items.redstone, 6);
		ItemStack lapis6 = new ItemStack(Items.dye, 6, 4);
		ItemStack nuggold46 = new ItemStack(Items.gold_nugget, 46);
		ItemStack diamond6 = new ItemStack(Items.diamond, 6);
		ItemStack enderpearl6 = new ItemStack(Items.ender_pearl, 6);
		ItemStack emerald6 = new ItemStack(Items.emerald, 6);
		//Bell Smelting		
		GameRegistry.addSmelting(BellSilver, ingiron6, 0.0F);
		
		MinecraftForge.EVENT_BUS.register(new EventHook());
	}
	
	@EventHandler
	public void load(FMLInitializationEvent event)
	{proxy.registerRenderers();}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) 
	{
		FMLCommonHandler.instance().bus().register(new onLogOn());
	}
}

package dabells.client;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import cpw.mods.fml.client.registry.ClientRegistry;
import dabells.CommonProxy;
import dabells.blocks.RenderBell;
//import dabells.tileentities.TEBellNetherStar;
import dabells.tileentities.TEBellSilver;
import dabells.tileentities.TEHBellSilver;
import dabells.tileentities.TEMBellSilver;
import dabells.tileentities.TEPBellSilver;

public class ClientProxy extends CommonProxy
{
	final static String[] subBlocks = new String[]{"0","1","2","3","4","5","6","7"};
	
	@Override
	public void registerRenderers()
	{
		TileEntitySpecialRenderer BellSilverRender = new RenderBell("BellSilver", null);
		TileEntitySpecialRenderer BellQuartzRender = new RenderBell("BellQuartz", null);
		TileEntitySpecialRenderer BellRedStoneRender = new RenderBell("BellRedStone", null);
		TileEntitySpecialRenderer BellLazuriteRender = new RenderBell("BellLazurite", null);
		TileEntitySpecialRenderer BellGoldRender = new RenderBell("BellGold", null);
		TileEntitySpecialRenderer BellDiamondRender = new RenderBell("BellDiamond", null);
		TileEntitySpecialRenderer BellEnderRender = new RenderBell("BellEnder", null);
		TileEntitySpecialRenderer BellEmeraldRender = new RenderBell("BellEmerald", null);
		TileEntitySpecialRenderer HardenedBellSilverRender = new RenderBell("HardenedBellSilver", null);
		TileEntitySpecialRenderer HardenedBellQuartzRender = new RenderBell("HardenedBellQuartz", null);
		TileEntitySpecialRenderer HardenedBellRedStoneRender = new RenderBell("HardenedBellRedStone", null);
		TileEntitySpecialRenderer HardenedBellLazuriteRender = new RenderBell("HardenedBellLazurite", null);
		TileEntitySpecialRenderer HardenedBellGoldRender = new RenderBell("HardenedBellGold", null);
		TileEntitySpecialRenderer HardenedBellDiamondRender = new RenderBell("HardenedBellDiamond", null);
		TileEntitySpecialRenderer HardenedBellEnderRender = new RenderBell("HardenedBellEnder", null);
		TileEntitySpecialRenderer HardenedBellEmeraldRender = new RenderBell("HardenedBellEmerald", null);
		TileEntitySpecialRenderer PlatedBellSilverRender = new RenderBell("PlatedBellSilver", null);
		TileEntitySpecialRenderer PlatedBellQuartzRender = new RenderBell("PlatedBellQuartz", null);
		TileEntitySpecialRenderer PlatedBellRedStoneRender = new RenderBell("PlatedBellRedStone", null);
		TileEntitySpecialRenderer PlatedBellLazuriteRender = new RenderBell("PlatedBellLazurite", null);
		TileEntitySpecialRenderer PlatedBellGoldRender = new RenderBell("PlatedBellGold", null);
		TileEntitySpecialRenderer PlatedBellDiamondRender = new RenderBell("PlatedBellDiamond", null);
		TileEntitySpecialRenderer PlatedBellEnderRender = new RenderBell("PlatedBellEnder", null);
		TileEntitySpecialRenderer PlatedBellEmeraldRender = new RenderBell("PlatedBellEmerald", null);
		TileEntitySpecialRenderer MasterBellSilverRender = new RenderBell("MasterBellSilver", null);
		TileEntitySpecialRenderer MasterBellQuartzRender = new RenderBell("MasterBellQuartz", null);
		TileEntitySpecialRenderer MasterBellRedStoneRender = new RenderBell("MasterBellRedStone", null);
		TileEntitySpecialRenderer MasterBellLazuriteRender = new RenderBell("MasterBellLazurite", null);
		TileEntitySpecialRenderer MasterBellGoldRender = new RenderBell("MasterBellGold", null);
		TileEntitySpecialRenderer MasterBellDiamondRender = new RenderBell("MasterBellDiamond", null);
		TileEntitySpecialRenderer MasterBellEnderRender = new RenderBell("MasterBellEnder", null);
		TileEntitySpecialRenderer MasterBellEmeraldRender = new RenderBell("MasterBellEmerald", null);
		
		ClientRegistry.bindTileEntitySpecialRenderer(TEBellSilver.class, BellSilverRender);
		ClientRegistry.bindTileEntitySpecialRenderer(TEHBellSilver.class, HardenedBellSilverRender);
		ClientRegistry.bindTileEntitySpecialRenderer(TEPBellSilver.class, PlatedBellSilverRender);
		ClientRegistry.bindTileEntitySpecialRenderer(TEMBellSilver.class, MasterBellSilverRender);
		
		TileEntitySpecialRenderer BellNetherStarRender0 = new RenderBell("BellNetherStar0", "0");
		TileEntitySpecialRenderer BellNetherStarRender1 = new RenderBell("BellNetherStar1", "1");
		TileEntitySpecialRenderer BellNetherStarRender2 = new RenderBell("BellNetherStar2", "2");
		TileEntitySpecialRenderer BellNetherStarRender3 = new RenderBell("BellNetherStar3", "3");
		TileEntitySpecialRenderer BellNetherStarRender4 = new RenderBell("BellNetherStar4", "4");
		TileEntitySpecialRenderer BellNetherStarRender5 = new RenderBell("BellNetherStar5", "5");
		TileEntitySpecialRenderer BellNetherStarRender6 = new RenderBell("BellNetherStar6", "6");
		TileEntitySpecialRenderer BellNetherStarRender7 = new RenderBell("BellNetherStar7", "7");

	}
}
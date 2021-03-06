package tutoriel.common;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockTutorial extends Block
{
	private IIcon icontop, iconbottom, iconfront;

	public BlockTutorial()
	{
		super(Material.rock);
		this.setCreativeTab(ModTutoriel.TutorialCreativeTabs);
	}

	public void registerBlockIcons(IIconRegister iconRegister)
	{
		blockIcon = iconRegister.registerIcon("modtutoriel:BlockTutorial");
		iconfront = iconRegister.registerIcon("modtutoriel:BlockTutorial_Front");
		icontop = iconRegister.registerIcon("modtutoriel:BlockTutorial_Top");
		iconbottom = iconRegister.registerIcon("modtutoriel:BlockTutorial_Bottom");
	}

	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int metadata)
	{
		return side == 1 ? this.icontop : (side == 0 ? this.iconbottom : (metadata == 2 && side == 2 ? this.iconfront : (metadata == 3 && side == 5 ? this.iconfront : (metadata == 0 && side == 3 ? this.iconfront : (metadata == 1 && side == 4 ? this.iconfront : this.blockIcon)))));
	}

	public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase living, ItemStack stack)
	{
		int direction = MathHelper.floor_double((double)(living.rotationYaw * 4.0F / 360.0F) + 2.5D) & 3;
		world.setBlockMetadataWithNotify(x, y, z, direction, 2);
	}
}
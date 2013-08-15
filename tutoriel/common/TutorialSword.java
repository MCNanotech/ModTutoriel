package Tutoriel.common;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
 
public class TutorialSword extends ItemSword
{
    public TutorialSword(int id, EnumToolMaterial par2EnumToolMaterial)
    {
        super(id, par2EnumToolMaterial);
        this.setCreativeTab(CreativeTabs.tabCombat);
    }
 
}

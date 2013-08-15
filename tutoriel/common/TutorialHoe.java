package Tutoriel.common;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;
 
public class TutorialHoe extends ItemHoe
{
 
    public TutorialHoe(int id, EnumToolMaterial par2EnumToolMaterial)
    {
    	super(id, par2EnumToolMaterial);
    	this.setCreativeTab(CreativeTabs.tabTools);
	}

	

	
	}
/**
 * The MIT License (MIT)
 * 
 * Copyright (c) 2016 "ShadowLordAlpha"
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated
 * documentation files (the "Software"), to deal in the Software without restriction, including without limitation the
 * rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the
 * Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 * WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR
 * OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 * 
 */
package shadowlordalpha.shadowcore.client.creativetab;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

/**
 * The CreativeTab class is an extension of the CreativeTabs class in order to provide more flexibility to the class. It
 * is not strictly needed however it gets rid of several parts of code that are just repeated over and over in general
 * use code. It will also set a default Item Icon instead of using the annoying missing icon texture that shows up when
 * no texture is set.
 * 
 * @author Josh "ShadowLordAlpha"
 *
 */
public class CreativeTab extends CreativeTabs {

	private Item iconItem;

	/**
	 * Creates a new CreativeTab for use in Minecraft by the Creative Menu GUI.
	 * 
	 * @param label The name used for the tab similar to the name used in the {@code setUnlocalizedName} method in the
	 * {@link net.minecraft.item.Item Item} class.
	 */
	public CreativeTab(String label) {
		super(label);
	}

	/**
	 * Get the Item to use as the Creative Tab's Icon. This will return the Item set or {@code Items.BOOK} if the item
	 * to use as the icon is {@code null}.
	 * 
	 * @return The Item to use as the Creative Tab's Icon.
	 */
	@Override
	public Item getTabIconItem() {

		if(this.iconItem != null) { return this.iconItem; }

		// I don't like the missing texture so I set it to be a book if no item is supplied to be the icon
		return Items.BOOK;
	}

	/**
	 * Sets the Item that should be used for the icon.
	 * 
	 * @param iconItem The Item to be used as the icon.
	 * @return The calling object. Useful for method chaining.
	 */
	public CreativeTab setTabIconItem(Item iconItem) {
		this.iconItem = iconItem;
		return this;
	}

	/**
	 * Sets the Block that should be used for the icon. This method is the same as calling
	 * {@code CreativeTab.setTabIconItem(Item.getItemFromBlock(iconBlock));}.
	 * 
	 * @param iconBlock The Block to be used as the icon.
	 * @return The calling object. Useful for method chaining.
	 */
	public CreativeTab setTabIconBlock(Block iconBlock) {
		return setTabIconItem(Item.getItemFromBlock(iconBlock));
	}
}

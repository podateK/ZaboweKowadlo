package gui;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class AnvilGui {

    public static Inventory NewAnvilGui() {
        Inventory gui = Bukkit.createInventory(null, 36, "§bMagiczne ");

        ItemStack kowadlo = new ItemStack(Material.ANVIL, 1);
        ItemMeta kowadloMeta = kowadlo.getItemMeta();

        kowadloMeta.setDisplayName(ChatColor.YELLOW + "Napraw!");
        ArrayList<String> kowadloMetta = new ArrayList<String>();

        kowadloMetta.add(ChatColor.YELLOW + "Kliknij prawym aby");
        kowadloMetta.add(ChatColor.YELLOW + "naprawic item w rece");
        kowadloMeta.setLore(kowadloMetta);

        kowadlo.setItemMeta(kowadloMeta);

        gui.setItem(10, kowadlo);
        return gui;
    }


}

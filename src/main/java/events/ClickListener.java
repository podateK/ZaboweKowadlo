package events;

import gui.AnvilGui;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class ClickListener implements Listener {
    @EventHandler
    public void onClick(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        if(e.getWhoClicked().getOpenInventory() == AnvilGui.NewAnvilGui()) {
            if(e.getCurrentItem() == null) {
                e.setCancelled(true);
                return;
            }
            if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "Napraw!")) {
                final ItemStack item = p.getItemInHand();
                if (item == null) {
                    e.setCancelled(true);
                    return;
                }
                final Material material = item.getType();
                if (material == Material.NETHERITE_PICKAXE) {
                    if(p.getExpToLevel() >= 5) {
                        e.setCancelled(true);
                        p.closeInventory();
                        if(!material.isSolid()) {
                            item.setDurability(material.getMaxDurability());
                            p.sendMessage("Naprawiles kilof");
                            p.setLevel(p.getLevel() - 5);
                        } else {
                            p.closeInventory();
                            p.sendMessage("Twoj item nie wymaga naprawy");
                        }

                    }  else {
                        p.closeInventory();
                        p.sendMessage("Nie masz wystarczajaco lvl zeby naprawic ten item");
                    }
                } else {
                    p.closeInventory();
                    p.sendMessage("Twoj item nie wymaga naprawy");
                }

                }
            }
        }
    }

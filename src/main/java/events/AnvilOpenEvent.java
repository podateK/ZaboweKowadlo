package events;

import gui.AnvilGui;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class AnvilOpenEvent implements Listener {

    @EventHandler
    public void onCLick(PlayerInteractEvent e) {
        if(e.getAction() == Action.RIGHT_CLICK_BLOCK) {
            System.out.println(1);
            Block clickedBlock = e.getClickedBlock();
            if(clickedBlock == null) {
                return;
            }
            if(clickedBlock.getType() == Material.ANVIL) {
                e.setCancelled(true);
                e.getPlayer().openInventory(AnvilGui.NewAnvilGui());
            }

        }
    }
}

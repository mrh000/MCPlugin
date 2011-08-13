package AllInOne;

import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerListener;

public class AllInOnePlayerListener extends PlayerListener {

	private final AllInOne instanceAIO;
	
	public AllInOnePlayerListener(AllInOne instance) {
		instanceAIO = instance;
	}
	
	public void OnPlayerInteract(PlayerInteractEvent event)
	{
		if(event.getAction() == Action.RIGHT_CLICK_BLOCK)
		{
			
		}
	}
	
}

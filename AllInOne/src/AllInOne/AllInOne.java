package AllInOne;

import org.bukkit.event.Event.Priority;
import org.bukkit.event.Event;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class AllInOne extends JavaPlugin {

	private final AllInOnePlayerListener playerListener = new AllInOnePlayerListener(this);
	
	@Override
	public void onDisable() {
		
	}

	@Override
	public void onEnable() {
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvent(Event.Type.PLAYER_INTERACT, playerListener , Priority.Normal, this);
	}

}

package crafttweaker.api.event;

import crafttweaker.annotations.ZenRegister;
import crafttweaker.api.player.IPlayer;
import stanhebben.zenscript.annotations.*;

/**
 * @author Stan
 */
@ZenClass("crafttweaker.event.PlayerRespawnEvent")
@ZenRegister
public class PlayerRespawnEvent {
    
    private final IPlayer player;
    
    public PlayerRespawnEvent(IPlayer player) {
        this.player = player;
    }
    
    @ZenGetter("player")
    public IPlayer getPlayer() {
        return player;
    }
}

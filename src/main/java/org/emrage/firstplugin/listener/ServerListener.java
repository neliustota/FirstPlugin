package org.emrage.firstplugin.listener;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
public class ServerListener implements Listener {
    // set the priority of event (determine how important the event is (not necessarily necessary)).
    @EventHandler(priority = EventPriority.HIGH)
    /*
    define the event.
    "public" = Event can be accessed from all classes
    "void" = method type
    "onChat" = name of the method, can be changed
    "AsyncPlayerChatEvent" = defines that we access his chat from the player
    "event" = can be changed
     */
    public void onChat(AsyncPlayerChatEvent event) {
        //Creation of a string called "message". With "event.getMessage()" we get the message that the player wrote in the chat
        String message = event.getMessage();
        //Creation of a player, which is called "player" here. With "event.getPlayer()" we get the player who wrote the message in this event
        Player player = event.getPlayer();
        //Query whether the player is an operator
        if (player.isOp()) {
            //The format of the message is set here. This basically means that we decide what ultimately comes out in the chat. The message here will only be sent if the player is an operator.
            event.setFormat(ChatColor.RED + player.getName() + ": " + message);
            //Above we said: "if the player is an operator, then..." and below we now basically say "if the player is not an operator, then..."
        }else {
            //We are setting the message format again, but now for all players who are not operators
            event.setFormat(ChatColor.GRAY + player.getName() + ": " + message);
        }

    }

}

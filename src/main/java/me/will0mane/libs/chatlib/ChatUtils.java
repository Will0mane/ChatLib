package me.will0mane.libs.chatlib;

import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class ChatUtils {

    public static String translate(String string){
        return ChatColors.translate(string);
    }

    public static void sendMessageTranslated(Player player, String... string){
        for(String value : string){
            player.sendMessage(translate(value));
        }
    }

    public static void sendTranslatedTitle(Player player, String title, String subtitle, int in, int stay, int out){
        player.sendTitle(translate(title), translate(subtitle), in, stay, out);
    }

    public static void sendTranslatedActionBar(Player player, String actionbar){
        player.spigot().sendMessage(ChatMessageType.ACTION_BAR, new TextComponent(translate(actionbar)));
    }

    public static TextComponent translateCustom(ChatMessage message){
        TextComponent component = new TextComponent(ChatUtils.translate(
                message.getMessage()
        ));
        if(message.getHoverEvent() != null){
            component.setHoverEvent(message.getHoverEvent());
        }
        if(message.getClickEvent() != null){
            component.setClickEvent(message.getClickEvent());
        }
        return component;
    }

    public static void sendMessageTranslatedWithAction(Player p, ChatMessage... messages){
        for(ChatMessage message : messages){
            p.spigot().sendMessage(translateCustom(message));
        }
    }

    public static List<String> translateAList(List<String> lore){
        List<String> list = new ArrayList<>();
        for(String value : lore){
            String translated = translate(value);
            list.add(translated);
        }
        return list;
    }

    public static String getRainbowVersion(String string){
        int done = 0;
        StringBuilder builder = new StringBuilder();
        for(String value : string.split("")){
            if(done >= ColorsNoStyles.values().length){
                done = 0;
            }
            ColorsNoStyles colorsNoStyles = ColorsNoStyles.values()[done];
            builder.append(colorsNoStyles.getColor()).append(value);
            done++;
        }
        return builder.toString();
    }
    public static String getColoredBoolean(boolean bool){
        if(bool)
            return translate("%%green%%Sì");
        else
            return translate("%%red%%No");
    }

    public static void sendMessageTranslated(CommandSender sender, String... strings){
        for(String value : strings){
            String translated = translate(value);
            sender.sendMessage(translated);
        }
    }

}

package com.rubygenix.GrubenCore;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;

public class CommandMan implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args == null || args.length <= 0){
            return true;
        }
        if (args[0] == "reload" && sender instanceof ConsoleCommandSender){
            Main.I.reloadConfig();
        }
        return true;
    }
}
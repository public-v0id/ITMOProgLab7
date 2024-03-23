package ru.se.ifmo.prog.lab7.commands;

import ru.se.ifmo.prog.lab7.cores.*;
import ru.se.ifmo.prog.lab7.classes.*;

public class Clear extends Command {
	public Clear() {
		super("clear", "очистить коллекцию", 1);
	}
	@Override
	public Response execute(String[] args, Integer stacksize, Dragon dragon, CommandManager commandmanager, CollectionData collectiondata) {
		super.check(args.length);
		if (stacksize > 10000) {
      return new Response(new String[0]);
    }
		collectiondata.clear();
		return new Response(new String[0]);
	}
}

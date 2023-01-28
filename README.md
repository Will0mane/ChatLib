# ChatLib
Send messages in a good way!

INSTALLATION:

[![](https://jitpack.io/v/Will0mane/ChatLib.svg)](https://jitpack.io/#Will0mane/ChatLib)

You can either use maven or gradle to import
this library in your project.
Take a look at the jitpack page above.
Note that you can also just copy the classes
in your project if you don't have a library manager.
This won't make you able to get the updates though.

In order to use this lib's messages, you
need to access the ChatUtils class which
has all the methods to translate, send
and a bunch more.

Features:
 - You can translate a string, this will give you the colored string. Use ChatUtils.translate(Your string here).
 - You can translate a list automatically, this will give you the colored string list. Use ChatUtils.translateAList(Your list here).
 - You can get a rainbow string. Use ChatUtils.getRainbowVersion(Your string here).
 - You can send multiple messages that will automatically translate. Use ChatUtils.sendMessageTranslated(Either Player or CommandSender here, All of your strings here).
 - You can create a custom message with hover events and click events by using the ChatMessage class, then you can send it using 
 ChatUtils.sendMessageTranslatedWithAction(Player here, All of your ChatMessages here).
 - You can send titles using ChatUtils.sendTitle(Player here, Title here, Subtitle here, Time to fade in here, Time to stay here, Time to fade out here).
 - You can send actionbar messages using ChatUtils.sendTranslatedActionBar(Player here, Message here).
 - More coming!

HOW TO FORMAT A MESSAGE?

You can take a look in the ChatColors enum which contains all of the
currently recognised colors and the relative substitution.
Let's say that you want to get a green 'Hello!' message,
you can use the translate method described above and 
adding the following: "%%green%%Hello!".
As you can see i added '%%green%%' before the Hello which
will make it a green color, you can work around with other
colors to get your desired message.
You can also get already bold colors by adding _bold at
the end of the color code. For example %%green_bold%%.
Remember to add the %% both at the start and at the end of the color code
to make sure that the system recognises it.

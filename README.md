# ColorConsole
 A library for Java to work with colors and text formats in the console

### Examples
##### Using foreground colors:
```Java
System.out.println(Font.Fore.RED+"Hello World"+Font.Fore.RESET);
```
This returns "Hello World" in red.  
This will reset the current color: `Font.Fore.RESET`

##### Using background colors:
```Java
System.out.println(Font.Background.CYAN);
```
This changes the current background color.  
You can reset the background color via: `Font.Fore.RESET`

##### Formatting Text:
ITALIC: `System.out.println(Font.Format.italicText("Hello World"));`
BOLD: `System.out.println(Font.Format.boldText("Hello World"));`

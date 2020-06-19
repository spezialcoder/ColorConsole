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
Here are 2 examples how to format text:    
  
ITALIC: `System.out.println(Font.Format.italicText("Hello World"));`  
BOLD: `System.out.println(Font.Format.boldText("Hello World"));`

Available Formats:
- `delText(text)`
- `blinkText(text)`
- `boldText(text)`
- `underlineText(text)`
- `upperlineText(text)`
- `doubleUnderLine(text)`
- `italicText(text)`

Codes:  
  
You can also use Codes to format text.  
Here an example:

`System.out.println(Font.Format.Codes.BOLD + "Hello World");`

### TextBuilder
TextBuilder is a feature from ColorConsole.  
With it you can easily build some bigger text.  
Here an example:
```Java
builder = new TextBuilder(); //Initialize the Builder
//addTextLine(text,options)
builder.addTextLine("Hello World!",
       Font.Format.Codes.BOLD,
       Font.Fore.RED,
       Font.Background.BLACK
);
System.out.println(builder.getText());
```

Global Options:  
  
Global options are options that can be applied to the entire text of the current TextBuilder instance.  
  
Example:
```Java
builder = new TextBuilder(); //Initialize the Builder
builder.addTextOptions(
       Fpmt.Background.BLACK,
       Font.Fore.GREEN,
       Font.Format.Codes.ITALIC
); //Must be used before adding any text if you want to use global options

builder.addTextLine("Hello World!",null); //Use null as options when you dont want any options
System.out.println(builder.getText());
```

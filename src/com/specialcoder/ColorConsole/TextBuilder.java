package com.specialcoder.ColorConsole;

public class TextBuilder {
    private String content = "";
    private String globalOption = "";

    public TextBuilder() {

    }

    public void addTextLine(String text,String... option) {
        if(option == null) {
            this.content += globalOption+text+"\n";
        } else {
            String options = "";
            for (String t : option) {
                options += t;
            }
            this.content += globalOption+options+text+Font.Fore.RESET+"\n";
        }
    }

    public void addText(String text,String... option) {
        if(option == null) {
            this.content += globalOption+text;
        } else {
            String options = "";
            for (String t : option) {
                options += t;
            }
            this.content += globalOption+options+text+Font.Fore.RESET;
        }
    }

    public void addTextOptions(String... option) {
        for (String t : option) {
            globalOption += t;
        }

    }

    public void clearText() {
        this.content = "";
    }

    public void clearOptions() {
        this.globalOption = "";
    }

    public String getText() {
        return this.content;
    }
}

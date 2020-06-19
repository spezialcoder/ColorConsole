package com.specialcoder.ColorConsole;

import java.util.HashMap;
import java.util.Map;

public class TextBuilder {
    private HashMap<String,String> content = new HashMap<String,String>();
    private String globalOption = "";

    public TextBuilder() {

    }

    public void addTextLine(String text,String... option) {
        if(option == null) {
            this.content.put(text+"\n",null);
        } else {
            String options = "";
            for (String t : option) {
                options += t;
            }
            this.content.put(text+"\n",options);
        }
    }

    public void addText(String text,String... option) {
        if(option == null) {
            this.content.put(text,null);
        } else {
            String options = "";
            for (String t : option) {
                options += t;
            }
            this.content.put(text,options);
        }
    }

    public void addTextOptions(String... option) {
        for (String t : option) {
            globalOption += t;
        }

    }

    public void clearText() {
        this.content.clear();
    }

    public void clearOptions() {
        this.globalOption = "";
    }

    public String getText() {
        String ret = "";
        for(Map.Entry<String,String> entry : this.content.entrySet()) {
            if(entry.getValue() == null) {
                ret += globalOption+entry.getKey();
            } else {
                ret += globalOption+entry.getValue()+entry.getKey()+Font.Fore.RESET;
            }
        }
        return ret;
    }
}

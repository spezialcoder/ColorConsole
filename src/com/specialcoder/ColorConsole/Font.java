package com.specialcoder.ColorConsole;

public class Font {
    public static class Fore {
        public static final String RESET  = "\u001B[0m";
        public static final String BLACK  = "\u001B[30m";
        public static final String RED    = "\u001B[31m";
        public static final String GREEN  = "\u001B[32m";
        public static final String YELLOW = "\u001B[33m";
        public static final String BLUE   = "\u001B[34m";
        public static final String PURPLE = "\u001B[35m";
        public static final String CYAN   = "\u001B[36m";
        public static final String WHITE  = "\u001B[37m";
        public static final String GRAY  = "\u001B[2m";
        public static final String BRIGHT_BLACK  = "\u001B[90m";
        public static final String BRIGHT_RED    = "\u001B[91m";
        public static final String BRIGHT_GREEN  = "\u001B[92m";
        public static final String BRIGHT_YELLOW = "\u001B[93m";
        public static final String BRIGHT_BLUE   = "\u001B[94m";
        public static final String BRIGHT_PURPLE = "\u001B[95m";
        public static final String BRIGHT_CYAN   = "\u001B[96m";
        public static final String BRIGHT_WHITE  = "\u001B[97m";
    }

    public static class Background {
        public static final String BLACK  = "\u001B[40m";
        public static final String RED    = "\u001B[41m";
        public static final String GREEN  = "\u001B[42m";
        public static final String YELLOW = "\u001B[43m";
        public static final String BLUE   = "\u001B[44m";
        public static final String PURPLE = "\u001B[45m";
        public static final String CYAN   = "\u001B[46m";
        public static final String WHITE  = "\u001B[47m";
        public static final String BRIGHT_BLACK  = "\u001B[100m";
        public static final String BRIGHT_RED    = "\u001B[101m";
        public static final String BRIGHT_GREEN  = "\u001B[102m";
        public static final String BRIGHT_YELLOW = "\u001B[103m";
        public static final String BRIGHT_BLUE   = "\u001B[104m";
        public static final String BRIGHT_PURPLE = "\u001B[105m";
        public static final String BRIGHT_CYAN   = "\u001B[106m";
        public static final String BRIGHT_WHITE  = "\u001B[107m";
    }

    public static class Format {
        public static class Codes {
            public static final String CROSS = "\u001B[9m";
            public static final String BLINK = "\u001B[5m";
            public static final String BOLD = "\u001B[1m";
            public static final String UNDERLINE = "\u001B[4m";
            public static final String DOUBLEUNDERLINE = "\u001B[21m";
            public static final String UPPERLINE = "\u001B[53m";
            public static final String ITALIC = "\u001B[3m";
        }

        public static String delText(String text) {
            return Codes.CROSS+text+Fore.RESET;
        }

        public static String blinkText(String text) {
            return Codes.BLINK+text+Fore.RESET;
        }

        public static String boldText(String text) {
            return Codes.BOLD+text+Fore.RESET;
        }

        public static String underlineText(String text) {
            return Codes.UNDERLINE+text+Fore.RESET;
        }

        public static String upperlineText(String text) {
            return Codes.UPPERLINE+text+Fore.RESET;
        }

        public static String doubleUnderLine(String text) {
            return Codes.DOUBLEUNDERLINE+text+Fore.RESET;
        }

        public static String italicText(String text) {
            return Codes.ITALIC+text+Fore.RESET;
        }
    }


}

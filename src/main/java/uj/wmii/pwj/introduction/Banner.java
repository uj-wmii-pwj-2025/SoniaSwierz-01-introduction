package uj.wmii.pwj.introduction;

import java.util.HashMap;

public class Banner {

    private final HashMap<Character, String[]> FONT = new HashMap<>();
    private void initFont(){
        FONT.put('A', new String[]{
                "   #   ",
                "  # #  ",
                " #   # ",
                "#     #",
                "#######",
                "#     #",
                "#     #"
        });
        FONT.put('B', new String[]{
                "###### ",
                "#     #",
                "#     #",
                "###### ",
                "#     #",
                "#     #",
                "###### "
        });
        FONT.put('C', new String[]{
                " ##### ",
                "#     #",
                "#      ",
                "#      ",
                "#      ",
                "#     #",
                " ##### "
        });
        FONT.put('D', new String[]{
                "###### ",
                "#     #",
                "#     #",
                "#     #",
                "#     #",
                "#     #",
                "###### "
        });
        FONT.put('E', new String[]{
                "#######",
                "#      ",
                "#      ",
                "#####  ",
                "#      ",
                "#      ",
                "#######"
        });
        FONT.put('F', new String[]{
                "#######",
                "#      ",
                "#      ",
                "#####  ",
                "#      ",
                "#      ",
                "#      "
        });
        FONT.put('G', new String[]{
                " ##### ",
                "#     #",
                "#      ",
                "#  ####",
                "#     #",
                "#     #",
                " ##### "
        });
        FONT.put('H', new String[]{
                "#     #",
                "#     #",
                "#     #",
                "#######",
                "#     #",
                "#     #",
                "#     #"
        });
        FONT.put('I', new String[]{
                "###" ,
                " # " ,
                " # " ,
                " # " ,
                " # " ,
                " # " ,
                "###"
        });
        FONT.put('J', new String[]{
                "      #" ,
                "      #" ,
                "      #" ,
                "      #" ,
                "#     #" ,
                "#     #" ,
                " ##### "
        });
        FONT.put('K', new String[]{
                "#    #" ,
                "#   # " ,
                "#  #  " ,
                "###   " ,
                "#  #  " ,
                "#   # " ,
                "#    #",
        });
        FONT.put('L', new String[]{
                "#      " ,
                "#      " ,
                "#      " ,
                "#      " ,
                "#      " ,
                "#      " ,
                "#######"
        });
        FONT.put('M', new String[]{
                "#     #" ,
                "##   ##" ,
                "# # # #" ,
                "#  #  #" ,
                "#     #" ,
                "#     #" ,
                "#     #",
        });
        FONT.put('N', new String[]{
                "#     #" ,
                "##    #" ,
                "# #   #" ,
                "#  #  #" ,
                "#   # #" ,
                "#    ##" ,
                "#     #",
        });
        FONT.put('O', new String[]{
                "#######" ,
                "#     #" ,
                "#     #" ,
                "#     #" ,
                "#     #" ,
                "#     #" ,
                "#######"
        });
        FONT.put('P', new String[]{
                "###### " ,
                "#     #" ,
                "#     #" ,
                "###### " ,
                "#      " ,
                "#      " ,
                "#      ",
        });
        FONT.put('Q', new String[]{
                " ##### " ,
                "#     #" ,
                "#     #" ,
                "#     #" ,
                "#   # #" ,
                "#    # " ,
                " #### #"
        });
        FONT.put('R', new String[]{
                "###### " ,
                "#     #" ,
                "#     #" ,
                "###### " ,
                "#   #  " ,
                "#    # " ,
                "#     #"
        });
        FONT.put('S', new String[]{
                " ##### " ,
                "#     #" ,
                "#      " ,
                " ##### " ,
                "      #" ,
                "#     #" ,
                " ##### ",
        });
        FONT.put('T', new String[]{
                "#######" ,
                "   #   " ,
                "   #   " ,
                "   #   " ,
                "   #   " ,
                "   #   " ,
                "   #   ",
        });
        FONT.put('U', new String[]{
                "#     #" ,
                "#     #" ,
                "#     #" ,
                "#     #" ,
                "#     #" ,
                "#     #" ,
                " ##### "
        });
        FONT.put('V', new String[]{
                "#     #" ,
                "#     #" ,
                "#     #" ,
                "#     #" ,
                " #   # " ,
                "  # #  " ,
                "   #   ",
        });
        FONT.put('W', new String[]{
                "#     #" ,
                "#  #  #" ,
                "#  #  #" ,
                "#  #  #" ,
                "#  #  #" ,
                "#  #  #" ,
                " ## ## ",
        });
        FONT.put('X', new String[]{
                "#     #" ,
                " #   # " ,
                "  # #  " ,
                "   #   " ,
                "  # #  " ,
                " #   # " ,
                "#     #",
        });
        FONT.put('Y', new String[]{
                "#     #" ,
                " #   # " ,
                "  # #  " ,
                "   #   " ,
                "   #   " ,
                "   #   " ,
                "   #   ",
        });
        FONT.put('Z', new String[]{
                "#######" ,
                "     # " ,
                "    #  " ,
                "   #   " ,
                "  #    " ,
                " #     " ,
                "#######"
        });
        FONT.put(' ', new String[]{
                "    " ,
                "    " ,
                "    " ,
                "    " ,
                "    " ,
                "    " ,
                "    "
        });
    }

    public Banner(){
        initFont();
    }

    public String[] toBanner(String input) {

        final int TEXT_HEIGHT = 7;

        if (input == null)
            return new String[0];

        input = input.trim().toUpperCase();

        String[] output = new String[TEXT_HEIGHT];
        for (int i = 0; i < TEXT_HEIGHT; i++) output[i] = "";

        char prevLetter = ' ';
        for (int index = 0; index < input.length(); index++) { // for every letter in input
            char currentInputCharacter = input.charAt(index);
            String[] letter;

            if (currentInputCharacter >= 'A' && currentInputCharacter <= 'Z')
                letter = FONT.get(currentInputCharacter);
            else
                letter = FONT.get(' ');

            // Making output from letters
            for (int line = 0; line < TEXT_HEIGHT; line++) {
                if (prevLetter != ' ' && currentInputCharacter != ' ')
                    output[line] += " "; // space between letters

                output[line] += letter[line];
            }
            prevLetter = currentInputCharacter;
        }

        return output;
    }
}

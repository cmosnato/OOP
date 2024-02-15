package Boardgame;

public class Figure {
    public String name;
    public int currentposition;

    public Figure(String playername, int startposition) {
        startposition-=1;
        this.name = playername;
        this.currentposition = startposition;
            
        
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(int currentposition)  {
        this.currentposition = currentposition;
    }
}


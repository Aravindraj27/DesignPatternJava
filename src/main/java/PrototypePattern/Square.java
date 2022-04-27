package PrototypePattern;

public class Square implements Component{

    public int side;


    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }



    @Override
    public void render() {
        System.out.println("Generate Square");
    }

    @Override
    public Component clone() {
        Square newSquare = new Square();
        newSquare.setSide(side);
        return newSquare;
    }
}

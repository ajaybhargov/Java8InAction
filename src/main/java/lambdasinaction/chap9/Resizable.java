package lambdasinaction.chap9;

public interface Resizable extends Drawable {
    public int getWidth();

    public void setWidth(int width);

    public int getHeight();

    public void setHeight(int height);

    public void setAbsoluteSize(int width, int height);
    //TODO: uncomment, read the README for instructions
    //public void setRelativeSize(int widthFactor, int heightFactor);
}


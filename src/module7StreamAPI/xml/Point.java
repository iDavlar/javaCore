package module7StreamAPI.xml;

public class Point {
    private int x;
    private int y;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Point ");
        sb.append(x).append(" px, ");
        sb.append(y).append(" px");
        return sb.toString();
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

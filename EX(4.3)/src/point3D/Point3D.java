package point3D;

import point2D.Point2D;

public class Point3D  extends Point2D{
    private float z;

    public Point3D() {
        this.z = 0.0F;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(x,y);
        this.z = z;
    }
    public float[] getXYZ() {
        return new float[] {super.getX(),super.getY(),this.z};
    }

    @Override
    public String toString() {
        return "(".concat(String.valueOf(super.getX())).concat(",").concat(String.valueOf(super.getY())).concat(",").concat(String.valueOf(this.z)).concat(")");
    }
}

package math;

public class Vector {
    private float x;
    private float y;

    private float z;

    public Vector() {
        this.x = 0;
        this.y = 0;
    }

    public Vector(float x, float y) {
        this.x = x;
        this.y = y;
        this.z = 0;
    }

    public Vector(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }



    public void add(Vector other) {
        this.x += other.getX();
        this.y += other.getY();
    }

    public void sub(Vector other) {
        this.x -= other.getX();
        this.y -= other.getY();
    }

    public void mult(float value) {
        this.x *= value;
        this.y *= value;
    }

    public Vector plus(Vector other) {
        return new Vector(this.x + other.getX(), this.y + other.getY());
    }



    public Vector minus(Vector other) {
        return new Vector(this.x - other.getX(), this.y - other.getY());
    }



    public Vector times(float value) {
        return new Vector(this.x * value, this.y * value);
    }

    public float magnitude() {
        return (float) Math.sqrt(magSq());
    }

    public float magSq() {
        return x*x + y*y;
    }

    public void normalize() {
        float curMagnitude = magnitude();
        this.x /= curMagnitude;
        this.y /= curMagnitude;
    }

    public Vector normalized() {
        float mag = magnitude();
        return new Vector(x / mag, y / mag);
    }

    public float dot(Vector other) {
        Vector normThis = this.normalized();
        Vector normOther = other.normalized();
        return normThis.getX() * normOther.getX()
                + normThis.getY() * normOther.getY();
    }


    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}

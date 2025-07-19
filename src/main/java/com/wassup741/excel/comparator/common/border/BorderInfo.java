package com.wassup741.excel.comparator.common.border;

public class BorderInfo {
    private final short top;
    private final short right;
    private final short bottom;
    private final short left;

    public BorderInfo(short top, short right, short bottom, short left) {
        this.top = top;
        this.right = right;
        this.bottom = bottom;
        this.left = left;
    }

    public short getTop() {
        return top;
    }

    public short getRight() {
        return right;
    }

    public short getBottom() {
        return bottom;
    }

    public short getLeft() {
        return left;
    }

    @Override
    public String toString() {
        return "BorderInfo{" +
            "top=" + top +
            ", right=" + right +
            ", bottom=" + bottom +
            ", left=" + left +
            '}';
    }
}